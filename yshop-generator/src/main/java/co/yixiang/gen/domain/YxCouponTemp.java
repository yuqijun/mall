package co.yixiang.gen.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class YxCouponTemp {
    private Integer couponTempId;

    private BigDecimal couponPrice;

    private Integer couponOptionId;

    private Date couponStartTime;

    private Date couponTimeOut;

    private String couponImg;

    private String couponName;

    private Integer couponType;

    private Integer shopId;

    private Integer classType;

    private Date crtTime;

    private Date updTime;

    public Integer getCouponTempId() {
        return couponTempId;
    }

    public void setCouponTempId(Integer couponTempId) {
        this.couponTempId = couponTempId;
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }

    public Integer getCouponOptionId() {
        return couponOptionId;
    }

    public void setCouponOptionId(Integer couponOptionId) {
        this.couponOptionId = couponOptionId;
    }

    public Date getCouponStartTime() {
        return couponStartTime;
    }

    public void setCouponStartTime(Date couponStartTime) {
        this.couponStartTime = couponStartTime;
    }

    public Date getCouponTimeOut() {
        return couponTimeOut;
    }

    public void setCouponTimeOut(Date couponTimeOut) {
        this.couponTimeOut = couponTimeOut;
    }

    public String getCouponImg() {
        return couponImg;
    }

    public void setCouponImg(String couponImg) {
        this.couponImg = couponImg == null ? null : couponImg.trim();
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getClassType() {
        return classType;
    }

    public void setClassType(Integer classType) {
        this.classType = classType;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public Date getUpdTime() {
        return updTime;
    }

    public void setUpdTime(Date updTime) {
        this.updTime = updTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", couponTempId=").append(couponTempId);
        sb.append(", couponPrice=").append(couponPrice);
        sb.append(", couponOptionId=").append(couponOptionId);
        sb.append(", couponStartTime=").append(couponStartTime);
        sb.append(", couponTimeOut=").append(couponTimeOut);
        sb.append(", couponImg=").append(couponImg);
        sb.append(", couponName=").append(couponName);
        sb.append(", couponType=").append(couponType);
        sb.append(", shopId=").append(shopId);
        sb.append(", classType=").append(classType);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", updTime=").append(updTime);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        YxCouponTemp other = (YxCouponTemp) that;
        return (this.getCouponTempId() == null ? other.getCouponTempId() == null : this.getCouponTempId().equals(other.getCouponTempId()))
            && (this.getCouponPrice() == null ? other.getCouponPrice() == null : this.getCouponPrice().equals(other.getCouponPrice()))
            && (this.getCouponOptionId() == null ? other.getCouponOptionId() == null : this.getCouponOptionId().equals(other.getCouponOptionId()))
            && (this.getCouponStartTime() == null ? other.getCouponStartTime() == null : this.getCouponStartTime().equals(other.getCouponStartTime()))
            && (this.getCouponTimeOut() == null ? other.getCouponTimeOut() == null : this.getCouponTimeOut().equals(other.getCouponTimeOut()))
            && (this.getCouponImg() == null ? other.getCouponImg() == null : this.getCouponImg().equals(other.getCouponImg()))
            && (this.getCouponName() == null ? other.getCouponName() == null : this.getCouponName().equals(other.getCouponName()))
            && (this.getCouponType() == null ? other.getCouponType() == null : this.getCouponType().equals(other.getCouponType()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getClassType() == null ? other.getClassType() == null : this.getClassType().equals(other.getClassType()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getUpdTime() == null ? other.getUpdTime() == null : this.getUpdTime().equals(other.getUpdTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCouponTempId() == null) ? 0 : getCouponTempId().hashCode());
        result = prime * result + ((getCouponPrice() == null) ? 0 : getCouponPrice().hashCode());
        result = prime * result + ((getCouponOptionId() == null) ? 0 : getCouponOptionId().hashCode());
        result = prime * result + ((getCouponStartTime() == null) ? 0 : getCouponStartTime().hashCode());
        result = prime * result + ((getCouponTimeOut() == null) ? 0 : getCouponTimeOut().hashCode());
        result = prime * result + ((getCouponImg() == null) ? 0 : getCouponImg().hashCode());
        result = prime * result + ((getCouponName() == null) ? 0 : getCouponName().hashCode());
        result = prime * result + ((getCouponType() == null) ? 0 : getCouponType().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getClassType() == null) ? 0 : getClassType().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getUpdTime() == null) ? 0 : getUpdTime().hashCode());
        return result;
    }

    public enum Column {
        couponTempId("coupon_temp_id", "couponTempId", "INTEGER", false),
        couponPrice("coupon_price", "couponPrice", "DECIMAL", false),
        couponOptionId("coupon_option_id", "couponOptionId", "INTEGER", false),
        couponStartTime("coupon_start_time", "couponStartTime", "TIMESTAMP", false),
        couponTimeOut("coupon_time_out", "couponTimeOut", "TIMESTAMP", false),
        couponImg("coupon_img", "couponImg", "VARCHAR", false),
        couponName("coupon_name", "couponName", "VARCHAR", false),
        couponType("coupon_type", "couponType", "INTEGER", false),
        shopId("shop_id", "shopId", "INTEGER", false),
        classType("class_type", "classType", "INTEGER", false),
        crtTime("crt_time", "crtTime", "TIMESTAMP", false),
        updTime("upd_time", "updTime", "TIMESTAMP", false);

        private static final String BEGINNING_DELIMITER = "`";

        private static final String ENDING_DELIMITER = "`";

        private final String column;

        private final boolean isColumnNameDelimited;

        private final String javaProperty;

        private final String jdbcType;

        public String value() {
            return this.column;
        }

        public String getValue() {
            return this.column;
        }

        public String getJavaProperty() {
            return this.javaProperty;
        }

        public String getJdbcType() {
            return this.jdbcType;
        }

        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }

        public String getAliasedEscapedColumnName() {
            return this.getEscapedColumnName();
        }
    }
}