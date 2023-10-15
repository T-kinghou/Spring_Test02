package com.hyd.proxy.dynamic.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 侯贻达
 * version 1.0
 */
public class MyProxyInterceptor implements MethodInterceptor {
    //cglib增强器
    private Enhancer enhancer = new Enhancer();

    public  MyProxyInterceptor(Class targetClass){
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(this);
    }
    //获得代理对象
    public Object getProxyBean(){

        return enhancer.create();
    }


    /**
     *
     * @param target  目标对象(被代理对象)
     * @param method  目标方法
     * @param args   目标方法参数
     * @param methodProxy  代理的目标方法
     * @return  目标方法执行后返回数据
     * @throws Throwable
     */
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

        //前:
        System.out.println("前期宣传...");
        //目标方法
        Object ret = methodProxy.invokeSuper(target,args);

        //后:
        System.out.println("后期维护...");
        return ret;
    }
}
