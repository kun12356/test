package com.rrg.myshop.dao;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.rrg.myshop.entity.ShoppingCart;

public interface ShoppingCartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    ShoppingCart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);

    /**
     * 根据userId查询购物车列表
     * @param userId
     * @return
     */
    List<ShoppingCart> selectAllByUserId(@Param("userId")Integer userId);


}