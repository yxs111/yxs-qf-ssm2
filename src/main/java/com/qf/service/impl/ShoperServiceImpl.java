package com.qf.service.impl;

import com.qf.dao.ShoperMapper;
import com.qf.domain.Shoper;
import com.qf.service.ShopperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2019/5/29.
 */
@Service
public class ShoperServiceImpl implements ShopperService {
    @Autowired
    private ShoperMapper shoperMapper;

//    public List<Shoper> selectAll() {
//        return  shoperMapper.selectAll(shoperInfo);
//    }

    @Override
    public Shoper selectShopperById(int id) {
        return shoperMapper.selectShopperById(id);
    }
    @Override
    public Shoper selectShoperByName(Shoper shoper) {
        return shoperMapper.selectShoperByName(shoper);
    }
    @Override
    public void deleteShopperById(int id) {
        shoperMapper.deleteShopperById(id);

    }

    @Override
    public void updateShopperById(Shoper shoper) {
        shoperMapper.updateShopperById(shoper);

    }

    @Override
    public void insertShopper(Shoper shoper) {
        shoperMapper.insertShopper(shoper);

    }

    @Override
    public void insertSelective(Shoper shoper) {
        shoperMapper.insertSelective(shoper);

    }

    @Override
    public void updateSelective(Shoper shoper) {
        shoperMapper.updateSelective(shoper);

    }

    @Override
    public int selectAllCount(Shoper shoper) {
        return shoperMapper.selectAllCount(shoper);
    }

    @Override
    public List<Shoper> selectAll(Shoper shoperInfo) {
        return  shoperMapper.selectAll(shoperInfo);
    }
    public Shoper selectShoperAll(Shoper shoper){
        return shoperMapper.selectShoperAll(shoper);
    }

}
