package com.mvrsoft.autotracker.controller;

import static org.mockito.ArgumentMatchers.anyString;

import com.mvrsoft.autotracker.model.ServiceAppointment;
import com.mvrsoft.autotracker.service.TrackerService;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.BDDMockito.given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest
public class TrackerControllerTest {
 
    @Mock
    TrackerService trackerService;

    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void test_get_appointment() throws Exception {
        given(trackerService.getServiceAppointment(anyString())).willReturn(new ServiceAppointment());

        mockMvc.perform(MockMvcRequestBuilders.get("/appointment/1"))
        .andExpect(status().isOk());
        //.andExpect(jsonPath("name").value("prius"))
        //.andExpect(jsonPath("type").value("hybrid"));
    }
}
