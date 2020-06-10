package com.yunshang;

import com.bstek.ureport.console.UReportServlet;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

import javax.servlet.Servlet;

@SpringBootApplication
@MapperScan(basePackages = {"com.yeyoo.mapper"})
@ImportResource("classpath:ureport-console-context.xml")
public class UreportApplication {

    public static void main(String[] args) {
        SpringApplication.run(UreportApplication.class, args);
    }


    /**
     * 进行注册Servlet
     * 配置 UReport2 需要使用到的servlet
     */
    @Bean
    public ServletRegistrationBean<Servlet> buildUReportServlet() {
        return new ServletRegistrationBean(new UReportServlet(), "/ureport/*");
    }
}
