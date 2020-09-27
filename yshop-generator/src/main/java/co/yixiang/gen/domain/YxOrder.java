package co.yixiang.gen.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class YxOrder {
    private Integer id;

    private String no;

    private String productId;

    private Integer productClassId;

    private Integer consumerId;

    private Integer number;

    private Date crtTime;

    private Date updTime;

    private Integer couponId;

    private Integer shopId;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no == null ? null : no.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Integer getProductClassId() {
        return productClassId;
    }

    public void setProductClassId(Integer productClassId) {
        this.productClassId = productClassId;
    }

    public Integer getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Integer consumerId) {
        this.consumerId = consumerId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", no=").append(no);
        sb.append(", productId=").append(productId);
        sb.append(", productClassId=").append(productClassId);
        sb.append(", consumerId=").append(consumerId);
        sb.append(", number=").append(number);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", couponId=").append(couponId);
        sb.append(", shopId=").append(shopId);
        sb.append(", status=").append(status);
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
        YxOrder other = (YxOrder) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNo() == null ? other.getNo() == null : this.getNo().equals(other.getNo()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProductClassId() == null ? other.getProductClassId() == null : this.getProductClassId().equals(other.getProductClassId()))
            && (this.getConsumerId() == null ? other.getConsumerId() == null : this.getConsumerId().equals(other.getConsumerId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getUpdTime() == null ? other.getUpdTime() == null : this.getUpdTime().equals(other.getUpdTime()))
            && (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNo() == null) ? 0 : getNo().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProductClassId() == null) ? 0 : getProductClassId().hashCode());
        result = prime * result + ((getConsumerId() == null) ? 0 : getConsumerId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getUpdTime() == null) ? 0 : getUpdTime().hashCode());
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        no("no", "no", "VARCHAR", true),
        productId("product_id", "productId", "VARCHAR", false),
        productClassId("product_class_id", "productClassId", "INTEGER", false),
        consumerId("consumer_id", "consumerId", "INTEGER", false),
        number("number", "number", "INTEGER", true),
        crtTime("crt_time", "crtTime", "TIMESTAMP", false),
        updTime("upd_time", "updTime", "TIMESTAMP", false),
        couponId("coupon_id", "couponId", "INTEGER", false),
        shopId("shop_id", "shopId", "INTEGER", false),
        status("status", "status", "INTEGER", true);

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