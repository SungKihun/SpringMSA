package covi.springmsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringMsaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMsaApplication.class, args);
    }

}
