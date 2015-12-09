package com.air;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.annotation.Annotation;

/**
 * Created by KL on 2015/12/8.
 */
@Controller
public class HelloWorldBean{
    static Logger log = Logger.getLogger(HelloWorldBean.class.getName());
    @RequestMapping(path="/hello",method = RequestMethod.GET)
        public String sayHello() {
            log.info("Hello World");
            return "hello";
        }
}
