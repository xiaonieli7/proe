package com.itheima.test.Itheima;

import com.itheima.domain.Items;
import com.itheima.service.impl.ItemsServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/ApplicationContext.xml")
public class ItheimaTest {
    @Autowired
    ItemsServiceImpl service;
    @Test
    public void  itheimaFind(){
        Items one = service.findOne(1);
        System.out.println(one);

    }
}
