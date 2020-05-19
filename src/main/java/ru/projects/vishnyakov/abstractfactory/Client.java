package ru.projects.vishnyakov.abstractfactory;

import ru.projects.vishnyakov.abstractfactory.rus.RUSAddressFactory;
import ru.projects.vishnyakov.abstractfactory.usa.USAddressFactory;

public class Client {
    public static void main(String[] args) {
        AddressFactory factory = new USAddressFactory();
        System.out.println("\tUSA");

        Address address = factory.createAddress();
        address.setCity("New York");
        address.setRegion("USA");
        address.setPostalCode("13-K-231");
        address.setStreet("Garden square");
        System.out.println(address.getFullAddress());

        PhoneNumber phoneNumber = factory.createPhoneNumber();
        phoneNumber.setPhoneNumber("1110230203");
        System.out.println(phoneNumber.getPhoneNumber());
        System.out.println(phoneNumber.getCountryCode());

        factory = new RUSAddressFactory();
        System.out.println("\n\tRUS");

        address = factory.createAddress();
        address.setCity("Moscow");
        address.setRegion("RUSSIA");
        address.setStreet("Pushkina");
        address.setPostalCode("382131");
        System.out.println(address.getFullAddress());

        phoneNumber = factory.createPhoneNumber();
        phoneNumber.setPhoneNumber("12345678");
        System.out.println(phoneNumber.getPhoneNumber());
        System.out.println(phoneNumber.getCountryCode());
    }
}
