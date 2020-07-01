package com.david.study.maven;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @version $Id: null.java, v 1.0 2020/6/12 1:15 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:测试
 * @since 1.0
 **/
public class AppTest extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public void testA(){
        System.out.println("嘿嘿");
        assertTrue("正确",true);
    }
}
