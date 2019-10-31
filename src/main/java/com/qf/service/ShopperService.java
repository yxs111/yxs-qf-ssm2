package com.qf.service;

import com.qf.domain.Shoper;

import java.util.List;

/**
 * Created by Administrator on 2019/5/29.
 */
public interface ShopperService {

    Shoper selectShopperById(int id);
    void deleteShopperById(int id);
    void updateShopperById(Shoper shoper);
    void insertShopper(Shoper shoper);
    void insertSelective(Shoper shoper);
    void updateSelective(Shoper shoper);
    int selectAllCount(Shoper shoper);
    Shoper selectShoperByName(Shoper shoper);
    List<Shoper> selectAll(Shoper shoperInfo);
    Shoper selectShoperAll (Shoper shoper);
}
