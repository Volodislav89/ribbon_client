package com.spring_cloud.ribbon_client;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RibbonConfiguration {
    @Autowired
    IClientConfig iClientConfig;

    @Bean
    public IPing ping(IClientConfig iClientConfig) {
        return new PingUrl();
    }

    @Bean
    public IRule rule(IClientConfig iClientConfig) {
        return new WeightedResponseTimeRule();
    }
}
