package com.live.liveteam.entity;

public class GoodsType {
    private Long id;

    private String tName;

    private Long pId;

    private String tImage;

    private Long sort;

    private Byte status;

    private Long createTime;

    private String createName;

    private Long updateTime;

    private String updateName;

    public GoodsType(Long id, String tName, Long pId, String tImage, Long sort, Byte status, Long createTime, String createName, Long updateTime, String updateName) {
        this.id = id;
        this.tName = tName;
        this.pId = pId;
        this.tImage = tImage;
        this.sort = sort;
        this.status = status;
        this.createTime = createTime;
        this.createName = createName;
        this.updateTime = updateTime;
        this.updateName = updateName;
    }

    public GoodsType() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public String gettImage() {
        return tImage;
    }

    public void settImage(String tImage) {
        this.tImage = tImage == null ? null : tImage.trim();
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateName() {
        return updateName;
    }

    public void setUpdateName(String updateName) {
        this.updateName = updateName == null ? null : updateName.trim();
    }
}