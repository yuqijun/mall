package co.yixiang.gen.domain.increase;

import co.yixiang.gen.domain.YxProduct;

import java.math.BigDecimal;
import java.util.List;

public class LitellOrder {
    private List<YxProduct> productList;
    //应付金额
    private BigDecimal amountDue;
    //折扣金额
    private BigDecimal dAmount;
    //实付金额
    private BigDecimal aPayment;

    private String no;

    public LitellOrder (){}

    public List<YxProduct> getProductList() {
        return productList;
    }

    public BigDecimal getAmountDue() {
        return amountDue;
    }

    public BigDecimal getdAmount() {
        return dAmount;
    }

    public BigDecimal getaPayment() {
        return aPayment;
    }

    public void setProductList(List<YxProduct> productList) {
        this.productList = productList;
    }

    public void setAmountDue(BigDecimal amountDue) {
        this.amountDue = amountDue;
    }

    public void setdAmount(BigDecimal dAmount) {
        this.dAmount = dAmount;
    }

    public void setaPayment(BigDecimal aPayment) {
        this.aPayment = aPayment;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "LitellOrder{" +
                "productList=" + productList +
                ", amountDue=" + amountDue +
                ", dAmount=" + dAmount +
                ", aPayment=" + aPayment +
                ", no='" + no + '\'' +
                '}';
    }
}
