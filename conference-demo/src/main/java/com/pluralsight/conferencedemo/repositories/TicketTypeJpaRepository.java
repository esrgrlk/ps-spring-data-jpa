package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.TicketType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by esra.gurluk on 5.02.2021.
 */
public interface TicketTypeJpaRepository extends JpaRepository<TicketType, String> {
    List<TicketType> findByIncludesWorkshopTrue();
}
