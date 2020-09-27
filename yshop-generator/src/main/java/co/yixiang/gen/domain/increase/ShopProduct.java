package co.yixiang.gen.domain.increase;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class ShopProduct implements java.io.Serializable {
    private String name;
    private String url;
    private int number;
    private BigDecimal price;
    private BigDecimal totalPrice;

    public ShopProduct(){}


    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public int getNumber() {
        return number;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "ShopProduct{" +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", number=" + number +
                ", price=" + price +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
