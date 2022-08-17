package com.samin.logbackdemo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestService {

    private Integer times = 0;

    public void setTimes() {
        log.info("times count 1 ... now is: {}", times);
        times += 1;
    }
}
