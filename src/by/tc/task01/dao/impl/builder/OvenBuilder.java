package by.tc.task01.dao.impl.builder;

import by.tc.task01.dao.ApplianceBuilder;
import by.tc.task01.dao.ApplianceStringUtil;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

public class OvenBuilder implements ApplianceBuilder {

    private int powerConsumption;
    private int weight;
    private int capacity;
    private double depth;
    private double height;
    private double width;

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void loadPramsFromStringArr(String applianceLine) {
        String[] params = new ApplianceStringUtil().allParams(applianceLine);
        setPowerConsumption(Integer.parseInt(params[0]));
        setWeight(Integer.parseInt(params[1]));
        setCapacity(Integer.parseInt(params[2]));
        setDepth(Double.parseDouble(params[3]));
        setHeight(Double.parseDouble(params[4]));
        setWidth(Double.parseDouble(params[5]));
    }

    @Override
    public Appliance build() {
        return new Oven(powerConsumption,weight,capacity,depth,height,width);
    }
}
