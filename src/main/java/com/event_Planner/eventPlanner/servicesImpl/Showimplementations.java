package com.event_Planner.eventPlanner.servicesImpl;

import com.event_Planner.eventPlanner.models.Show;
import com.event_Planner.eventPlanner.repository.Showrepo;
import com.event_Planner.eventPlanner.servicesActs.Showservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Showimplementations implements Showservices {
    @Autowired
    private  final Showrepo repository;

    public Showimplementations(Showrepo repository) {
        this.repository = repository;
    }

    @Override
    public Show insert(Show s) {
        return repository.save(s);
    }

    @Override
    public List<Show> findallshows() {
        return repository.findAll();
    }

    @Override
    public Show findbyid(Long id) {
        Optional<Show> result = repository.findById(id);
        return result.orElse(null);
    }

    @Override
    public long findcounts() {
        return repository.count();
    }

    @Override
    public boolean delete(Long id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public boolean deleteAll(List<Show> ids) {
        return false;
    }

    @Override
    public boolean update(Show s) {
        return false;
    }

    @Override
    public boolean updateAll(List<Show> s) {
        return false;
    }
}
