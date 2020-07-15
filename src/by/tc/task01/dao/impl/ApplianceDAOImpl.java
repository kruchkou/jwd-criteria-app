package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ApplianceFactory;
import by.tc.task01.dao.ApplianceFileReader;
import by.tc.task01.dao.ApplianceStringUtil;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {

    ApplianceFileReader applianceFileReader;
    ApplianceStringUtil applianceStringUtil;
    ApplianceFactory applianceFactory;

    List<String> appliances;

    @Override
    public List<Appliance> find(Criteria criteria) throws IOException{

        appliances = appliancesByGroup(criteria.getGroupSearchName());

        criteria.getCriteria().forEach((param, criteriaValue) ->
                filterByParam(param, String.valueOf(criteriaValue)));

        return applianceObjectList(criteria.getGroupSearchName());
    }

    private List<String> appliancesByGroup(String groupName) throws IOException {
        List<String> appliancesStringList = new ArrayList<>();
        boolean foundedGroup = false;

        String nextLine;

        do {
            nextLine = applianceFileReader.readLine();

            if (applianceStringUtil.className(nextLine).equals(groupName)) {

                foundedGroup = true;
                appliancesStringList.add(nextLine);

            } else if (foundedGroup && !applianceStringUtil.className(nextLine).equals(groupName)) {
                break;
            }

        } while (nextLine != null);

        return appliancesStringList;
    }

    private void filterByParam(String param, String suitableValue) {
        List<String> result = new ArrayList<>();

        for (String line : appliances) {
            String value = applianceStringUtil.paramValue(param, line);

            if (value.equals(suitableValue)) {
                result.add(line);
            }
        }
        appliances = result;
    }

    public ApplianceDAOImpl() throws FileNotFoundException {
        applianceFileReader = new ApplianceFileReader();
        applianceStringUtil = new ApplianceStringUtil();
        applianceFactory = new ApplianceFactory();
    }

    public List<Appliance> applianceObjectList(String groupName) {
        List<Appliance> applianceList = new ArrayList<>();
        for (String line : appliances) {
            applianceList.add(applianceFactory.create(groupName,line));
        }
        return applianceList;
    }
}


//you may add your own new classes