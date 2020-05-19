package ru.projects.vishnyakov.abstractfactory.rus;

import ru.projects.vishnyakov.abstractfactory.PhoneNumber;

public class RUSPhoneNumber extends PhoneNumber {
    private static final String COUNTRY_CODE = "13";
    private static final int NUMBER_LENGTH = 8;

    @Override
    public String getCountryCode() {
        return COUNTRY_CODE;
    }

    public void setCountryCode(String newNumber) {
        if (NUMBER_LENGTH == newNumber.length()) {
            super.setPhoneNumber(newNumber);
        }
    }
}
