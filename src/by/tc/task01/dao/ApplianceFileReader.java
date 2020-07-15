package by.tc.task01.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ApplianceFileReader {

    private final String FILEPATH = "resources/appliances_db.txt";
    private final BufferedReader bufferedReader;

    public String readLine() throws IOException {
        String line = bufferedReader.readLine();
        if(line.equals("")) {
            line = readLine();
        }
        return line;
    }

    public ApplianceFileReader() throws FileNotFoundException {
        FileReader fileReader = new FileReader(FILEPATH);
        bufferedReader = new BufferedReader(fileReader);
    }

}
