//package com.yupi.springbootinit.config;
//
//import lombok.Data;
//import org.redisson.Redisson;
//import org.redisson.api.RedissonClient;
//import org.redisson.config.Config;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@ConfigurationProperties(prefix = "spring.redis")
//@Configuration
//@Data
//public class RedissonConfig {
//    private Integer database;
//    private String host;
//    private Integer port;
//    private String password;
//
//    @Bean
//    public RedissonClient redissonClient() {
//        Config config = new Config();
//        config.useSingleServer()
//                .setDatabase(1)
//                .setAddress("redis//ddddd")
//                .setPassword("123445");
//        RedissonClient redisson = Redisson.create(config);
//        return redisson;
//    }
//
//}
