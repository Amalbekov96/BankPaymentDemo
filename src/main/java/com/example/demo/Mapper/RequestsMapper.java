package com.example.demo.Mapper;

import com.example.demo.Model.Accounts;
import com.example.demo.Model.Dto.RequestsDto;
import com.example.demo.Model.Requests;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RequestsMapper {
    RequestsMapper INSTANCE = Mappers.getMapper(RequestsMapper.class);

    Requests toRequests(RequestsDto requestsDto);
    RequestsDto toRequestsDto(Requests requests);
}
