package com.live.liveteam.entity;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andSessionKeyIsNull() {
            addCriterion("session_key is null");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIsNotNull() {
            addCriterion("session_key is not null");
            return (Criteria) this;
        }

        public Criteria andSessionKeyEqualTo(String value) {
            addCriterion("session_key =", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotEqualTo(String value) {
            addCriterion("session_key <>", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyGreaterThan(String value) {
            addCriterion("session_key >", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyGreaterThanOrEqualTo(String value) {
            addCriterion("session_key >=", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLessThan(String value) {
            addCriterion("session_key <", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLessThanOrEqualTo(String value) {
            addCriterion("session_key <=", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyLike(String value) {
            addCriterion("session_key like", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotLike(String value) {
            addCriterion("session_key not like", value, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyIn(List<String> values) {
            addCriterion("session_key in", values, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotIn(List<String> values) {
            addCriterion("session_key not in", values, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyBetween(String value1, String value2) {
            addCriterion("session_key between", value1, value2, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andSessionKeyNotBetween(String value1, String value2) {
            addCriterion("session_key not between", value1, value2, "sessionKey");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNull() {
            addCriterion("avatar_url is null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIsNotNull() {
            addCriterion("avatar_url is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlEqualTo(String value) {
            addCriterion("avatar_url =", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotEqualTo(String value) {
            addCriterion("avatar_url <>", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThan(String value) {
            addCriterion("avatar_url >", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlGreaterThanOrEqualTo(String value) {
            addCriterion("avatar_url >=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThan(String value) {
            addCriterion("avatar_url <", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLessThanOrEqualTo(String value) {
            addCriterion("avatar_url <=", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlLike(String value) {
            addCriterion("avatar_url like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotLike(String value) {
            addCriterion("avatar_url not like", value, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlIn(List<String> values) {
            addCriterion("avatar_url in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotIn(List<String> values) {
            addCriterion("avatar_url not in", values, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlBetween(String value1, String value2) {
            addCriterion("avatar_url between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andAvatarUrlNotBetween(String value1, String value2) {
            addCriterion("avatar_url not between", value1, value2, "avatarUrl");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNull() {
            addCriterion("nick_name is null");
            return (Criteria) this;
        }

        public Criteria andNickNameIsNotNull() {
            addCriterion("nick_name is not null");
            return (Criteria) this;
        }

        public Criteria andNickNameEqualTo(String value) {
            addCriterion("nick_name =", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotEqualTo(String value) {
            addCriterion("nick_name <>", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThan(String value) {
            addCriterion("nick_name >", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameGreaterThanOrEqualTo(String value) {
            addCriterion("nick_name >=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThan(String value) {
            addCriterion("nick_name <", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLessThanOrEqualTo(String value) {
            addCriterion("nick_name <=", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameLike(String value) {
            addCriterion("nick_name like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotLike(String value) {
            addCriterion("nick_name not like", value, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameIn(List<String> values) {
            addCriterion("nick_name in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotIn(List<String> values) {
            addCriterion("nick_name not in", values, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameBetween(String value1, String value2) {
            addCriterion("nick_name between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andNickNameNotBetween(String value1, String value2) {
            addCriterion("nick_name not between", value1, value2, "nickName");
            return (Criteria) this;
        }

        public Criteria andUserPostalIsNull() {
            addCriterion("user_postal is null");
            return (Criteria) this;
        }

        public Criteria andUserPostalIsNotNull() {
            addCriterion("user_postal is not null");
            return (Criteria) this;
        }

        public Criteria andUserPostalEqualTo(Long value) {
            addCriterion("user_postal =", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalNotEqualTo(Long value) {
            addCriterion("user_postal <>", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalGreaterThan(Long value) {
            addCriterion("user_postal >", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalGreaterThanOrEqualTo(Long value) {
            addCriterion("user_postal >=", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalLessThan(Long value) {
            addCriterion("user_postal <", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalLessThanOrEqualTo(Long value) {
            addCriterion("user_postal <=", value, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalIn(List<Long> values) {
            addCriterion("user_postal in", values, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalNotIn(List<Long> values) {
            addCriterion("user_postal not in", values, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalBetween(Long value1, Long value2) {
            addCriterion("user_postal between", value1, value2, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserPostalNotBetween(Long value1, Long value2) {
            addCriterion("user_postal not between", value1, value2, "userPostal");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNull() {
            addCriterion("user_birthday is null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIsNotNull() {
            addCriterion("user_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayEqualTo(Long value) {
            addCriterion("user_birthday =", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotEqualTo(Long value) {
            addCriterion("user_birthday <>", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThan(Long value) {
            addCriterion("user_birthday >", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayGreaterThanOrEqualTo(Long value) {
            addCriterion("user_birthday >=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThan(Long value) {
            addCriterion("user_birthday <", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayLessThanOrEqualTo(Long value) {
            addCriterion("user_birthday <=", value, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayIn(List<Long> values) {
            addCriterion("user_birthday in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotIn(List<Long> values) {
            addCriterion("user_birthday not in", values, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayBetween(Long value1, Long value2) {
            addCriterion("user_birthday between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserBirthdayNotBetween(Long value1, Long value2) {
            addCriterion("user_birthday not between", value1, value2, "userBirthday");
            return (Criteria) this;
        }

        public Criteria andUserIphoneIsNull() {
            addCriterion("user_iphone is null");
            return (Criteria) this;
        }

        public Criteria andUserIphoneIsNotNull() {
            addCriterion("user_iphone is not null");
            return (Criteria) this;
        }

        public Criteria andUserIphoneEqualTo(String value) {
            addCriterion("user_iphone =", value, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneNotEqualTo(String value) {
            addCriterion("user_iphone <>", value, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneGreaterThan(String value) {
            addCriterion("user_iphone >", value, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_iphone >=", value, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneLessThan(String value) {
            addCriterion("user_iphone <", value, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneLessThanOrEqualTo(String value) {
            addCriterion("user_iphone <=", value, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneLike(String value) {
            addCriterion("user_iphone like", value, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneNotLike(String value) {
            addCriterion("user_iphone not like", value, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneIn(List<String> values) {
            addCriterion("user_iphone in", values, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneNotIn(List<String> values) {
            addCriterion("user_iphone not in", values, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneBetween(String value1, String value2) {
            addCriterion("user_iphone between", value1, value2, "userIphone");
            return (Criteria) this;
        }

        public Criteria andUserIphoneNotBetween(String value1, String value2) {
            addCriterion("user_iphone not between", value1, value2, "userIphone");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlIsNull() {
            addCriterion("qr_code_url is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlIsNotNull() {
            addCriterion("qr_code_url is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlEqualTo(String value) {
            addCriterion("qr_code_url =", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotEqualTo(String value) {
            addCriterion("qr_code_url <>", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlGreaterThan(String value) {
            addCriterion("qr_code_url >", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code_url >=", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlLessThan(String value) {
            addCriterion("qr_code_url <", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlLessThanOrEqualTo(String value) {
            addCriterion("qr_code_url <=", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlLike(String value) {
            addCriterion("qr_code_url like", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotLike(String value) {
            addCriterion("qr_code_url not like", value, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlIn(List<String> values) {
            addCriterion("qr_code_url in", values, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotIn(List<String> values) {
            addCriterion("qr_code_url not in", values, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlBetween(String value1, String value2) {
            addCriterion("qr_code_url between", value1, value2, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andQrCodeUrlNotBetween(String value1, String value2) {
            addCriterion("qr_code_url not between", value1, value2, "qrCodeUrl");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceIsNull() {
            addCriterion("user_idevice is null");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceIsNotNull() {
            addCriterion("user_idevice is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceEqualTo(Integer value) {
            addCriterion("user_idevice =", value, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceNotEqualTo(Integer value) {
            addCriterion("user_idevice <>", value, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceGreaterThan(Integer value) {
            addCriterion("user_idevice >", value, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_idevice >=", value, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceLessThan(Integer value) {
            addCriterion("user_idevice <", value, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceLessThanOrEqualTo(Integer value) {
            addCriterion("user_idevice <=", value, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceIn(List<Integer> values) {
            addCriterion("user_idevice in", values, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceNotIn(List<Integer> values) {
            addCriterion("user_idevice not in", values, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceBetween(Integer value1, Integer value2) {
            addCriterion("user_idevice between", value1, value2, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserIdeviceNotBetween(Integer value1, Integer value2) {
            addCriterion("user_idevice not between", value1, value2, "userIdevice");
            return (Criteria) this;
        }

        public Criteria andUserFormIsNull() {
            addCriterion("user_form is null");
            return (Criteria) this;
        }

        public Criteria andUserFormIsNotNull() {
            addCriterion("user_form is not null");
            return (Criteria) this;
        }

        public Criteria andUserFormEqualTo(Integer value) {
            addCriterion("user_form =", value, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserFormNotEqualTo(Integer value) {
            addCriterion("user_form <>", value, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserFormGreaterThan(Integer value) {
            addCriterion("user_form >", value, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserFormGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_form >=", value, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserFormLessThan(Integer value) {
            addCriterion("user_form <", value, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserFormLessThanOrEqualTo(Integer value) {
            addCriterion("user_form <=", value, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserFormIn(List<Integer> values) {
            addCriterion("user_form in", values, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserFormNotIn(List<Integer> values) {
            addCriterion("user_form not in", values, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserFormBetween(Integer value1, Integer value2) {
            addCriterion("user_form between", value1, value2, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserFormNotBetween(Integer value1, Integer value2) {
            addCriterion("user_form not between", value1, value2, "userForm");
            return (Criteria) this;
        }

        public Criteria andUserIsNotIsNull() {
            addCriterion("user_is_not is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotIsNotNull() {
            addCriterion("user_is_not is not null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotEqualTo(Integer value) {
            addCriterion("user_is_not =", value, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNotEqualTo(Integer value) {
            addCriterion("user_is_not <>", value, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserIsNotGreaterThan(Integer value) {
            addCriterion("user_is_not >", value, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserIsNotGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_is_not >=", value, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserIsNotLessThan(Integer value) {
            addCriterion("user_is_not <", value, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserIsNotLessThanOrEqualTo(Integer value) {
            addCriterion("user_is_not <=", value, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserIsNotIn(List<Integer> values) {
            addCriterion("user_is_not in", values, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNotIn(List<Integer> values) {
            addCriterion("user_is_not not in", values, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserIsNotBetween(Integer value1, Integer value2) {
            addCriterion("user_is_not between", value1, value2, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNotBetween(Integer value1, Integer value2) {
            addCriterion("user_is_not not between", value1, value2, "userIsNot");
            return (Criteria) this;
        }

        public Criteria andUserLastIpIsNull() {
            addCriterion("user_last_ip is null");
            return (Criteria) this;
        }

        public Criteria andUserLastIpIsNotNull() {
            addCriterion("user_last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastIpEqualTo(String value) {
            addCriterion("user_last_ip =", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpNotEqualTo(String value) {
            addCriterion("user_last_ip <>", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpGreaterThan(String value) {
            addCriterion("user_last_ip >", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("user_last_ip >=", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpLessThan(String value) {
            addCriterion("user_last_ip <", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpLessThanOrEqualTo(String value) {
            addCriterion("user_last_ip <=", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpLike(String value) {
            addCriterion("user_last_ip like", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpNotLike(String value) {
            addCriterion("user_last_ip not like", value, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpIn(List<String> values) {
            addCriterion("user_last_ip in", values, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpNotIn(List<String> values) {
            addCriterion("user_last_ip not in", values, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpBetween(String value1, String value2) {
            addCriterion("user_last_ip between", value1, value2, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLastIpNotBetween(String value1, String value2) {
            addCriterion("user_last_ip not between", value1, value2, "userLastIp");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumIsNull() {
            addCriterion("user_login_num is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumIsNotNull() {
            addCriterion("user_login_num is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumEqualTo(Long value) {
            addCriterion("user_login_num =", value, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumNotEqualTo(Long value) {
            addCriterion("user_login_num <>", value, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumGreaterThan(Long value) {
            addCriterion("user_login_num >", value, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumGreaterThanOrEqualTo(Long value) {
            addCriterion("user_login_num >=", value, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumLessThan(Long value) {
            addCriterion("user_login_num <", value, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumLessThanOrEqualTo(Long value) {
            addCriterion("user_login_num <=", value, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumIn(List<Long> values) {
            addCriterion("user_login_num in", values, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumNotIn(List<Long> values) {
            addCriterion("user_login_num not in", values, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumBetween(Long value1, Long value2) {
            addCriterion("user_login_num between", value1, value2, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginNumNotBetween(Long value1, Long value2) {
            addCriterion("user_login_num not between", value1, value2, "userLoginNum");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressIsNull() {
            addCriterion("user_login_address is null");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressIsNotNull() {
            addCriterion("user_login_address is not null");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressEqualTo(String value) {
            addCriterion("user_login_address =", value, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressNotEqualTo(String value) {
            addCriterion("user_login_address <>", value, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressGreaterThan(String value) {
            addCriterion("user_login_address >", value, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_login_address >=", value, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressLessThan(String value) {
            addCriterion("user_login_address <", value, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressLessThanOrEqualTo(String value) {
            addCriterion("user_login_address <=", value, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressLike(String value) {
            addCriterion("user_login_address like", value, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressNotLike(String value) {
            addCriterion("user_login_address not like", value, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressIn(List<String> values) {
            addCriterion("user_login_address in", values, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressNotIn(List<String> values) {
            addCriterion("user_login_address not in", values, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressBetween(String value1, String value2) {
            addCriterion("user_login_address between", value1, value2, "userLoginAddress");
            return (Criteria) this;
        }

        public Criteria andUserLoginAddressNotBetween(String value1, String value2) {
            addCriterion("user_login_address not between", value1, value2, "userLoginAddress");
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

        public Criteria andLastVisitTimeIsNull() {
            addCriterion("last_visit_time is null");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIsNotNull() {
            addCriterion("last_visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeEqualTo(Long value) {
            addCriterion("last_visit_time =", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotEqualTo(Long value) {
            addCriterion("last_visit_time <>", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeGreaterThan(Long value) {
            addCriterion("last_visit_time >", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_visit_time >=", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeLessThan(Long value) {
            addCriterion("last_visit_time <", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeLessThanOrEqualTo(Long value) {
            addCriterion("last_visit_time <=", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIn(List<Long> values) {
            addCriterion("last_visit_time in", values, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotIn(List<Long> values) {
            addCriterion("last_visit_time not in", values, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeBetween(Long value1, Long value2) {
            addCriterion("last_visit_time between", value1, value2, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotBetween(Long value1, Long value2) {
            addCriterion("last_visit_time not between", value1, value2, "lastVisitTime");
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