package com.qf.domain;

import java.util.Date;

/**
 * Created by Administrator on 2019/5/29.
 */
public class Shoper {
    private Integer id;
    private String posName;
    private String posStatus;
    private Integer posPic;
    private Date posTime;
//    private List<Shop> shopList;
//    private Shop shop;
    private  ShopPic shopPic;

    public ShopPic getShopPic() {
        return shopPic;
    }

    public void setShopPic(ShopPic shopPic) {
        this.shopPic = shopPic;
    }

//    public void setShop(Shop shop) {
//        this.shop = shop;
//    }
//
//    public Shop getShop() {
//        return shop;
//    }

   

//    public Shoper(Date posTime, Integer posPic, String posStatus, String posName, Integer id) {
//        this.posTime = posTime;
//        this.posPic = posPic;
//        this.posStatus = posStatus;
//        this.posName = posName;
//        this.id = id;
//    }

    @Override
    public String toString() {
        return "Shoper{" +
                "id=" + id +
                ", posName='" + posName + '\'' +
                ", posStatus='" + posStatus + '\'' +
                ", posPic=" + posPic +
                ", posTime=" + posTime +
//                ", shopList=" + shopList +
//                ", shop=" + shop +
                ", shopPic=" + shopPic +
                ", startRow=" + startRow +
                ", endRow=" + endRow +
                '}';
    }

//    public Shoper() {
//    }

//    public List<Shop> getShopList() {
//        return shopList;
//    }
//
//    public void setShopList(List<Shop> shopList) {
//        this.shopList = shopList;
//    }

    private int startRow;
    private int endRow;

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosName() {
        return posName;
    }

    public void setPosName(String posName) {
        this.posName = posName;
    }

    public String getPosStatus() {
        return posStatus;
    }

    public void setPosStatus(String posStatus) {
        this.posStatus = posStatus;
    }

    public Integer getPosPic() {
        return posPic;
    }

    public void setPosPic(Integer posPic) {
        this.posPic = posPic;
    }

    public Date getPosTime() {
        return posTime;
    }

    public void setPosTime(Date posTime) {
        this.posTime = posTime;
    }


}
