package ru.vishnyakov.designpattern.creational.builder;

import java.util.Date;
import java.util.List;

public class Scheduler {
    public Appointment createAppointment(
            AppointmentBuilder builder,
            Date startDate, Date endDate,
            String description, Location location,
            List<Contact> attendees) throws InformationRequiredException {

        if (builder == null) {
            builder = new AppointmentBuilder();
        }
        builder.buildAppointment();
        builder.buildDates(startDate, endDate);
        builder.buildDescription(description);
        builder.buildAttendees(attendees);
        builder.buildLocation(location);
        return builder.getAppointment();
    }
}
