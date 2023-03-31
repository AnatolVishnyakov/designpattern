package ru.vishnyakov.designpattern.creational.abstractfactory;

public interface AddressFactory {
    Address createAddress();

    PhoneNumber createPhoneNumber();
}
