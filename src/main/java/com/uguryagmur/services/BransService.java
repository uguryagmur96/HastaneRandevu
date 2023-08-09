/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.services;

import com.uguryagmur.dto.request.BransSaveRequestDto;
import com.uguryagmur.exceptions.ErrorType;
import com.uguryagmur.exceptions.HastaneRandevuException;
import com.uguryagmur.repository.IBransRepository;
import com.uguryagmur.repository.entity.Brans;
import com.uguryagmur.utils.ServiceManager;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ugur
 */
@Service
public class BransService extends ServiceManager<Brans, Long>{
    private final IBransRepository repository;
    public BransService(IBransRepository repository){
        super(repository);
        this.repository=repository;
    }
    
    public Brans save(BransSaveRequestDto dto){
        /**
         * Dikkat !!!
         * eger aynı isimde bir brans varsa kayıt önce kontrol edilmeli sonra kayıt yapılmalıdır.
         */
        String bransAdi=dto.getAd().trim();
        /**
         * 1. Yöntem:
         * 
         */
        Optional<Brans> optionalBrans=repository.findOptionalByAdIgnoreCase(bransAdi);
        if(optionalBrans.isPresent())
            throw new HastaneRandevuException(ErrorType.BRANS_ZATEN_KAYITLI);
        return repository.save(Brans.builder().ad(bransAdi).build());
    }
}
