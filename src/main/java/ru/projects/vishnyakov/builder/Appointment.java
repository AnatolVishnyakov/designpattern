package ru.projects.vishnyakov.builder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appointment {
    private Date startDate;
    private Date endDate;
    private String description;
    private List<Contact> attendees = new ArrayList<>();
    private Location location;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Contact> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Contact> attendees) {
        this.attendees = attendees;
    }

    public void addAttendee(Contact attendee) {
        this.attendees.add(attendee);
    }

    public void removeAttendee(Contact attendee) {
        this.attendees.remove(attendee);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "startDate=" + startDate +
                ", endDate=" + endDate +
                ", description='" + description + '\'' +
                ", attendees=" + attendees +
                ", location=" + location +
                '}';
    }
}
