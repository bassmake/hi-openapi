package sk.bsmk.hi;

import org.openapitools.configuration.OpenAPIDocumentationConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import sk.bsmk.hi.openapi.CustomersApiController;

@SpringBootApplication
@ComponentScan(
  basePackageClasses = {
    OpenAPIDocumentationConfig.class,
    App.class
  },
  excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = CustomersApiController.class)
  }
)
public class App {

  public static void main(String ... args) {
    SpringApplication.run(App.class, args);
  }

}
