package com.live.liveteam.vo;

/**
 * 作者：张钰磊
 * 时间2019/9/16 17:21
 * 描述
 */
public class AddressDestVO {
//    private Integer id;
//
//    private String name;
//
//    private Integer pId;

    private Long id;

    private String detailedAddress;

    private String destName;

    private String destIphone;

    private Byte ifDefault;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getDestName() {
        return destName;
    }

    public void setDestName(String destName) {
        this.destName = destName;
    }

    public String getDestIphone() {
        return destIphone;
    }

    public void setDestIphone(String destIphone) {
        this.destIphone = destIphone;
    }

    public Byte getIfDefault() {
        return ifDefault;
    }

    public void setIfDefault(Byte ifDefault) {
        this.ifDefault = ifDefault;
    }
}
