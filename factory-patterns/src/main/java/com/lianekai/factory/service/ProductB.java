package com.lianekai.factory.service;

/**
 * 具体产品实现
 *
 * @author yikai.lian
 * @version: 1.0
 * @date 2020/12/23 16:24
 */
public class ProductB extends AbstractProduct {
    @Override
    public void show() {
        System.out.println("生产出了产品B");
    }
}
