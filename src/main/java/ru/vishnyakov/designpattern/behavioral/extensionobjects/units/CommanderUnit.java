package ru.vishnyakov.designpattern.behavioral.extensionobjects.units;

import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.UnitExtension;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.concreteextension.Commander;

import java.util.Optional;

public class CommanderUnit extends Unit {

    public CommanderUnit(String name) {
        super(name);
    }

    @Override
    public UnitExtension getUnitExtension(String extensionName) {
        if (extensionName.equalsIgnoreCase("CommanderExtension")) {
            return Optional.ofNullable(unitExtension)
                    .orElseGet(() -> new Commander(this));
        }
        return super.getUnitExtension(extensionName);
    }
}
