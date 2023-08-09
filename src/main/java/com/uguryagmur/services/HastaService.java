/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.services;

import com.uguryagmur.repository.IHastaRepository;
import com.uguryagmur.repository.entity.Hasta;
import com.uguryagmur.utils.ServiceManager;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ugur
 */
@Service
public class HastaService extends ServiceManager<Hasta, Long> {
    private final IHastaRepository repository;
    public HastaService(IHastaRepository repository){
        super(repository);
        this.repository=repository;
    }
}
