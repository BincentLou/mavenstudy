/**
 * hsjry.com Inc.
 * Copyright (c) 2014-2019 All Rights Reserved.
 */
package com.david.study.maven.annotation;


/**
 * 业务编号上下文
 * @author liangjf
 * @version $Id: BizCodeContext.java, v 1.0 2019年3月10日 下午7:01:45 liangjf Exp $
 * @since 1.0
 */
public class XtransactionContext {

	 private static ThreadLocal<String> context = new ThreadLocal<String>();
	 
	/**
	 * Getter method for property <tt>bizCode</tt>.
	 * 
	 * @return property value of bizCode
	 */
	public static String getBizCode() {
		return context.get();
	}

	/**
	 * Setter method for property <tt>bizCode</tt>.
	 * 
	 * @param bizCode value to be assigned to property bizCode
	 */
	public static void setBizCode(String bizCode) {
		context.set(bizCode);
	}
	
    public static void removecontext() {
    	context.remove();
    }
	 
}
