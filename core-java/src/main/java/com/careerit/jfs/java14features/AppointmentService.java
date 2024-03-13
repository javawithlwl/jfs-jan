package com.careerit.jfs.java14features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {

    List<Appointment> appointments = new ArrayList<>();

    public AppointmentService() {
        Appointment appointment1 = Appointment.builder()
                .id(IdGenerator.generateId())
                .location("Bangalore")
                .doctor("Dr. Ramesh")
                .patient("Krish")
                .date(LocalDate.now())
                .startTime(LocalDateTime.now())
                .endTime(LocalDateTime.now().plusHours(1))
                .status(Status.CONFIRM)
                .build();
        appointments.add(appointment1);
        Appointment appointment2 = Appointment.builder()
                .id(IdGenerator.generateId())
                .location("Bangalore")
                .doctor("Dr. Suresh")
                .patient("Jayesh")
                .date(LocalDate.now())
                .startTime(LocalDateTime.now())
                .endTime(LocalDateTime.now().plusHours(1))
                .status(Status.CONFIRM)
                .build();
        appointments.add(appointment2);
        Appointment appointment3 = Appointment.builder()
                .id(IdGenerator.generateId())
                .location("Bangalore")
                .doctor("Dr. Ramesh")
                .patient("Charan")
                .date(LocalDate.now())
                .startTime(LocalDateTime.now())
                .endTime(LocalDateTime.now().plusHours(1))
                .status(Status.CONFIRM)
                .build();
    }

    // get the appointment of the given doctor (patient, date, startTime, endTime)

    public List<AppointmentDto> getAppointmentsOf(String doctorName){

        List<AppointmentDto> list = new ArrayList<>();
        for(Appointment appointment:appointments){
            if(appointment.getDoctor().equals(doctorName)){
                list.add(new AppointmentDto(appointment.getPatient(),
                        appointment.getDate(),
                        appointment.getStartTime(),
                        appointment.getEndTime()));
            }
        }
        return list;
    }

}
