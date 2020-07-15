package by.tc.task01.dao.impl.builder;

import by.tc.task01.dao.ApplianceBuilder;
import by.tc.task01.dao.ApplianceStringUtil;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder implements ApplianceBuilder {

    private int batteryCapacity;
    private int displayInches;
    private int memoryRom;
    private int flashMemoryCapacity;
    private String color;

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void loadPramsFromStringArr(String applianceLine) {
        String[] params = new ApplianceStringUtil().allParams(applianceLine);
        setBatteryCapacity(Integer.parseInt(params[0]));
        setDisplayInches(Integer.parseInt(params[1]));
        setMemoryRom(Integer.parseInt(params[2]));
        setFlashMemoryCapacity(Integer.parseInt(params[3]));
        setColor(params[4]);
    }

    @Override
    public Appliance build() {

        return new TabletPC(batteryCapacity,displayInches,memoryRom,flashMemoryCapacity,color);
    }
}
