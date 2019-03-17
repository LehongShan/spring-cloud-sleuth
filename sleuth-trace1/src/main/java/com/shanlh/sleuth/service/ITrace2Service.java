package com.shanlh.sleuth.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import vo.Trace2VO;

/**
 * @Description:
 * @Author: 单乐鸿
 * @CreateDate: 2018/11/9 22:15
 */
@FeignClient(name = "TRACE-2")
public interface ITrace2Service {

    @PostMapping("/eg1")
    String eg1(@RequestBody Trace2VO trace2VO);
}
