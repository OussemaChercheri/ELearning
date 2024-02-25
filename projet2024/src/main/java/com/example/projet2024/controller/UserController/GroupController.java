package com.example.projet2024.controller.UserController;


import com.example.projet2024.dto.GroupDto;
import com.example.projet2024.dto.MeetDto;
import com.example.projet2024.entite.Group;
import com.example.projet2024.entite.Meet;
import com.example.projet2024.service.Groups.GroupService;
import com.example.projet2024.service.Meets.MeetsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

    @PostMapping("group")
    public ResponseEntity<Group> creategroup(@RequestBody GroupDto groupDto){
        Group group = groupService.creategroup(groupDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(group);

    }

}
