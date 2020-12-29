package top.hellooooo.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Q
 * @Date 26/12/2020 14:22
 * @Description
 */
@SpringBootApplication
@EnableDiscoveryClient
// Feign接口所在包名
@EnableFeignClients("top.hellooooo.gulimall.member.feign")
public class GulimallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }
}
