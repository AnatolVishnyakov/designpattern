package ru.projects.vishnyakov.abstractfactory.rus;

import ru.projects.vishnyakov.abstractfactory.Address;

public class RUSAddress extends Address {
    private static final String COUNTRY = "RUSSIA";

    @Override
    public String getCountry() {
        return COUNTRY;
    }

    public String getFullAddress() {
        return getStreet() + EOL_STRING +
                getCity() + COMMA + SPACE + getRegion() +
                SPACE + getPostalCode() + EOL_STRING +
                COUNTRY + EOL_STRING;
    }
}
