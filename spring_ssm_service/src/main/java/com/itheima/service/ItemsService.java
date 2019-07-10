package com.itheima.service;

import com.itheima.domain.Items;

public interface ItemsService {
    /**
     * 根据用户查询用户
     * @param id
     * @return
     */
    public Items findOne(int id);
}
