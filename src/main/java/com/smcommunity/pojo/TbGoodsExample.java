package com.smcommunity.pojo;

import java.util.ArrayList;
import java.util.List;

public class TbGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbGoodsExample() {
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

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeIsNull() {
            addCriterion("goodsdescribe is null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeIsNotNull() {
            addCriterion("goodsdescribe is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeEqualTo(String value) {
            addCriterion("goodsdescribe =", value, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeNotEqualTo(String value) {
            addCriterion("goodsdescribe <>", value, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeGreaterThan(String value) {
            addCriterion("goodsdescribe >", value, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeGreaterThanOrEqualTo(String value) {
            addCriterion("goodsdescribe >=", value, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeLessThan(String value) {
            addCriterion("goodsdescribe <", value, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeLessThanOrEqualTo(String value) {
            addCriterion("goodsdescribe <=", value, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeLike(String value) {
            addCriterion("goodsdescribe like", value, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeNotLike(String value) {
            addCriterion("goodsdescribe not like", value, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeIn(List<String> values) {
            addCriterion("goodsdescribe in", values, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeNotIn(List<String> values) {
            addCriterion("goodsdescribe not in", values, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeBetween(String value1, String value2) {
            addCriterion("goodsdescribe between", value1, value2, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andGoodsdescribeNotBetween(String value1, String value2) {
            addCriterion("goodsdescribe not between", value1, value2, "goodsdescribe");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNull() {
            addCriterion("sellerid is null");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNotNull() {
            addCriterion("sellerid is not null");
            return (Criteria) this;
        }

        public Criteria andSelleridEqualTo(Integer value) {
            addCriterion("sellerid =", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotEqualTo(Integer value) {
            addCriterion("sellerid <>", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThan(Integer value) {
            addCriterion("sellerid >", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThanOrEqualTo(Integer value) {
            addCriterion("sellerid >=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThan(Integer value) {
            addCriterion("sellerid <", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThanOrEqualTo(Integer value) {
            addCriterion("sellerid <=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridIn(List<Integer> values) {
            addCriterion("sellerid in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotIn(List<Integer> values) {
            addCriterion("sellerid not in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridBetween(Integer value1, Integer value2) {
            addCriterion("sellerid between", value1, value2, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotBetween(Integer value1, Integer value2) {
            addCriterion("sellerid not between", value1, value2, "sellerid");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNull() {
            addCriterion("goodstype is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNotNull() {
            addCriterion("goodstype is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeEqualTo(Integer value) {
            addCriterion("goodstype =", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotEqualTo(Integer value) {
            addCriterion("goodstype <>", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThan(Integer value) {
            addCriterion("goodstype >", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("goodstype >=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThan(Integer value) {
            addCriterion("goodstype <", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThanOrEqualTo(Integer value) {
            addCriterion("goodstype <=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIn(List<Integer> values) {
            addCriterion("goodstype in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotIn(List<Integer> values) {
            addCriterion("goodstype not in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeBetween(Integer value1, Integer value2) {
            addCriterion("goodstype between", value1, value2, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotBetween(Integer value1, Integer value2) {
            addCriterion("goodstype not between", value1, value2, "goodstype");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNull() {
            addCriterion("display is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIsNotNull() {
            addCriterion("display is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayEqualTo(Integer value) {
            addCriterion("display =", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotEqualTo(Integer value) {
            addCriterion("display <>", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThan(Integer value) {
            addCriterion("display >", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayGreaterThanOrEqualTo(Integer value) {
            addCriterion("display >=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThan(Integer value) {
            addCriterion("display <", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayLessThanOrEqualTo(Integer value) {
            addCriterion("display <=", value, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayIn(List<Integer> values) {
            addCriterion("display in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotIn(List<Integer> values) {
            addCriterion("display not in", values, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayBetween(Integer value1, Integer value2) {
            addCriterion("display between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andDisplayNotBetween(Integer value1, Integer value2) {
            addCriterion("display not between", value1, value2, "display");
            return (Criteria) this;
        }

        public Criteria andGoodsimageIsNull() {
            addCriterion("goodsimage is null");
            return (Criteria) this;
        }

        public Criteria andGoodsimageIsNotNull() {
            addCriterion("goodsimage is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsimageEqualTo(String value) {
            addCriterion("goodsimage =", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageNotEqualTo(String value) {
            addCriterion("goodsimage <>", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageGreaterThan(String value) {
            addCriterion("goodsimage >", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageGreaterThanOrEqualTo(String value) {
            addCriterion("goodsimage >=", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageLessThan(String value) {
            addCriterion("goodsimage <", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageLessThanOrEqualTo(String value) {
            addCriterion("goodsimage <=", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageLike(String value) {
            addCriterion("goodsimage like", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageNotLike(String value) {
            addCriterion("goodsimage not like", value, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageIn(List<String> values) {
            addCriterion("goodsimage in", values, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageNotIn(List<String> values) {
            addCriterion("goodsimage not in", values, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageBetween(String value1, String value2) {
            addCriterion("goodsimage between", value1, value2, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andGoodsimageNotBetween(String value1, String value2) {
            addCriterion("goodsimage not between", value1, value2, "goodsimage");
            return (Criteria) this;
        }

        public Criteria andTidIsNull() {
            addCriterion("tid is null");
            return (Criteria) this;
        }

        public Criteria andTidIsNotNull() {
            addCriterion("tid is not null");
            return (Criteria) this;
        }

        public Criteria andTidEqualTo(Integer value) {
            addCriterion("tid =", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotEqualTo(Integer value) {
            addCriterion("tid <>", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThan(Integer value) {
            addCriterion("tid >", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tid >=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThan(Integer value) {
            addCriterion("tid <", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidLessThanOrEqualTo(Integer value) {
            addCriterion("tid <=", value, "tid");
            return (Criteria) this;
        }

        public Criteria andTidIn(List<Integer> values) {
            addCriterion("tid in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotIn(List<Integer> values) {
            addCriterion("tid not in", values, "tid");
            return (Criteria) this;
        }

        public Criteria andTidBetween(Integer value1, Integer value2) {
            addCriterion("tid between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTidNotBetween(Integer value1, Integer value2) {
            addCriterion("tid not between", value1, value2, "tid");
            return (Criteria) this;
        }

        public Criteria andTnameIsNull() {
            addCriterion("tname is null");
            return (Criteria) this;
        }

        public Criteria andTnameIsNotNull() {
            addCriterion("tname is not null");
            return (Criteria) this;
        }

        public Criteria andTnameEqualTo(String value) {
            addCriterion("tname =", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotEqualTo(String value) {
            addCriterion("tname <>", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThan(String value) {
            addCriterion("tname >", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameGreaterThanOrEqualTo(String value) {
            addCriterion("tname >=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThan(String value) {
            addCriterion("tname <", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLessThanOrEqualTo(String value) {
            addCriterion("tname <=", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameLike(String value) {
            addCriterion("tname like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotLike(String value) {
            addCriterion("tname not like", value, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameIn(List<String> values) {
            addCriterion("tname in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotIn(List<String> values) {
            addCriterion("tname not in", values, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameBetween(String value1, String value2) {
            addCriterion("tname between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andTnameNotBetween(String value1, String value2) {
            addCriterion("tname not between", value1, value2, "tname");
            return (Criteria) this;
        }

        public Criteria andWidIsNull() {
            addCriterion("wid is null");
            return (Criteria) this;
        }

        public Criteria andWidIsNotNull() {
            addCriterion("wid is not null");
            return (Criteria) this;
        }

        public Criteria andWidEqualTo(String value) {
            addCriterion("wid =", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotEqualTo(String value) {
            addCriterion("wid <>", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThan(String value) {
            addCriterion("wid >", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidGreaterThanOrEqualTo(String value) {
            addCriterion("wid >=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThan(String value) {
            addCriterion("wid <", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLessThanOrEqualTo(String value) {
            addCriterion("wid <=", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidLike(String value) {
            addCriterion("wid like", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotLike(String value) {
            addCriterion("wid not like", value, "wid");
            return (Criteria) this;
        }

        public Criteria andWidIn(List<String> values) {
            addCriterion("wid in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotIn(List<String> values) {
            addCriterion("wid not in", values, "wid");
            return (Criteria) this;
        }

        public Criteria andWidBetween(String value1, String value2) {
            addCriterion("wid between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andWidNotBetween(String value1, String value2) {
            addCriterion("wid not between", value1, value2, "wid");
            return (Criteria) this;
        }

        public Criteria andIsallIsNull() {
            addCriterion("isall is null");
            return (Criteria) this;
        }

        public Criteria andIsallIsNotNull() {
            addCriterion("isall is not null");
            return (Criteria) this;
        }

        public Criteria andIsallEqualTo(Integer value) {
            addCriterion("isall =", value, "isall");
            return (Criteria) this;
        }

        public Criteria andIsallNotEqualTo(Integer value) {
            addCriterion("isall <>", value, "isall");
            return (Criteria) this;
        }

        public Criteria andIsallGreaterThan(Integer value) {
            addCriterion("isall >", value, "isall");
            return (Criteria) this;
        }

        public Criteria andIsallGreaterThanOrEqualTo(Integer value) {
            addCriterion("isall >=", value, "isall");
            return (Criteria) this;
        }

        public Criteria andIsallLessThan(Integer value) {
            addCriterion("isall <", value, "isall");
            return (Criteria) this;
        }

        public Criteria andIsallLessThanOrEqualTo(Integer value) {
            addCriterion("isall <=", value, "isall");
            return (Criteria) this;
        }

        public Criteria andIsallIn(List<Integer> values) {
            addCriterion("isall in", values, "isall");
            return (Criteria) this;
        }

        public Criteria andIsallNotIn(List<Integer> values) {
            addCriterion("isall not in", values, "isall");
            return (Criteria) this;
        }

        public Criteria andIsallBetween(Integer value1, Integer value2) {
            addCriterion("isall between", value1, value2, "isall");
            return (Criteria) this;
        }

        public Criteria andIsallNotBetween(Integer value1, Integer value2) {
            addCriterion("isall not between", value1, value2, "isall");
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