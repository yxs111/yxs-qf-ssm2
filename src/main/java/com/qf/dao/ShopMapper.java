package com.qf.dao;

import com.qf.domain.Shop;

import java.util.List;

/**
 * Created by Administrator on 2019/5/29.
 */
public interface ShopMapper {
    Shop selectShopById(int id);
    void deleteShopById(int id);
    void updateShopById(Shop shop);
    void insertShop(Shop shop);
    void insertSelective(Shop shop);
    void updateSelective(Shop shop);

    List<Shop> selectAll(Shop shop);
}
