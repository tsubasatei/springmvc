package com.xt.ssm.pojo;

/**
 * Created with xt.
 * Date: 2018/3/20
 * Time: 16:24
 * Description: 订单明细
 */
public class OrderDetail {

    private Integer id;
    private Integer ordersId;// 订单号
    private Integer ItermsId;// 商品id
    private Integer ItermsNum;// 商品数量

    private Items iterms;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public Integer getItermsId() {
        return ItermsId;
    }

    public void setItermsId(Integer ItermsId) {
        this.ItermsId = ItermsId;
    }

    public Integer getItermsNum() {
        return ItermsNum;
    }

    public void setItermsNum(Integer ItermsNum) {
        this.ItermsNum = ItermsNum;
    }

    public Items getIterms() {
        return iterms;
    }

    public void setIterms(Items iterms) {
        this.iterms = iterms;
    }
}
