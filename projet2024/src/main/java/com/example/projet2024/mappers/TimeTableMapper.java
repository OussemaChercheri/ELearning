package com.example.projet2024.mappers;

import com.example.projet2024.dto.MeetDto;
import com.example.projet2024.dto.TimeTableDto;
import com.example.projet2024.dto.GroupDto;
import com.example.projet2024.entite.Meet;
import com.example.projet2024.entite.TimeTable;
import com.example.projet2024.entite.Group;

import java.util.HashSet;
import java.util.Set;

public class TimeTableMapper {
    public static TimeTableDto mapTimeTableToDto(TimeTable timeTable) {
        TimeTableDto dto = new TimeTableDto();

        dto.setTimeTableId(timeTable.getTimeTableID());
        dto.setStartDate(timeTable.getStartDate());
        dto.setEndDate(timeTable.getEndDate());

        Set<MeetDto> meetDtos = new HashSet<>();
        for (Meet meet : timeTable.getMeets()) {
            MeetDto meetDto = new MeetDto();

            meetDtos.add(meetDto);
        }
        dto.setMeets(meetDtos);


        GroupDto groupDto = new GroupDto();
        Group group = timeTable.getGroup();

        dto.setGroup(groupDto);

        return dto;
    }
}

