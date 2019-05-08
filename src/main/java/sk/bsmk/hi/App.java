package sk.bsmk.hi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"sk.bsmk", "org.openapitools.configuration"})
public class App {

  public static void main(String ... args) {
    SpringApplication.run(App.class, args);
  }

}
