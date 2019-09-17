package com.live.liveteam.entity;

public class GoodsMadeUp {
    private Long id;

    private Long gId;

    private String mName;

    private String mDesc;

    private Long pId;

    public GoodsMadeUp(Long id, Long gId, String mName, String mDesc, Long pId) {
        this.id = id;
        this.gId = gId;
        this.mName = mName;
        this.mDesc = mDesc;
        this.pId = pId;
    }

    public GoodsMadeUp() {
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

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmDesc() {
        return mDesc;
    }

    public void setmDesc(String mDesc) {
        this.mDesc = mDesc == null ? null : mDesc.trim();
    }

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }
}