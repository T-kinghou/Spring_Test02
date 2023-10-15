package com.hyd.proxy.static_;

/**
 * @author 侯贻达
 * version 1.0
 */
public class CarProxy {

    private CarFactory carFactory;
    public CarProxy(CarFactory carFactory){
        this.carFactory = carFactory;
    }
    //4s店代理卖车
    public void sellCar(){
        //前:增强
        System.out.println("百公里加速2s....");
        //目标方法：卖车
        carFactory.sellCar();
        //后:增强
        System.out.println("后期包维修....");
    }
}
