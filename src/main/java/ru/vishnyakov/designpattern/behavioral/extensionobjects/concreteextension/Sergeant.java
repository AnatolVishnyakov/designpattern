package ru.vishnyakov.designpattern.behavioral.extensionobjects.concreteextension;

import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.SergeantExtension;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.units.SergeantUnit;

public class Sergeant implements SergeantExtension {

    private final SergeantUnit unit;

    public Sergeant(SergeantUnit unit) {
        this.unit = unit;
    }

    @Override
    public void sergeantReady() {
        System.out.println("[Sergeant] " + unit.getName() + " is ready!");
    }
}
