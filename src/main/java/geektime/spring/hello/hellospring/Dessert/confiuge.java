package geektime.spring.hello.hellospring.Dessert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:/app.properties")
public class confiuge {
    @Autowired
    Environment env;

}
