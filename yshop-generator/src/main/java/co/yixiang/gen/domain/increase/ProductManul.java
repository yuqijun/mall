package co.yixiang.gen.domain.increase;

import java.math.BigDecimal;

public class ProductManul {
    private int id;
    private String name;
    private BigDecimal price;
    private String url;
    private String shopName;
    private int shopId;


    public ProductManul(){}
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getUrl() {
        return url;
    }

    public String getShopName() {
        return shopName;
    }

    public int getShopId() {
        return shopId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Override
    public String toString() {
        return "ProductManul{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", url='" + url + '\'' +
                ", shopName='" + shopName + '\'' +
                ", shopId=" + shopId +
                '}';
    }
}
