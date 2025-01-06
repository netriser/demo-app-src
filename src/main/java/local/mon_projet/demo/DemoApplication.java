package local.mon_projet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"local.mon_projet.demo.model"}) // Scanne uniquement ce package
@EnableJpaRepositories(basePackages = {"local.mon_projet.demo.repository"}) // Scanne les repositories
@ComponentScan(basePackages = {"local.mon_projet.demo"}) // Scanne les composants
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
