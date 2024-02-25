package com.example.projet2024.dto;



import lombok.Data;

@Data
public class GroupDto {
    private Long groupId;
    private String name;
    private TimeTableDto timeTable;
}
