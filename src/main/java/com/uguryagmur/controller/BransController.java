/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.controller;

import static com.uguryagmur.constants.RestApiList.*;
import com.uguryagmur.dto.request.BransSaveRequestDto;
import com.uguryagmur.repository.entity.Brans;
import com.uguryagmur.services.BransService;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Ugur
 */
@RestController
@RequestMapping(BRANS)
@RequiredArgsConstructor
public class BransController {
    private final BransService bransService;
    
    @PostMapping(SAVE)
    public Brans save(@RequestBody @Valid BransSaveRequestDto dto){
        return bransService.save(dto);
    }
    @GetMapping(FINDALL)
    public ResponseEntity<List> findAll(){
        return ResponseEntity.ok(bransService.findAll());
    }
    
}
