package com.yupi.springbootinit.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiManagerTest {

    @Resource
    private AiManager aiManager;
    @Test
//         分析需求：
//         分析网站用户的增长情况
//         原始数据：
//         日期,用户数
//         1号,10
//         2号,20
//         3号,30
    void doChat() {
        String answer = aiManager.doChat(1822167272153145346L,"分析需求：\n" +
                "分析网站用户的增长情况\n" +
                "原始数据：\n" +
                "日期,用户数\n" +
                "1号,10\n" +
                "2号,20\n" +
                "3号,30");
        System.out.println(answer);
    }
}