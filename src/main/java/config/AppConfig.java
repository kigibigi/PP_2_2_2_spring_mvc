package config;

import dao.CarDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CarDAO carDAO() {
        return new CarDAO();
    }
}
