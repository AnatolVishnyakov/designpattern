package ru.projects.vishnyakov.abstractfactory.rus;

import ru.projects.vishnyakov.abstractfactory.Address;
import ru.projects.vishnyakov.abstractfactory.AddressFactory;
import ru.projects.vishnyakov.abstractfactory.PhoneNumber;

public class RUSAddressFactory implements AddressFactory {
    @Override
    public Address createAddress() {
        return new RUSAddress();
    }

    @Override
    public PhoneNumber createPhoneNumber() {
        return new RUSPhoneNumber();
    }
}
