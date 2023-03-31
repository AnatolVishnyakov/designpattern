package ru.vishnyakov.designpattern.behavioral.extensionobjects.units;

import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.UnitExtension;

public abstract class Unit implements UnitExtension {

    private final String name;

    protected UnitExtension unitExtension;

    public Unit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UnitExtension getUnitExtension(String extensionName) {
        return null;
    }
}
