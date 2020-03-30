package com.page.page;

import java.util.List;

/**
 * @Author: 王鑫垚
 * @Description:
 * @Date: Create in 15:48 2020/2/23
 */
public class PageResult {

    /*当前页码*/
    private int pageNum;
    /*每页数量*/
    private int pageSize;
    /*记录总数*/
    private long totalSize;
    /*页码总数*/
    private int totalPages;
    /*数据内容*/
    private List<?> content;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(long totalSize) {
        this.totalSize = totalSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<?> getContent() {
        return content;
    }

    public void setContent(List<?> content) {
        this.content = content;
    }
}
