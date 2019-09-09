package com.live.liveteam.entity;

import java.util.ArrayList;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrdersExample() {
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

        public Criteria andOrderNumIsNull() {
            addCriterion("order_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderNumIsNotNull() {
            addCriterion("order_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNumEqualTo(String value) {
            addCriterion("order_num =", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotEqualTo(String value) {
            addCriterion("order_num <>", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThan(String value) {
            addCriterion("order_num >", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumGreaterThanOrEqualTo(String value) {
            addCriterion("order_num >=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThan(String value) {
            addCriterion("order_num <", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLessThanOrEqualTo(String value) {
            addCriterion("order_num <=", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumLike(String value) {
            addCriterion("order_num like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotLike(String value) {
            addCriterion("order_num not like", value, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumIn(List<String> values) {
            addCriterion("order_num in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotIn(List<String> values) {
            addCriterion("order_num not in", values, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumBetween(String value1, String value2) {
            addCriterion("order_num between", value1, value2, "orderNum");
            return (Criteria) this;
        }

        public Criteria andOrderNumNotBetween(String value1, String value2) {
            addCriterion("order_num not between", value1, value2, "orderNum");
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Long value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Long value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Long value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Long value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Long value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Long value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Long> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Long> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Long value1, Long value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Long value1, Long value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Integer value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Integer value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Integer value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Integer value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Integer value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Integer> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Integer> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Integer value1, Integer value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Integer value1, Integer value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsIsNull() {
            addCriterion("goods_urls is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsIsNotNull() {
            addCriterion("goods_urls is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsEqualTo(String value) {
            addCriterion("goods_urls =", value, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsNotEqualTo(String value) {
            addCriterion("goods_urls <>", value, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsGreaterThan(String value) {
            addCriterion("goods_urls >", value, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsGreaterThanOrEqualTo(String value) {
            addCriterion("goods_urls >=", value, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsLessThan(String value) {
            addCriterion("goods_urls <", value, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsLessThanOrEqualTo(String value) {
            addCriterion("goods_urls <=", value, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsLike(String value) {
            addCriterion("goods_urls like", value, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsNotLike(String value) {
            addCriterion("goods_urls not like", value, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsIn(List<String> values) {
            addCriterion("goods_urls in", values, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsNotIn(List<String> values) {
            addCriterion("goods_urls not in", values, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsBetween(String value1, String value2) {
            addCriterion("goods_urls between", value1, value2, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andGoodsUrlsNotBetween(String value1, String value2) {
            addCriterion("goods_urls not between", value1, value2, "goodsUrls");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalIsNull() {
            addCriterion("order_price_total is null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalIsNotNull() {
            addCriterion("order_price_total is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalEqualTo(Long value) {
            addCriterion("order_price_total =", value, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalNotEqualTo(Long value) {
            addCriterion("order_price_total <>", value, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalGreaterThan(Long value) {
            addCriterion("order_price_total >", value, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("order_price_total >=", value, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalLessThan(Long value) {
            addCriterion("order_price_total <", value, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalLessThanOrEqualTo(Long value) {
            addCriterion("order_price_total <=", value, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalIn(List<Long> values) {
            addCriterion("order_price_total in", values, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalNotIn(List<Long> values) {
            addCriterion("order_price_total not in", values, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalBetween(Long value1, Long value2) {
            addCriterion("order_price_total between", value1, value2, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderPriceTotalNotBetween(Long value1, Long value2) {
            addCriterion("order_price_total not between", value1, value2, "orderPriceTotal");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumIsNull() {
            addCriterion("order_goods_num is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumIsNotNull() {
            addCriterion("order_goods_num is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumEqualTo(Long value) {
            addCriterion("order_goods_num =", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumNotEqualTo(Long value) {
            addCriterion("order_goods_num <>", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumGreaterThan(Long value) {
            addCriterion("order_goods_num >", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumGreaterThanOrEqualTo(Long value) {
            addCriterion("order_goods_num >=", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumLessThan(Long value) {
            addCriterion("order_goods_num <", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumLessThanOrEqualTo(Long value) {
            addCriterion("order_goods_num <=", value, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumIn(List<Long> values) {
            addCriterion("order_goods_num in", values, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumNotIn(List<Long> values) {
            addCriterion("order_goods_num not in", values, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumBetween(Long value1, Long value2) {
            addCriterion("order_goods_num between", value1, value2, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNumNotBetween(Long value1, Long value2) {
            addCriterion("order_goods_num not between", value1, value2, "orderGoodsNum");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsIsNull() {
            addCriterion("coupons_ids is null");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsIsNotNull() {
            addCriterion("coupons_ids is not null");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsEqualTo(String value) {
            addCriterion("coupons_ids =", value, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsNotEqualTo(String value) {
            addCriterion("coupons_ids <>", value, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsGreaterThan(String value) {
            addCriterion("coupons_ids >", value, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsGreaterThanOrEqualTo(String value) {
            addCriterion("coupons_ids >=", value, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsLessThan(String value) {
            addCriterion("coupons_ids <", value, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsLessThanOrEqualTo(String value) {
            addCriterion("coupons_ids <=", value, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsLike(String value) {
            addCriterion("coupons_ids like", value, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsNotLike(String value) {
            addCriterion("coupons_ids not like", value, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsIn(List<String> values) {
            addCriterion("coupons_ids in", values, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsNotIn(List<String> values) {
            addCriterion("coupons_ids not in", values, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsBetween(String value1, String value2) {
            addCriterion("coupons_ids between", value1, value2, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andCouponsIdsNotBetween(String value1, String value2) {
            addCriterion("coupons_ids not between", value1, value2, "couponsIds");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmIsNull() {
            addCriterion("order_affirm is null");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmIsNotNull() {
            addCriterion("order_affirm is not null");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmEqualTo(Long value) {
            addCriterion("order_affirm =", value, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmNotEqualTo(Long value) {
            addCriterion("order_affirm <>", value, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmGreaterThan(Long value) {
            addCriterion("order_affirm >", value, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmGreaterThanOrEqualTo(Long value) {
            addCriterion("order_affirm >=", value, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmLessThan(Long value) {
            addCriterion("order_affirm <", value, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmLessThanOrEqualTo(Long value) {
            addCriterion("order_affirm <=", value, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmIn(List<Long> values) {
            addCriterion("order_affirm in", values, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmNotIn(List<Long> values) {
            addCriterion("order_affirm not in", values, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmBetween(Long value1, Long value2) {
            addCriterion("order_affirm between", value1, value2, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderAffirmNotBetween(Long value1, Long value2) {
            addCriterion("order_affirm not between", value1, value2, "orderAffirm");
            return (Criteria) this;
        }

        public Criteria andOrderScoreIsNull() {
            addCriterion("order_score is null");
            return (Criteria) this;
        }

        public Criteria andOrderScoreIsNotNull() {
            addCriterion("order_score is not null");
            return (Criteria) this;
        }

        public Criteria andOrderScoreEqualTo(Integer value) {
            addCriterion("order_score =", value, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderScoreNotEqualTo(Integer value) {
            addCriterion("order_score <>", value, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderScoreGreaterThan(Integer value) {
            addCriterion("order_score >", value, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_score >=", value, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderScoreLessThan(Integer value) {
            addCriterion("order_score <", value, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderScoreLessThanOrEqualTo(Integer value) {
            addCriterion("order_score <=", value, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderScoreIn(List<Integer> values) {
            addCriterion("order_score in", values, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderScoreNotIn(List<Integer> values) {
            addCriterion("order_score not in", values, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderScoreBetween(Integer value1, Integer value2) {
            addCriterion("order_score between", value1, value2, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("order_score not between", value1, value2, "orderScore");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceIsNull() {
            addCriterion("order_coupons_price is null");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceIsNotNull() {
            addCriterion("order_coupons_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceEqualTo(Long value) {
            addCriterion("order_coupons_price =", value, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceNotEqualTo(Long value) {
            addCriterion("order_coupons_price <>", value, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceGreaterThan(Long value) {
            addCriterion("order_coupons_price >", value, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("order_coupons_price >=", value, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceLessThan(Long value) {
            addCriterion("order_coupons_price <", value, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceLessThanOrEqualTo(Long value) {
            addCriterion("order_coupons_price <=", value, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceIn(List<Long> values) {
            addCriterion("order_coupons_price in", values, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceNotIn(List<Long> values) {
            addCriterion("order_coupons_price not in", values, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceBetween(Long value1, Long value2) {
            addCriterion("order_coupons_price between", value1, value2, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCouponsPriceNotBetween(Long value1, Long value2) {
            addCriterion("order_coupons_price not between", value1, value2, "orderCouponsPrice");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseIsNull() {
            addCriterion("order_cancel_cause is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseIsNotNull() {
            addCriterion("order_cancel_cause is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseEqualTo(String value) {
            addCriterion("order_cancel_cause =", value, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseNotEqualTo(String value) {
            addCriterion("order_cancel_cause <>", value, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseGreaterThan(String value) {
            addCriterion("order_cancel_cause >", value, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseGreaterThanOrEqualTo(String value) {
            addCriterion("order_cancel_cause >=", value, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseLessThan(String value) {
            addCriterion("order_cancel_cause <", value, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseLessThanOrEqualTo(String value) {
            addCriterion("order_cancel_cause <=", value, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseLike(String value) {
            addCriterion("order_cancel_cause like", value, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseNotLike(String value) {
            addCriterion("order_cancel_cause not like", value, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseIn(List<String> values) {
            addCriterion("order_cancel_cause in", values, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseNotIn(List<String> values) {
            addCriterion("order_cancel_cause not in", values, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseBetween(String value1, String value2) {
            addCriterion("order_cancel_cause between", value1, value2, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderCancelCauseNotBetween(String value1, String value2) {
            addCriterion("order_cancel_cause not between", value1, value2, "orderCancelCause");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNull() {
            addCriterion("order_pay_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIsNotNull() {
            addCriterion("order_pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeEqualTo(Long value) {
            addCriterion("order_pay_time =", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotEqualTo(Long value) {
            addCriterion("order_pay_time <>", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThan(Long value) {
            addCriterion("order_pay_time >", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_pay_time >=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThan(Long value) {
            addCriterion("order_pay_time <", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeLessThanOrEqualTo(Long value) {
            addCriterion("order_pay_time <=", value, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeIn(List<Long> values) {
            addCriterion("order_pay_time in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotIn(List<Long> values) {
            addCriterion("order_pay_time not in", values, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeBetween(Long value1, Long value2) {
            addCriterion("order_pay_time between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andOrderPayTimeNotBetween(Long value1, Long value2) {
            addCriterion("order_pay_time not between", value1, value2, "orderPayTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateIsNull() {
            addCriterion("order_update is null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateIsNotNull() {
            addCriterion("order_update is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateEqualTo(Long value) {
            addCriterion("order_update =", value, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateNotEqualTo(Long value) {
            addCriterion("order_update <>", value, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateGreaterThan(Long value) {
            addCriterion("order_update >", value, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateGreaterThanOrEqualTo(Long value) {
            addCriterion("order_update >=", value, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateLessThan(Long value) {
            addCriterion("order_update <", value, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateLessThanOrEqualTo(Long value) {
            addCriterion("order_update <=", value, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateIn(List<Long> values) {
            addCriterion("order_update in", values, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateNotIn(List<Long> values) {
            addCriterion("order_update not in", values, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateBetween(Long value1, Long value2) {
            addCriterion("order_update between", value1, value2, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderUpdateNotBetween(Long value1, Long value2) {
            addCriterion("order_update not between", value1, value2, "orderUpdate");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeIsNull() {
            addCriterion("order_cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeIsNotNull() {
            addCriterion("order_cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeEqualTo(Long value) {
            addCriterion("order_cancel_time =", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeNotEqualTo(Long value) {
            addCriterion("order_cancel_time <>", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeGreaterThan(Long value) {
            addCriterion("order_cancel_time >", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("order_cancel_time >=", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeLessThan(Long value) {
            addCriterion("order_cancel_time <", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeLessThanOrEqualTo(Long value) {
            addCriterion("order_cancel_time <=", value, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeIn(List<Long> values) {
            addCriterion("order_cancel_time in", values, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeNotIn(List<Long> values) {
            addCriterion("order_cancel_time not in", values, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeBetween(Long value1, Long value2) {
            addCriterion("order_cancel_time between", value1, value2, "orderCancelTime");
            return (Criteria) this;
        }

        public Criteria andOrderCancelTimeNotBetween(Long value1, Long value2) {
            addCriterion("order_cancel_time not between", value1, value2, "orderCancelTime");
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