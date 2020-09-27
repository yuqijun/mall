package co.yixiang.gen.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class YxShop {
    private Integer id;

    private Integer userId;

    private Integer classId;

    private String address;

    private String tel;

    private String license;

    private String cardPositive;

    private String cardBack;

    private Date crtTime;

    private Date updTime;

    private String shopName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getCardPositive() {
        return cardPositive;
    }

    public void setCardPositive(String cardPositive) {
        this.cardPositive = cardPositive == null ? null : cardPositive.trim();
    }

    public String getCardBack() {
        return cardBack;
    }

    public void setCardBack(String cardBack) {
        this.cardBack = cardBack == null ? null : cardBack.trim();
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

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", classId=").append(classId);
        sb.append(", address=").append(address);
        sb.append(", tel=").append(tel);
        sb.append(", license=").append(license);
        sb.append(", cardPositive=").append(cardPositive);
        sb.append(", cardBack=").append(cardBack);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", shopName=").append(shopName);
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
        YxShop other = (YxShop) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getLicense() == null ? other.getLicense() == null : this.getLicense().equals(other.getLicense()))
            && (this.getCardPositive() == null ? other.getCardPositive() == null : this.getCardPositive().equals(other.getCardPositive()))
            && (this.getCardBack() == null ? other.getCardBack() == null : this.getCardBack().equals(other.getCardBack()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getUpdTime() == null ? other.getUpdTime() == null : this.getUpdTime().equals(other.getUpdTime()))
            && (this.getShopName() == null ? other.getShopName() == null : this.getShopName().equals(other.getShopName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getLicense() == null) ? 0 : getLicense().hashCode());
        result = prime * result + ((getCardPositive() == null) ? 0 : getCardPositive().hashCode());
        result = prime * result + ((getCardBack() == null) ? 0 : getCardBack().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getUpdTime() == null) ? 0 : getUpdTime().hashCode());
        result = prime * result + ((getShopName() == null) ? 0 : getShopName().hashCode());
        return result;
    }

    public enum Column {
        id("id", "id", "INTEGER", false),
        userId("user_id", "userId", "INTEGER", false),
        classId("class_id", "classId", "INTEGER", false),
        address("address", "address", "VARCHAR", false),
        tel("tel", "tel", "VARCHAR", false),
        license("license", "license", "VARCHAR", false),
        cardPositive("card_positive", "cardPositive", "VARCHAR", false),
        cardBack("card_back", "cardBack", "VARCHAR", false),
        crtTime("crt_time", "crtTime", "TIMESTAMP", false),
        updTime("upd_time", "updTime", "TIMESTAMP", false),
        shopName("shop_name", "shopName", "VARCHAR", false);

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