package ru.vishnyakov.designpattern.behavioral.extensionobjects;

import lombok.extern.slf4j.Slf4j;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.CommanderExtension;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.SergeantExtension;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.abstractextensions.SoldierExtension;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.units.CommanderUnit;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.units.SergeantUnit;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.units.SoldierUnit;
import ru.vishnyakov.designpattern.behavioral.extensionobjects.units.Unit;

import java.util.Optional;
import java.util.function.Function;

@Slf4j
public class ExtensionObjectsApp {

    public static void main(String[] args) {
        Unit soldierUnit = new SoldierUnit("SoldierUnit1");
        Unit sergeantUnit = new SergeantUnit("SergeantUnit1");
        Unit commanderUnit = new CommanderUnit("CommanderUnit1");

        checkExtensionsForUnit(soldierUnit);
        checkExtensionsForUnit(sergeantUnit);
        checkExtensionsForUnit(commanderUnit);
    }

    private static void checkExtensionsForUnit(Unit unit) {
        String name = unit.getName();
        Function<String, Runnable> func = (e) -> () -> log.info(name + " without " + e);

        String extension = "SoldierExtension";
        Optional.ofNullable(unit.getUnitExtension(extension))
                .map(e -> (SoldierExtension) e)
                .ifPresentOrElse(SoldierExtension::soldierReady, func.apply(extension));

        extension = "SergeantExtension";
        Optional.ofNullable(unit.getUnitExtension(extension))
                .map(e -> (SergeantExtension) e)
                .ifPresentOrElse(SergeantExtension::sergeantReady, func.apply(extension));

        extension = "CommanderExtension";
        Optional.ofNullable(unit.getUnitExtension(extension))
                .map(e -> (CommanderExtension) e)
                .ifPresentOrElse(CommanderExtension::commanderReady, func.apply(extension));
    }
}
