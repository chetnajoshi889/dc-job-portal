package com.dc.jobPortal.repository;

import com.dc.jobPortal.dto.JobPortalSearchDTO;
import com.dc.jobPortal.modal.JobPortal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JobPortalRepository {

    @Autowired
    MongoTemplate mongoTemplate;

    public List<JobPortal> searchJobBySkillAndLocation(JobPortalSearchDTO jobPortalSearchDTO) {
        Query query = new Query();
        query.addCriteria(Criteria.where("skill").regex(jobPortalSearchDTO.getSkill())
                .and("location").regex(jobPortalSearchDTO.getLocation()));

        return mongoTemplate.find(query, JobPortal.class);
    }
}
