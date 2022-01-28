package com.springhack.okozukaisystem.integration.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
public class ChildrenEntity {
    private Long childId;
    private String name;
    private LocalDate birthday;
}
