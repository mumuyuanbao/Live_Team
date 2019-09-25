package com.live.liveteam.entity;

import java.util.ArrayList;
import java.util.List;

public class AddressDestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressDestExample() {
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

        public Criteria andCCountryIdIsNull() {
            addCriterion("c_country_id is null");
            return (Criteria) this;
        }

        public Criteria andCCountryIdIsNotNull() {
            addCriterion("c_country_id is not null");
            return (Criteria) this;
        }

        public Criteria andCCountryIdEqualTo(Long value) {
            addCriterion("c_country_id =", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdNotEqualTo(Long value) {
            addCriterion("c_country_id <>", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdGreaterThan(Long value) {
            addCriterion("c_country_id >", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_country_id >=", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdLessThan(Long value) {
            addCriterion("c_country_id <", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdLessThanOrEqualTo(Long value) {
            addCriterion("c_country_id <=", value, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdIn(List<Long> values) {
            addCriterion("c_country_id in", values, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdNotIn(List<Long> values) {
            addCriterion("c_country_id not in", values, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdBetween(Long value1, Long value2) {
            addCriterion("c_country_id between", value1, value2, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andCCountryIdNotBetween(Long value1, Long value2) {
            addCriterion("c_country_id not between", value1, value2, "cCountryId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdIsNull() {
            addCriterion("p_province_id is null");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdIsNotNull() {
            addCriterion("p_province_id is not null");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdEqualTo(Long value) {
            addCriterion("p_province_id =", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdNotEqualTo(Long value) {
            addCriterion("p_province_id <>", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdGreaterThan(Long value) {
            addCriterion("p_province_id >", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("p_province_id >=", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdLessThan(Long value) {
            addCriterion("p_province_id <", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("p_province_id <=", value, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdIn(List<Long> values) {
            addCriterion("p_province_id in", values, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdNotIn(List<Long> values) {
            addCriterion("p_province_id not in", values, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdBetween(Long value1, Long value2) {
            addCriterion("p_province_id between", value1, value2, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andPProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("p_province_id not between", value1, value2, "pProvinceId");
            return (Criteria) this;
        }

        public Criteria andCCityIdIsNull() {
            addCriterion("c_city_id is null");
            return (Criteria) this;
        }

        public Criteria andCCityIdIsNotNull() {
            addCriterion("c_city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCCityIdEqualTo(Long value) {
            addCriterion("c_city_id =", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotEqualTo(Long value) {
            addCriterion("c_city_id <>", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdGreaterThan(Long value) {
            addCriterion("c_city_id >", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("c_city_id >=", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdLessThan(Long value) {
            addCriterion("c_city_id <", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdLessThanOrEqualTo(Long value) {
            addCriterion("c_city_id <=", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdIn(List<Long> values) {
            addCriterion("c_city_id in", values, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotIn(List<Long> values) {
            addCriterion("c_city_id not in", values, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdBetween(Long value1, Long value2) {
            addCriterion("c_city_id between", value1, value2, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotBetween(Long value1, Long value2) {
            addCriterion("c_city_id not between", value1, value2, "cCityId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdIsNull() {
            addCriterion("a_area_id is null");
            return (Criteria) this;
        }

        public Criteria andAAreaIdIsNotNull() {
            addCriterion("a_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andAAreaIdEqualTo(Long value) {
            addCriterion("a_area_id =", value, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdNotEqualTo(Long value) {
            addCriterion("a_area_id <>", value, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdGreaterThan(Long value) {
            addCriterion("a_area_id >", value, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("a_area_id >=", value, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdLessThan(Long value) {
            addCriterion("a_area_id <", value, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("a_area_id <=", value, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdIn(List<Long> values) {
            addCriterion("a_area_id in", values, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdNotIn(List<Long> values) {
            addCriterion("a_area_id not in", values, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdBetween(Long value1, Long value2) {
            addCriterion("a_area_id between", value1, value2, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andAAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("a_area_id not between", value1, value2, "aAreaId");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNull() {
            addCriterion("detailed_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIsNotNull() {
            addCriterion("detailed_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressEqualTo(String value) {
            addCriterion("detailed_address =", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotEqualTo(String value) {
            addCriterion("detailed_address <>", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThan(String value) {
            addCriterion("detailed_address >", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detailed_address >=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThan(String value) {
            addCriterion("detailed_address <", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLessThanOrEqualTo(String value) {
            addCriterion("detailed_address <=", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressLike(String value) {
            addCriterion("detailed_address like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotLike(String value) {
            addCriterion("detailed_address not like", value, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressIn(List<String> values) {
            addCriterion("detailed_address in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotIn(List<String> values) {
            addCriterion("detailed_address not in", values, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressBetween(String value1, String value2) {
            addCriterion("detailed_address between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDetailedAddressNotBetween(String value1, String value2) {
            addCriterion("detailed_address not between", value1, value2, "detailedAddress");
            return (Criteria) this;
        }

        public Criteria andDestNameIsNull() {
            addCriterion("dest_name is null");
            return (Criteria) this;
        }

        public Criteria andDestNameIsNotNull() {
            addCriterion("dest_name is not null");
            return (Criteria) this;
        }

        public Criteria andDestNameEqualTo(String value) {
            addCriterion("dest_name =", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameNotEqualTo(String value) {
            addCriterion("dest_name <>", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameGreaterThan(String value) {
            addCriterion("dest_name >", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameGreaterThanOrEqualTo(String value) {
            addCriterion("dest_name >=", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameLessThan(String value) {
            addCriterion("dest_name <", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameLessThanOrEqualTo(String value) {
            addCriterion("dest_name <=", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameLike(String value) {
            addCriterion("dest_name like", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameNotLike(String value) {
            addCriterion("dest_name not like", value, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameIn(List<String> values) {
            addCriterion("dest_name in", values, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameNotIn(List<String> values) {
            addCriterion("dest_name not in", values, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameBetween(String value1, String value2) {
            addCriterion("dest_name between", value1, value2, "destName");
            return (Criteria) this;
        }

        public Criteria andDestNameNotBetween(String value1, String value2) {
            addCriterion("dest_name not between", value1, value2, "destName");
            return (Criteria) this;
        }

        public Criteria andDestIphoneIsNull() {
            addCriterion("dest_iphone is null");
            return (Criteria) this;
        }

        public Criteria andDestIphoneIsNotNull() {
            addCriterion("dest_iphone is not null");
            return (Criteria) this;
        }

        public Criteria andDestIphoneEqualTo(String value) {
            addCriterion("dest_iphone =", value, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneNotEqualTo(String value) {
            addCriterion("dest_iphone <>", value, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneGreaterThan(String value) {
            addCriterion("dest_iphone >", value, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneGreaterThanOrEqualTo(String value) {
            addCriterion("dest_iphone >=", value, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneLessThan(String value) {
            addCriterion("dest_iphone <", value, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneLessThanOrEqualTo(String value) {
            addCriterion("dest_iphone <=", value, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneLike(String value) {
            addCriterion("dest_iphone like", value, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneNotLike(String value) {
            addCriterion("dest_iphone not like", value, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneIn(List<String> values) {
            addCriterion("dest_iphone in", values, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneNotIn(List<String> values) {
            addCriterion("dest_iphone not in", values, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneBetween(String value1, String value2) {
            addCriterion("dest_iphone between", value1, value2, "destIphone");
            return (Criteria) this;
        }

        public Criteria andDestIphoneNotBetween(String value1, String value2) {
            addCriterion("dest_iphone not between", value1, value2, "destIphone");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andStausIsNull() {
            addCriterion("staus is null");
            return (Criteria) this;
        }

        public Criteria andStausIsNotNull() {
            addCriterion("staus is not null");
            return (Criteria) this;
        }

        public Criteria andStausEqualTo(Byte value) {
            addCriterion("staus =", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotEqualTo(Byte value) {
            addCriterion("staus <>", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThan(Byte value) {
            addCriterion("staus >", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausGreaterThanOrEqualTo(Byte value) {
            addCriterion("staus >=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThan(Byte value) {
            addCriterion("staus <", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausLessThanOrEqualTo(Byte value) {
            addCriterion("staus <=", value, "staus");
            return (Criteria) this;
        }

        public Criteria andStausIn(List<Byte> values) {
            addCriterion("staus in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotIn(List<Byte> values) {
            addCriterion("staus not in", values, "staus");
            return (Criteria) this;
        }

        public Criteria andStausBetween(Byte value1, Byte value2) {
            addCriterion("staus between", value1, value2, "staus");
            return (Criteria) this;
        }

        public Criteria andStausNotBetween(Byte value1, Byte value2) {
            addCriterion("staus not between", value1, value2, "staus");
            return (Criteria) this;
        }

        public Criteria andIfDefaultIsNull() {
            addCriterion("if_default is null");
            return (Criteria) this;
        }

        public Criteria andIfDefaultIsNotNull() {
            addCriterion("if_default is not null");
            return (Criteria) this;
        }

        public Criteria andIfDefaultEqualTo(Byte value) {
            addCriterion("if_default =", value, "ifDefault");
            return (Criteria) this;
        }

        public Criteria andIfDefaultNotEqualTo(Byte value) {
            addCriterion("if_default <>", value, "ifDefault");
            return (Criteria) this;
        }

        public Criteria andIfDefaultGreaterThan(Byte value) {
            addCriterion("if_default >", value, "ifDefault");
            return (Criteria) this;
        }

        public Criteria andIfDefaultGreaterThanOrEqualTo(Byte value) {
            addCriterion("if_default >=", value, "ifDefault");
            return (Criteria) this;
        }

        public Criteria andIfDefaultLessThan(Byte value) {
            addCriterion("if_default <", value, "ifDefault");
            return (Criteria) this;
        }

        public Criteria andIfDefaultLessThanOrEqualTo(Byte value) {
            addCriterion("if_default <=", value, "ifDefault");
            return (Criteria) this;
        }

        public Criteria andIfDefaultIn(List<Byte> values) {
            addCriterion("if_default in", values, "ifDefault");
            return (Criteria) this;
        }

        public Criteria andIfDefaultNotIn(List<Byte> values) {
            addCriterion("if_default not in", values, "ifDefault");
            return (Criteria) this;
        }

        public Criteria andIfDefaultBetween(Byte value1, Byte value2) {
            addCriterion("if_default between", value1, value2, "ifDefault");
            return (Criteria) this;
        }

        public Criteria andIfDefaultNotBetween(Byte value1, Byte value2) {
            addCriterion("if_default not between", value1, value2, "ifDefault");
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

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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