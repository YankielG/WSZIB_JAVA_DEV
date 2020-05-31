package pl.edu.wszib.jwd.java_dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
//@PropertySource("classpath:db.properties")
public class JavaDevApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaDevApplication.class, args);
    }

    @Bean
    public SpringDataDialect springDataDialect() {
        return new SpringDataDialect();
    }

    

}
