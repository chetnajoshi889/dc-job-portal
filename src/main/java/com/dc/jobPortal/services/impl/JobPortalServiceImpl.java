package com.dc.jobPortal.services.impl;

import com.dc.jobPortal.common.ResponseUtil;
import com.dc.jobPortal.dto.JobPortalSearchDTO;
import com.dc.jobPortal.modal.JobPortal;
import com.dc.jobPortal.repository.JobPortalRepository;
import com.dc.jobPortal.services.interfaces.JobPortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import java.util.List;

public class JobPortalServiceImpl implements JobPortalService {

    @Autowired
    private JobPortalRepository jobPortalRepository;

    @Override
    public ResponseUtil searchJobBySkillAndLocation(JobPortalSearchDTO jobPortalSearchDTO) {
        List<JobPortal> jobPortal = jobPortalRepository.searchJobBySkillAndLocation(jobPortalSearchDTO);

        if (jobPortal.isEmpty()) {
            return new ResponseUtil(HttpStatus.NOT_FOUND.value(), "Jobs not found with that skill and location", null);
        }

        return new ResponseUtil(HttpStatus.OK.value(), "Request Completed Successfully.", jobPortal);
    }
}
