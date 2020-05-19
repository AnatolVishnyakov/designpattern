package ru.projects.vishnyakov.abstractfactory;

public interface AddressFactory {
    Address createAddress();

    PhoneNumber createPhoneNumber();
}
