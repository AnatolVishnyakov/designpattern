package ru.vishnyakov.designpattern.behavioral.extensionobjects.units;

import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.UnitExtension;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.concreteextension.Soldier;

import java.util.Optional;

public class SoldierUnit extends Unit {

    public SoldierUnit(String name) {
        super(name);
    }

    @Override
    public UnitExtension getUnitExtension(String extensionName) {
        if (extensionName.equals("SoldierExtension")) {
            return Optional.ofNullable(unitExtension)
                    .orElseGet(() -> new Soldier(this));
        }
        return super.getUnitExtension(extensionName);
    }
}
