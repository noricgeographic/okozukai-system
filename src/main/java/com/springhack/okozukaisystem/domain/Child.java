package com.springhack.okozukaisystem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Child {

    private String name;

    private LocalDate birthday;

}
