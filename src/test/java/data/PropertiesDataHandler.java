package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDataHandler {
    private final String fileName = "mobile-app-automation.properties";
    private final String userMachine = System.getProperty("user.name");
    private final String filePath = "/Users/"+userMachine+"/.secret/ios_automation/"+fileName;
    Properties properties = new Properties();

    public String getPropsValue(String key) throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return properties.getProperty(key);
    }
}
