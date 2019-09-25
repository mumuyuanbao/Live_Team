package com.live.liveteam.entity;

public class GoodsSnapUp {
    private Long id;

    private Long gId;

    private String gUrl;

    private Byte gStatus;

    private Long gPrice;

    private Long gInventory;

    private Long gStartTime;

    private Long gStopTime;

    private Long gSaleProce;

    private Long createTime;

    private String createUser;

    private Long updateTime;

    private String updateUser;

    public GoodsSnapUp(Long id, Long gId, String gUrl, Byte gStatus, Long gPrice, Long gInventory, Long gStartTime, Long gStopTime, Long gSaleProce, Long createTime, String createUser, Long updateTime, String updateUser) {
        this.id = id;
        this.gId = gId;
        this.gUrl = gUrl;
        this.gStatus = gStatus;
        this.gPrice = gPrice;
        this.gInventory = gInventory;
        this.gStartTime = gStartTime;
        this.gStopTime = gStopTime;
        this.gSaleProce = gSaleProce;
        this.createTime = createTime;
        this.createUser = createUser;
        this.updateTime = updateTime;
        this.updateUser = updateUser;
    }

    public GoodsSnapUp() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getgId() {
        return gId;
    }

    public void setgId(Long gId) {
        this.gId = gId;
    }

    public String getgUrl() {
        return gUrl;
    }

    public void setgUrl(String gUrl) {
        this.gUrl = gUrl == null ? null : gUrl.trim();
    }

    public Byte getgStatus() {
        return gStatus;
    }

    public void setgStatus(Byte gStatus) {
        this.gStatus = gStatus;
    }

    public Long getgPrice() {
        return gPrice;
    }

    public void setgPrice(Long gPrice) {
        this.gPrice = gPrice;
    }

    public Long getgInventory() {
        return gInventory;
    }

    public void setgInventory(Long gInventory) {
        this.gInventory = gInventory;
    }

    public Long getgStartTime() {
        return gStartTime;
    }

    public void setgStartTime(Long gStartTime) {
        this.gStartTime = gStartTime;
    }

    public Long getgStopTime() {
        return gStopTime;
    }

    public void setgStopTime(Long gStopTime) {
        this.gStopTime = gStopTime;
    }

    public Long getgSaleProce() {
        return gSaleProce;
    }

    public void setgSaleProce(Long gSaleProce) {
        this.gSaleProce = gSaleProce;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser == null ? null : updateUser.trim();
    }
}