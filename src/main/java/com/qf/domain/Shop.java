package com.qf.domain;

import java.util.Date;

/**
 * Created by Administrator on 2019/5/29.
 */
public class Shop {
    private Integer id;
    private String shopName;
    private String shopStatus;
    private String shopDetail;
    private String shopPic;
    private Integer posId;
    private Date createTime;
    private Date updateTime;
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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopStatus() {
        return shopStatus;
    }

    public void setShopStatus(String shopStatus) {
        this.shopStatus = shopStatus;
    }

    public String getShopDetail() {
        return shopDetail;
    }

    public void setShopDetail(String shopDetail) {
        this.shopDetail = shopDetail;
    }

    public String getShopPic() {
        return shopPic;
    }

    public void setShopPic(String shopPic) {
        this.shopPic = shopPic;
    }

    public Integer getPosId() {
        return posId;
    }

    public void setPosId(Integer posId) {
        this.posId = posId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", shopStatus='" + shopStatus + '\'' +
                ", shopDetail='" + shopDetail + '\'' +
                ", shopPic='" + shopPic + '\'' +
                ", posId=" + posId +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", startRow=" + startRow +
                ", endRow=" + endRow +
                '}';
    }
}
