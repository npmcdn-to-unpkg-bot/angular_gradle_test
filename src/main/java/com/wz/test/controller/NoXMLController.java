package com.wz.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhen.wang3 on 2016/7/22.
 */
@Controller
public class NoXMLController {
    @RequestMapping("/hello")
     String helloAngularjs() {
        return "index";
    }
}
