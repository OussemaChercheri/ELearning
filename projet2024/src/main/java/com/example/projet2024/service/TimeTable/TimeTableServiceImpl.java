package com.example.projet2024.service.TimeTable;

import com.example.projet2024.dto.TimeTableDto;
import com.example.projet2024.entite.Group;
import com.example.projet2024.entite.Meet;
import com.example.projet2024.entite.TimeTable;
import com.example.projet2024.repository.GroupRepo;
import com.example.projet2024.repository.MeetRepo;
import com.example.projet2024.repository.TimeTableRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class TimeTableServiceImpl {

    private final TimeTableRepo timeTableRepo;

    private final MeetRepo meetRepo;

    private final GroupRepo groupRepo;

    public TimeTableDto addTimeTable(TimeTableDto timeTableDto){
        TimeTable timeTable = new TimeTable();
        timeTable.setStartDate(timeTableDto.getStartDate());
        timeTable.setEndDate(timeTableDto.getEndDate());

        Meet meet = meetRepo.findById(timeTableDto.getTimeTableId()).orElseThrow();
        Group group = groupRepo.findById(timeTableDto.getTimeTableId()).orElseThrow();

        timeTable.setMeets((Set<Meet>) meet);
        timeTable.setGroup(group);

        return timeTableRepo.save(timeTable).getDto();

    }
    

}
