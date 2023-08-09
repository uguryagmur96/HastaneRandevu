/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.uguryagmur.mapper;

import com.uguryagmur.dto.request.HastaRequestDto;
import com.uguryagmur.repository.entity.Hasta;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

/**
 *
 * @author Ugur
 */
@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IHastaMapper {
    IHastaMapper INSTANCE=Mappers.getMapper(IHastaMapper.class);
    
    Hasta fromSaveDto(HastaRequestDto dto);
    
}
