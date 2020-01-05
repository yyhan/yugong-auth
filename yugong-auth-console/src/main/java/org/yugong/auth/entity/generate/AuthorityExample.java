package org.yugong.auth.entity.generate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.yugong.auth.common.PageInfo;

/**
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class AuthorityExample extends PageInfo {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuthorityExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * 
     * setOrderByClause
     * 
     * @param orderByClause
     * 
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 
     * getOrderByClause
     * 
     * @return {@link java.lang.String}
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 
     * setDistinct
     * 
     * @param distinct
     * 
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 
     * isDistinct
     * 
     * @return {@link boolean}
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 
     * getOredCriteria
     * 
     * @return {@link java.util.List<Criteria>}
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * 
     * or
     * 
     * @param criteria
     * 
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * 
     * or
     * 
     * @return {@link Criteria}
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * 
     * createCriteria
     * 
     * @return {@link Criteria}
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * 
     * createCriteriaInternal
     * 
     * @return {@link Criteria}
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * 
     * clear
     * 
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * @author MyBatis Generator
     * @version 1.0.0
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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

        public Criteria andAuthorityIdIsNull() {
            addCriterion("`authority_id` is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIsNotNull() {
            addCriterion("`authority_id` is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdEqualTo(Integer value) {
            addCriterion("`authority_id` =", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotEqualTo(Integer value) {
            addCriterion("`authority_id` <>", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThan(Integer value) {
            addCriterion("`authority_id` >", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`authority_id` >=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThan(Integer value) {
            addCriterion("`authority_id` <", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdLessThanOrEqualTo(Integer value) {
            addCriterion("`authority_id` <=", value, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdIn(List<Integer> values) {
            addCriterion("`authority_id` in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotIn(List<Integer> values) {
            addCriterion("`authority_id` not in", values, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdBetween(Integer value1, Integer value2) {
            addCriterion("`authority_id` between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAuthorityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`authority_id` not between", value1, value2, "authorityId");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("`app_id` is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("`app_id` is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("`app_id` =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("`app_id` <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("`app_id` >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`app_id` >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("`app_id` <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("`app_id` <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("`app_id` in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("`app_id` not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("`app_id` between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`app_id` not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNull() {
            addCriterion("`authority_name` is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIsNotNull() {
            addCriterion("`authority_name` is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameEqualTo(String value) {
            addCriterion("`authority_name` =", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotEqualTo(String value) {
            addCriterion("`authority_name` <>", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThan(String value) {
            addCriterion("`authority_name` >", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameGreaterThanOrEqualTo(String value) {
            addCriterion("`authority_name` >=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThan(String value) {
            addCriterion("`authority_name` <", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLessThanOrEqualTo(String value) {
            addCriterion("`authority_name` <=", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameLike(String value) {
            addCriterion("`authority_name` like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotLike(String value) {
            addCriterion("`authority_name` not like", value, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameIn(List<String> values) {
            addCriterion("`authority_name` in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotIn(List<String> values) {
            addCriterion("`authority_name` not in", values, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameBetween(String value1, String value2) {
            addCriterion("`authority_name` between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityNameNotBetween(String value1, String value2) {
            addCriterion("`authority_name` not between", value1, value2, "authorityName");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeIsNull() {
            addCriterion("`authority_code` is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeIsNotNull() {
            addCriterion("`authority_code` is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeEqualTo(String value) {
            addCriterion("`authority_code` =", value, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeNotEqualTo(String value) {
            addCriterion("`authority_code` <>", value, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeGreaterThan(String value) {
            addCriterion("`authority_code` >", value, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("`authority_code` >=", value, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeLessThan(String value) {
            addCriterion("`authority_code` <", value, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeLessThanOrEqualTo(String value) {
            addCriterion("`authority_code` <=", value, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeLike(String value) {
            addCriterion("`authority_code` like", value, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeNotLike(String value) {
            addCriterion("`authority_code` not like", value, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeIn(List<String> values) {
            addCriterion("`authority_code` in", values, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeNotIn(List<String> values) {
            addCriterion("`authority_code` not in", values, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeBetween(String value1, String value2) {
            addCriterion("`authority_code` between", value1, value2, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityCodeNotBetween(String value1, String value2) {
            addCriterion("`authority_code` not between", value1, value2, "authorityCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentIsNull() {
            addCriterion("`authority_content` is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentIsNotNull() {
            addCriterion("`authority_content` is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentEqualTo(String value) {
            addCriterion("`authority_content` =", value, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentNotEqualTo(String value) {
            addCriterion("`authority_content` <>", value, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentGreaterThan(String value) {
            addCriterion("`authority_content` >", value, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentGreaterThanOrEqualTo(String value) {
            addCriterion("`authority_content` >=", value, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentLessThan(String value) {
            addCriterion("`authority_content` <", value, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentLessThanOrEqualTo(String value) {
            addCriterion("`authority_content` <=", value, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentLike(String value) {
            addCriterion("`authority_content` like", value, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentNotLike(String value) {
            addCriterion("`authority_content` not like", value, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentIn(List<String> values) {
            addCriterion("`authority_content` in", values, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentNotIn(List<String> values) {
            addCriterion("`authority_content` not in", values, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentBetween(String value1, String value2) {
            addCriterion("`authority_content` between", value1, value2, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityContentNotBetween(String value1, String value2) {
            addCriterion("`authority_content` not between", value1, value2, "authorityContent");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeIsNull() {
            addCriterion("`authority_type` is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeIsNotNull() {
            addCriterion("`authority_type` is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeEqualTo(String value) {
            addCriterion("`authority_type` =", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotEqualTo(String value) {
            addCriterion("`authority_type` <>", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeGreaterThan(String value) {
            addCriterion("`authority_type` >", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`authority_type` >=", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeLessThan(String value) {
            addCriterion("`authority_type` <", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeLessThanOrEqualTo(String value) {
            addCriterion("`authority_type` <=", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeLike(String value) {
            addCriterion("`authority_type` like", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotLike(String value) {
            addCriterion("`authority_type` not like", value, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeIn(List<String> values) {
            addCriterion("`authority_type` in", values, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotIn(List<String> values) {
            addCriterion("`authority_type` not in", values, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeBetween(String value1, String value2) {
            addCriterion("`authority_type` between", value1, value2, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityTypeNotBetween(String value1, String value2) {
            addCriterion("`authority_type` not between", value1, value2, "authorityType");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupIsNull() {
            addCriterion("`authority_group` is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupIsNotNull() {
            addCriterion("`authority_group` is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupEqualTo(String value) {
            addCriterion("`authority_group` =", value, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupNotEqualTo(String value) {
            addCriterion("`authority_group` <>", value, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupGreaterThan(String value) {
            addCriterion("`authority_group` >", value, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupGreaterThanOrEqualTo(String value) {
            addCriterion("`authority_group` >=", value, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupLessThan(String value) {
            addCriterion("`authority_group` <", value, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupLessThanOrEqualTo(String value) {
            addCriterion("`authority_group` <=", value, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupLike(String value) {
            addCriterion("`authority_group` like", value, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupNotLike(String value) {
            addCriterion("`authority_group` not like", value, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupIn(List<String> values) {
            addCriterion("`authority_group` in", values, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupNotIn(List<String> values) {
            addCriterion("`authority_group` not in", values, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupBetween(String value1, String value2) {
            addCriterion("`authority_group` between", value1, value2, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityGroupNotBetween(String value1, String value2) {
            addCriterion("`authority_group` not between", value1, value2, "authorityGroup");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNull() {
            addCriterion("`authority_desc` is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIsNotNull() {
            addCriterion("`authority_desc` is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescEqualTo(String value) {
            addCriterion("`authority_desc` =", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotEqualTo(String value) {
            addCriterion("`authority_desc` <>", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThan(String value) {
            addCriterion("`authority_desc` >", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescGreaterThanOrEqualTo(String value) {
            addCriterion("`authority_desc` >=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThan(String value) {
            addCriterion("`authority_desc` <", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLessThanOrEqualTo(String value) {
            addCriterion("`authority_desc` <=", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescLike(String value) {
            addCriterion("`authority_desc` like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotLike(String value) {
            addCriterion("`authority_desc` not like", value, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescIn(List<String> values) {
            addCriterion("`authority_desc` in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotIn(List<String> values) {
            addCriterion("`authority_desc` not in", values, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescBetween(String value1, String value2) {
            addCriterion("`authority_desc` between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityDescNotBetween(String value1, String value2) {
            addCriterion("`authority_desc` not between", value1, value2, "authorityDesc");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconIsNull() {
            addCriterion("`authority_icon` is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconIsNotNull() {
            addCriterion("`authority_icon` is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconEqualTo(String value) {
            addCriterion("`authority_icon` =", value, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconNotEqualTo(String value) {
            addCriterion("`authority_icon` <>", value, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconGreaterThan(String value) {
            addCriterion("`authority_icon` >", value, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconGreaterThanOrEqualTo(String value) {
            addCriterion("`authority_icon` >=", value, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconLessThan(String value) {
            addCriterion("`authority_icon` <", value, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconLessThanOrEqualTo(String value) {
            addCriterion("`authority_icon` <=", value, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconLike(String value) {
            addCriterion("`authority_icon` like", value, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconNotLike(String value) {
            addCriterion("`authority_icon` not like", value, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconIn(List<String> values) {
            addCriterion("`authority_icon` in", values, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconNotIn(List<String> values) {
            addCriterion("`authority_icon` not in", values, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconBetween(String value1, String value2) {
            addCriterion("`authority_icon` between", value1, value2, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorityIconNotBetween(String value1, String value2) {
            addCriterion("`authority_icon` not between", value1, value2, "authorityIcon");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeIsNull() {
            addCriterion("`authorization_type` is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeIsNotNull() {
            addCriterion("`authorization_type` is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeEqualTo(String value) {
            addCriterion("`authorization_type` =", value, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeNotEqualTo(String value) {
            addCriterion("`authorization_type` <>", value, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeGreaterThan(String value) {
            addCriterion("`authorization_type` >", value, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("`authorization_type` >=", value, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeLessThan(String value) {
            addCriterion("`authorization_type` <", value, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeLessThanOrEqualTo(String value) {
            addCriterion("`authorization_type` <=", value, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeLike(String value) {
            addCriterion("`authorization_type` like", value, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeNotLike(String value) {
            addCriterion("`authorization_type` not like", value, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeIn(List<String> values) {
            addCriterion("`authorization_type` in", values, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeNotIn(List<String> values) {
            addCriterion("`authorization_type` not in", values, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeBetween(String value1, String value2) {
            addCriterion("`authorization_type` between", value1, value2, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andAuthorizationTypeNotBetween(String value1, String value2) {
            addCriterion("`authorization_type` not between", value1, value2, "authorizationType");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("`sort` is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("`sort` is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("`sort` =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("`sort` <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("`sort` >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("`sort` >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("`sort` <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("`sort` <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("`sort` in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("`sort` not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("`sort` between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("`sort` not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("`create_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`create_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(LocalDateTime value) {
            addCriterion("`create_time` =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("`create_time` <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(LocalDateTime value) {
            addCriterion("`create_time` >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("`create_time` >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(LocalDateTime value) {
            addCriterion("`create_time` <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("`create_time` <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<LocalDateTime> values) {
            addCriterion("`create_time` in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("`create_time` not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("`create_time` between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("`create_time` not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("`update_time` is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("`update_time` is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(LocalDateTime value) {
            addCriterion("`update_time` =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(LocalDateTime value) {
            addCriterion("`update_time` <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(LocalDateTime value) {
            addCriterion("`update_time` >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("`update_time` >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(LocalDateTime value) {
            addCriterion("`update_time` <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("`update_time` <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<LocalDateTime> values) {
            addCriterion("`update_time` in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<LocalDateTime> values) {
            addCriterion("`update_time` not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("`update_time` between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("`update_time` not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * @author MyBatis Generator
     * @version 1.0.0
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * @author MyBatis Generator
     * @version 1.0.0
     */
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