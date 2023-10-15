package com.hyd.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author 侯贻达
 * version 1.0
 * @desc 在java的java.lang.reflect.InvocationHandler包下
 * 有一个InvocationHandler接口,可以实现动态产生代理对象.
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;


    public  MyInvocationHandler(Object target){
        this.target = target;
    }

    /**
     * @param proxy  代理对象
     * @param method   目标方法
     * @param args   目标方法执行需要的参数
     * @return     目标方法执行后返回值
     * @throws Throwable
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //目标方法前:前期宣传
        System.out.println("前期宣传");
        //目标方法执行
        Object ret = method.invoke(target,args);

        //目标方法后:后期维护
        System.out.println("后期维护");
        return ret;
    }
}
