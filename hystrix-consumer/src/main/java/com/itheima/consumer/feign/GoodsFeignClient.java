package com.itheima.consumer.feign;


import com.itheima.consumer.domain.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//fallback = GoodsFeignClientImpl.class ：设置降级回调类
@FeignClient(value = "HYSTRIX-PROVIDER", fallback = GoodsFeignClientImpl.class)
public interface GoodsFeignClient {


    @GetMapping("/goods/findOne/{id}")
    public Goods findGoodsById(@PathVariable("id") int id);

}
