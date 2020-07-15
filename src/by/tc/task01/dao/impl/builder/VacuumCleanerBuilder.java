package by.tc.task01.dao.impl.builder;

import by.tc.task01.dao.ApplianceBuilder;
import by.tc.task01.dao.ApplianceStringUtil;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder implements ApplianceBuilder {

    private int powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    public void loadPramsFromStringArr(String applianceLine) {
        String[] params = new ApplianceStringUtil().allParams(applianceLine);
        setPowerConsumption(Integer.parseInt(params[0]));
        setFilterType(params[1]);
        setBagType(params[2]);
        setWandType(params[3]);
        setMotorSpeedRegulation(Integer.parseInt(params[4]));
        setCleaningWidth(Integer.parseInt(params[5]));
    }

    @Override
    public Appliance build() {
        return new VacuumCleaner(powerConsumption,filterType,bagType,wandType,motorSpeedRegulation,cleaningWidth);
    }
}
