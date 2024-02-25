package com.example.projet2024.controller.UserController;



import com.example.projet2024.entite.TimeTable;
import com.example.projet2024.repository.MeetRepo;
import com.example.projet2024.repository.TimeTableRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/timetables")
public class TimeTableController {
    @Autowired
    private TimeTableRepo timeTableRepo;

    @Autowired
    private MeetRepo meetRepo;



}
