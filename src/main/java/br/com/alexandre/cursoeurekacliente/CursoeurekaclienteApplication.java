package br.com.alexandre.cursoeurekacliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CursoeurekaclienteApplication {

    public static void main(String[] args) {
        SpringApplication.run(CursoeurekaclienteApplication.class, args);
    }

}
