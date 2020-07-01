package com.david.study.maven.web;

import com.david.study.maven.biz.AsynService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version $Id: null.java, v 1.0 2020/6/12 3:44 PM david Exp $$
 * @Author:louwenbin(louwb@runyong.cn)
 * @Description:${TODO}(这里用一句话描述这个类的作用)
 * @since 1.0
 **/
@Controller
public class IndexController {


    @Autowired
    private AsynService asynService;

    @RequestMapping("/index")
    public String index() throws Exception {
        asynService.doBiz("index");
        return "hahah";
    }
}
