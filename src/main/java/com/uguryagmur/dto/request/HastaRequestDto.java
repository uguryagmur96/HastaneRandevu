/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Ugur
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HastaRequestDto {
    @NotEmpty
    String ad;
    @NotEmpty
    String adres;
    @NotEmpty
    String telefon;
    @NotEmpty
    String yas;
    @NotEmpty
    String cinsiyet;
    
}
