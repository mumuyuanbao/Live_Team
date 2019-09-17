package com.live.liveteam.common.result;

import java.util.List;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.live.liveteam.common.constant.BizConstant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 分页对象
 * 
 * @author linyuanbao
 *
 */
@ApiModel(value = "PageVO(分页对象)")
public class PageVO<T> {

    @ApiModelProperty(value = "每页数量", required = true)
    private Integer pageSize = BizConstant.PAGE_SIZE_20;// 每页显示记录数 1

    @ApiModelProperty(value = "当前页", required = true)
    private Integer currentPage = 1;// 当前页码 1

    @ApiModelProperty(value = "总记录数", required = true)
    private long totalCount = 0;// 总记录数 1

    @ApiModelProperty(value = "当前页的数量", required = true)
    private Integer size = BizConstant.PAGE_SIZE_20;//1

    @ApiModelProperty(value = "总页数",required = true)//1
    private Integer pages ;

    @ApiModelProperty(value = "数据", required = true)//1
    private List<T> data;// 查询结果




    public  void savePageinfo(PageInfo<T> pageinfo){
        this.pageSize=pageinfo.getPageSize();//设置每页数量
        this.currentPage=pageinfo.getPageNum();//设置当前页
        this.totalCount=pageinfo.getTotal();     //设置总记录数
        this.size=pageinfo.getSize();//当前页数量
        this.pages=pageinfo.getPages();
    }

    public PageVO() {}

    public PageVO(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public PageVO(Integer currentPage, Integer pageSize) {
        if (currentPage != null) {
            this.currentPage = currentPage;
        }
        if (pageSize != null) {
            this.pageSize = pageSize;
        }
    }


    public void setPageInfo(PageInfo<T> pageinfo){


    }

    public Integer getPages() {
        return pages;
    }
    //设置总页数 传入总数
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    //获取总页数
    public Integer getTotalPage() {
        //设置默认页数为0
        Integer totalPage = 0;
        //如果数据库记录为0
        if (this.totalCount == 0) {
            //直接返回页数为0
           this.pages=0;
        }
        //页数= 总数/每行页数
        totalPage = (int)this.totalCount / pageSize;
        //如果总页数为0  或者总记录数跟每页行数取余不等于0，页数+1，因为不等于0代表有多的行，一行没展示完，自然要加1
        if (totalPage == 0 || totalCount % pageSize != 0) {
            totalPage = totalPage + 1;
            this.pages=totalPage;
        }
        //返回总页数
        return totalPage;
    }
    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
        this.pages=this.getTotalPage();
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
