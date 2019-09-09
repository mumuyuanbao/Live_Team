package com.live.liveteam.entity;

import java.util.ArrayList;
import java.util.List;

public class UserLevelRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserLevelRightExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
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

        public Criteria andLevelNameIsNull() {
            addCriterion("level_name is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNotNull() {
            addCriterion("level_name is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameEqualTo(String value) {
            addCriterion("level_name =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(String value) {
            addCriterion("level_name <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(String value) {
            addCriterion("level_name >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("level_name >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(String value) {
            addCriterion("level_name <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(String value) {
            addCriterion("level_name <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLike(String value) {
            addCriterion("level_name like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotLike(String value) {
            addCriterion("level_name not like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<String> values) {
            addCriterion("level_name in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<String> values) {
            addCriterion("level_name not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(String value1, String value2) {
            addCriterion("level_name between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(String value1, String value2) {
            addCriterion("level_name not between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberIsNull() {
            addCriterion("right_coupons_number is null");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberIsNotNull() {
            addCriterion("right_coupons_number is not null");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberEqualTo(Integer value) {
            addCriterion("right_coupons_number =", value, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberNotEqualTo(Integer value) {
            addCriterion("right_coupons_number <>", value, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberGreaterThan(Integer value) {
            addCriterion("right_coupons_number >", value, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_coupons_number >=", value, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberLessThan(Integer value) {
            addCriterion("right_coupons_number <", value, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("right_coupons_number <=", value, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberIn(List<Integer> values) {
            addCriterion("right_coupons_number in", values, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberNotIn(List<Integer> values) {
            addCriterion("right_coupons_number not in", values, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberBetween(Integer value1, Integer value2) {
            addCriterion("right_coupons_number between", value1, value2, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("right_coupons_number not between", value1, value2, "rightCouponsNumber");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueIsNull() {
            addCriterion("right_coupons_value is null");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueIsNotNull() {
            addCriterion("right_coupons_value is not null");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueEqualTo(Integer value) {
            addCriterion("right_coupons_value =", value, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueNotEqualTo(Integer value) {
            addCriterion("right_coupons_value <>", value, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueGreaterThan(Integer value) {
            addCriterion("right_coupons_value >", value, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_coupons_value >=", value, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueLessThan(Integer value) {
            addCriterion("right_coupons_value <", value, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueLessThanOrEqualTo(Integer value) {
            addCriterion("right_coupons_value <=", value, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueIn(List<Integer> values) {
            addCriterion("right_coupons_value in", values, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueNotIn(List<Integer> values) {
            addCriterion("right_coupons_value not in", values, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueBetween(Integer value1, Integer value2) {
            addCriterion("right_coupons_value between", value1, value2, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsValueNotBetween(Integer value1, Integer value2) {
            addCriterion("right_coupons_value not between", value1, value2, "rightCouponsValue");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutIsNull() {
            addCriterion("right_coupons_timeout is null");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutIsNotNull() {
            addCriterion("right_coupons_timeout is not null");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutEqualTo(Long value) {
            addCriterion("right_coupons_timeout =", value, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutNotEqualTo(Long value) {
            addCriterion("right_coupons_timeout <>", value, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutGreaterThan(Long value) {
            addCriterion("right_coupons_timeout >", value, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutGreaterThanOrEqualTo(Long value) {
            addCriterion("right_coupons_timeout >=", value, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutLessThan(Long value) {
            addCriterion("right_coupons_timeout <", value, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutLessThanOrEqualTo(Long value) {
            addCriterion("right_coupons_timeout <=", value, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutIn(List<Long> values) {
            addCriterion("right_coupons_timeout in", values, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutNotIn(List<Long> values) {
            addCriterion("right_coupons_timeout not in", values, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutBetween(Long value1, Long value2) {
            addCriterion("right_coupons_timeout between", value1, value2, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightCouponsTimeoutNotBetween(Long value1, Long value2) {
            addCriterion("right_coupons_timeout not between", value1, value2, "rightCouponsTimeout");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftIsNull() {
            addCriterion("right_birth_gift is null");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftIsNotNull() {
            addCriterion("right_birth_gift is not null");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftEqualTo(Integer value) {
            addCriterion("right_birth_gift =", value, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftNotEqualTo(Integer value) {
            addCriterion("right_birth_gift <>", value, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftGreaterThan(Integer value) {
            addCriterion("right_birth_gift >", value, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_birth_gift >=", value, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftLessThan(Integer value) {
            addCriterion("right_birth_gift <", value, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftLessThanOrEqualTo(Integer value) {
            addCriterion("right_birth_gift <=", value, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftIn(List<Integer> values) {
            addCriterion("right_birth_gift in", values, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftNotIn(List<Integer> values) {
            addCriterion("right_birth_gift not in", values, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftBetween(Integer value1, Integer value2) {
            addCriterion("right_birth_gift between", value1, value2, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightBirthGiftNotBetween(Integer value1, Integer value2) {
            addCriterion("right_birth_gift not between", value1, value2, "rightBirthGift");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioIsNull() {
            addCriterion("right_score_ratio is null");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioIsNotNull() {
            addCriterion("right_score_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioEqualTo(Integer value) {
            addCriterion("right_score_ratio =", value, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioNotEqualTo(Integer value) {
            addCriterion("right_score_ratio <>", value, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioGreaterThan(Integer value) {
            addCriterion("right_score_ratio >", value, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_score_ratio >=", value, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioLessThan(Integer value) {
            addCriterion("right_score_ratio <", value, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioLessThanOrEqualTo(Integer value) {
            addCriterion("right_score_ratio <=", value, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioIn(List<Integer> values) {
            addCriterion("right_score_ratio in", values, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioNotIn(List<Integer> values) {
            addCriterion("right_score_ratio not in", values, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioBetween(Integer value1, Integer value2) {
            addCriterion("right_score_ratio between", value1, value2, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightScoreRatioNotBetween(Integer value1, Integer value2) {
            addCriterion("right_score_ratio not between", value1, value2, "rightScoreRatio");
            return (Criteria) this;
        }

        public Criteria andRightDiscountIsNull() {
            addCriterion("right_discount is null");
            return (Criteria) this;
        }

        public Criteria andRightDiscountIsNotNull() {
            addCriterion("right_discount is not null");
            return (Criteria) this;
        }

        public Criteria andRightDiscountEqualTo(Integer value) {
            addCriterion("right_discount =", value, "rightDiscount");
            return (Criteria) this;
        }

        public Criteria andRightDiscountNotEqualTo(Integer value) {
            addCriterion("right_discount <>", value, "rightDiscount");
            return (Criteria) this;
        }

        public Criteria andRightDiscountGreaterThan(Integer value) {
            addCriterion("right_discount >", value, "rightDiscount");
            return (Criteria) this;
        }

        public Criteria andRightDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_discount >=", value, "rightDiscount");
            return (Criteria) this;
        }

        public Criteria andRightDiscountLessThan(Integer value) {
            addCriterion("right_discount <", value, "rightDiscount");
            return (Criteria) this;
        }

        public Criteria andRightDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("right_discount <=", value, "rightDiscount");
            return (Criteria) this;
        }

        public Criteria andRightDiscountIn(List<Integer> values) {
            addCriterion("right_discount in", values, "rightDiscount");
            return (Criteria) this;
        }

        public Criteria andRightDiscountNotIn(List<Integer> values) {
            addCriterion("right_discount not in", values, "rightDiscount");
            return (Criteria) this;
        }

        public Criteria andRightDiscountBetween(Integer value1, Integer value2) {
            addCriterion("right_discount between", value1, value2, "rightDiscount");
            return (Criteria) this;
        }

        public Criteria andRightDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("right_discount not between", value1, value2, "rightDiscount");
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