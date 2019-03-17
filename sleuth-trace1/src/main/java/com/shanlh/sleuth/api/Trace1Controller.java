package com.shanlh.sleuth.api;

import com.shanlh.sleuth.service.ITrace2Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vo.Trace2VO;

/**
 * @Description:
 * @Author: 单乐鸿
 * @CreateDate: 2018/11/9 21:57
 */
@RestController
@RequestMapping("/trace1")
@Slf4j
public class Trace1Controller {
    @Autowired
    private ITrace2Service trace2Service;

    @GetMapping("/name")
    public void trace1(String name){
        Trace2VO trace2VO = new Trace2VO();
        trace2VO.setName(name);
        log.info("trace1 访问 trace2");
        trace2Service.eg1(trace2VO);
    }
}
