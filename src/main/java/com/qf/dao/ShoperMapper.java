package com.qf.dao;

import com.qf.domain.Shoper;

import java.util.List;

/**
 * Created by Administrator on 2019/5/29.
 */
public interface ShoperMapper {
   List<Shoper>selectAll(Shoper shoper);
   Shoper selectShopperById(int id);
   void deleteShopperById(int id);
   void updateShopperById(Shoper shoper);
   void insertShopper(Shoper shoper);
   void insertSelective(Shoper shoper);
   void updateSelective(Shoper shoper);
   Shoper selectShoperByName(Shoper shoper);
   int selectAllCount(Shoper shoper);
   Shoper selectShoperAll (Shoper shoper);


}
