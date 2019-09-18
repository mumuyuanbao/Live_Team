package com.live.liveteam.entity;

import java.util.ArrayList;
import java.util.List;

public class GoodsSnapUpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsSnapUpExample() {
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

        public Criteria andGIdIsNull() {
            addCriterion("g_id is null");
            return (Criteria) this;
        }

        public Criteria andGIdIsNotNull() {
            addCriterion("g_id is not null");
            return (Criteria) this;
        }

        public Criteria andGIdEqualTo(Long value) {
            addCriterion("g_id =", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotEqualTo(Long value) {
            addCriterion("g_id <>", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThan(Long value) {
            addCriterion("g_id >", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdGreaterThanOrEqualTo(Long value) {
            addCriterion("g_id >=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThan(Long value) {
            addCriterion("g_id <", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdLessThanOrEqualTo(Long value) {
            addCriterion("g_id <=", value, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdIn(List<Long> values) {
            addCriterion("g_id in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotIn(List<Long> values) {
            addCriterion("g_id not in", values, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdBetween(Long value1, Long value2) {
            addCriterion("g_id between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGIdNotBetween(Long value1, Long value2) {
            addCriterion("g_id not between", value1, value2, "gId");
            return (Criteria) this;
        }

        public Criteria andGUrlIsNull() {
            addCriterion("g_url is null");
            return (Criteria) this;
        }

        public Criteria andGUrlIsNotNull() {
            addCriterion("g_url is not null");
            return (Criteria) this;
        }

        public Criteria andGUrlEqualTo(String value) {
            addCriterion("g_url =", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlNotEqualTo(String value) {
            addCriterion("g_url <>", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlGreaterThan(String value) {
            addCriterion("g_url >", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlGreaterThanOrEqualTo(String value) {
            addCriterion("g_url >=", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlLessThan(String value) {
            addCriterion("g_url <", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlLessThanOrEqualTo(String value) {
            addCriterion("g_url <=", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlLike(String value) {
            addCriterion("g_url like", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlNotLike(String value) {
            addCriterion("g_url not like", value, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlIn(List<String> values) {
            addCriterion("g_url in", values, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlNotIn(List<String> values) {
            addCriterion("g_url not in", values, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlBetween(String value1, String value2) {
            addCriterion("g_url between", value1, value2, "gUrl");
            return (Criteria) this;
        }

        public Criteria andGUrlNotBetween(String value1, String value2) {
            addCriterion("g_url not between", value1, value2, "gUrl");
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

        public Criteria andGInventoryIsNull() {
            addCriterion("g_inventory is null");
            return (Criteria) this;
        }

        public Criteria andGInventoryIsNotNull() {
            addCriterion("g_inventory is not null");
            return (Criteria) this;
        }

        public Criteria andGInventoryEqualTo(Long value) {
            addCriterion("g_inventory =", value, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGInventoryNotEqualTo(Long value) {
            addCriterion("g_inventory <>", value, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGInventoryGreaterThan(Long value) {
            addCriterion("g_inventory >", value, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGInventoryGreaterThanOrEqualTo(Long value) {
            addCriterion("g_inventory >=", value, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGInventoryLessThan(Long value) {
            addCriterion("g_inventory <", value, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGInventoryLessThanOrEqualTo(Long value) {
            addCriterion("g_inventory <=", value, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGInventoryIn(List<Long> values) {
            addCriterion("g_inventory in", values, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGInventoryNotIn(List<Long> values) {
            addCriterion("g_inventory not in", values, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGInventoryBetween(Long value1, Long value2) {
            addCriterion("g_inventory between", value1, value2, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGInventoryNotBetween(Long value1, Long value2) {
            addCriterion("g_inventory not between", value1, value2, "gInventory");
            return (Criteria) this;
        }

        public Criteria andGStartTimeIsNull() {
            addCriterion("g_start_time is null");
            return (Criteria) this;
        }

        public Criteria andGStartTimeIsNotNull() {
            addCriterion("g_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andGStartTimeEqualTo(Long value) {
            addCriterion("g_start_time =", value, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStartTimeNotEqualTo(Long value) {
            addCriterion("g_start_time <>", value, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStartTimeGreaterThan(Long value) {
            addCriterion("g_start_time >", value, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStartTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("g_start_time >=", value, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStartTimeLessThan(Long value) {
            addCriterion("g_start_time <", value, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStartTimeLessThanOrEqualTo(Long value) {
            addCriterion("g_start_time <=", value, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStartTimeIn(List<Long> values) {
            addCriterion("g_start_time in", values, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStartTimeNotIn(List<Long> values) {
            addCriterion("g_start_time not in", values, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStartTimeBetween(Long value1, Long value2) {
            addCriterion("g_start_time between", value1, value2, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStartTimeNotBetween(Long value1, Long value2) {
            addCriterion("g_start_time not between", value1, value2, "gStartTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeIsNull() {
            addCriterion("g_stop_time is null");
            return (Criteria) this;
        }

        public Criteria andGStopTimeIsNotNull() {
            addCriterion("g_stop_time is not null");
            return (Criteria) this;
        }

        public Criteria andGStopTimeEqualTo(Long value) {
            addCriterion("g_stop_time =", value, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeNotEqualTo(Long value) {
            addCriterion("g_stop_time <>", value, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeGreaterThan(Long value) {
            addCriterion("g_stop_time >", value, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("g_stop_time >=", value, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeLessThan(Long value) {
            addCriterion("g_stop_time <", value, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeLessThanOrEqualTo(Long value) {
            addCriterion("g_stop_time <=", value, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeIn(List<Long> values) {
            addCriterion("g_stop_time in", values, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeNotIn(List<Long> values) {
            addCriterion("g_stop_time not in", values, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeBetween(Long value1, Long value2) {
            addCriterion("g_stop_time between", value1, value2, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGStopTimeNotBetween(Long value1, Long value2) {
            addCriterion("g_stop_time not between", value1, value2, "gStopTime");
            return (Criteria) this;
        }

        public Criteria andGSaleProceIsNull() {
            addCriterion("g_sale_proce is null");
            return (Criteria) this;
        }

        public Criteria andGSaleProceIsNotNull() {
            addCriterion("g_sale_proce is not null");
            return (Criteria) this;
        }

        public Criteria andGSaleProceEqualTo(Long value) {
            addCriterion("g_sale_proce =", value, "gSaleProce");
            return (Criteria) this;
        }

        public Criteria andGSaleProceNotEqualTo(Long value) {
            addCriterion("g_sale_proce <>", value, "gSaleProce");
            return (Criteria) this;
        }

        public Criteria andGSaleProceGreaterThan(Long value) {
            addCriterion("g_sale_proce >", value, "gSaleProce");
            return (Criteria) this;
        }

        public Criteria andGSaleProceGreaterThanOrEqualTo(Long value) {
            addCriterion("g_sale_proce >=", value, "gSaleProce");
            return (Criteria) this;
        }

        public Criteria andGSaleProceLessThan(Long value) {
            addCriterion("g_sale_proce <", value, "gSaleProce");
            return (Criteria) this;
        }

        public Criteria andGSaleProceLessThanOrEqualTo(Long value) {
            addCriterion("g_sale_proce <=", value, "gSaleProce");
            return (Criteria) this;
        }

        public Criteria andGSaleProceIn(List<Long> values) {
            addCriterion("g_sale_proce in", values, "gSaleProce");
            return (Criteria) this;
        }

        public Criteria andGSaleProceNotIn(List<Long> values) {
            addCriterion("g_sale_proce not in", values, "gSaleProce");
            return (Criteria) this;
        }

        public Criteria andGSaleProceBetween(Long value1, Long value2) {
            addCriterion("g_sale_proce between", value1, value2, "gSaleProce");
            return (Criteria) this;
        }

        public Criteria andGSaleProceNotBetween(Long value1, Long value2) {
            addCriterion("g_sale_proce not between", value1, value2, "gSaleProce");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
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