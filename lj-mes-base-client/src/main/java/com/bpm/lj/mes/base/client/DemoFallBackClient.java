package com.bpm.lj.mes.base.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * <p>Title: DemoFallBackClient</p>
 * <p>Description: Feign异常处理</p>
 * <p>Company: http://www.wootion.com/</p>
 * <p>create date: 2020/03/26</p>
 *
 * @author :tanhuan
 * @version :1.0
 */
@Component
public class DemoFallBackClient implements FallbackFactory<DemoClient> {

    @Override
    public DemoClient create(Throwable throwable) {
        return null;
    }
}