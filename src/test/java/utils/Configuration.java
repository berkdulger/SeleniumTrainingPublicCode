package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Configuration {
	private Properties configProps = new Properties();
	private String geckoDriverPath;

	Configuration () {
		try {
			String configFile = "config.properties";
			configProps.load(ClassLoader.getSystemResourceAsStream(configFile));

			this.geckoDriverPath = configProps.getProperty("webdriver.gecko.driver");

		} catch (IOException e) {
			System.err.println("Cannot read config file");
		}
	}

	public String getGeckoDriverPath() {
		return geckoDriverPath;
	}
}
