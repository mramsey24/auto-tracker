package com.mvrsoft.autotracker.controller;

import javax.websocket.server.PathParam;

import com.mvrsoft.autotracker.model.ServiceAppointment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrackerController {
 
    @GetMapping("/appointment/{apptId}")
    public ServiceAppointment getServiceAppointment
    (@PathVariable String apptId) {
        return new ServiceAppointment();
    }

}
