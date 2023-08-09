/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uguryagmur.dto.request;

import jakarta.validation.constraints.NotNull;
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
public class RandevuSaveRequestDto {
     @NotNull
    Long doktorid;
    @NotNull
    Long hastaid;
    @NotNull
    Long tarih; // 09.06.2023 - 10:30
    @NotNull
    Long zaman; // 10:30

    Integer gun;
    Integer ay;
    Integer yil;
    Integer saat;
    Integer dakika;
}
