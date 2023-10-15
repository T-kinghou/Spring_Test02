package com.hyd.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * @author 侯贻达
 * version 1.0
 */
public class TestJDKDynamic {
    public static void main(String[] args) {

//        // 动态代理,只需要给定目标类,就会产生目标类的代理对象
//        Class clazz = FangDongImpl.class;
//        ClassLoader loader = clazz.getClassLoader();
//        Class[] interfaces = clazz.getInterfaces();
//        MyInvocationHandler handler = new MyInvocationHandler(new FangDongImpl());
//         /**
//          * @param   loader 被代理的类(目标类)的类加载器
//          * @param   interfaces 被代理的类(目标类)的实现的接口数组
//          * @param   handler 刚才自己创建的MyInvocationHandler
//          * @return 返回代理对象
//          */
//        FangDong proxy = (FangDong) Proxy.newProxyInstance(loader, interfaces, handler);
//        proxy.chuZhu();

        Class clazz = CarFactoryImpl.class;
        ClassLoader loader = clazz.getClassLoader( );
        Class[] interfaces = clazz.getInterfaces( );
        MyInvocationHandler handler = new MyInvocationHandler(new CarFactoryImpl( ));
        /**
         * @param   loader 被代理的类(目标类)的类加载器
         * @param   interfaces 被代理的类(目标类)的实现的接口数组
         * @param   handler 刚才自己创建的MyInvocationHandler
         * @return 返回代理对象
         */
        CarFactory proxy = (CarFactory) Proxy.newProxyInstance(loader, interfaces, handler);

        proxy.sellCar();

        //  JDK的动态代理,目标类必须实现接口,否则代理失败
    }

}
