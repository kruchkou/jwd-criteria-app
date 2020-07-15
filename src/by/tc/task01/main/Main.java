package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Appliance> appliance;

        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
        criteriaOven.add(Oven.CAPACITY.toString(), 33);

        try {
            appliance = service.find(criteriaOven);
            PrintApplianceInfo.print(appliance);// find(Object...obj)
        } catch (IOException e) {
            e.printStackTrace();
        }

        //////////////////////////////////////////////////////////////////

        criteriaOven = new Criteria(Oven.class.getSimpleName());
        criteriaOven.add(Oven.HEIGHT.toString(), 40);
        criteriaOven.add(Oven.DEPTH.toString(), 60);

        try {
            appliance = service.find(criteriaOven);
            PrintApplianceInfo.print(appliance);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //////////////////////////////////////////////////////////////////

        Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
        criteriaTabletPC.add(TabletPC.COLOR.toString(), "blue");
        criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
        criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

        try {
            appliance = service.find(criteriaTabletPC); //find(Object...obj)
            PrintApplianceInfo.print(appliance);
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
