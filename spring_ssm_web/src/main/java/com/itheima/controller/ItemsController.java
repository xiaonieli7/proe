package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import com.itheima.service.impl.ItemsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/item")
public class ItemsController {
   /* @Autowired
    private ItemsServiceImpl itemsService;*/
    @RequestMapping("/findOne")
    public String findOnes(Model model){
       /* Items item = itemsService.findOne(1);*/
        ApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        ItemsService items = ac.getBean(ItemsService.class);
        Items item = items.findOne(1);
        System.out.println(item);
        model.addAttribute("item", item);

        return "itemDetail";
    }
}
