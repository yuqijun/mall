package co.yixiang.gen.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class YxCoupon {
    private Integer couponId;

    private Integer couponTempId;

    private Integer userId;

    private Integer couponStatus;

    private Date crtTime;

    private Date updTime;

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getCouponTempId() {
        return couponTempId;
    }

    public void setCouponTempId(Integer couponTempId) {
        this.couponTempId = couponTempId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
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
        sb.append(", couponId=").append(couponId);
        sb.append(", couponTempId=").append(couponTempId);
        sb.append(", userId=").append(userId);
        sb.append(", couponStatus=").append(couponStatus);
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
        YxCoupon other = (YxCoupon) that;
        return (this.getCouponId() == null ? other.getCouponId() == null : this.getCouponId().equals(other.getCouponId()))
            && (this.getCouponTempId() == null ? other.getCouponTempId() == null : this.getCouponTempId().equals(other.getCouponTempId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getCouponStatus() == null ? other.getCouponStatus() == null : this.getCouponStatus().equals(other.getCouponStatus()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getUpdTime() == null ? other.getUpdTime() == null : this.getUpdTime().equals(other.getUpdTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCouponId() == null) ? 0 : getCouponId().hashCode());
        result = prime * result + ((getCouponTempId() == null) ? 0 : getCouponTempId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getCouponStatus() == null) ? 0 : getCouponStatus().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getUpdTime() == null) ? 0 : getUpdTime().hashCode());
        return result;
    }

    public enum Column {
        couponId("coupon_id", "couponId", "INTEGER", false),
        couponTempId("coupon_temp_id", "couponTempId", "INTEGER", false),
        userId("user_id", "userId", "INTEGER", false),
        couponStatus("coupon_status", "couponStatus", "INTEGER", false),
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