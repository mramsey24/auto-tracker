package com.mvrsoft.autotracker.controller;

import com.mvrsoft.autotracker.model.ServiceAppointment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerController {
 
    @GetMapping("/appointment")
    public ServiceAppointment getServiceAppointment
    (@RequestParam (value="id") String appointmentId) {
        return new ServiceAppointment();
    }

}
