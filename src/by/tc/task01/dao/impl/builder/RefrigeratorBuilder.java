package by.tc.task01.dao.impl.builder;

import by.tc.task01.dao.ApplianceBuilder;
import by.tc.task01.dao.ApplianceStringUtil;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder implements ApplianceBuilder {

    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private double overallCapacity;
    private int height;
    private int width;

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void loadPramsFromStringArr(String applianceLine) {
        String[] params = new ApplianceStringUtil().allParams(applianceLine);
        setPowerConsumption(Integer.parseInt(params[0]));
        setWeight(Integer.parseInt(params[1]));
        setFreezerCapacity(Integer.parseInt(params[2]));
        setOverallCapacity(Double.parseDouble(params[3]));
        setHeight(Integer.parseInt(params[4]));
        setWidth(Integer.parseInt(params[5]));
    }

    @Override
    public Appliance build() {
        return new Refrigerator(powerConsumption,weight,freezerCapacity,overallCapacity,height,width);
    }
}
