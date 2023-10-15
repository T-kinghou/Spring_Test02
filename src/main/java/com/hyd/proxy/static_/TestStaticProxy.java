package com.hyd.proxy.static_;

/**
 * @author 侯贻达
 * version 1.0
 * @desc 测试静态代理
 */
public class TestStaticProxy {
    public static void main(String[] args) {

        FangDongProxy fangDongProxy = new FangDongProxy(new FangDongImpl());
        fangDongProxy.chuZhu();

        System.out.println("---------------------");

        CarProxy carProxy = new CarProxy(new CarFactoryImpl());
        carProxy.sellCar();
    }
}
