package com.platform.testcase.vo;

public class ProductVo {
    private Long id;

    private String productName;

    private Long productmanId;

    private Integer status;

    public ProductVo(Long id, String productName, Long productmanId, Integer status) {
        this.id = id;
        this.productName = productName;
        this.productmanId = productmanId;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getProductmanId() {
        return productmanId;
    }

    public void setProductmanId(Long productmanId) {
        this.productmanId = productmanId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
