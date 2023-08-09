/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.services;


import com.uguryagmur.dto.request.RandevuSaveRequestDto;
import com.uguryagmur.exceptions.ErrorType;
import com.uguryagmur.exceptions.HastaneRandevuException;
import com.uguryagmur.repository.IRandevuRepository;
import com.uguryagmur.repository.entity.Randevu;
import com.uguryagmur.utils.ServiceManager;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ugur
 */
@Service
public class RandevuService extends ServiceManager<Randevu, Long> {
    private final IRandevuRepository repository;
    private final DoktorService doktorService;
     private final HastaService hastaService;
    public RandevuService(IRandevuRepository repository,DoktorService doktorService, HastaService hastaService){
        super(repository);
        this.repository=repository;
        this.doktorService=doktorService;
        this.hastaService=hastaService;
    }
    
    /**
     * Bir servisin içinde başka bir servis kullanmak doğru mudur?
     * Çağırım yapacağınız servis içinde özelleştirilmiş methodlar ve işlemler olabilir ve bu özel methodlar datayı 
     * manipüle ederken farklı işlemler yapabilir. İşlemleri soyutlama nedeniyle ilgili serviste yapılan işlemleri 
     * bilemeyeceğiniz için direkt repository erişmek sakıncalı olacaktır.
     * 
     * Dİkkat ! : Servisler birbirilerini çağırarak loop yaratması engellenmelidir.
     */
    public Randevu save(RandevuSaveRequestDto dto){
        if(doktorService.findById(dto.getDoktorid()).isEmpty())
            throw new HastaneRandevuException(ErrorType.DOKTOR_BULUNAMADI);
        else if(hastaService.findById(dto.getHastaid()).isEmpty())
            throw new HastaneRandevuException(ErrorType.HASTA_BULUNAMADI);
        
        return null;
    }
    
   
}
