package com.live.liveteam;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@MapperScan(basePackages = {"com.live.liveteam.mapper"})
@Import(FdfsClientConfig.class)
public class LiveteamApplication {

    public static void main(String[] args) {
        SpringApplication.run(LiveteamApplication.class, args);
    }



}
