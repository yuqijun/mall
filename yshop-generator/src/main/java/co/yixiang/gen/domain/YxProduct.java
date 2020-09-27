package co.yixiang.gen.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class YxProduct {
    private Integer pId;

    private String id;

    private Integer shopId;

    private Integer classId;

    private String url;

    private String name;

    private BigDecimal price;

    private Date crtTime;

    private Date updTime;

    private Integer number;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pId=").append(pId);
        sb.append(", id=").append(id);
        sb.append(", shopId=").append(shopId);
        sb.append(", classId=").append(classId);
        sb.append(", url=").append(url);
        sb.append(", name=").append(name);
        sb.append(", price=").append(price);
        sb.append(", crtTime=").append(crtTime);
        sb.append(", updTime=").append(updTime);
        sb.append(", number=").append(number);
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
        YxProduct other = (YxProduct) that;
        return (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getClassId() == null ? other.getClassId() == null : this.getClassId().equals(other.getClassId()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getCrtTime() == null ? other.getCrtTime() == null : this.getCrtTime().equals(other.getCrtTime()))
            && (this.getUpdTime() == null ? other.getUpdTime() == null : this.getUpdTime().equals(other.getUpdTime()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getClassId() == null) ? 0 : getClassId().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getCrtTime() == null) ? 0 : getCrtTime().hashCode());
        result = prime * result + ((getUpdTime() == null) ? 0 : getUpdTime().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        return result;
    }

    public enum Column {
        pId("p_id", "pId", "INTEGER", false),
        id("id", "id", "VARCHAR", false),
        shopId("shop_id", "shopId", "INTEGER", false),
        classId("class_id", "classId", "INTEGER", false),
        url("url", "url", "VARCHAR", false),
        name("name", "name", "VARCHAR", true),
        price("price", "price", "DECIMAL", false),
        crtTime("crt_time", "crtTime", "TIMESTAMP", false),
        updTime("upd_time", "updTime", "TIMESTAMP", false),
        number("number", "number", "INTEGER", true);

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