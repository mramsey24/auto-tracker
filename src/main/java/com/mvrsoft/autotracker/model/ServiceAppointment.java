package com.mvrsoft.autotracker.model;

import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;

@Data
public class ServiceAppointment {
    private String serviceProviderName;
    private Date appointmentDate;
    private BigDecimal cost;
    private String serviceDescription;
}
