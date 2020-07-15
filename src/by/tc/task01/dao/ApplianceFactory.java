package by.tc.task01.dao;

import by.tc.task01.dao.impl.builder.*;
import by.tc.task01.entity.Appliance;

public class ApplianceFactory {

    public Appliance create(String className, String applianceLine) {

        switch (className) {
            case "Laptop":
                LaptopBuilder laptopBuilder = new LaptopBuilder();
                laptopBuilder.loadPramsFromStringArr(applianceLine);
                return laptopBuilder.build();
            case "Oven":
                OvenBuilder ovenBuilder = new OvenBuilder();
                ovenBuilder.loadPramsFromStringArr(applianceLine);
                return ovenBuilder.build();
            case "Refrigerator":
                RefrigeratorBuilder refrigeratorBuilder = new RefrigeratorBuilder();
                refrigeratorBuilder.loadPramsFromStringArr(applianceLine);
                return refrigeratorBuilder.build();
            case "Speaker":
                SpeakersBuilder speakersBuilder = new SpeakersBuilder();
                speakersBuilder.loadPramsFromStringArr(applianceLine);
                return speakersBuilder.build();
            case "TabletPC":
                TabletPCBuilder tabletPCBuilder = new TabletPCBuilder();
                tabletPCBuilder.loadPramsFromStringArr(applianceLine);
                return tabletPCBuilder.build();
            case "VacuumCleaner":
                VacuumCleanerBuilder vacuumCleanerBuilder = new VacuumCleanerBuilder();
                vacuumCleanerBuilder.loadPramsFromStringArr(applianceLine);
                return vacuumCleanerBuilder.build();
        }
        return null;
    }

}
