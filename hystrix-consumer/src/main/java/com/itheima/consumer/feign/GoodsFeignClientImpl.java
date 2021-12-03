package com.itheima.consumer.feign;

import com.itheima.consumer.domain.Goods;
import org.springframework.stereotype.Component;

@Component
public class GoodsFeignClientImpl implements GoodsFeignClient {

    @Override
    public Goods findGoodsById(int id) {
        Goods goods = new Goods();
        goods.setTitle("降级了！消费者");
        return goods;
    }
}
