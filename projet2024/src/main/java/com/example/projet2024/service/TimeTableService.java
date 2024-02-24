package com.example.projet2024.service;


import com.example.projet2024.dto.TimeTableDto;

import java.util.List;
import java.util.Optional;

public interface TimeTableService {
    List<TimeTableDto> getAllTimeTables();
    Optional<TimeTableDto> getTimeTableById(Long id);
    TimeTableDto createTimeTable(TimeTableDto timeTableDto);
    Optional<TimeTableDto> updateTimeTable(Long id, TimeTableDto timeTableDto);
    void deleteTimeTable(Long id);
}
