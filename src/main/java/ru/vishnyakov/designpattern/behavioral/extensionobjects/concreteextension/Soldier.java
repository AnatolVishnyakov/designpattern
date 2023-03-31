package ru.vishnyakov.designpattern.behavioral.extensionobjects.concreteextension;

import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.SoldierExtension;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.units.SoldierUnit;

public class Soldier implements SoldierExtension {

    private final SoldierUnit unit;

    public Soldier(SoldierUnit unit) {
        this.unit = unit;
    }

    @Override
    public void soldierReady() {
        System.out.println("[Soldier] " + unit.getName() + " is ready!");
    }
}
