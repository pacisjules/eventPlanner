package com.event_Planner.eventPlanner.controller;

import com.event_Planner.eventPlanner.models.Show;
import com.event_Planner.eventPlanner.servicesImpl.Showimplementations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "MainApi")
public class MainController {

    private static final String REQUEST_NO_BODY = "Request does not contain a body";
    @Autowired
    Showimplementations showimplementations;

    @GetMapping("")
    public List<Show>getallshows(){
        return showimplementations.findallshows();
    }

    @GetMapping("{id}")
    public Show getPerson(@PathVariable long id) {
        return showimplementations.findbyid(id);
    }

    @PostMapping("")
    public String addShow(@RequestBody Show show) {

        if(show != null) {
            showimplementations.insert(show);
            return "Show  has been Added";
        } else {
            return REQUEST_NO_BODY;
        }
    }

    @DeleteMapping("{id}")
    public String deleteShow(@PathVariable("id") long id) {
        if(id > 0) {
            if(showimplementations.delete(id)) {
                return "Deleted the Show.";
            } else {
                return "Cannot delete the Show.";
            }
        }
        return "The id is invalid for the Show.";
    }

    @PutMapping("")
    public String updatePerson(@RequestBody Show show) {
        if(show != null) {
            showimplementations.update(show);
            return "Updated Show.";
        } else {
            return REQUEST_NO_BODY;
        }
    }

    @GetMapping("/count")
    public long Counting(){
        return showimplementations.findcounts();
    }


    //Print List in Jav    //Welcoming the visitor
    //    @GetMapping("welcome")
    //    public String Hallo() {
    //        String Message="<b>Working with Spring Data Repositories Developed by ISHIMWE JULES Pacis</b>";
    //        return "<center>Message:  "+Message+"</center>";
    //    }a Spring
    @GetMapping("/list")
    public List<String> mylist() {
        return  List.of("Amakuru","Amata", "Amahoro","Amafi");
    }
}
