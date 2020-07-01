package com.david.study.maven.biz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @version $Id: null.java, v 1.0 2020/6/29 5:46 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:${TODO}(这里用一句话描述这个类的作用)
 * @since 1.0
 **/
@Component
public class AsynServiceImpl implements AsynService{

    Logger logger = LoggerFactory.getLogger(AsynServiceImpl.class);
    @Autowired
    private NormService normService;

    @Async
    public void doBiz(String message) throws Exception {
        logger.warn("异步执行-----------------");
        normService.doBiz(message);
    }
}
