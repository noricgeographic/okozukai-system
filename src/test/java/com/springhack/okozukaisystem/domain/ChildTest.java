package com.springhack.okozukaisystem.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChildTest {
    @Test
    public void testConstructor() {
        final Long childId = 1L;
        final String name = "よしお";
        final LocalDate birthday = LocalDate.of(2000, 1, 23);
        Child child = new Child(childId, name, birthday);
        assertEquals(childId, child.getChildId());
        assertEquals(name, child.getName());
        assertEquals(birthday, child.getBirthday());
    }
}
