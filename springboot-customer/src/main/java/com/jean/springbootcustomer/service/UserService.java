package com.jean.springbootcustomer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jean.springbootprovider.service.TickerProviderService;
import org.springframework.stereotype.Service;




@Service
public class UserService {

    @Reference
    private TickerProviderService tickerProviderService;
    public void  buyTicket(){
        String ticket=tickerProviderService.getTicker();
        System.out.println("买到票了" + ticket);
    }
}
