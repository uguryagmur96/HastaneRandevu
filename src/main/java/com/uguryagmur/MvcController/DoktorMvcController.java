/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.MvcController;

import com.uguryagmur.repository.view.ModelDoktorSearch;
import com.uguryagmur.services.DoktorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ugur
 */
@Controller
@RequestMapping("/doktor")
@RequiredArgsConstructor
public class DoktorMvcController {
    private final DoktorService doktorService;
    
    @GetMapping("/search") 
    public ModelAndView search(){
        ModelAndView md=new ModelAndView("doktor/search");
        ModelDoktorSearch model=ModelDoktorSearch.builder()
                .doktorList(doktorService.findAll())
                .build();
        md.addObject("model", model);
       return md; 
    }

}
