package helpers;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:testing.properties"})
public interface TestingProperties extends Config {
    String username();

    String password();

    String website();

    String product();

}
