package com.live.liveteam.entity;

public class Goods {
    private Long id;

    private Long gTypeId;

    private Long gTypePid;

    private String gName;

    private String gFullName;

    private String gImage;

    private Long gPrice;

    private Long gSalePrice;

    private Long gSort;

    private Byte gIsOnly;

    private Byte gStatus;

    private Byte goodsIsNew;

    private Byte gNewStart;

    private String gSayPoint;

    private Long gCreateTime;

    private String gCreateId;

    private Long gUpdateTime;

    private String gUpdateId;

    private Long gSalesNum;

    private String gProvince;

    private String gCity;

    private String gNum;

    public Goods(Long id, Long gTypeId, Long gTypePid, String gName, String gFullName, String gImage, Long gPrice, Long gSalePrice, Long gSort, Byte gIsOnly, Byte gStatus, Byte goodsIsNew, Byte gNewStart, String gSayPoint, Long gCreateTime, String gCreateId, Long gUpdateTime, String gUpdateId, Long gSalesNum, String gProvince, String gCity, String gNum) {
        this.id = id;
        this.gTypeId = gTypeId;
        this.gTypePid = gTypePid;
        this.gName = gName;
        this.gFullName = gFullName;
        this.gImage = gImage;
        this.gPrice = gPrice;
        this.gSalePrice = gSalePrice;
        this.gSort = gSort;
        this.gIsOnly = gIsOnly;
        this.gStatus = gStatus;
        this.goodsIsNew = goodsIsNew;
        this.gNewStart = gNewStart;
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

    public Long getgTypePid() {
        return gTypePid;
    }

    public void setgTypePid(Long gTypePid) {
        this.gTypePid = gTypePid;
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

    public Byte getgIsOnly() {
        return gIsOnly;
    }

    public void setgIsOnly(Byte gIsOnly) {
        this.gIsOnly = gIsOnly;
    }

    public Byte getgStatus() {
        return gStatus;
    }

    public void setgStatus(Byte gStatus) {
        this.gStatus = gStatus;
    }

    public Byte getGoodsIsNew() {
        return goodsIsNew;
    }

    public void setGoodsIsNew(Byte goodsIsNew) {
        this.goodsIsNew = goodsIsNew;
    }

    public Byte getgNewStart() {
        return gNewStart;
    }

    public void setgNewStart(Byte gNewStart) {
        this.gNewStart = gNewStart;
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
}