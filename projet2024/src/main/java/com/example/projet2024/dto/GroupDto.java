package com.example.projet2024.dto;


import java.util.Set;

import lombok.Data;

@Data
public class GroupDto {
    private Long groupId;
    private String name;
    private TimeTableDto timeTable;
    private Set<UserDto> users;
}
