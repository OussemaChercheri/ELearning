package com.example.projet2024.service;


import com.example.projet2024.dto.GroupDto;

import java.util.List;
import java.util.Optional;

public interface GroupService {
    List<GroupDto> getAllGroups();
    Optional<GroupDto> getGroupById(Long id);
    GroupDto createGroup(GroupDto groupDto);
    Optional<GroupDto> updateGroup(Long id, GroupDto groupDto);
    void deleteGroup(Long id);
}
