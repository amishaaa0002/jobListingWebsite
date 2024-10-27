package com.example.jobListing.modal;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class JobPost {


    private String description;

    private String name;
    private Integer exp;

    private ArrayList<String> techs;

}
