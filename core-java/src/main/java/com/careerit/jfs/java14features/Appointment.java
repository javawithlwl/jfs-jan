package com.careerit.jfs.java14features;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Builder
@Data
public class Appointment {
    private String id;
    private String location;
    private String doctor;
    private String patient;
    private LocalDate date;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Status status;
}
