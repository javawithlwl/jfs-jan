package com.careerit.jfs.java14features;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AppointmentManager {

    public static void main(String[] args) {

        Appointment obj1 =
                Appointment.builder()
                        .id(IdGenerator.generateId())
                        .location("Bangalore")
                        .doctor("Dr. Ramesh")
                        .patient("Krish")
                        .date(LocalDate.now())
                        .startTime(LocalDateTime.now())
                        .endTime(LocalDateTime.now().plusHours(1))
                        .status(Status.CONFIRM)
                        .build();
        System.out.println(obj1);
        // Builder pattern

    }
}
