package com.wenlincheng.pika.evaluation;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.util.StopWatch;

/**
 * 评价问答中心
 *
 * @author Pikaman
 * @version 1.0.0
 * @date 2021/1/1 10:10 上午
 */
@Slf4j
@EnableAsync
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.wenlincheng.pika.common.core.log.feign"})
@MapperScan("com.wenlincheng.pika.evaluation.mapper")
public class PikaEvaluationApplication {

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        log.info("pika-evaluation 启动中...");
        new SpringApplicationBuilder(PikaEvaluationApplication.class)
                .web(WebApplicationType.SERVLET)
                .listeners(new ApplicationPidFileWriter("pid/pika.evaluation.pid"))
                .run(args);
        stopWatch.stop();
        log.info("pika-evaluation 启动完成! 启动耗时 {} s", stopWatch.getTotalTimeSeconds());
        System.out.println("启动耗时 " + stopWatch.getTotalTimeSeconds() + "s");
    }

}
