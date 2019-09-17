package com.live.liveteam.entity;

public class GoodsDetail {
    private Long id;

    private Long gId;

    private String gDesc;

    private String gDetail;

    private Long createTime;

    private String createName;

    private Long updateTime;

    private String updateName;

    private String gImages;

    public GoodsDetail(Long id, Long gId, String gDesc, String gDetail, Long createTime, String createName, Long updateTime, String updateName, String gImages) {
        this.id = id;
        this.gId = gId;
        this.gDesc = gDesc;
        this.gDetail = gDetail;
        this.createTime = createTime;
        this.createName = createName;
        this.updateTime = updateTime;
        this.updateName = updateName;
        this.gImages = gImages;
    }

    public GoodsDetail() {
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

    public String getgDesc() {
        return gDesc;
    }

    public void setgDesc(String gDesc) {
        this.gDesc = gDesc == null ? null : gDesc.trim();
    }

    public String getgDetail() {
        return gDetail;
    }

    public void setgDetail(String gDetail) {
        this.gDetail = gDetail == null ? null : gDetail.trim();
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

    public String getgImages() {
        return gImages;
    }

    public void setgImages(String gImages) {
        this.gImages = gImages == null ? null : gImages.trim();
    }
}