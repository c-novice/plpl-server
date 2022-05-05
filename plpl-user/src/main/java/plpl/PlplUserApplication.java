package plpl;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lzq
 */
@SpringBootApplication
@MapperScan(basePackages = {"plpl.user.mapper"})
public class PlplUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(PlplUserApplication.class, args);
    }
}

