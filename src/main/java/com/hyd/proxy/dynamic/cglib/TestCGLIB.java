package com.hyd.proxy.dynamic.cglib;

/**
 * @author 侯贻达
 * version 1.0
 */
public class TestCGLIB {
    public static void main(String[] args) {
        // 动态代理,只需要给定目标类,就会产生目标类的代理对象

        MyProxyInterceptor myProxyInterceptor = new MyProxyInterceptor(FangDongImpl.class);
        FangDongImpl proxy = (FangDongImpl) myProxyInterceptor.getProxyBean();
        proxy.chuZhu();

        // CGLIB代理的好处,就在于目标类即可以实现接口,也可以不用实现接口,都可以代理
    }
}
