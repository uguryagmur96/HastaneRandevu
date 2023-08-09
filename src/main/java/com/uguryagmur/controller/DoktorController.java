/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.controller;

import static com.uguryagmur.constants.RestApiList.*;
import com.uguryagmur.dto.request.DoktorSaveRequestDto;
import com.uguryagmur.dto.response.DoktorResponseDto;
import com.uguryagmur.repository.entity.Doktor;
import com.uguryagmur.repository.view.VwDoktor;
import com.uguryagmur.services.DoktorService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ugur
 */
@RestController
@RequestMapping(DOKTOR)
@RequiredArgsConstructor
public class DoktorController {
    private final DoktorService doktorService;
    
   @Value("${myapplication.name}")
    private  String appName;
    public String getActiveApplicationFile(){
        return appName;
    }
      @PostMapping(SAVE)
    public Doktor save(@RequestBody @Valid DoktorSaveRequestDto dto){
        return doktorService.save(dto);
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List> findAll(){
        return ResponseEntity.ok(doktorService.findAll());
    }
    @GetMapping(FINDBYAD)
    public List<Doktor> findByAd(String ad){
        return doktorService.findByAd(ad);
    }
    
   @GetMapping(FINDALLVWDOKTORDTOMAPPER)
   public List<DoktorResponseDto> findAllDoktorDto(){
       return doktorService.getAllDoktorDto();
   }
    @GetMapping(FINDALLVWDOKTORMAPPER)
    public List<VwDoktor> findAllDoktorView(){
    return doktorService.getAllVwDoktor();
}
}
