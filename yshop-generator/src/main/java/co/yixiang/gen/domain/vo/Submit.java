package co.yixiang.gen.domain.vo;

import co.yixiang.gen.domain.YxProduct;

import java.util.List;

public class Submit {
    private Integer shopId;
    private Integer userId;
    private List<YxProduct> productList;

    public Submit(){}

    public Integer getShopId() {
        return shopId;
    }

    public Integer getUserId() {
        return userId;
    }

    public List<YxProduct> getProductList() {
        return productList;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setProductList(List<YxProduct> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Submit{" +
                "shopId='" + shopId + '\'' +
                ", userId='" + userId + '\'' +
                ", productList=" + productList +
                '}';
    }
}
