package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.DishDto;
import com.itheima.reggie.entity.Dish;

import javax.crypto.interfaces.PBEKey;

public interface DishService extends IService<Dish> {

    //新增菜品，同时加入口味数据：dish dishFlavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品和口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新询菜品和口味信息
    public void updateWithFlavor(DishDto dishDto);
}
