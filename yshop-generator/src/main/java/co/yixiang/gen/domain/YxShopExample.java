package co.yixiang.gen.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class YxShopExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YxShopExample() {
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

    public YxShopExample orderBy(String orderByClause) {
        this.setOrderByClause(orderByClause);
        return this;
    }

    public YxShopExample orderBy(String ... orderByClauses) {
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
        YxShopExample example = new YxShopExample();
        return example.createCriteria();
    }

    public YxShopExample when(boolean condition, IExampleWhen then) {
        if (condition) {
            then.example(this);
        }
        return this;
    }

    public YxShopExample when(boolean condition, IExampleWhen then, IExampleWhen otherwise) {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
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

        public Criteria andUserIdEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("user_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("user_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("user_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("user_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("user_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualToColumn(YxShop.Column column) {
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

        public Criteria andClassIdIsNull() {
            addCriterion("class_id is null");
            return (Criteria) this;
        }

        public Criteria andClassIdIsNotNull() {
            addCriterion("class_id is not null");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualTo(Integer value) {
            addCriterion("class_id =", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("class_id = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualTo(Integer value) {
            addCriterion("class_id <>", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("class_id <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThan(Integer value) {
            addCriterion("class_id >", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("class_id > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("class_id >=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("class_id >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassIdLessThan(Integer value) {
            addCriterion("class_id <", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("class_id < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualTo(Integer value) {
            addCriterion("class_id <=", value, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdLessThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("class_id <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andClassIdIn(List<Integer> values) {
            addCriterion("class_id in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotIn(List<Integer> values) {
            addCriterion("class_id not in", values, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdBetween(Integer value1, Integer value2) {
            addCriterion("class_id between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andClassIdNotBetween(Integer value1, Integer value2) {
            addCriterion("class_id not between", value1, value2, "classId");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("address = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("address <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("address > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("address >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("address < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("address <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("tel is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("tel is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("tel =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("tel = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("tel <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("tel <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("tel >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("tel > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("tel >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("tel >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("tel <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("tel < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("tel <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("tel <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("tel like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("tel not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("tel in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("tel not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("tel between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("tel not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("license = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("license <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("license > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("license >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("license < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("license <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andCardPositiveIsNull() {
            addCriterion("card_positive is null");
            return (Criteria) this;
        }

        public Criteria andCardPositiveIsNotNull() {
            addCriterion("card_positive is not null");
            return (Criteria) this;
        }

        public Criteria andCardPositiveEqualTo(String value) {
            addCriterion("card_positive =", value, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_positive = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardPositiveNotEqualTo(String value) {
            addCriterion("card_positive <>", value, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_positive <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardPositiveGreaterThan(String value) {
            addCriterion("card_positive >", value, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_positive > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardPositiveGreaterThanOrEqualTo(String value) {
            addCriterion("card_positive >=", value, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_positive >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardPositiveLessThan(String value) {
            addCriterion("card_positive <", value, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_positive < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardPositiveLessThanOrEqualTo(String value) {
            addCriterion("card_positive <=", value, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveLessThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_positive <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardPositiveLike(String value) {
            addCriterion("card_positive like", value, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveNotLike(String value) {
            addCriterion("card_positive not like", value, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveIn(List<String> values) {
            addCriterion("card_positive in", values, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveNotIn(List<String> values) {
            addCriterion("card_positive not in", values, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveBetween(String value1, String value2) {
            addCriterion("card_positive between", value1, value2, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardPositiveNotBetween(String value1, String value2) {
            addCriterion("card_positive not between", value1, value2, "cardPositive");
            return (Criteria) this;
        }

        public Criteria andCardBackIsNull() {
            addCriterion("card_back is null");
            return (Criteria) this;
        }

        public Criteria andCardBackIsNotNull() {
            addCriterion("card_back is not null");
            return (Criteria) this;
        }

        public Criteria andCardBackEqualTo(String value) {
            addCriterion("card_back =", value, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_back = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardBackNotEqualTo(String value) {
            addCriterion("card_back <>", value, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_back <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardBackGreaterThan(String value) {
            addCriterion("card_back >", value, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_back > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardBackGreaterThanOrEqualTo(String value) {
            addCriterion("card_back >=", value, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_back >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardBackLessThan(String value) {
            addCriterion("card_back <", value, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_back < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardBackLessThanOrEqualTo(String value) {
            addCriterion("card_back <=", value, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackLessThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("card_back <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCardBackLike(String value) {
            addCriterion("card_back like", value, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackNotLike(String value) {
            addCriterion("card_back not like", value, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackIn(List<String> values) {
            addCriterion("card_back in", values, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackNotIn(List<String> values) {
            addCriterion("card_back not in", values, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackBetween(String value1, String value2) {
            addCriterion("card_back between", value1, value2, "cardBack");
            return (Criteria) this;
        }

        public Criteria andCardBackNotBetween(String value1, String value2) {
            addCriterion("card_back not between", value1, value2, "cardBack");
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

        public Criteria andCrtTimeEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("crt_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualTo(Date value) {
            addCriterion("crt_time <>", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("crt_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThan(Date value) {
            addCriterion("crt_time >", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("crt_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("crt_time >=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("crt_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThan(Date value) {
            addCriterion("crt_time <", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("crt_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualTo(Date value) {
            addCriterion("crt_time <=", value, "crtTime");
            return (Criteria) this;
        }

        public Criteria andCrtTimeLessThanOrEqualToColumn(YxShop.Column column) {
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

        public Criteria andUpdTimeEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("upd_time = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualTo(Date value) {
            addCriterion("upd_time <>", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("upd_time <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThan(Date value) {
            addCriterion("upd_time >", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("upd_time > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("upd_time >=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("upd_time >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThan(Date value) {
            addCriterion("upd_time <", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("upd_time < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualTo(Date value) {
            addCriterion("upd_time <=", value, "updTime");
            return (Criteria) this;
        }

        public Criteria andUpdTimeLessThanOrEqualToColumn(YxShop.Column column) {
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

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("shop_name = ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("shop_name <> ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("shop_name > ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("shop_name >= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("shop_name < ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualToColumn(YxShop.Column column) {
            addCriterion(new StringBuilder("shop_name <= ").append(column.getEscapedColumnName()).toString());
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        private YxShopExample example;

        protected Criteria(YxShopExample example) {
            super();
            this.example = example;
        }

        public YxShopExample example() {
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
        void example(co.yixiang.gen.domain.YxShopExample example);
    }
}