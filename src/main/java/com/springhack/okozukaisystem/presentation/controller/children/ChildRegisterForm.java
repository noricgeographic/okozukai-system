package com.springhack.okozukaisystem.presentation.controller.children;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class ChildRegisterForm {

    /** 名前 */
    @NotBlank
    private String name;

    /** 誕生日 */
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
}
