package com.pluralsight.conferencedemo.models;

import com.pluralsight.conferencedemo.repositories.TimeSlotJpaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by esra.gurluk on 5.02.2021.
 */
@SpringBootTest
public class TimeSlotTest {

    @Autowired
    private TimeSlotJpaRepository repository;

    @Test
    public void testJpaBefore() throws Exception {
        List<TimeSlot> timeSlots = repository.findByTimeSlotDateBefore(LocalDate.of(2020, 5, 10));
        assertTrue(timeSlots.size() > 0);
    }

    @Test
    public void testJpaAfter() throws Exception {
        List<TimeSlot> timeSlots = repository.findByTimeSlotDateAfter(LocalDate.of(2020, 4, 9));
        assertTrue(timeSlots.size() > 0);
    }

    @Test
    public void testJpaBetween() throws Exception {
        List<TimeSlot> timeSlots = repository.findByTimeSlotDateBetween(LocalDate.of(2020, 3, 1), LocalDate.of(2020, 4, 15));
        assertTrue(timeSlots.size() > 0);
    }
}
