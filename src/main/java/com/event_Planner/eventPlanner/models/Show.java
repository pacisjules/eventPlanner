package com.event_Planner.eventPlanner.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
@Entity
@Table(name = "show")
public class Show {
    @Id
    @SequenceGenerator(
            name="show_sequence",
            sequenceName="show_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "show_sequence"
    )
    private  Long id;
    private  String show_name;
    private String show_location;
    private String show_description;
    private LocalDate show_date;
    private LocalTime show_time;

    public Show() {
    }

    public Show(Long id, String show_name, String show_location, String show_description, LocalDate show_date, LocalTime show_time) {
        this.id = id;
        this.show_name = show_name;
        this.show_location = show_location;
        this.show_description = show_description;
        this.show_date = show_date;
        this.show_time = show_time;
    }

    public Show(String show_name, String show_location, String show_description, LocalDate show_date, LocalTime show_time) {
        this.show_name = show_name;
        this.show_location = show_location;
        this.show_description = show_description;
        this.show_date = show_date;
        this.show_time = show_time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShow_name() {
        return show_name;
    }

    public void setShow_name(String show_name) {
        this.show_name = show_name;
    }

    public String getShow_location() {
        return show_location;
    }

    public void setShow_location(String show_location) {
        this.show_location = show_location;
    }

    public String getShow_description() {
        return show_description;
    }

    public void setShow_description(String show_description) {
        this.show_description = show_description;
    }

    public LocalDate getShow_date() {
        return show_date;
    }

    public void setShow_date(LocalDate show_date) {
        this.show_date = show_date;
    }

    public LocalTime getShow_time() {
        return show_time;
    }

    public void setShow_time(LocalTime show_time) {
        this.show_time = show_time;
    }

    @Override
    public String toString() {
        return "Show{" +
                "id=" + id +
                ", show_name='" + show_name + '\'' +
                ", show_location='" + show_location + '\'' +
                ", show_description='" + show_description + '\'' +
                ", show_date=" + show_date +
                ", show_time=" + show_time +
                '}';
    }
}
