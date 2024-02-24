package com.example.projet2024.dto;

import java.util.Date;

import lombok.Data;

@Data
public class MeetDto {
    private Long meetID;
    private String title;
    private Date startDate;
    private Date endDate;
    private TimeTableDto timeTable;
}
