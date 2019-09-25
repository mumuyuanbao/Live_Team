package com.live.liveteam.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsExample() {
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

        public Criteria andGTypeIdIsNull() {
            addCriterion("g_type_id is null");
            return (Criteria) this;
        }

        public Criteria andGTypeIdIsNotNull() {
            addCriterion("g_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andGTypeIdEqualTo(Long value) {
            addCriterion("g_type_id =", value, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypeIdNotEqualTo(Long value) {
            addCriterion("g_type_id <>", value, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypeIdGreaterThan(Long value) {
            addCriterion("g_type_id >", value, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("g_type_id >=", value, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypeIdLessThan(Long value) {
            addCriterion("g_type_id <", value, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("g_type_id <=", value, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypeIdIn(List<Long> values) {
            addCriterion("g_type_id in", values, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypeIdNotIn(List<Long> values) {
            addCriterion("g_type_id not in", values, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypeIdBetween(Long value1, Long value2) {
            addCriterion("g_type_id between", value1, value2, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("g_type_id not between", value1, value2, "gTypeId");
            return (Criteria) this;
        }

        public Criteria andGTypePidIsNull() {
            addCriterion("g_type_pid is null");
            return (Criteria) this;
        }

        public Criteria andGTypePidIsNotNull() {
            addCriterion("g_type_pid is not null");
            return (Criteria) this;
        }

        public Criteria andGTypePidEqualTo(Long value) {
            addCriterion("g_type_pid =", value, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGTypePidNotEqualTo(Long value) {
            addCriterion("g_type_pid <>", value, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGTypePidGreaterThan(Long value) {
            addCriterion("g_type_pid >", value, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGTypePidGreaterThanOrEqualTo(Long value) {
            addCriterion("g_type_pid >=", value, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGTypePidLessThan(Long value) {
            addCriterion("g_type_pid <", value, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGTypePidLessThanOrEqualTo(Long value) {
            addCriterion("g_type_pid <=", value, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGTypePidIn(List<Long> values) {
            addCriterion("g_type_pid in", values, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGTypePidNotIn(List<Long> values) {
            addCriterion("g_type_pid not in", values, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGTypePidBetween(Long value1, Long value2) {
            addCriterion("g_type_pid between", value1, value2, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGTypePidNotBetween(Long value1, Long value2) {
            addCriterion("g_type_pid not between", value1, value2, "gTypePid");
            return (Criteria) this;
        }

        public Criteria andGNameIsNull() {
            addCriterion("g_name is null");
            return (Criteria) this;
        }

        public Criteria andGNameIsNotNull() {
            addCriterion("g_name is not null");
            return (Criteria) this;
        }

        public Criteria andGNameEqualTo(String value) {
            addCriterion("g_name =", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotEqualTo(String value) {
            addCriterion("g_name <>", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThan(String value) {
            addCriterion("g_name >", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameGreaterThanOrEqualTo(String value) {
            addCriterion("g_name >=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThan(String value) {
            addCriterion("g_name <", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLessThanOrEqualTo(String value) {
            addCriterion("g_name <=", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameLike(String value) {
            addCriterion("g_name like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotLike(String value) {
            addCriterion("g_name not like", value, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameIn(List<String> values) {
            addCriterion("g_name in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotIn(List<String> values) {
            addCriterion("g_name not in", values, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameBetween(String value1, String value2) {
            addCriterion("g_name between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGNameNotBetween(String value1, String value2) {
            addCriterion("g_name not between", value1, value2, "gName");
            return (Criteria) this;
        }

        public Criteria andGFullNameIsNull() {
            addCriterion("g_full_name is null");
            return (Criteria) this;
        }

        public Criteria andGFullNameIsNotNull() {
            addCriterion("g_full_name is not null");
            return (Criteria) this;
        }

        public Criteria andGFullNameEqualTo(String value) {
            addCriterion("g_full_name =", value, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameNotEqualTo(String value) {
            addCriterion("g_full_name <>", value, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameGreaterThan(String value) {
            addCriterion("g_full_name >", value, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("g_full_name >=", value, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameLessThan(String value) {
            addCriterion("g_full_name <", value, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameLessThanOrEqualTo(String value) {
            addCriterion("g_full_name <=", value, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameLike(String value) {
            addCriterion("g_full_name like", value, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameNotLike(String value) {
            addCriterion("g_full_name not like", value, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameIn(List<String> values) {
            addCriterion("g_full_name in", values, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameNotIn(List<String> values) {
            addCriterion("g_full_name not in", values, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameBetween(String value1, String value2) {
            addCriterion("g_full_name between", value1, value2, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGFullNameNotBetween(String value1, String value2) {
            addCriterion("g_full_name not between", value1, value2, "gFullName");
            return (Criteria) this;
        }

        public Criteria andGImageIsNull() {
            addCriterion("g_image is null");
            return (Criteria) this;
        }

        public Criteria andGImageIsNotNull() {
            addCriterion("g_image is not null");
            return (Criteria) this;
        }

        public Criteria andGImageEqualTo(String value) {
            addCriterion("g_image =", value, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageNotEqualTo(String value) {
            addCriterion("g_image <>", value, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageGreaterThan(String value) {
            addCriterion("g_image >", value, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageGreaterThanOrEqualTo(String value) {
            addCriterion("g_image >=", value, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageLessThan(String value) {
            addCriterion("g_image <", value, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageLessThanOrEqualTo(String value) {
            addCriterion("g_image <=", value, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageLike(String value) {
            addCriterion("g_image like", value, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageNotLike(String value) {
            addCriterion("g_image not like", value, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageIn(List<String> values) {
            addCriterion("g_image in", values, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageNotIn(List<String> values) {
            addCriterion("g_image not in", values, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageBetween(String value1, String value2) {
            addCriterion("g_image between", value1, value2, "gImage");
            return (Criteria) this;
        }

        public Criteria andGImageNotBetween(String value1, String value2) {
            addCriterion("g_image not between", value1, value2, "gImage");
            return (Criteria) this;
        }

        public Criteria andGPriceIsNull() {
            addCriterion("g_price is null");
            return (Criteria) this;
        }

        public Criteria andGPriceIsNotNull() {
            addCriterion("g_price is not null");
            return (Criteria) this;
        }

        public Criteria andGPriceEqualTo(Long value) {
            addCriterion("g_price =", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotEqualTo(Long value) {
            addCriterion("g_price <>", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceGreaterThan(Long value) {
            addCriterion("g_price >", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("g_price >=", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceLessThan(Long value) {
            addCriterion("g_price <", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceLessThanOrEqualTo(Long value) {
            addCriterion("g_price <=", value, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceIn(List<Long> values) {
            addCriterion("g_price in", values, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotIn(List<Long> values) {
            addCriterion("g_price not in", values, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceBetween(Long value1, Long value2) {
            addCriterion("g_price between", value1, value2, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGPriceNotBetween(Long value1, Long value2) {
            addCriterion("g_price not between", value1, value2, "gPrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceIsNull() {
            addCriterion("g_sale_price is null");
            return (Criteria) this;
        }

        public Criteria andGSalePriceIsNotNull() {
            addCriterion("g_sale_price is not null");
            return (Criteria) this;
        }

        public Criteria andGSalePriceEqualTo(Long value) {
            addCriterion("g_sale_price =", value, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceNotEqualTo(Long value) {
            addCriterion("g_sale_price <>", value, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceGreaterThan(Long value) {
            addCriterion("g_sale_price >", value, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceGreaterThanOrEqualTo(Long value) {
            addCriterion("g_sale_price >=", value, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceLessThan(Long value) {
            addCriterion("g_sale_price <", value, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceLessThanOrEqualTo(Long value) {
            addCriterion("g_sale_price <=", value, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceIn(List<Long> values) {
            addCriterion("g_sale_price in", values, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceNotIn(List<Long> values) {
            addCriterion("g_sale_price not in", values, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceBetween(Long value1, Long value2) {
            addCriterion("g_sale_price between", value1, value2, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSalePriceNotBetween(Long value1, Long value2) {
            addCriterion("g_sale_price not between", value1, value2, "gSalePrice");
            return (Criteria) this;
        }

        public Criteria andGSortIsNull() {
            addCriterion("g_sort is null");
            return (Criteria) this;
        }

        public Criteria andGSortIsNotNull() {
            addCriterion("g_sort is not null");
            return (Criteria) this;
        }

        public Criteria andGSortEqualTo(Long value) {
            addCriterion("g_sort =", value, "gSort");
            return (Criteria) this;
        }

        public Criteria andGSortNotEqualTo(Long value) {
            addCriterion("g_sort <>", value, "gSort");
            return (Criteria) this;
        }

        public Criteria andGSortGreaterThan(Long value) {
            addCriterion("g_sort >", value, "gSort");
            return (Criteria) this;
        }

        public Criteria andGSortGreaterThanOrEqualTo(Long value) {
            addCriterion("g_sort >=", value, "gSort");
            return (Criteria) this;
        }

        public Criteria andGSortLessThan(Long value) {
            addCriterion("g_sort <", value, "gSort");
            return (Criteria) this;
        }

        public Criteria andGSortLessThanOrEqualTo(Long value) {
            addCriterion("g_sort <=", value, "gSort");
            return (Criteria) this;
        }

        public Criteria andGSortIn(List<Long> values) {
            addCriterion("g_sort in", values, "gSort");
            return (Criteria) this;
        }

        public Criteria andGSortNotIn(List<Long> values) {
            addCriterion("g_sort not in", values, "gSort");
            return (Criteria) this;
        }

        public Criteria andGSortBetween(Long value1, Long value2) {
            addCriterion("g_sort between", value1, value2, "gSort");
            return (Criteria) this;
        }

        public Criteria andGSortNotBetween(Long value1, Long value2) {
            addCriterion("g_sort not between", value1, value2, "gSort");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyIsNull() {
            addCriterion("g_is_only is null");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyIsNotNull() {
            addCriterion("g_is_only is not null");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyEqualTo(Byte value) {
            addCriterion("g_is_only =", value, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyNotEqualTo(Byte value) {
            addCriterion("g_is_only <>", value, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyGreaterThan(Byte value) {
            addCriterion("g_is_only >", value, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyGreaterThanOrEqualTo(Byte value) {
            addCriterion("g_is_only >=", value, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyLessThan(Byte value) {
            addCriterion("g_is_only <", value, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyLessThanOrEqualTo(Byte value) {
            addCriterion("g_is_only <=", value, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyIn(List<Byte> values) {
            addCriterion("g_is_only in", values, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyNotIn(List<Byte> values) {
            addCriterion("g_is_only not in", values, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyBetween(Byte value1, Byte value2) {
            addCriterion("g_is_only between", value1, value2, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGIsOnlyNotBetween(Byte value1, Byte value2) {
            addCriterion("g_is_only not between", value1, value2, "gIsOnly");
            return (Criteria) this;
        }

        public Criteria andGStatusIsNull() {
            addCriterion("g_status is null");
            return (Criteria) this;
        }

        public Criteria andGStatusIsNotNull() {
            addCriterion("g_status is not null");
            return (Criteria) this;
        }

        public Criteria andGStatusEqualTo(Byte value) {
            addCriterion("g_status =", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusNotEqualTo(Byte value) {
            addCriterion("g_status <>", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusGreaterThan(Byte value) {
            addCriterion("g_status >", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("g_status >=", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusLessThan(Byte value) {
            addCriterion("g_status <", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusLessThanOrEqualTo(Byte value) {
            addCriterion("g_status <=", value, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusIn(List<Byte> values) {
            addCriterion("g_status in", values, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusNotIn(List<Byte> values) {
            addCriterion("g_status not in", values, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusBetween(Byte value1, Byte value2) {
            addCriterion("g_status between", value1, value2, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("g_status not between", value1, value2, "gStatus");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewIsNull() {
            addCriterion("goods_is_new is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewIsNotNull() {
            addCriterion("goods_is_new is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewEqualTo(Byte value) {
            addCriterion("goods_is_new =", value, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewNotEqualTo(Byte value) {
            addCriterion("goods_is_new <>", value, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewGreaterThan(Byte value) {
            addCriterion("goods_is_new >", value, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewGreaterThanOrEqualTo(Byte value) {
            addCriterion("goods_is_new >=", value, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewLessThan(Byte value) {
            addCriterion("goods_is_new <", value, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewLessThanOrEqualTo(Byte value) {
            addCriterion("goods_is_new <=", value, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewIn(List<Byte> values) {
            addCriterion("goods_is_new in", values, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewNotIn(List<Byte> values) {
            addCriterion("goods_is_new not in", values, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewBetween(Byte value1, Byte value2) {
            addCriterion("goods_is_new between", value1, value2, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNewNotBetween(Byte value1, Byte value2) {
            addCriterion("goods_is_new not between", value1, value2, "goodsIsNew");
            return (Criteria) this;
        }

        public Criteria andGNewStartIsNull() {
            addCriterion("g_new_start is null");
            return (Criteria) this;
        }

        public Criteria andGNewStartIsNotNull() {
            addCriterion("g_new_start is not null");
            return (Criteria) this;
        }

        public Criteria andGNewStartEqualTo(Byte value) {
            addCriterion("g_new_start =", value, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGNewStartNotEqualTo(Byte value) {
            addCriterion("g_new_start <>", value, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGNewStartGreaterThan(Byte value) {
            addCriterion("g_new_start >", value, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGNewStartGreaterThanOrEqualTo(Byte value) {
            addCriterion("g_new_start >=", value, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGNewStartLessThan(Byte value) {
            addCriterion("g_new_start <", value, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGNewStartLessThanOrEqualTo(Byte value) {
            addCriterion("g_new_start <=", value, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGNewStartIn(List<Byte> values) {
            addCriterion("g_new_start in", values, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGNewStartNotIn(List<Byte> values) {
            addCriterion("g_new_start not in", values, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGNewStartBetween(Byte value1, Byte value2) {
            addCriterion("g_new_start between", value1, value2, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGNewStartNotBetween(Byte value1, Byte value2) {
            addCriterion("g_new_start not between", value1, value2, "gNewStart");
            return (Criteria) this;
        }

        public Criteria andGSayPointIsNull() {
            addCriterion("g_say_point is null");
            return (Criteria) this;
        }

        public Criteria andGSayPointIsNotNull() {
            addCriterion("g_say_point is not null");
            return (Criteria) this;
        }

        public Criteria andGSayPointEqualTo(String value) {
            addCriterion("g_say_point =", value, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointNotEqualTo(String value) {
            addCriterion("g_say_point <>", value, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointGreaterThan(String value) {
            addCriterion("g_say_point >", value, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointGreaterThanOrEqualTo(String value) {
            addCriterion("g_say_point >=", value, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointLessThan(String value) {
            addCriterion("g_say_point <", value, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointLessThanOrEqualTo(String value) {
            addCriterion("g_say_point <=", value, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointLike(String value) {
            addCriterion("g_say_point like", value, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointNotLike(String value) {
            addCriterion("g_say_point not like", value, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointIn(List<String> values) {
            addCriterion("g_say_point in", values, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointNotIn(List<String> values) {
            addCriterion("g_say_point not in", values, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointBetween(String value1, String value2) {
            addCriterion("g_say_point between", value1, value2, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGSayPointNotBetween(String value1, String value2) {
            addCriterion("g_say_point not between", value1, value2, "gSayPoint");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeIsNull() {
            addCriterion("g_create_time is null");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeIsNotNull() {
            addCriterion("g_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeEqualTo(Long value) {
            addCriterion("g_create_time =", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeNotEqualTo(Long value) {
            addCriterion("g_create_time <>", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeGreaterThan(Long value) {
            addCriterion("g_create_time >", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("g_create_time >=", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeLessThan(Long value) {
            addCriterion("g_create_time <", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("g_create_time <=", value, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeIn(List<Long> values) {
            addCriterion("g_create_time in", values, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeNotIn(List<Long> values) {
            addCriterion("g_create_time not in", values, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeBetween(Long value1, Long value2) {
            addCriterion("g_create_time between", value1, value2, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("g_create_time not between", value1, value2, "gCreateTime");
            return (Criteria) this;
        }

        public Criteria andGCreateIdIsNull() {
            addCriterion("g_create_id is null");
            return (Criteria) this;
        }

        public Criteria andGCreateIdIsNotNull() {
            addCriterion("g_create_id is not null");
            return (Criteria) this;
        }

        public Criteria andGCreateIdEqualTo(String value) {
            addCriterion("g_create_id =", value, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdNotEqualTo(String value) {
            addCriterion("g_create_id <>", value, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdGreaterThan(String value) {
            addCriterion("g_create_id >", value, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("g_create_id >=", value, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdLessThan(String value) {
            addCriterion("g_create_id <", value, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdLessThanOrEqualTo(String value) {
            addCriterion("g_create_id <=", value, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdLike(String value) {
            addCriterion("g_create_id like", value, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdNotLike(String value) {
            addCriterion("g_create_id not like", value, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdIn(List<String> values) {
            addCriterion("g_create_id in", values, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdNotIn(List<String> values) {
            addCriterion("g_create_id not in", values, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdBetween(String value1, String value2) {
            addCriterion("g_create_id between", value1, value2, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGCreateIdNotBetween(String value1, String value2) {
            addCriterion("g_create_id not between", value1, value2, "gCreateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeIsNull() {
            addCriterion("g_update_time is null");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeIsNotNull() {
            addCriterion("g_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeEqualTo(Long value) {
            addCriterion("g_update_time =", value, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeNotEqualTo(Long value) {
            addCriterion("g_update_time <>", value, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeGreaterThan(Long value) {
            addCriterion("g_update_time >", value, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("g_update_time >=", value, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeLessThan(Long value) {
            addCriterion("g_update_time <", value, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("g_update_time <=", value, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeIn(List<Long> values) {
            addCriterion("g_update_time in", values, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeNotIn(List<Long> values) {
            addCriterion("g_update_time not in", values, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("g_update_time between", value1, value2, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("g_update_time not between", value1, value2, "gUpdateTime");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdIsNull() {
            addCriterion("g_update_id is null");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdIsNotNull() {
            addCriterion("g_update_id is not null");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdEqualTo(String value) {
            addCriterion("g_update_id =", value, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdNotEqualTo(String value) {
            addCriterion("g_update_id <>", value, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdGreaterThan(String value) {
            addCriterion("g_update_id >", value, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdGreaterThanOrEqualTo(String value) {
            addCriterion("g_update_id >=", value, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdLessThan(String value) {
            addCriterion("g_update_id <", value, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdLessThanOrEqualTo(String value) {
            addCriterion("g_update_id <=", value, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdLike(String value) {
            addCriterion("g_update_id like", value, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdNotLike(String value) {
            addCriterion("g_update_id not like", value, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdIn(List<String> values) {
            addCriterion("g_update_id in", values, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdNotIn(List<String> values) {
            addCriterion("g_update_id not in", values, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdBetween(String value1, String value2) {
            addCriterion("g_update_id between", value1, value2, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGUpdateIdNotBetween(String value1, String value2) {
            addCriterion("g_update_id not between", value1, value2, "gUpdateId");
            return (Criteria) this;
        }

        public Criteria andGSalesNumIsNull() {
            addCriterion("g_sales_num is null");
            return (Criteria) this;
        }

        public Criteria andGSalesNumIsNotNull() {
            addCriterion("g_sales_num is not null");
            return (Criteria) this;
        }

        public Criteria andGSalesNumEqualTo(Long value) {
            addCriterion("g_sales_num =", value, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGSalesNumNotEqualTo(Long value) {
            addCriterion("g_sales_num <>", value, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGSalesNumGreaterThan(Long value) {
            addCriterion("g_sales_num >", value, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGSalesNumGreaterThanOrEqualTo(Long value) {
            addCriterion("g_sales_num >=", value, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGSalesNumLessThan(Long value) {
            addCriterion("g_sales_num <", value, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGSalesNumLessThanOrEqualTo(Long value) {
            addCriterion("g_sales_num <=", value, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGSalesNumIn(List<Long> values) {
            addCriterion("g_sales_num in", values, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGSalesNumNotIn(List<Long> values) {
            addCriterion("g_sales_num not in", values, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGSalesNumBetween(Long value1, Long value2) {
            addCriterion("g_sales_num between", value1, value2, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGSalesNumNotBetween(Long value1, Long value2) {
            addCriterion("g_sales_num not between", value1, value2, "gSalesNum");
            return (Criteria) this;
        }

        public Criteria andGProvinceIsNull() {
            addCriterion("g_province is null");
            return (Criteria) this;
        }

        public Criteria andGProvinceIsNotNull() {
            addCriterion("g_province is not null");
            return (Criteria) this;
        }

        public Criteria andGProvinceEqualTo(String value) {
            addCriterion("g_province =", value, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceNotEqualTo(String value) {
            addCriterion("g_province <>", value, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceGreaterThan(String value) {
            addCriterion("g_province >", value, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("g_province >=", value, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceLessThan(String value) {
            addCriterion("g_province <", value, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceLessThanOrEqualTo(String value) {
            addCriterion("g_province <=", value, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceLike(String value) {
            addCriterion("g_province like", value, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceNotLike(String value) {
            addCriterion("g_province not like", value, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceIn(List<String> values) {
            addCriterion("g_province in", values, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceNotIn(List<String> values) {
            addCriterion("g_province not in", values, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceBetween(String value1, String value2) {
            addCriterion("g_province between", value1, value2, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGProvinceNotBetween(String value1, String value2) {
            addCriterion("g_province not between", value1, value2, "gProvince");
            return (Criteria) this;
        }

        public Criteria andGCityIsNull() {
            addCriterion("g_city is null");
            return (Criteria) this;
        }

        public Criteria andGCityIsNotNull() {
            addCriterion("g_city is not null");
            return (Criteria) this;
        }

        public Criteria andGCityEqualTo(String value) {
            addCriterion("g_city =", value, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityNotEqualTo(String value) {
            addCriterion("g_city <>", value, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityGreaterThan(String value) {
            addCriterion("g_city >", value, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityGreaterThanOrEqualTo(String value) {
            addCriterion("g_city >=", value, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityLessThan(String value) {
            addCriterion("g_city <", value, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityLessThanOrEqualTo(String value) {
            addCriterion("g_city <=", value, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityLike(String value) {
            addCriterion("g_city like", value, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityNotLike(String value) {
            addCriterion("g_city not like", value, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityIn(List<String> values) {
            addCriterion("g_city in", values, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityNotIn(List<String> values) {
            addCriterion("g_city not in", values, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityBetween(String value1, String value2) {
            addCriterion("g_city between", value1, value2, "gCity");
            return (Criteria) this;
        }

        public Criteria andGCityNotBetween(String value1, String value2) {
            addCriterion("g_city not between", value1, value2, "gCity");
            return (Criteria) this;
        }

        public Criteria andGNumIsNull() {
            addCriterion("g_num is null");
            return (Criteria) this;
        }

        public Criteria andGNumIsNotNull() {
            addCriterion("g_num is not null");
            return (Criteria) this;
        }

        public Criteria andGNumEqualTo(String value) {
            addCriterion("g_num =", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumNotEqualTo(String value) {
            addCriterion("g_num <>", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumGreaterThan(String value) {
            addCriterion("g_num >", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumGreaterThanOrEqualTo(String value) {
            addCriterion("g_num >=", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumLessThan(String value) {
            addCriterion("g_num <", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumLessThanOrEqualTo(String value) {
            addCriterion("g_num <=", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumLike(String value) {
            addCriterion("g_num like", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumNotLike(String value) {
            addCriterion("g_num not like", value, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumIn(List<String> values) {
            addCriterion("g_num in", values, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumNotIn(List<String> values) {
            addCriterion("g_num not in", values, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumBetween(String value1, String value2) {
            addCriterion("g_num between", value1, value2, "gNum");
            return (Criteria) this;
        }

        public Criteria andGNumNotBetween(String value1, String value2) {
            addCriterion("g_num not between", value1, value2, "gNum");
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