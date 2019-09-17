package com.live.liveteam.entity;

import java.util.Comparator;

public class Goods{
    private Long id;

    private Long gTypeId;

    private String gName;

    private String gFullName;

    private String gImage;

    private Long gPrice;

    private Long gSalePrice;

    private Long gSort;

    private Byte gStatus;

    private String gSayPoint;

    private Long gCreateTime;

    private String gCreateId;

    private Long gUpdateTime;

    private String gUpdateId;

    private Long gSalesNum;

    private String gProvince;

    private String gCity;

    private String gNum;

    public Goods(Long id, Long gTypeId, String gName, String gFullName, String gImage, Long gPrice, Long gSalePrice, Long gSort, Byte gStatus, String gSayPoint, Long gCreateTime, String gCreateId, Long gUpdateTime, String gUpdateId, Long gSalesNum, String gProvince, String gCity, String gNum) {
        this.id = id;
        this.gTypeId = gTypeId;
        this.gName = gName;
        this.gFullName = gFullName;
        this.gImage = gImage;
        this.gPrice = gPrice;
        this.gSalePrice = gSalePrice;
        this.gSort = gSort;
        this.gStatus = gStatus;
        this.gSayPoint = gSayPoint;
        this.gCreateTime = gCreateTime;
        this.gCreateId = gCreateId;
        this.gUpdateTime = gUpdateTime;
        this.gUpdateId = gUpdateId;
        this.gSalesNum = gSalesNum;
        this.gProvince = gProvince;
        this.gCity = gCity;
        this.gNum = gNum;
    }

    public Goods() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getgTypeId() {
        return gTypeId;
    }

    public void setgTypeId(Long gTypeId) {
        this.gTypeId = gTypeId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getgFullName() {
        return gFullName;
    }

    public void setgFullName(String gFullName) {
        this.gFullName = gFullName == null ? null : gFullName.trim();
    }

    public String getgImage() {
        return gImage;
    }

    public void setgImage(String gImage) {
        this.gImage = gImage == null ? null : gImage.trim();
    }

    public Long getgPrice() {
        return gPrice;
    }

    public void setgPrice(Long gPrice) {
        this.gPrice = gPrice;
    }

    public Long getgSalePrice() {
        return gSalePrice;
    }

    public void setgSalePrice(Long gSalePrice) {
        this.gSalePrice = gSalePrice;
    }

    public Long getgSort() {
        return gSort;
    }

    public void setgSort(Long gSort) {
        this.gSort = gSort;
    }

    public Byte getgStatus() {
        return gStatus;
    }

    public void setgStatus(Byte gStatus) {
        this.gStatus = gStatus;
    }

    public String getgSayPoint() {
        return gSayPoint;
    }

    public void setgSayPoint(String gSayPoint) {
        this.gSayPoint = gSayPoint == null ? null : gSayPoint.trim();
    }

    public Long getgCreateTime() {
        return gCreateTime;
    }

    public void setgCreateTime(Long gCreateTime) {
        this.gCreateTime = gCreateTime;
    }

    public String getgCreateId() {
        return gCreateId;
    }

    public void setgCreateId(String gCreateId) {
        this.gCreateId = gCreateId == null ? null : gCreateId.trim();
    }

    public Long getgUpdateTime() {
        return gUpdateTime;
    }

    public void setgUpdateTime(Long gUpdateTime) {
        this.gUpdateTime = gUpdateTime;
    }

    public String getgUpdateId() {
        return gUpdateId;
    }

    public void setgUpdateId(String gUpdateId) {
        this.gUpdateId = gUpdateId == null ? null : gUpdateId.trim();
    }

    public Long getgSalesNum() {
        return gSalesNum;
    }

    public void setgSalesNum(Long gSalesNum) {
        this.gSalesNum = gSalesNum;
    }

    public String getgProvince() {
        return gProvince;
    }

    public void setgProvince(String gProvince) {
        this.gProvince = gProvince == null ? null : gProvince.trim();
    }

    public String getgCity() {
        return gCity;
    }

    public void setgCity(String gCity) {
        this.gCity = gCity == null ? null : gCity.trim();
    }

    public String getgNum() {
        return gNum;
    }

    public void setgNum(String gNum) {
        this.gNum = gNum == null ? null : gNum.trim();
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id=" + id +
                ", gTypeId=" + gTypeId +
                ", gName='" + gName + '\'' +
                ", gFullName='" + gFullName + '\'' +
                ", gImage='" + gImage + '\'' +
                ", gPrice=" + gPrice +
                ", gSalePrice=" + gSalePrice +
                ", gSort=" + gSort +
                ", gStatus=" + gStatus +
                ", gSayPoint='" + gSayPoint + '\'' +
                ", gCreateTime=" + gCreateTime +
                ", gCreateId='" + gCreateId + '\'' +
                ", gUpdateTime=" + gUpdateTime +
                ", gUpdateId='" + gUpdateId + '\'' +
                ", gSalesNum=" + gSalesNum +
                ", gProvince='" + gProvince + '\'' +
                ", gCity='" + gCity + '\'' +
                ", gNum='" + gNum + '\'' +
                '}';
    }


//    @Override
//    public int compare(Goods o1, Goods o2) {
//
//        return 01;
//    }

//    @Override
//    public int compareTo(Goods o) {
//            return (int)(this.gSort.intValue()-o.getgSort().intValue());
//    }
}