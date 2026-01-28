package com.zh.sky.context;


/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/28 14:05
 */
public class BaseContext {

    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    public static Long getCurrentId(){
        return threadLocal.get();
    }
    public static void removeCurrentId(){
        threadLocal.remove();
    }
}
