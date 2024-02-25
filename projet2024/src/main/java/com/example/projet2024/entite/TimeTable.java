package com.example.projet2024.entite;


import com.example.projet2024.dto.TimeTableDto;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "TimeTable")
public class TimeTable {
    @Id
    @Column(name = "TimeTableID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long timeTableID;

    @Temporal(TemporalType.DATE)
    @Column(name = "StartDate")
    private Date startDate;

    @Temporal(TemporalType.DATE)
    @Column(name = "EndDate")
    private Date endDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "timeTable")
    private Set<Meet> meets;

    @OneToOne(mappedBy = "timeTable")
    private Group group;

    public TimeTableDto getDto() {
        TimeTableDto timeTableDto = new TimeTableDto();
        timeTableDto.setTimeTableId(timeTableID);
        timeTableDto.setStartDate(startDate);
        timeTableDto.setEndDate(endDate);
        //timeTableDto.setMeets(meets);
        //timeTableDto.setGroup(group);
        return timeTableDto;
    }
}

