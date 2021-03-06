package org.yugong.auth.entity.generate;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.yugong.auth.common.PageInfo;

/**
 * @author MyBatis Generator
 * @version 1.0.0
 */
public class GroupExample extends PageInfo {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupExample() {
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

        public Criteria andGroupIdIsNull() {
            addCriterion("`group_id` is null");
            return (Criteria) this;
        }

        public Criteria andGroupIdIsNotNull() {
            addCriterion("`group_id` is not null");
            return (Criteria) this;
        }

        public Criteria andGroupIdEqualTo(Integer value) {
            addCriterion("`group_id` =", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotEqualTo(Integer value) {
            addCriterion("`group_id` <>", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThan(Integer value) {
            addCriterion("`group_id` >", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`group_id` >=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThan(Integer value) {
            addCriterion("`group_id` <", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("`group_id` <=", value, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdIn(List<Integer> values) {
            addCriterion("`group_id` in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotIn(List<Integer> values) {
            addCriterion("`group_id` not in", values, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("`group_id` between", value1, value2, "groupId");
            return (Criteria) this;
        }

        public Criteria andGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`group_id` not between", value1, value2, "groupId");
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

        public Criteria andGroupCodeIsNull() {
            addCriterion("`group_code` is null");
            return (Criteria) this;
        }

        public Criteria andGroupCodeIsNotNull() {
            addCriterion("`group_code` is not null");
            return (Criteria) this;
        }

        public Criteria andGroupCodeEqualTo(String value) {
            addCriterion("`group_code` =", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotEqualTo(String value) {
            addCriterion("`group_code` <>", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeGreaterThan(String value) {
            addCriterion("`group_code` >", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeGreaterThanOrEqualTo(String value) {
            addCriterion("`group_code` >=", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeLessThan(String value) {
            addCriterion("`group_code` <", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeLessThanOrEqualTo(String value) {
            addCriterion("`group_code` <=", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeLike(String value) {
            addCriterion("`group_code` like", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotLike(String value) {
            addCriterion("`group_code` not like", value, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeIn(List<String> values) {
            addCriterion("`group_code` in", values, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotIn(List<String> values) {
            addCriterion("`group_code` not in", values, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeBetween(String value1, String value2) {
            addCriterion("`group_code` between", value1, value2, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupCodeNotBetween(String value1, String value2) {
            addCriterion("`group_code` not between", value1, value2, "groupCode");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("`group_name` is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("`group_name` is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("`group_name` =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("`group_name` <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("`group_name` >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("`group_name` >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("`group_name` <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("`group_name` <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("`group_name` like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("`group_name` not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("`group_name` in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("`group_name` not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("`group_name` between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("`group_name` not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupDescIsNull() {
            addCriterion("`group_desc` is null");
            return (Criteria) this;
        }

        public Criteria andGroupDescIsNotNull() {
            addCriterion("`group_desc` is not null");
            return (Criteria) this;
        }

        public Criteria andGroupDescEqualTo(String value) {
            addCriterion("`group_desc` =", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotEqualTo(String value) {
            addCriterion("`group_desc` <>", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescGreaterThan(String value) {
            addCriterion("`group_desc` >", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescGreaterThanOrEqualTo(String value) {
            addCriterion("`group_desc` >=", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLessThan(String value) {
            addCriterion("`group_desc` <", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLessThanOrEqualTo(String value) {
            addCriterion("`group_desc` <=", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescLike(String value) {
            addCriterion("`group_desc` like", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotLike(String value) {
            addCriterion("`group_desc` not like", value, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescIn(List<String> values) {
            addCriterion("`group_desc` in", values, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotIn(List<String> values) {
            addCriterion("`group_desc` not in", values, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescBetween(String value1, String value2) {
            addCriterion("`group_desc` between", value1, value2, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andGroupDescNotBetween(String value1, String value2) {
            addCriterion("`group_desc` not between", value1, value2, "groupDesc");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdIsNull() {
            addCriterion("`parent_group_id` is null");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdIsNotNull() {
            addCriterion("`parent_group_id` is not null");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdEqualTo(Integer value) {
            addCriterion("`parent_group_id` =", value, "parentGroupId");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdNotEqualTo(Integer value) {
            addCriterion("`parent_group_id` <>", value, "parentGroupId");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdGreaterThan(Integer value) {
            addCriterion("`parent_group_id` >", value, "parentGroupId");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`parent_group_id` >=", value, "parentGroupId");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdLessThan(Integer value) {
            addCriterion("`parent_group_id` <", value, "parentGroupId");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdLessThanOrEqualTo(Integer value) {
            addCriterion("`parent_group_id` <=", value, "parentGroupId");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdIn(List<Integer> values) {
            addCriterion("`parent_group_id` in", values, "parentGroupId");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdNotIn(List<Integer> values) {
            addCriterion("`parent_group_id` not in", values, "parentGroupId");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdBetween(Integer value1, Integer value2) {
            addCriterion("`parent_group_id` between", value1, value2, "parentGroupId");
            return (Criteria) this;
        }

        public Criteria andParentGroupIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`parent_group_id` not between", value1, value2, "parentGroupId");
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