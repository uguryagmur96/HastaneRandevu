/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.uguryagmur.repository;

import com.uguryagmur.repository.entity.Brans;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ugur
 */
@Repository
public interface IBransRepository extends JpaRepository<Brans, Long> {
    
    Optional<Brans> findOptionalByAdIgnoreCase(String ad);
    
}
