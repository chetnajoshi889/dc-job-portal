package com.dc.jobPortal.services.interfaces;

import com.dc.jobPortal.common.ResponseUtil;
import com.dc.jobPortal.dto.JobPortalSearchDTO;

public interface JobPortalService {

    ResponseUtil searchJobBySkillAndLocation(JobPortalSearchDTO jobPortalSearchDTO);
}
