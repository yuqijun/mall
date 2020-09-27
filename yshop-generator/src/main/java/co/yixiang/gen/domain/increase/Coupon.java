package co.yixiang.gen.domain.increase;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

public class Coupon {
    private String couponName;
    private BigDecimal couponPrice;
    private int couponStatus;
    private Date couponTimeOut;
    private int shopId;
    private int classType;
    private String couponImg;


    public Coupon(){ }

    public void setCouponName(String couponName) {
        this.couponName = couponName;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public void setCouponStatus(int couponStatus) {
        this.couponStatus = couponStatus;
    }

    public void setCouponTimeOut(Date couponTimeOut) {
        this.couponTimeOut = couponTimeOut;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public void setClassType(int classType) {
        this.classType = classType;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg;
    }

    public String getCouponName() {
        return couponName;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public int getCouponStatus() {
        return couponStatus;
    }

    public Date getCouponTimeOut() {
        return couponTimeOut;
    }

    public int getShopId() {
        return shopId;
    }

    public int getClassType() {
        return classType;
    }

    public String getCouponImg() {
        return couponImg;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "couponName='" + couponName + '\'' +
                ", couponPrice=" + couponPrice +
                ", couponStatus=" + couponStatus +
                ", couponTimeOut=" + couponTimeOut +
                ", shopId=" + shopId +
                ", classType=" + classType +
                ", couponImg='" + couponImg + '\'' +
                '}';
    }
}
