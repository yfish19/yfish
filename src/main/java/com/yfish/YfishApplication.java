package com.yfish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author yfish
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class YfishApplication
{
    public static void main(String[] args)
    {
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(YfishApplication.class, args);
        System.out.println("yfish 启动成功！ﾞ  \n");
    }
}
