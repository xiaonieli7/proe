package com.itheima.service.impl;

import com.itheima.dao.Itemsdao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private Itemsdao itemsdao;
    public Items findOne(int id) {
        return itemsdao.findOne(id);
    }
}
