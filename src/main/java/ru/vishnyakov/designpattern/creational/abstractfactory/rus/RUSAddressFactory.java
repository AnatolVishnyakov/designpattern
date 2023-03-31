package ru.vishnyakov.designpattern.creational.abstractfactory.rus;

import ru.vishnyakov.designpattern.creational.abstractfactory.Address;
import ru.vishnyakov.designpattern.creational.abstractfactory.AddressFactory;
import ru.vishnyakov.designpattern.creational.abstractfactory.PhoneNumber;

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
