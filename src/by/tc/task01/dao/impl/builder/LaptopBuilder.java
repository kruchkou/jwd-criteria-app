package by.tc.task01.dao.impl.builder;

import by.tc.task01.dao.ApplianceBuilder;
import by.tc.task01.dao.ApplianceStringUtil;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;

public class LaptopBuilder implements ApplianceBuilder {

    private double batteryCapacity;
    private String os;
    private int memoryRom;
    private int systemMemory;
    private double cpu;
    private int displayInchs;

    @Override
    public Appliance build() {
        return new Laptop(batteryCapacity,os,memoryRom,systemMemory,cpu,displayInchs);
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    public void loadPramsFromStringArr(String applianceLine) {
        String[] params = new ApplianceStringUtil().allParams(applianceLine);
        setBatteryCapacity(Double.parseDouble(params[0]));
        setOs(os = params[1]);
        setMemoryRom(Integer.parseInt(params[2]));
        setSystemMemory(Integer.parseInt(params[3]));
        setCpu(Double.parseDouble(params[4]));
        setDisplayInchs(Integer.parseInt(params[5]));
    }
}
