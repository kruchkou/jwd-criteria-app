package by.tc.task01.main;

import by.tc.task01.entity.*;

import java.sql.Ref;
import java.util.List;

public class PrintApplianceInfo {

    public static void print(List<Appliance> applianceList) {
        for (Appliance appliance : applianceList) {
            print(appliance);
        }
    }

    public static void print(Appliance appliance) {
        switch (appliance.getClass().getSimpleName()) {
            case "Laptop":
                printLaptop((Laptop) appliance);
                break;
            case "Oven":
                printOven((Oven) appliance);
                break;
            case "Refrigerator":
                printRefrigerator((Refrigerator) appliance);
                break;
            case "Speaker":
                printSpeakers((Speakers) appliance);
                break;
            case "TabletPC":
                printTabletPC((TabletPC) appliance);
                break;
            case "VacuumCleaner":
                printVacuumCleaner((VacuumCleaner) appliance);
                break;
            default:
                System.out.println("Incorrect appliance!");
        }
    }

    public static void printLaptop(Laptop laptop) {
        System.out.printf("Laptop:\n\t Battary Capactiy = %.1f\n", laptop.getBatteryCapacity());
        System.out.printf("\t OS = %s\n", laptop.getOs());
        System.out.printf("\t Memory Rom = %d\n", laptop.getMemoryRom());
        System.out.printf("\t System Memory = %d\n", laptop.getSystemMemory());
        System.out.printf("\t Cpu = %.2f\n", laptop.getCpu());
        System.out.printf("\t DisplaySize = %d\n", laptop.getDisplayInchs());
    }

    public static void printOven(Oven oven) {
        System.out.printf("Oven:\n\t Power consumption = %d\n", oven.getPowerConsumption());
        System.out.printf("\t Weight = %d\n", oven.getWeight());
        System.out.printf("\t Capacity = %d\n", oven.getCapacity());
        System.out.printf("\t Depth = %.1f\n", oven.getDepth());
        System.out.printf("\t Height = %.1f\n", oven.getHeight());
        System.out.printf("\t Width = %.1f\n", oven.getWidth());
    }

    public static void printRefrigerator(Refrigerator refrigerator) {
        System.out.printf("Refrigerator:\n\t Power consumption = %d\n", refrigerator.getPowerConsumption());
        System.out.printf("\t Weight = %d\n", refrigerator.getWeight());
        System.out.printf("\t Freezer capacity = %d\n", refrigerator.getFreezerCapacity());
        System.out.printf("\t Overall capacity = %.1f\n", refrigerator.getOverallCapacity());
        System.out.printf("\t Height = %d\n", refrigerator.getHeight());
        System.out.printf("\t Width = %d\n", refrigerator.getWidth());
    }

    public static void printSpeakers(Speakers speakers) {
        System.out.printf("Speakers:\n\t Power consumption = %d\n", speakers.getPowerConsumption());
        System.out.printf("\t Number of speakers = %d\n", speakers.getNumberOfSpeakers());
        System.out.printf("\t Frequency range = %s\n", speakers.getFrequencyRange());
        System.out.printf("\t Cord length = %d\n", speakers.getCordLength());
    }

    public static void printTabletPC(TabletPC tabletPC) {
        System.out.printf("TabletPC:\n\t Battary Capactiy = %d\n", tabletPC.getBatteryCapacity());
        System.out.printf("\t Display inches = %d\n", tabletPC.getDisplayInches());
        System.out.printf("\t Memory Rom = %d\n", tabletPC.getMemoryRom());
        System.out.printf("\t Flash Memory capacity = %d\n", tabletPC.getFlashMemoryCapacity());
        System.out.printf("\t Color = %s\n", tabletPC.getColor());
    }

    public static void printVacuumCleaner(VacuumCleaner vacuumCleaner) {
        System.out.printf("VacuumCleaner:\n\t Power consumption = %d\n", vacuumCleaner.getPowerConsumption());
        System.out.printf("\t Filter type = %s\n", vacuumCleaner.getFilterType());
        System.out.printf("\t Bag type = %s\n", vacuumCleaner.getBagType());
        System.out.printf("\t Wand type = %s\n", vacuumCleaner.getWandType());
        System.out.printf("\t Motor speed regulation= %d\n", vacuumCleaner.getMotorSpeedRegulation());
        System.out.printf("\t Cleaning width = %d\n", vacuumCleaner.getCleaningWidth());
    }

}
