package com.han.atm.batter;

import com.han.atm.batter.dto.BatterGroupDto;
import com.han.atm.batter.repository.BatterGroupRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BatterService {

    private final BatterGroupRepository batterGroupRepository;

    public BatterGroupDto findBatterGroup(BatterGroupDto request){
        BatterGroup batterGroup = batterGroupRepository.findById(request.getBatterGroupId()).orElseThrow();
        ModelMapper modelMapper = new ModelMapper();
        BatterGroupDto a =  modelMapper.map(batterGroup, BatterGroupDto.class);
        return modelMapper.map(batterGroup, BatterGroupDto.class);
    }

    public BatterGroupDto createBatterGroup(BatterGroupDto request){
        ModelMapper modelMapper = new ModelMapper();
        BatterGroup batterGroup = modelMapper.map(request, BatterGroup.class);
        batterGroupRepository.save(batterGroup);
        return request;
    }
}
