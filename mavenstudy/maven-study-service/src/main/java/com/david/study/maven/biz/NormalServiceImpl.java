package com.david.study.maven.biz;

import com.david.study.maven.annotation.Xtransaction;
import com.david.study.maven.annotation.XtransactionContext;
import com.david.study.maven.dao.ExceptionRetryExtMapper;
import com.david.study.maven.entity.ExceptionRetryExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @version $Id: null.java, v 1.0 2020/6/29 5:27 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:${TODO}(这里用一句话描述这个类的作用)
 * @since 1.0
 **/
@Component
public class NormalServiceImpl implements NormService{

    Logger logger = LoggerFactory.getLogger(NormalServiceImpl.class);

    @Resource
    ExceptionRetryExtMapper exceptionRetryExtMapper;

    @Xtransaction
    public void doBiz(String messgae) throws Exception {
        logger.warn("嘿嘿");
        XtransactionContext.setBizCode("121212");
        throw new Exception("故意抛出异常");


    }

    public void doExceptionHandler(Throwable e, Class clazs, String beanName, String methodName,String bizCode) {
        logger.error("执行异常后处理----------------");
        ExceptionRetryExt ex = new ExceptionRetryExt();
        ex.setInvokeId(System.currentTimeMillis());
        ex.setClazzName(clazs.getName());
        ex.setBusinessCode(bizCode);
        ex.setMethodName(methodName);

        ex.setBeanName(beanName);
        ex.setTenantId("001");
        exceptionRetryExtMapper.insertSelective(ex);
    }
}
