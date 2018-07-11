package com.tomSpringProject.demo.entities;

public class Event {
    private String nameOfEvent;
    private String location;
    private String dateOfEvent;

    public Event(String nameOfEvent, String location, String dateOfEvent) {
        this.nameOfEvent = nameOfEvent;
        this.location = location;
        this.dateOfEvent = dateOfEvent;
    }

    public String getNameOfEvent() {
        return nameOfEvent;
    }

    public String getLocation() {
        return location;
    }

    public String getDateOfEvent() {
        return dateOfEvent;
    }

    @Override
    public String toString() {
        return "Event{" +
                "nameOfEvent='" + nameOfEvent + '\'' +
                ", location='" + location + '\'' +
                ", dateOfEvent='" + dateOfEvent + '\'' +
                '}';
    }
}
