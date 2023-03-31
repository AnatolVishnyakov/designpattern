package ru.vishnyakov.designpattern.behavioral.extensionobjects.concreteextension;

import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.CommanderExtension;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.units.CommanderUnit;

public class Commander implements CommanderExtension {

    private final CommanderUnit unit;

    public Commander(CommanderUnit unit) {
        this.unit = unit;
    }

    @Override
    public void commanderReady() {
        System.out.println("[Commander] " + unit.getName() + " is ready!");
    }
}
