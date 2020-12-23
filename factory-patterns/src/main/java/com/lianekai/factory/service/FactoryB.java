package com.lianekai.factory.service;

/**
 * 具体工厂实现
 *
 * @author yikai.lian
 * @version: 1.0
 * @date 2020/12/23 16:24
 */
public class FactoryB extends AbstractFactory{
    @Override
    public AbstractProduct manufacture() {
        return new ProductB();
    }
}
