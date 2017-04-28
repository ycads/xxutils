package com.xxxxtech.xxutils;

/**
 * create date：2017/4/28 10:13
 * @author dawson@xxxxtech.com
 * @version 1.0
 * @since JDK 1.7.0_79
 * fileName： SystemUtils.java
 * Description：系统工具类
 */
public class SystemUtils {

    public static final int DEFAULT_THREAD_POOL_SIZE = getDefaultThreadPoolSize();

    private SystemUtils() {
        throw new AssertionError();
    }


    /**
     *
     * @return 返回线程池的个数
     */
    public static int getDefaultThreadPoolSize() {

        return getDefaultThreadPoolSize(8);
    }

    /**
     * get recommend default thread pool size
     * 
     * @param max  最大线程数
     * @return if 2 * availableProcessors + 1 less than max, return it, else return max;
     */
    public static int getDefaultThreadPoolSize(int max) {
        int availableProcessors = 2 * Runtime.getRuntime().availableProcessors() + 1;
        return availableProcessors > max ? max : availableProcessors;
    }
}
