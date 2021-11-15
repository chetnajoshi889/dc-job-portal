package com.dc.jobPortal.controllers;

import com.dc.jobPortal.common.ResponseUtil;
import com.dc.jobPortal.dto.JobPortalSearchDTO;
import com.dc.jobPortal.services.interfaces.JobPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class JobPortalController {

    @Autowired
    private JobPortalService jobPortalService;

    @PostMapping("/searchJobBySkillAndLocation")
    public ResponseUtil searchJobBySkillAndLocation(@Valid @RequestBody JobPortalSearchDTO jobPortalSearchDTO) {
        return jobPortalService.searchJobBySkillAndLocation(jobPortalSearchDTO);
    }
}
