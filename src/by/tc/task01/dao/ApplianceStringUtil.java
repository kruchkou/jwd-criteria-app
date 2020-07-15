package by.tc.task01.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceStringUtil {

    private final String RX_CLASS_NAME = "^[\\w]+";
    private final String RX_ALL_PARAMS = "(=)(.+?(?=[,\\s]|$))";

    private String rxByParam(String param) {
        return "("+param+")[=](.+?(?=[,\n]|$))";
    }

    private String group(String regex, String line, int groupIndex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(line);
        matcher.find();

        return matcher.group(groupIndex);
    }

    public String className(String line) {
        final int CLASS_NAME_GROUP_INDEX = 0;

        return group(RX_CLASS_NAME, line, CLASS_NAME_GROUP_INDEX);
    }

    public String[] allParams(String line) {
        List<String> params = new ArrayList<>();
        final int PARAM_GROUP_INDEX = 2;

        Pattern pattern = Pattern.compile(RX_ALL_PARAMS);
        Matcher matcher = pattern.matcher(line);
        while(matcher.find()) {

            params.add(matcher.group(PARAM_GROUP_INDEX));
        }

        return params.toArray(new String[0]);
    }

    public String paramValue(String param, String line) {
        final int PARAM_VALUE_GROUP_INDEX = 2;
        String regex = rxByParam(param);

        return group(regex,line,PARAM_VALUE_GROUP_INDEX);
    }

}
