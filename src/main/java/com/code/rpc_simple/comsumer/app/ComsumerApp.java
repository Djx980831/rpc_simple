package com.code.rpc_simple.comsumer.app;

import com.code.rpc_simple.comsumer.service.CalculatorRemoteImpl;
import com.code.rpc_simple.provider.service.Calculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
 * @Author dongjingxiong
 * @Date 17:38 2019/7/11
 **/
public class ComsumerApp {
    private static Logger log = LoggerFactory.getLogger(ComsumerApp.class);

    public static void main(String[] args) {
        Calculator calculator = new CalculatorRemoteImpl();
        int result = calculator.add(1, 2);
        log.info("result is {}", result);
    }
}
