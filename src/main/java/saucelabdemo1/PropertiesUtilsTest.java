package saucelabdemo1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtilsTest {
	
	public static Properties loadProperties(String path) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputstream = null;
		inputstream = new FileInputStream(path);
		properties.load(inputstream);
		return properties;
	}

	public static Properties loadApplicationProperties() throws IOException {
		Properties prop = PropertiesUtilsTest.loadProperties("C:\\Users\\akilan-18633\\eclipse-workspace\\saucelabdemo\\src\\test\\resources");
		return prop;
		
	}
}
