package co.yixiang.gen.domain.vo;

import co.yixiang.gen.domain.YxProduct;

import java.util.List;

public class Submit {
    private String  shopId;
    private String userId;
    private List<YxProduct> productList;

    public Submit(){}

    public String getShopId() {
        return shopId;
    }

    public String getUserId() {
        return userId;
    }

    public List<YxProduct> getProductList() {
        return productList;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public void setUserId(String userId) {
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
