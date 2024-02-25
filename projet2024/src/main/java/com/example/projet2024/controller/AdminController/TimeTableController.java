package com.example.projet2024.controller.AdminController;



import com.example.projet2024.dto.TimeTableDto;
import com.example.projet2024.service.TimeTable.TImeTableService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class TimeTableController {

    private final TImeTableService tImeTableService;

    public ResponseEntity<TimeTableDto> addTimeTable(@ModelAttribute TimeTableDto timeTableDto){
        TimeTableDto timeTableDto1 = tImeTableService.addTimeTable(timeTableDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(timeTableDto1);
    }


}
