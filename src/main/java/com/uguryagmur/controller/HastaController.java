/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.controller;
        
import static com.uguryagmur.constants.RestApiList.*;
import com.uguryagmur.services.HastaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Ugur
 */
@RestController
@RequestMapping(HASTA)
@RequiredArgsConstructor
public class HastaController {
    private final HastaService hastaService;
    
}
