package com.springhack.okozukaisystem.integration.enitity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ChildrenEntity {
    private long childId;
    private String name;
    private LocalDate birthday;
}
