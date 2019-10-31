package com.qf.service.impl;

import com.qf.dao.ShopMapper;
import com.qf.domain.Shop;
import com.qf.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/5/29.
 */
@Service
public class ShopServiceImpl implements ShopService{
    @Autowired
    private ShopMapper shopMapper;
    @Override
    public Shop selectShopById(int id) {
        return shopMapper.selectShopById(id);
    }

    @Override
    public void deleteShopById(int id) {
        shopMapper.deleteShopById(id);

    }

    @Override
    public void updateShopById(Shop shop) {
        shopMapper.updateShopById(shop);

    }

    @Override
    public void insertShop(Shop shop) {
        shopMapper.insertShop(shop);

    }

    @Override
    public void insertSelective(Shop shop) {
        shopMapper.insertSelective(shop);

    }

    @Override
    public void updateSelective(Shop shop) {
        shopMapper.updateShopById(shop);

    }

    @Override
    public List<Shop> selectAll(Shop shop) {
        return shopMapper.selectAll(shop);
    }
}
