package com.hyd.proxy.static_;

/**
 * @author 侯贻达
 * version 1.0
 * @desc 房东代理中介
 */
public class FangDongProxy {
    private FangDong fangDong;
    public FangDongProxy(FangDong fangDong){
        this.fangDong = fangDong;
    }
    // 执行代理方法
    public void chuZhu(){
        //前: 功能增强
        System.out.println("租房前进行的事情...");
        fangDong.chuZhu();
        //后: 功能增强
        System.out.println("租房后进行的事情...");

    }

}
