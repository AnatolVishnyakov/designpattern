package ru.vishnyakov.designpattern.behavioral.extensionobjects.units;

import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.UnitExtension;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.concreteextension.Sergeant;

import java.util.Optional;

public class SergeantUnit extends Unit {

    public SergeantUnit(String name) {
        super(name);
    }

    @Override
    public UnitExtension getUnitExtension(String extensionName) {
        if (extensionName.equalsIgnoreCase("SergeantExtension")) {
            return Optional.ofNullable(unitExtension)
                    .orElseGet(() -> new Sergeant(this));
        }
        return super.getUnitExtension(extensionName);
    }
}
