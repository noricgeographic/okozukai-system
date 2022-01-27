package com.springhack.okozukaisystem.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class Child {

    /** ID */
    private Long childId;

    /** 名前 */
    private String name;

    /** 誕生日 */
    private LocalDate birthday;
}
