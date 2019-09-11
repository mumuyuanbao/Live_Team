package com.live.liveteam.entity;

import java.util.ArrayList;
import java.util.List;

public class CouponsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CouponsExample() {
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

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNull() {
            addCriterion("open_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenIdIsNotNull() {
            addCriterion("open_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenIdEqualTo(String value) {
            addCriterion("open_id =", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotEqualTo(String value) {
            addCriterion("open_id <>", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThan(String value) {
            addCriterion("open_id >", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("open_id >=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThan(String value) {
            addCriterion("open_id <", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLessThanOrEqualTo(String value) {
            addCriterion("open_id <=", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdLike(String value) {
            addCriterion("open_id like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotLike(String value) {
            addCriterion("open_id not like", value, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdIn(List<String> values) {
            addCriterion("open_id in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotIn(List<String> values) {
            addCriterion("open_id not in", values, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdBetween(String value1, String value2) {
            addCriterion("open_id between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andOpenIdNotBetween(String value1, String value2) {
            addCriterion("open_id not between", value1, value2, "openId");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeIsNull() {
            addCriterion("coupons_type is null");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeIsNotNull() {
            addCriterion("coupons_type is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeEqualTo(Integer value) {
            addCriterion("coupons_type =", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotEqualTo(Integer value) {
            addCriterion("coupons_type <>", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeGreaterThan(Integer value) {
            addCriterion("coupons_type >", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupons_type >=", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeLessThan(Integer value) {
            addCriterion("coupons_type <", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("coupons_type <=", value, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeIn(List<Integer> values) {
            addCriterion("coupons_type in", values, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotIn(List<Integer> values) {
            addCriterion("coupons_type not in", values, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeBetween(Integer value1, Integer value2) {
            addCriterion("coupons_type between", value1, value2, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("coupons_type not between", value1, value2, "couponsType");
            return (Criteria) this;
        }

        public Criteria andCouponsValueIsNull() {
            addCriterion("coupons_value is null");
            return (Criteria) this;
        }

        public Criteria andCouponsValueIsNotNull() {
            addCriterion("coupons_value is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsValueEqualTo(Integer value) {
            addCriterion("coupons_value =", value, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsValueNotEqualTo(Integer value) {
            addCriterion("coupons_value <>", value, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsValueGreaterThan(Integer value) {
            addCriterion("coupons_value >", value, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupons_value >=", value, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsValueLessThan(Integer value) {
            addCriterion("coupons_value <", value, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsValueLessThanOrEqualTo(Integer value) {
            addCriterion("coupons_value <=", value, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsValueIn(List<Integer> values) {
            addCriterion("coupons_value in", values, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsValueNotIn(List<Integer> values) {
            addCriterion("coupons_value not in", values, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsValueBetween(Integer value1, Integer value2) {
            addCriterion("coupons_value between", value1, value2, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsValueNotBetween(Integer value1, Integer value2) {
            addCriterion("coupons_value not between", value1, value2, "couponsValue");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireIsNull() {
            addCriterion("coupons_require is null");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireIsNotNull() {
            addCriterion("coupons_require is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireEqualTo(Integer value) {
            addCriterion("coupons_require =", value, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireNotEqualTo(Integer value) {
            addCriterion("coupons_require <>", value, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireGreaterThan(Integer value) {
            addCriterion("coupons_require >", value, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupons_require >=", value, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireLessThan(Integer value) {
            addCriterion("coupons_require <", value, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireLessThanOrEqualTo(Integer value) {
            addCriterion("coupons_require <=", value, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireIn(List<Integer> values) {
            addCriterion("coupons_require in", values, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireNotIn(List<Integer> values) {
            addCriterion("coupons_require not in", values, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireBetween(Integer value1, Integer value2) {
            addCriterion("coupons_require between", value1, value2, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsRequireNotBetween(Integer value1, Integer value2) {
            addCriterion("coupons_require not between", value1, value2, "couponsRequire");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdIsNull() {
            addCriterion("coupons_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdIsNotNull() {
            addCriterion("coupons_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdEqualTo(Long value) {
            addCriterion("coupons_goods_id =", value, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdNotEqualTo(Long value) {
            addCriterion("coupons_goods_id <>", value, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdGreaterThan(Long value) {
            addCriterion("coupons_goods_id >", value, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("coupons_goods_id >=", value, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdLessThan(Long value) {
            addCriterion("coupons_goods_id <", value, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("coupons_goods_id <=", value, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdIn(List<Long> values) {
            addCriterion("coupons_goods_id in", values, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdNotIn(List<Long> values) {
            addCriterion("coupons_goods_id not in", values, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdBetween(Long value1, Long value2) {
            addCriterion("coupons_goods_id between", value1, value2, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("coupons_goods_id not between", value1, value2, "couponsGoodsId");
            return (Criteria) this;
        }

        public Criteria andCouponsStateIsNull() {
            addCriterion("coupons_state is null");
            return (Criteria) this;
        }

        public Criteria andCouponsStateIsNotNull() {
            addCriterion("coupons_state is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsStateEqualTo(Integer value) {
            addCriterion("coupons_state =", value, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStateNotEqualTo(Integer value) {
            addCriterion("coupons_state <>", value, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStateGreaterThan(Integer value) {
            addCriterion("coupons_state >", value, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupons_state >=", value, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStateLessThan(Integer value) {
            addCriterion("coupons_state <", value, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStateLessThanOrEqualTo(Integer value) {
            addCriterion("coupons_state <=", value, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStateIn(List<Integer> values) {
            addCriterion("coupons_state in", values, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStateNotIn(List<Integer> values) {
            addCriterion("coupons_state not in", values, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStateBetween(Integer value1, Integer value2) {
            addCriterion("coupons_state between", value1, value2, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("coupons_state not between", value1, value2, "couponsState");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeIsNull() {
            addCriterion("coupons_start_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeIsNotNull() {
            addCriterion("coupons_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeEqualTo(Long value) {
            addCriterion("coupons_start_time =", value, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeNotEqualTo(Long value) {
            addCriterion("coupons_start_time <>", value, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeGreaterThan(Long value) {
            addCriterion("coupons_start_time >", value, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("coupons_start_time >=", value, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeLessThan(Long value) {
            addCriterion("coupons_start_time <", value, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("coupons_start_time <=", value, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeIn(List<Long> values) {
            addCriterion("coupons_start_time in", values, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeNotIn(List<Long> values) {
            addCriterion("coupons_start_time not in", values, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeBetween(Long value1, Long value2) {
            addCriterion("coupons_start_time between", value1, value2, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("coupons_start_time not between", value1, value2, "couponsStartTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeIsNull() {
            addCriterion("coupons_use_time is null");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeIsNotNull() {
            addCriterion("coupons_use_time is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeEqualTo(Long value) {
            addCriterion("coupons_use_time =", value, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeNotEqualTo(Long value) {
            addCriterion("coupons_use_time <>", value, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeGreaterThan(Long value) {
            addCriterion("coupons_use_time >", value, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("coupons_use_time >=", value, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeLessThan(Long value) {
            addCriterion("coupons_use_time <", value, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeLessThanOrEqualTo(Long value) {
            addCriterion("coupons_use_time <=", value, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeIn(List<Long> values) {
            addCriterion("coupons_use_time in", values, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeNotIn(List<Long> values) {
            addCriterion("coupons_use_time not in", values, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeBetween(Long value1, Long value2) {
            addCriterion("coupons_use_time between", value1, value2, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsUseTimeNotBetween(Long value1, Long value2) {
            addCriterion("coupons_use_time not between", value1, value2, "couponsUseTime");
            return (Criteria) this;
        }

        public Criteria andCouponsDescIsNull() {
            addCriterion("coupons_desc is null");
            return (Criteria) this;
        }

        public Criteria andCouponsDescIsNotNull() {
            addCriterion("coupons_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsDescEqualTo(String value) {
            addCriterion("coupons_desc =", value, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescNotEqualTo(String value) {
            addCriterion("coupons_desc <>", value, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescGreaterThan(String value) {
            addCriterion("coupons_desc >", value, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescGreaterThanOrEqualTo(String value) {
            addCriterion("coupons_desc >=", value, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescLessThan(String value) {
            addCriterion("coupons_desc <", value, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescLessThanOrEqualTo(String value) {
            addCriterion("coupons_desc <=", value, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescLike(String value) {
            addCriterion("coupons_desc like", value, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescNotLike(String value) {
            addCriterion("coupons_desc not like", value, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescIn(List<String> values) {
            addCriterion("coupons_desc in", values, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescNotIn(List<String> values) {
            addCriterion("coupons_desc not in", values, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescBetween(String value1, String value2) {
            addCriterion("coupons_desc between", value1, value2, "couponsDesc");
            return (Criteria) this;
        }

        public Criteria andCouponsDescNotBetween(String value1, String value2) {
            addCriterion("coupons_desc not between", value1, value2, "couponsDesc");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
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
}