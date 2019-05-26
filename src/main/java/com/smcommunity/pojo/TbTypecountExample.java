package com.smcommunity.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbTypecountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbTypecountExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andFoodIsNull() {
            addCriterion("food is null");
            return (Criteria) this;
        }

        public Criteria andFoodIsNotNull() {
            addCriterion("food is not null");
            return (Criteria) this;
        }

        public Criteria andFoodEqualTo(Double value) {
            addCriterion("food =", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotEqualTo(Double value) {
            addCriterion("food <>", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodGreaterThan(Double value) {
            addCriterion("food >", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodGreaterThanOrEqualTo(Double value) {
            addCriterion("food >=", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLessThan(Double value) {
            addCriterion("food <", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLessThanOrEqualTo(Double value) {
            addCriterion("food <=", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodIn(List<Double> values) {
            addCriterion("food in", values, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotIn(List<Double> values) {
            addCriterion("food not in", values, "food");
            return (Criteria) this;
        }

        public Criteria andFoodBetween(Double value1, Double value2) {
            addCriterion("food between", value1, value2, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotBetween(Double value1, Double value2) {
            addCriterion("food not between", value1, value2, "food");
            return (Criteria) this;
        }

        public Criteria andElectronicsIsNull() {
            addCriterion("electronics is null");
            return (Criteria) this;
        }

        public Criteria andElectronicsIsNotNull() {
            addCriterion("electronics is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicsEqualTo(Double value) {
            addCriterion("electronics =", value, "electronics");
            return (Criteria) this;
        }

        public Criteria andElectronicsNotEqualTo(Double value) {
            addCriterion("electronics <>", value, "electronics");
            return (Criteria) this;
        }

        public Criteria andElectronicsGreaterThan(Double value) {
            addCriterion("electronics >", value, "electronics");
            return (Criteria) this;
        }

        public Criteria andElectronicsGreaterThanOrEqualTo(Double value) {
            addCriterion("electronics >=", value, "electronics");
            return (Criteria) this;
        }

        public Criteria andElectronicsLessThan(Double value) {
            addCriterion("electronics <", value, "electronics");
            return (Criteria) this;
        }

        public Criteria andElectronicsLessThanOrEqualTo(Double value) {
            addCriterion("electronics <=", value, "electronics");
            return (Criteria) this;
        }

        public Criteria andElectronicsIn(List<Double> values) {
            addCriterion("electronics in", values, "electronics");
            return (Criteria) this;
        }

        public Criteria andElectronicsNotIn(List<Double> values) {
            addCriterion("electronics not in", values, "electronics");
            return (Criteria) this;
        }

        public Criteria andElectronicsBetween(Double value1, Double value2) {
            addCriterion("electronics between", value1, value2, "electronics");
            return (Criteria) this;
        }

        public Criteria andElectronicsNotBetween(Double value1, Double value2) {
            addCriterion("electronics not between", value1, value2, "electronics");
            return (Criteria) this;
        }

        public Criteria andEverydayIsNull() {
            addCriterion("everyday is null");
            return (Criteria) this;
        }

        public Criteria andEverydayIsNotNull() {
            addCriterion("everyday is not null");
            return (Criteria) this;
        }

        public Criteria andEverydayEqualTo(Double value) {
            addCriterion("everyday =", value, "everyday");
            return (Criteria) this;
        }

        public Criteria andEverydayNotEqualTo(Double value) {
            addCriterion("everyday <>", value, "everyday");
            return (Criteria) this;
        }

        public Criteria andEverydayGreaterThan(Double value) {
            addCriterion("everyday >", value, "everyday");
            return (Criteria) this;
        }

        public Criteria andEverydayGreaterThanOrEqualTo(Double value) {
            addCriterion("everyday >=", value, "everyday");
            return (Criteria) this;
        }

        public Criteria andEverydayLessThan(Double value) {
            addCriterion("everyday <", value, "everyday");
            return (Criteria) this;
        }

        public Criteria andEverydayLessThanOrEqualTo(Double value) {
            addCriterion("everyday <=", value, "everyday");
            return (Criteria) this;
        }

        public Criteria andEverydayIn(List<Double> values) {
            addCriterion("everyday in", values, "everyday");
            return (Criteria) this;
        }

        public Criteria andEverydayNotIn(List<Double> values) {
            addCriterion("everyday not in", values, "everyday");
            return (Criteria) this;
        }

        public Criteria andEverydayBetween(Double value1, Double value2) {
            addCriterion("everyday between", value1, value2, "everyday");
            return (Criteria) this;
        }

        public Criteria andEverydayNotBetween(Double value1, Double value2) {
            addCriterion("everyday not between", value1, value2, "everyday");
            return (Criteria) this;
        }

        public Criteria andBookIsNull() {
            addCriterion("book is null");
            return (Criteria) this;
        }

        public Criteria andBookIsNotNull() {
            addCriterion("book is not null");
            return (Criteria) this;
        }

        public Criteria andBookEqualTo(Double value) {
            addCriterion("book =", value, "book");
            return (Criteria) this;
        }

        public Criteria andBookNotEqualTo(Double value) {
            addCriterion("book <>", value, "book");
            return (Criteria) this;
        }

        public Criteria andBookGreaterThan(Double value) {
            addCriterion("book >", value, "book");
            return (Criteria) this;
        }

        public Criteria andBookGreaterThanOrEqualTo(Double value) {
            addCriterion("book >=", value, "book");
            return (Criteria) this;
        }

        public Criteria andBookLessThan(Double value) {
            addCriterion("book <", value, "book");
            return (Criteria) this;
        }

        public Criteria andBookLessThanOrEqualTo(Double value) {
            addCriterion("book <=", value, "book");
            return (Criteria) this;
        }

        public Criteria andBookIn(List<Double> values) {
            addCriterion("book in", values, "book");
            return (Criteria) this;
        }

        public Criteria andBookNotIn(List<Double> values) {
            addCriterion("book not in", values, "book");
            return (Criteria) this;
        }

        public Criteria andBookBetween(Double value1, Double value2) {
            addCriterion("book between", value1, value2, "book");
            return (Criteria) this;
        }

        public Criteria andBookNotBetween(Double value1, Double value2) {
            addCriterion("book not between", value1, value2, "book");
            return (Criteria) this;
        }

        public Criteria andClothingIsNull() {
            addCriterion("clothing is null");
            return (Criteria) this;
        }

        public Criteria andClothingIsNotNull() {
            addCriterion("clothing is not null");
            return (Criteria) this;
        }

        public Criteria andClothingEqualTo(Double value) {
            addCriterion("clothing =", value, "clothing");
            return (Criteria) this;
        }

        public Criteria andClothingNotEqualTo(Double value) {
            addCriterion("clothing <>", value, "clothing");
            return (Criteria) this;
        }

        public Criteria andClothingGreaterThan(Double value) {
            addCriterion("clothing >", value, "clothing");
            return (Criteria) this;
        }

        public Criteria andClothingGreaterThanOrEqualTo(Double value) {
            addCriterion("clothing >=", value, "clothing");
            return (Criteria) this;
        }

        public Criteria andClothingLessThan(Double value) {
            addCriterion("clothing <", value, "clothing");
            return (Criteria) this;
        }

        public Criteria andClothingLessThanOrEqualTo(Double value) {
            addCriterion("clothing <=", value, "clothing");
            return (Criteria) this;
        }

        public Criteria andClothingIn(List<Double> values) {
            addCriterion("clothing in", values, "clothing");
            return (Criteria) this;
        }

        public Criteria andClothingNotIn(List<Double> values) {
            addCriterion("clothing not in", values, "clothing");
            return (Criteria) this;
        }

        public Criteria andClothingBetween(Double value1, Double value2) {
            addCriterion("clothing between", value1, value2, "clothing");
            return (Criteria) this;
        }

        public Criteria andClothingNotBetween(Double value1, Double value2) {
            addCriterion("clothing not between", value1, value2, "clothing");
            return (Criteria) this;
        }

        public Criteria andFreshIsNull() {
            addCriterion("fresh is null");
            return (Criteria) this;
        }

        public Criteria andFreshIsNotNull() {
            addCriterion("fresh is not null");
            return (Criteria) this;
        }

        public Criteria andFreshEqualTo(Double value) {
            addCriterion("fresh =", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotEqualTo(Double value) {
            addCriterion("fresh <>", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshGreaterThan(Double value) {
            addCriterion("fresh >", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshGreaterThanOrEqualTo(Double value) {
            addCriterion("fresh >=", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshLessThan(Double value) {
            addCriterion("fresh <", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshLessThanOrEqualTo(Double value) {
            addCriterion("fresh <=", value, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshIn(List<Double> values) {
            addCriterion("fresh in", values, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotIn(List<Double> values) {
            addCriterion("fresh not in", values, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshBetween(Double value1, Double value2) {
            addCriterion("fresh between", value1, value2, "fresh");
            return (Criteria) this;
        }

        public Criteria andFreshNotBetween(Double value1, Double value2) {
            addCriterion("fresh not between", value1, value2, "fresh");
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