package utility;
import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;
public class PropertyLoader {

    private Properties properties;
    public PropertyLoader(String propertyFileName) {
        properties = new Properties();
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(propertyFileName)) {
            if (input == null) {
                throw new RuntimeException("Sorry, unable to find " + propertyFileName);
            }
            properties.load(input);
        } catch ( IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error loading properties file", ex);
        }
    }
    public String getProperty(String key) {
        return properties.getProperty(key);
    }

}
