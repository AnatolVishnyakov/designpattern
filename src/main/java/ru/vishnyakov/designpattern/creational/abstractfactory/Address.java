package ru.vishnyakov.designpattern.creational.abstractfactory;

public abstract class Address {
    public static final String EOL_STRING = System.getProperty("line.separator");
    public static final String SPACE = " ";
    public static final String COMMA = ",";
    private String street;
    private String city;
    private String region;
    private String postalCode;

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public abstract String getCountry();

    public String getFullAddress() {
        return street + EOL_STRING +
                city + SPACE + postalCode + EOL_STRING;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}