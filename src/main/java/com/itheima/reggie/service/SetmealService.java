package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    //新增套餐，保存套餐与菜品的关联
    public void saveWithDish(SetmealDto setmealDto);

    //删除套餐,同时删除和菜品关联的数据
    public void removeWithDish(List<Long> ids);
}
