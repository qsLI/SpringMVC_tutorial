package com.air;

import org.apache.log4j.Logger;

/**
 * Created by KL on 2015/12/11.
 */
public class LoggerAspect {
    static Logger log = Logger.getLogger(HelloWorldBean.class.getName());

    public void before() {
        log.info("call LoggerAspect.before----KL");
    }

    public void after() {
        log.info("call LoggerAspect.after");
    }
}
