package com.example.demo.Mapper;

import com.example.demo.Model.Dto.SuppliersDto;
import com.example.demo.Model.Suppliers;
import org.mapstruct.factory.Mappers;

public interface SuppliersMapper {
    SuppliersMapper INSTANCE = Mappers.getMapper(SuppliersMapper.class);
    Suppliers toSuppliers(SuppliersDto suppliersDto);
    SuppliersDto toSuppliersDto(Suppliers suppliers);
}
