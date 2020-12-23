package com.lianekai.factory;

import com.lianekai.factory.service.FactoryA;
import com.lianekai.factory.service.FactoryB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 工厂方法启动类
 *
 * @author yikai.lian
 * @version: 1.0
 * @date 2020/12/23 16:21
 */
@SpringBootApplication
public class FactoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(FactoryApplication.class);
        //客户要产品A
        FactoryA mFactoryA = new FactoryA();
        mFactoryA.manufacture();

        //客户要产品B
        FactoryB mFactoryB = new FactoryB();
        mFactoryB.manufacture();
    }
}
