package com.xg.java.springboot.common.utils;

import org.dozer.DozerBeanMapper;

/**
 * Created by xionggao on 2017/6/28.
 * 简单封装Dozer，实现深度转换Bean -> Bean之间的转换
 * <p/>
 * 1. 持有Mapper的单例.
 * 2. 泛型返回值转换.
 * 3. 批量转换Collection中的所有对象.
 * 4. 区分创建新的B对象与将对象A值复制到已存在的B对象两种函数.
 * <p/>
 */
public class BeanMapper {
    /**
     * 创建Dozer单例，避免重复创建dozer 浪费资源
     */
    private static DozerBeanMapper dozer = new DozerBeanMapper();

    public BeanMapper() {}

    /**
     * 基于Dozer转换对象的类型
     */
    public static <T> T map(Object source,Class<T>destinationClass) {
        return dozer.map(source,destinationClass);
    }

    /**
     * 基于Dozer转换Collection中对象的类型
     */


}
