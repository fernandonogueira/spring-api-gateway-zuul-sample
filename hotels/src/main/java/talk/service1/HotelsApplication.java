package talk.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HotelsApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelsApplication.class, args);
    }

}
