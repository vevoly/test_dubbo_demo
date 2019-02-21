package com.jevoly.testdubbo;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/2/20 0020.
 */

@Service("testServiceImpl")
public class TestServiceImpl implements TestService{

    @Override
    public String getData(String name) {
        return "你传递的数据是" + name;
    }
}
