[![Stories in Ready](https://badge.waffle.io/liquidpineapple/movienight-voting-app-api.png?label=ready&title=Ready)](https://waffle.io/liquidpineapple/movienight-voting-app-api)
# Setting up your IDE

1. Clone the repository
1. Open the preferred IDE
1. Import the project as a *Maven* project
1. Make sure that you are using at least JDK version 1.8 or above
1. Run `mvn generate-sources generate-resources`
1. (Eclipse only) set the `target/metamodel` as *source* directory in the IDE. (You can find this under `Properties > Build Path`)
1. Run `mvn compile`
1. Install [Project Lombok](https://projectlombok.org)
    * For **Eclipse** follow these steps:
        1. Close Eclipse.
        1. Download the [Lombok JAR](https://projectlombok.org/downloads/lombok.jar)
        1. Run the `lombok.jar` and add it to your IDE (the installation contains the required steps to do this)
    * For **IntelliJ**
        1. Go to: `File > Settings... > Plugins > Browse repositories...
        1. Search for "lombok"
        1. Install "Lombok plugin"
