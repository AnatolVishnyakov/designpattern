package ru.vishnyakov.designpattern.creational.abstractfactory.usa;

import ru.vishnyakov.designpattern.creational.abstractfactory.Address;
import ru.vishnyakov.designpattern.creational.abstractfactory.AddressFactory;
import ru.vishnyakov.designpattern.creational.abstractfactory.PhoneNumber;

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
