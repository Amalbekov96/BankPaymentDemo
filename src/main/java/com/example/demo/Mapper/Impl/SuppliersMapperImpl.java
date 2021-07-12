package com.example.demo.Mapper.Impl;

import com.example.demo.Mapper.SuppliersMapper;
import com.example.demo.Model.Dto.SuppliersDto;
import com.example.demo.Model.Suppliers;
import org.springframework.stereotype.Service;


@Service
public class SuppliersMapperImpl implements SuppliersMapper {
    @Override
    public Suppliers toSuppliers(SuppliersDto suppliersDto) {
        Suppliers suppliers = SuppliersMapper.INSTANCE.toSuppliers(suppliersDto);
        return suppliers;
    }

    @Override
    public SuppliersDto toSuppliersDto(Suppliers suppliers) {
        SuppliersDto suppliersDto = SuppliersMapper.INSTANCE.toSuppliersDto(suppliers);
        return suppliersDto;
    }
}
