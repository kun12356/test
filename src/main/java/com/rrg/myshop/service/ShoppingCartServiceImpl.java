package com.rrg.myshop.service;

import javax.annotation.Resource;
import com.rrg.myshop.entity.ShoppingCart;
import com.rrg.myshop.dao.ShoppingCartMapper;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{

    @Resource
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return shoppingCartMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShoppingCart record) {
        return shoppingCartMapper.insert(record);
    }

    @Override
    public int insertSelective(ShoppingCart record) {
        return shoppingCartMapper.insertSelective(record);
    }

    @Override
    public ShoppingCart selectByPrimaryKey(Integer id) {
        return shoppingCartMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShoppingCart record) {
        return shoppingCartMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShoppingCart record) {
        return shoppingCartMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ShoppingCart> findAllByUserId(Integer id) {
        return shoppingCartMapper.selectAllByUserId(id);
    }

}
