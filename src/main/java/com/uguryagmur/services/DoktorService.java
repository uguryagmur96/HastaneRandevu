/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.services;

import com.uguryagmur.dto.request.DoktorSaveRequestDto;
import com.uguryagmur.dto.response.DoktorResponseDto;
import com.uguryagmur.mapper.IDoktorMapper;
import com.uguryagmur.repository.IDoktorRepository;
import com.uguryagmur.repository.entity.Doktor;
import com.uguryagmur.repository.view.VwDoktor;
import com.uguryagmur.utils.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ugur
 */
@Service
public class DoktorService extends ServiceManager<Doktor, Long>{
    private final IDoktorRepository repository;
    public DoktorService(IDoktorRepository repository){
        super(repository);
        this.repository=repository;
    }
    /**
     * Dikkat!!
     * Burada ek olarak neler yapılabilir?
     * 1- Doktorların özel olan bilgileri kontrol edilerek mükerrer kayıt yapılmasının önüne geçilebilir.
     * 2- brand id benzersiz ve tutarlı oldugu için kontrol edilebilir. bransid yok ise kayıt işlemi hata fırlatabilir.
     * @param dto
     * @return 
     */
    public Doktor save(DoktorSaveRequestDto dto){
        Doktor doktor=IDoktorMapper.INSTANCE.fromSaveDto(dto);
        return repository.save(doktor);
    }
    
    public List<Doktor> findByAd(String ad){
       return repository.findAllByAdContaining(ad);
    }
    
    public List<DoktorResponseDto>getAllDoktorDto(){
        List<Doktor> dList=repository.findAll();
        List<DoktorResponseDto> resultDList=new ArrayList<>();
        dList.forEach(p->{
            resultDList.add(IDoktorMapper.INSTANCE.doktorToDto(p));
        });
        return resultDList;
    }
    public List<VwDoktor>getAllVwDoktor(){
        List<Doktor> dList=repository.findAll();
        List<VwDoktor> resultDList=new ArrayList<>();
        dList.forEach(p->{
            resultDList.add(IDoktorMapper.INSTANCE.doktorToVwDoktor(p));
        });
        return resultDList;
    }
    
    
}
