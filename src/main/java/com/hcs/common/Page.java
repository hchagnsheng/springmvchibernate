package com.hcs.common;

import java.io.Serializable;
import java.util.List;


/**
 * 
* @ClassName: Page
* @Description: TODO(这里用一句话描述这个类的作用)
* @author A18ccms a18ccms_gmail_com
* @date 2017年7月18日 上午8:37:48
*
* @param <T>
 */
public class Page<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //总记录数
    private long total;
    //排序方式
    private String order;
    //从第几个开始
    private Integer offset;
    //每页显示多少个
    private Integer limit;
    //数据
    private List<T> rows;

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public Page() {
    }
}
