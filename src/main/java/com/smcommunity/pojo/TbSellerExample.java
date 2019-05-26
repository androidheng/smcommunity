package com.smcommunity.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbSellerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbSellerExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSerllernameIsNull() {
            addCriterion("serllername is null");
            return (Criteria) this;
        }

        public Criteria andSerllernameIsNotNull() {
            addCriterion("serllername is not null");
            return (Criteria) this;
        }

        public Criteria andSerllernameEqualTo(String value) {
            addCriterion("serllername =", value, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameNotEqualTo(String value) {
            addCriterion("serllername <>", value, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameGreaterThan(String value) {
            addCriterion("serllername >", value, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameGreaterThanOrEqualTo(String value) {
            addCriterion("serllername >=", value, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameLessThan(String value) {
            addCriterion("serllername <", value, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameLessThanOrEqualTo(String value) {
            addCriterion("serllername <=", value, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameLike(String value) {
            addCriterion("serllername like", value, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameNotLike(String value) {
            addCriterion("serllername not like", value, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameIn(List<String> values) {
            addCriterion("serllername in", values, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameNotIn(List<String> values) {
            addCriterion("serllername not in", values, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameBetween(String value1, String value2) {
            addCriterion("serllername between", value1, value2, "serllername");
            return (Criteria) this;
        }

        public Criteria andSerllernameNotBetween(String value1, String value2) {
            addCriterion("serllername not between", value1, value2, "serllername");
            return (Criteria) this;
        }

        public Criteria andSellertypeIsNull() {
            addCriterion("sellertype is null");
            return (Criteria) this;
        }

        public Criteria andSellertypeIsNotNull() {
            addCriterion("sellertype is not null");
            return (Criteria) this;
        }

        public Criteria andSellertypeEqualTo(String value) {
            addCriterion("sellertype =", value, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeNotEqualTo(String value) {
            addCriterion("sellertype <>", value, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeGreaterThan(String value) {
            addCriterion("sellertype >", value, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeGreaterThanOrEqualTo(String value) {
            addCriterion("sellertype >=", value, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeLessThan(String value) {
            addCriterion("sellertype <", value, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeLessThanOrEqualTo(String value) {
            addCriterion("sellertype <=", value, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeLike(String value) {
            addCriterion("sellertype like", value, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeNotLike(String value) {
            addCriterion("sellertype not like", value, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeIn(List<String> values) {
            addCriterion("sellertype in", values, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeNotIn(List<String> values) {
            addCriterion("sellertype not in", values, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeBetween(String value1, String value2) {
            addCriterion("sellertype between", value1, value2, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellertypeNotBetween(String value1, String value2) {
            addCriterion("sellertype not between", value1, value2, "sellertype");
            return (Criteria) this;
        }

        public Criteria andSellerddressIsNull() {
            addCriterion("sellerddress is null");
            return (Criteria) this;
        }

        public Criteria andSellerddressIsNotNull() {
            addCriterion("sellerddress is not null");
            return (Criteria) this;
        }

        public Criteria andSellerddressEqualTo(String value) {
            addCriterion("sellerddress =", value, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressNotEqualTo(String value) {
            addCriterion("sellerddress <>", value, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressGreaterThan(String value) {
            addCriterion("sellerddress >", value, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressGreaterThanOrEqualTo(String value) {
            addCriterion("sellerddress >=", value, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressLessThan(String value) {
            addCriterion("sellerddress <", value, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressLessThanOrEqualTo(String value) {
            addCriterion("sellerddress <=", value, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressLike(String value) {
            addCriterion("sellerddress like", value, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressNotLike(String value) {
            addCriterion("sellerddress not like", value, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressIn(List<String> values) {
            addCriterion("sellerddress in", values, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressNotIn(List<String> values) {
            addCriterion("sellerddress not in", values, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressBetween(String value1, String value2) {
            addCriterion("sellerddress between", value1, value2, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerddressNotBetween(String value1, String value2) {
            addCriterion("sellerddress not between", value1, value2, "sellerddress");
            return (Criteria) this;
        }

        public Criteria andSellerphoneIsNull() {
            addCriterion("sellerphone is null");
            return (Criteria) this;
        }

        public Criteria andSellerphoneIsNotNull() {
            addCriterion("sellerphone is not null");
            return (Criteria) this;
        }

        public Criteria andSellerphoneEqualTo(String value) {
            addCriterion("sellerphone =", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneNotEqualTo(String value) {
            addCriterion("sellerphone <>", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneGreaterThan(String value) {
            addCriterion("sellerphone >", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneGreaterThanOrEqualTo(String value) {
            addCriterion("sellerphone >=", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneLessThan(String value) {
            addCriterion("sellerphone <", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneLessThanOrEqualTo(String value) {
            addCriterion("sellerphone <=", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneLike(String value) {
            addCriterion("sellerphone like", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneNotLike(String value) {
            addCriterion("sellerphone not like", value, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneIn(List<String> values) {
            addCriterion("sellerphone in", values, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneNotIn(List<String> values) {
            addCriterion("sellerphone not in", values, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneBetween(String value1, String value2) {
            addCriterion("sellerphone between", value1, value2, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerphoneNotBetween(String value1, String value2) {
            addCriterion("sellerphone not between", value1, value2, "sellerphone");
            return (Criteria) this;
        }

        public Criteria andSellerlogoIsNull() {
            addCriterion("sellerlogo is null");
            return (Criteria) this;
        }

        public Criteria andSellerlogoIsNotNull() {
            addCriterion("sellerlogo is not null");
            return (Criteria) this;
        }

        public Criteria andSellerlogoEqualTo(String value) {
            addCriterion("sellerlogo =", value, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoNotEqualTo(String value) {
            addCriterion("sellerlogo <>", value, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoGreaterThan(String value) {
            addCriterion("sellerlogo >", value, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoGreaterThanOrEqualTo(String value) {
            addCriterion("sellerlogo >=", value, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoLessThan(String value) {
            addCriterion("sellerlogo <", value, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoLessThanOrEqualTo(String value) {
            addCriterion("sellerlogo <=", value, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoLike(String value) {
            addCriterion("sellerlogo like", value, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoNotLike(String value) {
            addCriterion("sellerlogo not like", value, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoIn(List<String> values) {
            addCriterion("sellerlogo in", values, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoNotIn(List<String> values) {
            addCriterion("sellerlogo not in", values, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoBetween(String value1, String value2) {
            addCriterion("sellerlogo between", value1, value2, "sellerlogo");
            return (Criteria) this;
        }

        public Criteria andSellerlogoNotBetween(String value1, String value2) {
            addCriterion("sellerlogo not between", value1, value2, "sellerlogo");
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