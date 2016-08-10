package net.liquidpineapple.movienight.server;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

@Slf4j
public class Config {

  private Properties properties;

  public Config() {
    this.properties = new Properties();
    reload();
  }

  public void reload() {
    InputStreamReader reader = new InputStreamReader(
      getClass().getResourceAsStream("/config.properties")
    );
    try {
      properties.load(reader);
    } catch (IOException e) {
      log.error(e.getMessage());
    }
  }

  public int getHttpPort() {
    return Integer.parseInt(properties.getProperty("http.port", "8080"));
  }
}
