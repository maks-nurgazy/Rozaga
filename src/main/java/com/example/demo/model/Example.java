package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Example {

    private Integer coachId;

    private String coachKod;

    private String coachName;

    private String coachSurname;

    private UserInfo userInfo;

}
