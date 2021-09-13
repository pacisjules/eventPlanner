package com.event_Planner.eventPlanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication

public class EventPlannerSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventPlannerSystemApplication.class, args); }

}
