package com.shanlh.sleuth.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vo.Trace2VO;

/**
 * @Description:
 * @Author: 单乐鸿
 * @CreateDate: 2018/11/9 22:18
 */
@Slf4j
@RestController
public class Trace2Controller {


    @PostMapping("/eg1")
    public String eg1(@RequestBody Trace2VO vo){
        log.info("request params->name is {}",vo.getName());
        return "this is trace2 application eg1";
    }
}
