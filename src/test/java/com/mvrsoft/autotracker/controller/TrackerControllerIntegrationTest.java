package com.mvrsoft.autotracker.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import com.mvrsoft.autotracker.model.ServiceAppointment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TrackerControllerIntegrationTest {
    
    @Autowired
    TrackerController trackerController;

    @Test
    public void get_ServiceAppointment() {
        //Given
        String appointmentId = "ABCD";
        

        //When
        ServiceAppointment appointment = trackerController.getServiceAppointment(appointmentId);
        
        //Then
        assertNotNull(appointment);
        assertEquals("Joes Chevy Dealership", appointment.getServiceProviderName());
        assertEquals(new BigDecimal("25.00"), appointment.getCost());
        

    }
}
