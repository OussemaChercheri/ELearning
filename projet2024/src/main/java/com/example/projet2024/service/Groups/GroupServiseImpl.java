package com.example.projet2024.service.Groups;


import com.example.projet2024.dto.GroupDto;

import com.example.projet2024.dto.TimeTableDto;
import com.example.projet2024.entite.Group;
import com.example.projet2024.entite.Meet;
import com.example.projet2024.entite.TimeTable;
import com.example.projet2024.repository.GroupRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GroupServiseImpl implements GroupService{

    private final GroupRepo groupRepo;

    public Group creategroup(GroupDto groupDto) {
        Group group = new Group();
        group.setName(groupDto.getName());
        return groupRepo.save(group);
    }
}
