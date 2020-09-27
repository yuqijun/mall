package co.yixiang.gen.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YxCouponTempExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YxCouponTempExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public YxCouponTempExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public YxCouponTempExample orderBy(String ... orderByClauses) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < orderByClauses.length; i++) {
            sb.append(orderByClauses[i]);
            if (i < orderByClauses.length - 1) {
                sb.append(" , ");
            }
        }
        this.setOrderByClause(sb.toString());
        return this;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria(this);
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public static Criteria newAndCreateCriteria() {
        YxCouponTempExample example = new YxCouponTempExample();
        return example.createCriteria();
    }

    public YxCouponTempExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public YxCouponTempExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
        if (condition) {
            then.example(this);
        } else {
            otherwise.example(this);
        }
        return this;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCouponTempIdIsNull() {
            addCriterion("coupon_temp_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdIsNotNull() {
            addCriterion("coupon_temp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdEqualTo(Integer value) {
            addCriterion("coupon_temp_id =", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdNotEqualTo(Integer value) {
            addCriterion("coupon_temp_id <>", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdGreaterThan(Integer value) {
            addCriterion("coupon_temp_id >", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_temp_id >=", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdLessThan(Integer value) {
            addCriterion("coupon_temp_id <", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_temp_id <=", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdIn(List<Integer> values) {
            addCriterion("coupon_temp_id in", values, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdNotIn(List<Integer> values) {
            addCriterion("coupon_temp_id not in", values, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_temp_id between", value1, value2, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_temp_id not between", value1, value2, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(BigDecimal value) {
            addCriterion("coupon_price =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_price = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(BigDecimal value) {
            addCriterion("coupon_price <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_price <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(BigDecimal value) {
            addCriterion("coupon_price >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_price > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_price >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(BigDecimal value) {
            addCriterion("coupon_price <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_price < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_price <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<BigDecimal> values) {
            addCriterion("coupon_price in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<BigDecimal> values) {
            addCriterion("coupon_price not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdIsNull() {
            addCriterion("coupon_option_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdIsNotNull() {
            addCriterion("coupon_option_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdEqualTo(Integer value) {
            addCriterion("coupon_option_id =", value, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_option_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdNotEqualTo(Integer value) {
            addCriterion("coupon_option_id <>", value, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_option_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdGreaterThan(Integer value) {
            addCriterion("coupon_option_id >", value, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_option_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_option_id >=", value, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_option_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdLessThan(Integer value) {
            addCriterion("coupon_option_id <", value, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_option_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_option_id <=", value, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_option_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdIn(List<Integer> values) {
            addCriterion("coupon_option_id in", values, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdNotIn(List<Integer> values) {
            addCriterion("coupon_option_id not in", values, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_option_id between", value1, value2, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponOptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_option_id not between", value1, value2, "couponOptionId");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNull() {
            addCriterion("coupon_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIsNotNull() {
            addCriterion("coupon_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeEqualTo(Date value) {
            addCriterion("coupon_start_time =", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_start_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotEqualTo(Date value) {
            addCriterion("coupon_start_time <>", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_start_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThan(Date value) {
            addCriterion("coupon_start_time >", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_start_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_start_time >=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_start_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThan(Date value) {
            addCriterion("coupon_start_time <", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_start_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("coupon_start_time <=", value, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_start_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeIn(List<Date> values) {
            addCriterion("coupon_start_time in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotIn(List<Date> values) {
            addCriterion("coupon_start_time not in", values, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeBetween(Date value1, Date value2) {
            addCriterion("coupon_start_time between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("coupon_start_time not between", value1, value2, "couponStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutIsNull() {
            addCriterion("coupon_time_out is null");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutIsNotNull() {
            addCriterion("coupon_time_out is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutEqualTo(Date value) {
            addCriterion("coupon_time_out =", value, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_time_out = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutNotEqualTo(Date value) {
            addCriterion("coupon_time_out <>", value, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_time_out <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutGreaterThan(Date value) {
            addCriterion("coupon_time_out >", value, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_time_out > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutGreaterThanOrEqualTo(Date value) {
            addCriterion("coupon_time_out >=", value, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_time_out >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutLessThan(Date value) {
            addCriterion("coupon_time_out <", value, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_time_out < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutLessThanOrEqualTo(Date value) {
            addCriterion("coupon_time_out <=", value, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_time_out <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutIn(List<Date> values) {
            addCriterion("coupon_time_out in", values, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutNotIn(List<Date> values) {
            addCriterion("coupon_time_out not in", values, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutBetween(Date value1, Date value2) {
            addCriterion("coupon_time_out between", value1, value2, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponTimeOutNotBetween(Date value1, Date value2) {
            addCriterion("coupon_time_out not between", value1, value2, "couponTimeOut");
            return (Criteria) this;
        }

        public Criteria andCouponImgIsNull() {
            addCriterion("coupon_img is null");
            return (Criteria) this;
        }

        public Criteria andCouponImgIsNotNull() {
            addCriterion("coupon_img is not null");
            return (Criteria) this;
        }

        public Criteria andCouponImgEqualTo(String value) {
            addCriterion("coupon_img =", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_img = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponImgNotEqualTo(String value) {
            addCriterion("coupon_img <>", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_img <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponImgGreaterThan(String value) {
            addCriterion("coupon_img >", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_img > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponImgGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_img >=", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_img >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponImgLessThan(String value) {
            addCriterion("coupon_img <", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_img < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponImgLessThanOrEqualTo(String value) {
            addCriterion("coupon_img <=", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_img <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponImgLike(String value) {
            addCriterion("coupon_img like", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgNotLike(String value) {
            addCriterion("coupon_img not like", value, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgIn(List<String> values) {
            addCriterion("coupon_img in", values, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgNotIn(List<String> values) {
            addCriterion("coupon_img not in", values, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgBetween(String value1, String value2) {
            addCriterion("coupon_img between", value1, value2, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponImgNotBetween(String value1, String value2) {
            addCriterion("coupon_img not between", value1, value2, "couponImg");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNull() {
            addCriterion("coupon_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeIsNotNull() {
            addCriterion("coupon_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualTo(Integer value) {
            addCriterion("coupon_type =", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualTo(Integer value) {
            addCriterion("coupon_type <>", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThan(Integer value) {
            addCriterion("coupon_type >", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_type >=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThan(Integer value) {
            addCriterion("coupon_type <", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_type <=", value, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("coupon_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTypeIn(List<Integer> values) {
            addCriterion("coupon_type in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotIn(List<Integer> values) {
            addCriterion("coupon_type not in", values, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andCouponTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_type not between", value1, value2, "couponType");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("shop_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("shop_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("shop_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("shop_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("shop_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("shop_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNull() {
            addCriterion("class_type is null");
            return (Criteria) this;
        }

        public Criteria andClassTypeIsNotNull() {
            addCriterion("class_type is not null");
            return (Criteria) this;
        }

        public Criteria andClassTypeEqualTo(Integer value) {
            addCriterion("class_type =", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("class_type = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassTypeNotEqualTo(Integer value) {
            addCriterion("class_type <>", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("class_type <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThan(Integer value) {
            addCriterion("class_type >", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("class_type > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_type >=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("class_type >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThan(Integer value) {
            addCriterion("class_type <", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("class_type < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanOrEqualTo(Integer value) {
            addCriterion("class_type <=", value, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("class_type <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassTypeIn(List<Integer> values) {
            addCriterion("class_type in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotIn(List<Integer> values) {
            addCriterion("class_type not in", values, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeBetween(Integer value1, Integer value2) {
            addCriterion("class_type between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andClassTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("class_type not between", value1, value2, "classType");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNull() {
            addCriterion("crt_time is null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeIsNotNull() {
            addCriterion("crt_time is not null");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualTo(Date value) {
            addCriterion("crt_time =", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("crt_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("crt_time <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("crt_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("crt_time >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("crt_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_time >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("crt_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("crt_time <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("crt_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("crt_time <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("crt_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeIn(List<Date> values) {
            addCriterion("crt_time in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotIn(List<Date> values) {
            addCriterion("crt_time not in", values, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeBetween(Date value1, Date value2) {
            addCriterion("crt_time between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotBetween(Date value1, Date value2) {
            addCriterion("crt_time not between", value1, value2, "crtTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNull() {
            addCriterion("upd_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeIsNotNull() {
            addCriterion("upd_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualTo(Date value) {
            addCriterion("upd_time =", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("upd_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("upd_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("upd_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("upd_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("upd_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualToColumn(YxCouponTemp.Column column) {
            addCriterion(new StringBuilder("upd_time <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeIn(List<Date> values) {
            addCriterion("upd_time in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotIn(List<Date> values) {
            addCriterion("upd_time not in", values, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeBetween(Date value1, Date value2) {
            addCriterion("upd_time between", value1, value2, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotBetween(Date value1, Date value2) {
            addCriterion("upd_time not between", value1, value2, "updTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private YxCouponTempExample example;

        protected Criteria(YxCouponTempExample example) {
            super();
            this.example = example;
        }

        public YxCouponTempExample example() {
            return this.example;
        }

        @Deprecated
        public Criteria andIf(boolean ifAdd, ICriteriaAdd add) {
            if (ifAdd) {
                add.add(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then) {
            if (condition) {
                then.criteria(this);
            }
            return this;
        }

        public Criteria when(boolean condition, ICriteriaWhen then, ICriteriaWhen otherwise) {
            if (condition) {
                then.criteria(this);
            } else {
                otherwise.criteria(this);
            }
            return this;
        }

        @Deprecated
        public interface ICriteriaAdd {
            Criteria add(Criteria add);
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }

    public interface ICriteriaWhen {
        void criteria(Criteria criteria);
    }

    public interface IExampleWhen {
        void example(co.yixiang.gen.domain.YxCouponTempExample example);
    }
}