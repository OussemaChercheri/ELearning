package com.example.projet2024.service.Meets;

import com.example.projet2024.dto.MeetDto;
import com.example.projet2024.entite.Meet;
import com.example.projet2024.repository.MeetRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MeetServiceImpl implements MeetsService{

    private final MeetRepo meetRepo;

    public Meet createMeet(MeetDto meetDto){
        Meet meet = new Meet();
        meet.setTitle(meetDto.getTitle());
        meet.setEndDate(meetDto.getEndDate());
        meet.setStartDate(meetDto.getStartDate());

        return meetRepo.save(meet);

    }
}
