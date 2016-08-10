package net.liquidpineapple.movienight.server;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.eclipse.jetty.server.Server;
import org.slf4j.bridge.SLF4JBridgeHandler;

@Slf4j
public class MovieNightServer {

  private final Server server;

  public MovieNightServer() {
    Config config = new Config();

    server = new Server(config.getHttpPort());

  }

  public static void main(String... args) throws Exception {
    SLF4JBridgeHandler.removeHandlersForRootLogger();
    SLF4JBridgeHandler.install();

    MovieNightServer movieNightServer = new MovieNightServer();
    movieNightServer.startServer();
    movieNightServer.joinThread();
  }

  private void startServer() throws Exception {
    server.start();
    Runtime.getRuntime().addShutdownHook(new Thread(this::stopServer));
  }

  private void joinThread() throws InterruptedException {
    server.join();
  }

  @SneakyThrows
  private void stopServer() {
    server.stop();
  }
}
