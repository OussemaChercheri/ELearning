package com.example.projet2024.controller;

import com.example.projet2024.dto.MeetDto;
import com.example.projet2024.service.MeetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/meets")
public class MeetController {

    private final MeetService meetService;

    public MeetController(MeetService meetService) {
        this.meetService = meetService;
    }

    @GetMapping
    public ResponseEntity<List<MeetDto>> getAllMeets() {
        List<MeetDto> meets = meetService.getAllMeets();
        return new ResponseEntity<>(meets, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MeetDto> getMeetById(@PathVariable Long id) {
        Optional<MeetDto> meet = meetService.getMeetById(id);
        return meet.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<MeetDto> createMeet(@RequestBody MeetDto meetDto) {
        MeetDto newMeet = meetService.createMeet(meetDto);
        return new ResponseEntity<>(newMeet, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MeetDto> updateMeet(@PathVariable Long id, @RequestBody MeetDto meetDto) {
        Optional<MeetDto> updatedMeet = meetService.updateMeet(id, meetDto);
        return updatedMeet.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> deleteMeet(@PathVariable Long id) {
        try {
            meetService.deleteMeet(id);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
