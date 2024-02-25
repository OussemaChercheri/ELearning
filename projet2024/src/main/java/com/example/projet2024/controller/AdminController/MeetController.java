package com.example.projet2024.controller.AdminController;

import com.example.projet2024.dto.MeetDto;
import com.example.projet2024.service.Meets.MeetsService;
import lombok.RequiredArgsConstructor;
import com.example.projet2024.entite.Meet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class MeetController {

    private final MeetsService meetsService;

    @PostMapping("meet")
    public ResponseEntity<Meet> createmeet(@RequestBody MeetDto meetDto){
        Meet meet = meetsService.createMeet(meetDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(meet);

    }

}
