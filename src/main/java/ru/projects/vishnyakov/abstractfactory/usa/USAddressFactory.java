package ru.projects.vishnyakov.abstractfactory.usa;

import ru.projects.vishnyakov.abstractfactory.Address;
import ru.projects.vishnyakov.abstractfactory.AddressFactory;
import ru.projects.vishnyakov.abstractfactory.PhoneNumber;

public class USAddressFactory implements AddressFactory {
    @Override
    public Address createAddress() {
        return new USAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new USPhoneNumber();
    }
}
