package com.live.liveteam.entity;

public class AddressDest {
    private Long id;

    private String openId;

    private Long cCountryId;

    private Long pProvinceId;

    private Long cCityId;

    private Long aAreaId;

    private String detailedAddress;

    private String destName;

    private String destIphone;

    private String tag;

    private Byte staus;

    private Byte ifDefault;

    private Long createTime;

    private Long updateTime;

    public AddressDest(Long id, String openId, Long cCountryId, Long pProvinceId, Long cCityId, Long aAreaId, String detailedAddress, String destName, String destIphone, String tag, Byte staus, Byte ifDefault, Long createTime, Long updateTime) {
        this.id = id;
        this.openId = openId;
        this.cCountryId = cCountryId;
        this.pProvinceId = pProvinceId;
        this.cCityId = cCityId;
        this.aAreaId = aAreaId;
        this.detailedAddress = detailedAddress;
        this.destName = destName;
        this.destIphone = destIphone;
        this.tag = tag;
        this.staus = staus;
        this.ifDefault = ifDefault;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public AddressDest() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }

    public Long getcCountryId() {
        return cCountryId;
    }

    public void setcCountryId(Long cCountryId) {
        this.cCountryId = cCountryId;
    }

    public Long getpProvinceId() {
        return pProvinceId;
    }

    public void setpProvinceId(Long pProvinceId) {
        this.pProvinceId = pProvinceId;
    }

    public Long getcCityId() {
        return cCityId;
    }

    public void setcCityId(Long cCityId) {
        this.cCityId = cCityId;
    }

    public Long getaAreaId() {
        return aAreaId;
    }

    public void setaAreaId(Long aAreaId) {
        this.aAreaId = aAreaId;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress == null ? null : detailedAddress.trim();
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName == null ? null : destName.trim();
    }

    public String getDestIphone() {
        return destIphone;
    }

    public void setDestIphone(String destIphone) {
        this.destIphone = destIphone == null ? null : destIphone.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Byte getStaus() {
        return staus;
    }

    public void setStaus(Byte staus) {
        this.staus = staus;
    }

    public Byte getIfDefault() {
        return ifDefault;
    }

    public void setIfDefault(Byte ifDefault) {
        this.ifDefault = ifDefault;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}