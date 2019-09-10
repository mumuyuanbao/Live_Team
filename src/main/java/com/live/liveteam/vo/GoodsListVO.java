package com.live.liveteam.vo;


/**
 * 作者：木木豹
 * 时间2019-09-10 20:45
 * 描述：商品列表VO
 */
public class GoodsListVO {

    private Long id;

    private Long gTypeId;

    private String gName;

    private String gFullName;

    private String gImage;

    private Long gPrice;

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
        this.gName = gName;
    }

    public String getgFullName() {
        return gFullName;
    }

    public void setgFullName(String gFullName) {
        this.gFullName = gFullName;
    }

    public String getgImage() {
        return gImage;
    }

    public void setgImage(String gImage) {
        this.gImage = gImage;
    }

    public Long getgPrice() {
        return gPrice;
    }

    public void setgPrice(Long gPrice) {
        this.gPrice = gPrice;
    }
}
