package com.kps.template.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWord1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger("com.kps.template.logback.HelloWord1");
        //由于logback的默认配置策略，如果找不到默认配置文件，logback将在根日志器中添加一个consoleAppender
        logger.debug("Hello World1");
    }
}
