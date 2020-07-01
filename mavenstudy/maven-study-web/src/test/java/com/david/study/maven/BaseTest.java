package com.david.study.maven;

import com.google.gson.Gson;

/**
 * @version $Id: null.java, v 1.0 2020/6/17 11:20 AM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:${TODO}(这里用一句话描述这个类的作用)
 * @since 1.0
 **/
public class BaseTest{

    public static void main(String[] args) {
        BaseParam obj1 = getNewObject();
//        BaseParam obj2 = getNewObject();
        System.out.println(obj1);
    }

    private static BaseParam getNewObject() {
//        BaseParam object = JSON.parseObject("",BaseParam.class);
        Gson gson = new Gson();
        BaseParam object = gson.fromJson("{\"flag\":\"true\"}",BaseParam.class);
        return object;
    }

    public static class BaseParam {

        private Boolean flag = false;


        @Override
        public String toString() {
            return "BaseParam{" +
                    "flag=" + flag +
                    '}';
        }
    }
}
