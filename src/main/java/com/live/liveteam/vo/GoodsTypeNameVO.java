package com.live.liveteam.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 作者：张钰磊
 * 时间2019/9/8 18:17
 * 描述 一级分类获取
 */
@ApiModel("分类list")
public class GoodsTypeNameVO {

    @ApiModelProperty("主键")
    private Long id;
    @ApiModelProperty("分类名称")
    private String tName;
    @ApiModelProperty("分类主图")
    private String tImage;


    public String gettImage() {
        return tImage;
    }
    public void settImage(String tImage) {
        this.tImage = tImage;
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
        this.tName = tName;
    }

}
