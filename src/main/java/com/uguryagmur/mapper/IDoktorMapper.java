/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.uguryagmur.mapper;

import com.uguryagmur.dto.request.DoktorSaveRequestDto;
import com.uguryagmur.dto.response.DoktorResponseDto;
import com.uguryagmur.repository.entity.Doktor;
import com.uguryagmur.repository.view.VwDoktor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Ugur
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IDoktorMapper {
    IDoktorMapper INSTANCE=Mappers.getMapper(IDoktorMapper.class);
    
    Doktor fromSaveDto(DoktorSaveRequestDto dto);
    DoktorResponseDto doktorToDto(final Doktor doktor);
    VwDoktor doktorToVwDoktor(final Doktor doktor);
}
