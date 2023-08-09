/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.MvcController;

import com.uguryagmur.model.HomeModel;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Ugur
 */
@Controller
@RequestMapping("/")
public class HomoController {
    @GetMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView=new ModelAndView("index");
        HomeModel model= HomeModel.builder()
                .content("Merhaba yeni sistemimiz aktif edilmiştir")
                .title("Hastane Randevu Sistemi")
                .uList(Arrays.asList("Ürün1","Ürün2","Ürün3","Ürün4"))
                .build();
        modelAndView.addObject("model", model);
        return modelAndView;
    }
}
