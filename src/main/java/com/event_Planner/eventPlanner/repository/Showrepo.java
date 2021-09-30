package com.event_Planner.eventPlanner.repository;

import com.event_Planner.eventPlanner.models.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Showrepo extends JpaRepository<Show, Long> {
}
