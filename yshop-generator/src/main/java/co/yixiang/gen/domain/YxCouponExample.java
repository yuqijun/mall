package co.yixiang.gen.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YxCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YxCouponExample() {
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

    public YxCouponExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public YxCouponExample orderBy(String ... orderByClauses) {
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
        YxCouponExample example = new YxCouponExample();
        return example.createCriteria();
    }

    public YxCouponExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public YxCouponExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Integer value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Integer value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Integer value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Integer value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Integer> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Integer> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
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

        public Criteria andCouponTempIdEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdNotEqualTo(Integer value) {
            addCriterion("coupon_temp_id <>", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdNotEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdGreaterThan(Integer value) {
            addCriterion("coupon_temp_id >", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdGreaterThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_temp_id >=", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdGreaterThanOrEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdLessThan(Integer value) {
            addCriterion("coupon_temp_id <", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdLessThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_temp_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponTempIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_temp_id <=", value, "couponTempId");
            return (Criteria) this;
        }

        public Criteria andCouponTempIdLessThanOrEqualToColumn(YxCoupon.Column column) {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("user_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNull() {
            addCriterion("coupon_status is null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNotNull() {
            addCriterion("coupon_status is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusEqualTo(Integer value) {
            addCriterion("coupon_status =", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_status = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotEqualTo(Integer value) {
            addCriterion("coupon_status <>", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_status <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThan(Integer value) {
            addCriterion("coupon_status >", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_status > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_status >=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThanOrEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_status >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThan(Integer value) {
            addCriterion("coupon_status <", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_status < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_status <=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThanOrEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("coupon_status <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCouponStatusIn(List<Integer> values) {
            addCriterion("coupon_status in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotIn(List<Integer> values) {
            addCriterion("coupon_status not in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusBetween(Integer value1, Integer value2) {
            addCriterion("coupon_status between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_status not between", value1, value2, "couponStatus");
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

        public Criteria andCrtTimeEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("crt_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("crt_time <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("crt_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("crt_time >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("crt_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_time >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("crt_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("crt_time <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("crt_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("crt_time <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualToColumn(YxCoupon.Column column) {
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

        public Criteria andUpdTimeEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("upd_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("upd_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("upd_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualToColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("upd_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanColumn(YxCoupon.Column column) {
            addCriterion(new StringBuilder("upd_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualToColumn(YxCoupon.Column column) {
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
        private YxCouponExample example;

        protected Criteria(YxCouponExample example) {
            super();
            this.example = example;
        }

        public YxCouponExample example() {
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
        void example(co.yixiang.gen.domain.YxCouponExample example);
    }
}