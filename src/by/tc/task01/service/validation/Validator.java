package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

public class Validator {

    static boolean isValid = true;

    public static boolean criteriaValidator(Criteria criteria) {
        criteria.getCriteria().forEach((key, value) ->
                {
                    if (value == null) {
                        isValid = false;
                    }
                }
        );

        if (!isValid) {
            isValid = true;
            return false;
        } else {
            return isValid;
        }
    }

}

//you may add your own new classes