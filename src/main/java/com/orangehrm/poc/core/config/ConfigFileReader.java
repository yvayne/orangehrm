package com.orangehrm.poc.core.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * It is in charged to read the configuration file.
 */
public class ConfigFileReader {

    private static final Logger LOGGER = LogManager.getLogger();

    private static ConfigFileReader instance;

    private Properties properties;

    /**
     * Private constructor for Env.
     */
    private ConfigFileReader() {
        try (FileInputStream input = new FileInputStream("gradle.properties")) {
            properties = new Properties();
            properties.load(input);
        } catch (FileNotFoundException e) {
            LOGGER.error("File not found.");
            LOGGER.info(e);
        } catch (IOException e) {
            LOGGER.error("File broken.");
            LOGGER.info(e);
        }
    }

    /**
     * Returns the Instance for Env.
     *
     * @return Env instance.
     */
    public static ConfigFileReader getInstance() {
        if (instance == null) {
            instance = new ConfigFileReader();
        }
        return instance;
    }

    /**
     * Gets Env Properties.
     *
     * @param env String option.
     * @return String result.
     */
    public String getEnv(String env) {
        String property = System.getProperty(env);
        if (property == null) {
            return properties.getProperty(env);
        }
        return property;
    }

    /**
     * Gets the Username value.
     *
     * @return String.
     */
    public String getUsername() {
        return getEnv("username");
    }

    /**
     * Gets the Password value.
     *
     * @return String.
     */
    public String getPassword() {
        return getEnv("password");
    }

    /**
     * Gets the Base Url of orangehrm.
     *
     * @return String.
     */
    public String getBaseUrl() {
        return getEnv("baseUrl");
    }

    /**
     * Gets the Browser to use.
     *
     * @return String.
     */
    public String getBrowser() {
        return getEnv("browser");
    }

    /**
     * Gets the Implicit Time Wait.
     *
     * @return the value of implicit time wait.
     */
    public int getImplicitTimeWait() {
        return Integer.parseInt(getEnv("implicitTimeWait"));
    }

    /**
     * Gets the ExplicitT Time Wait.
     *
     * @return the value of explicit time wait.
     */
    public int getExplicitTimeWait() {
        return Integer.parseInt(getEnv("explicitTimeWait"));
    }
}

