package hello.core;

import hello.core.discount.FixDiscountPolicy;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class AutoAppConfigTest {


    @Test
    void basicScan(){
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        OrderServiceImpl orderServiceImpl = ac.getBean(OrderServiceImpl.class);

        Assertions.assertThat(orderServiceImpl.getDiscountPolicy()).isInstanceOf(FixDiscountPolicy.class);


    }

}