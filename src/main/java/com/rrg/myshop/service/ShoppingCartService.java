package com.rrg.myshop.service;

import com.rrg.myshop.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService{


    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);

    List<ShoppingCart> findAllByUserId(Integer id);

}
