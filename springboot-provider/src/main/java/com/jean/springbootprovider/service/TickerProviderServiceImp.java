package com.jean.springbootprovider.service;


import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;


@Component
@Service
public class TickerProviderServiceImp implements TickerProviderService
{
    @Override
    public String getTicker() {
        return "我不是药神";
    }
}

