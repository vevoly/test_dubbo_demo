package com.jevoly.testdubbo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/2/20 0020.
 */

@RestController
public class TestController {
//这里应该声明一个sevice，但是service最终会变成一个web项目，我们无法直接依赖。
//    解决方式：我们将service的接口声明和实现进行拆分。
//    将service创建一个jar包项目
//    因为除了controller中会用到service外，service实现也用到了这个接口

    @Resource
    private TestService service;

    @RequestMapping("/getData")
    @ResponseBody
    public String getData(String name) {

        return service.getData(name);
    }
}
