package com.event_Planner.eventPlanner.servicesActs;

import com.event_Planner.eventPlanner.models.Show;

import java.util.List;

public interface Showservices {
    Show insert(Show s);

    List<Show>findallshows();

    Show findbyid(Long id);

    long findcounts();

    boolean delete(Long id);

    boolean deleteAll(List<Show> ids);

    boolean update(Show s);

    boolean updateAll(List<Show> s);

}
