package com.example.demo.Mapper.Impl;

import com.example.demo.Mapper.RequestsMapper;
import com.example.demo.Model.Dto.RequestsDto;
import com.example.demo.Model.Requests;
import org.springframework.stereotype.Service;


@Service
public class RequestsMapperImpl implements RequestsMapper {
    @Override
    public Requests toRequests(RequestsDto requestsDto) {
        Requests requests = RequestsMapper.INSTANCE.toRequests(requestsDto);
        return requests;
    }

    @Override
    public RequestsDto toRequestsDto(Requests requests) {
        RequestsDto requestsDto = RequestsMapper.INSTANCE.toRequestsDto(requests);
        return requestsDto;
    }
}
