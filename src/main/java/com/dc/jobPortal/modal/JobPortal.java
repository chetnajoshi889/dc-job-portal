package com.dc.jobPortal.modal;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document(collection = "job_portal")
public class JobPortal {

    @Id
    private String id;

    private String skill;

    private String location;

    @Field(name = "company_name")
    private String companyName;

    @Field(name = "creation_ts")
    private Long creationTs;

    @Field(name = "modified_ts")
    private Long modifiedTs;

}
