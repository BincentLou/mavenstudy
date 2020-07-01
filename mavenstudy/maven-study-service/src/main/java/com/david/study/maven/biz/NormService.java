package com.david.study.maven.biz;

/**
 * @version $Id: null.java, v 1.0 2020/6/29 5:25 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:${TODO}(这里用一句话描述这个类的作用)
 * @since 1.0
 **/
public interface NormService {

    void doBiz(String messgae) throws Exception ;

   void doExceptionHandler(Throwable e, Class clazs, String beanName, String methodName,String bizCode);
}
