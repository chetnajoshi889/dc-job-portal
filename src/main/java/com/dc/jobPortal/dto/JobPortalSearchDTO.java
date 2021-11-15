package com.dc.jobPortal.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class JobPortalSearchDTO {

    @NotBlank(message = "Please provide skill.")
    private String skill;

    @NotBlank(message = "Please provide location.")
    private String location;
}
