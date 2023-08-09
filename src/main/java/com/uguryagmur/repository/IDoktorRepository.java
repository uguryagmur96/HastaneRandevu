/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.uguryagmur.repository;

import com.uguryagmur.repository.entity.Doktor;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ugur
 */
@Repository
public interface IDoktorRepository extends JpaRepository<Doktor, Long> {
    /**
     * Bu method ad parametresine göre doktorları getirir, ancak adı aynı olan doktorları da getirir.
     * @param ad
     * @return 
     */
    List<Doktor> findAllByAd(String ad);
    
    /**
     * Ad bilgisi tam girilmemiş ise bile kısmi girişler ile ad alanında arama yaparak uyuşan doktorların getirilmesini 
     * istiyoruz.
     */
    List<Doktor> findAllByAdContaining(String ad);
}
