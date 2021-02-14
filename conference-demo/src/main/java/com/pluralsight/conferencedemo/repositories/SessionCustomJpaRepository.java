package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Session;

import java.util.List;

/**
 * Created by esra.gurluk on 14.02.2021.
 */
public interface SessionCustomJpaRepository {
    List<Session> customGetSessions();
}
