package com.example.projet2024.dto;

import java.util.Date;
import java.util.Set;

import com.example.projet2024.entite.TimeTable;
import lombok.Data;

@Data
public class TimeTableDto {
    private Long timeTableId;
    private Date startDate;
    private Date endDate;
    private Set<MeetDto> meets;
    private GroupDto group;


}
