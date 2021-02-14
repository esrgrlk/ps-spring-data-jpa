package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.TimeSlot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by esra.gurluk on 5.02.2021.
 */
public interface TimeSlotJpaRepository extends JpaRepository<TimeSlot, Long> {
    List<TimeSlot> findByTimeSlotDateBefore(LocalDate startDate);

    List<TimeSlot> findByTimeSlotDateAfter(LocalDate startDate);

    List<TimeSlot> findByTimeSlotDateBetween(LocalDate startDate, LocalDate endDate);
}
