package com.david.study.maven.annotation;

import com.david.study.maven.biz.NormService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @version $Id: null.java, v 1.0 2020/6/29 5:13 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:${TODO}(这里用一句话描述这个类的作用)
 * @since 1.0
 **/
@Component
@Aspect
public class XtransactionAspect implements ApplicationContextAware {

    Logger logger = LoggerFactory.getLogger(XtransactionAspect.class);

    private ApplicationContext applicationContext;

    private NormService normService;

    @Pointcut("@annotation(com.david.study.maven.annotation.Xtransaction)")
    public void poitCut(){
        System.out.println("");
    }

    @Before("poitCut()")
    public void before(JoinPoint joinPoint){
        logger.error("切面前——————————————————————----------------------");
    }

    @After("poitCut()")
    public void after(JoinPoint joinPoint){

        logger.error("切面后——————————————————————----------------------");
    }

    @AfterThrowing(pointcut = "poitCut()",throwing = "e")
    public void afterThrowing(JoinPoint joinPoint ,Throwable e){
        try {

            logger.error("失败了--------------------------------------------");
            Class clazs = joinPoint.getTarget().getClass();
            String[] beanNames = applicationContext.getBeanNamesForType(clazs);
            String beanName = beanNames[0];
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            String methodName = signature.getMethod().getName();
            Object bizCodeObj =  XtransactionContext.getBizCode();
            logger.error("开始执行doExceptionHandler");
            normService.doExceptionHandler(e,clazs,beanName,methodName,bizCodeObj.toString());
        }catch (Exception ex){
            logger.error("切面执行失败：",ex);
        }
    }


    @AfterReturning(pointcut = "poitCut()",returning = "result")
    public void afterReturn(JoinPoint joinPoint ,Object result){
        logger.error("return 执行--------------------------------------------");
    }



    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.error("扫描到aspect");
        this.applicationContext = applicationContext;
        normService = applicationContext.getBean(NormService.class);
    }
}
