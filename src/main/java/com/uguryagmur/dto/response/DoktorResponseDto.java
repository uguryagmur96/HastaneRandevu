/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.dto.response;

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
public class DoktorResponseDto {
    Long id;
    String ad;
    Long bransid;
    String bransad; 
}
