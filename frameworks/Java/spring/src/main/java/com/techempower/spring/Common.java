package com.techempower.spring;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * User: Denis Baranov
 * Date: 2/18/15
 */
public class Common {

    private static final int cpuCount = Runtime.getRuntime().availableProcessors();

    // todo: parameterize multipliers
    public static ExecutorService EXECUTOR = new ThreadPoolExecutor(
        cpuCount * 2, cpuCount * 25, 200, TimeUnit.MILLISECONDS,
        new LinkedBlockingQueue<Runnable>(cpuCount * 100),
        new ThreadPoolExecutor.CallerRunsPolicy());

}
