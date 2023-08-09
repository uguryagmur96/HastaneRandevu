/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.repository.view;

import com.uguryagmur.repository.entity.Doktor;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ugur
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ModelDoktorSearch {
  List<Doktor> doktorList;  
}
