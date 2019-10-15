package com.oracool.shiftlab.cart.config;



import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;

import org.springframework.core.env.Environment;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;



import javax.annotation.Resource;



@Configuration

@EnableWebMvc

@ComponentScan("com.oracool.shiftlab.cart")

public class WebConfig extends WebMvcConfigurerAdapter {



    @Resource

    private Environment env;

}
