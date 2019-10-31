package com.qf.service;

import com.qf.domain.ShopPic;

import java.util.List;

/**
 * Created by 54110 on 2019-05-27.
 */
public interface ShopPicService {

    List<ShopPic> selectAll(ShopPic shopPic);

    int selectUserCount();

    void updateStatus(ShopPic shopPic);
    void deleteByPrimaryKey(int id);

    //根据id查找一个图片对象
    ShopPic selectById(Integer picId);
}
