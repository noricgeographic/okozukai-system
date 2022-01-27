package com.springhack.okozukaisystem.presentation.children;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
public class ChildEditForm {

    /** ID */
    @NotNull
    private Long childId;

    /** 名前 */
    @NotBlank
    private String name;

    /** 誕生日 */
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
}
