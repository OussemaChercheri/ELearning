package com.example.projet2024.service;


import com.example.projet2024.dto.MeetDto;

import java.util.List;
import java.util.Optional;

public interface MeetService {
    List<MeetDto> getAllMeets();
    Optional<MeetDto> getMeetById(Long id);
    MeetDto createMeet(MeetDto meetDto);
    Optional<MeetDto> updateMeet(Long id, MeetDto meetDto);
    void deleteMeet(Long id);
}
