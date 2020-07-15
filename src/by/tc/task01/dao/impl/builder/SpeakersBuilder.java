package by.tc.task01.dao.impl.builder;

import by.tc.task01.dao.ApplianceBuilder;
import by.tc.task01.dao.ApplianceStringUtil;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

public class SpeakersBuilder implements ApplianceBuilder {

    private int powerConsumption;
    private int numberOfSpeakers;
    private String frequencyRange;
    private int cordLength;

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    public void loadPramsFromStringArr(String applianceLine) {
        String[] params = new ApplianceStringUtil().allParams(applianceLine);
        setPowerConsumption(Integer.parseInt(params[0]));
        setNumberOfSpeakers(Integer.parseInt(params[1]));
        setFrequencyRange(params[2]);
        setCordLength(Integer.parseInt(params[3]));
    }

    @Override
    public Appliance build() {
        return new Speakers(powerConsumption,numberOfSpeakers,frequencyRange,cordLength);
    }
}
