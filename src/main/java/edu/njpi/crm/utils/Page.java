package edu.njpi.crm.utils;

import java.util.List;

/**
 * @Classname Page
 * @Description TODO
 * @Date 2020/12/23 11:33 上午
 * @Created by lqj(1724226325@qq.com)
 */
public class Page<T> {
    private int recordTotal; //总记录数
    private int currentPage; //当前页
    private int pageSize;    //每页记录数
    private List<T> rows;    //每页结果集

    public int getRecordTotal() {
        return recordTotal;
    }

    public void setRecordTotal(int recordTotal) {
        this.recordTotal = recordTotal;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
