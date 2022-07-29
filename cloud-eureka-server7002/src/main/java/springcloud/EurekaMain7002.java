package springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author xxx
 * @create 2022-07-29 15:15
 */
@Slf4j
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain7002 {
    public static void main(String[] args) {

        SpringApplication.run(EurekaMain7002.class,args);
        log.info("----eureka7002启动成功---");
    }
}
