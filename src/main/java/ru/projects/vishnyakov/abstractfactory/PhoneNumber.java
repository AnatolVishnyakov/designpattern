package ru.projects.vishnyakov.abstractfactory;

public abstract class PhoneNumber {
    private String phoneNumber;

    public abstract String getCountryCode();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        Long.parseLong(phoneNumber);
        this.phoneNumber = phoneNumber;
    }
}
