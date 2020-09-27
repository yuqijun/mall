package co.yixiang.gen.domain.increase;




import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.List;

@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class ShopOrder  implements java.io.Serializable {
    private String orderNo;
    private BigDecimal amountDue;
    private BigDecimal aPayment;
    private BigDecimal dPayment;
    private List<ShopProduct> productList;

    public ShopOrder(){

    }

    public String getOrderNo() {
        return orderNo;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public BigDecimal getaPayment() {
        return aPayment;
    }

    public BigDecimal getdPayment() {
        return dPayment;
    }

    public List<ShopProduct> getProductList() {
        return productList;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public void setaPayment(BigDecimal aPayment) {
        this.aPayment = aPayment;
    }

    public void setdPayment(BigDecimal dPayment) {
        this.dPayment = dPayment;
    }

    public void setProductList(List<ShopProduct> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "ShopOrder{" +
                "orderNo='" + orderNo + '\'' +
                ", amountDue=" + amountDue +
                ", aPayment=" + aPayment +
                ", dPayment=" + dPayment +
                ", productList=" + productList +
                '}';
    }
}
