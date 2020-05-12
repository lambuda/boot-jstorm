package com.haier.rrswl.oms.es;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DynamicDataSourceAutoConfiguration;
import com.haier.rrswl.oms.es.config.ApplicationContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Objects;

@Slf4j
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DruidDataSourceAutoConfigure.class,
        DynamicDataSourceAutoConfiguration.class, GsonAutoConfiguration.class})
public class NewomsJstormEsApplication {

    public synchronized static void runSpring() {
        runSpring(new String[0]);
    }

    public synchronized static void runSpring(String[] args) {
        if (!Objects.isNull(ApplicationContextHolder.getApplicationContext())) {
            return;
        }
        try {
            run(args);
        } catch (UnknownHostException e) {
            log.error("启动springboot时出现异常", e);
        }
    }

    public synchronized static void run(String[] args) throws UnknownHostException {

        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder()
                .sources(NewomsJstormEsApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        Environment env = applicationContext.getEnvironment();

        log.info(
                "\n----------------------------------------------------------\n\t"
                        + "Application '{}' is running! Access URLs:\n\t"
                        + "Local: \t\thttp://127.0.0.1:{}\n\t"
                        + "External: \thttp://{}:{}\n----------------------------------------------------------",
                env.getProperty("spring.application.name"),
                env.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                env.getProperty("server.port"));

    }

}
