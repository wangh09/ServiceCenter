package Server;

/**
 * Created by wangh09 on 2017/2/21.
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.SpringApplication;
@SpringBootApplication
@EnableEurekaServer
public class ServiceCenter {
    public static void main(String[] args) {
        SpringApplication.run(ServiceCenter.class, args);
    }
}
