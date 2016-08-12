package net.liquidpineapple.movienight.server;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Properties;

@Slf4j
public class Config {

  private static final String CONFIG_FILE = "/config.properties";

  private Properties properties;

  public Config() throws IOException {
    this.properties = new Properties();
    reload();
  }

  public void reload() throws IOException {
    InputStream input = getClass().getResourceAsStream(CONFIG_FILE);

    if (input == null) {
      log.error("Could not read file \"" + CONFIG_FILE + "\"");
      throw new FileNotFoundException("Could not read file \"" + CONFIG_FILE + "\"");
    }
    InputStreamReader reader = new InputStreamReader(input);
    properties.load(reader);
  }

  public int getHttpPort() {
    return Integer.parseInt(properties.getProperty("http.port", "8080"));
  }
}
