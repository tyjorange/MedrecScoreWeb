package data.dao.pojo.exp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class MedrecScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedrecScoreExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andMrYearIsNull() {
            addCriterion("mr_year is null");
            return (Criteria) this;
        }

        public Criteria andMrYearIsNotNull() {
            addCriterion("mr_year is not null");
            return (Criteria) this;
        }

        public Criteria andMrYearEqualTo(Date value) {
            addCriterionForJDBCDate("mr_year =", value, "mrYear");
            return (Criteria) this;
        }

        public Criteria andMrYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("mr_year <>", value, "mrYear");
            return (Criteria) this;
        }

        public Criteria andMrYearGreaterThan(Date value) {
            addCriterionForJDBCDate("mr_year >", value, "mrYear");
            return (Criteria) this;
        }

        public Criteria andMrYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mr_year >=", value, "mrYear");
            return (Criteria) this;
        }

        public Criteria andMrYearLessThan(Date value) {
            addCriterionForJDBCDate("mr_year <", value, "mrYear");
            return (Criteria) this;
        }

        public Criteria andMrYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("mr_year <=", value, "mrYear");
            return (Criteria) this;
        }

        public Criteria andMrYearIn(List<Date> values) {
            addCriterionForJDBCDate("mr_year in", values, "mrYear");
            return (Criteria) this;
        }

        public Criteria andMrYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("mr_year not in", values, "mrYear");
            return (Criteria) this;
        }

        public Criteria andMrYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mr_year between", value1, value2, "mrYear");
            return (Criteria) this;
        }

        public Criteria andMrYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("mr_year not between", value1, value2, "mrYear");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(BigDecimal value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(BigDecimal value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(BigDecimal value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(BigDecimal value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<BigDecimal> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<BigDecimal> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAa1IsNull() {
            addCriterion("aa1 is null");
            return (Criteria) this;
        }

        public Criteria andAa1IsNotNull() {
            addCriterion("aa1 is not null");
            return (Criteria) this;
        }

        public Criteria andAa1EqualTo(BigDecimal value) {
            addCriterion("aa1 =", value, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa1NotEqualTo(BigDecimal value) {
            addCriterion("aa1 <>", value, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa1GreaterThan(BigDecimal value) {
            addCriterion("aa1 >", value, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aa1 >=", value, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa1LessThan(BigDecimal value) {
            addCriterion("aa1 <", value, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("aa1 <=", value, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa1In(List<BigDecimal> values) {
            addCriterion("aa1 in", values, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa1NotIn(List<BigDecimal> values) {
            addCriterion("aa1 not in", values, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("aa1 between", value1, value2, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aa1 not between", value1, value2, "aa1");
            return (Criteria) this;
        }

        public Criteria andAa2IsNull() {
            addCriterion("aa2 is null");
            return (Criteria) this;
        }

        public Criteria andAa2IsNotNull() {
            addCriterion("aa2 is not null");
            return (Criteria) this;
        }

        public Criteria andAa2EqualTo(BigDecimal value) {
            addCriterion("aa2 =", value, "aa2");
            return (Criteria) this;
        }

        public Criteria andAa2NotEqualTo(BigDecimal value) {
            addCriterion("aa2 <>", value, "aa2");
            return (Criteria) this;
        }

        public Criteria andAa2GreaterThan(BigDecimal value) {
            addCriterion("aa2 >", value, "aa2");
            return (Criteria) this;
        }

        public Criteria andAa2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("aa2 >=", value, "aa2");
            return (Criteria) this;
        }

        public Criteria andAa2LessThan(BigDecimal value) {
            addCriterion("aa2 <", value, "aa2");
            return (Criteria) this;
        }

        public Criteria andAa2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("aa2 <=", value, "aa2");
            return (Criteria) this;
        }

        public Criteria andAa2In(List<BigDecimal> values) {
            addCriterion("aa2 in", values, "aa2");
            return (Criteria) this;
        }

        public Criteria andAa2NotIn(List<BigDecimal> values) {
            addCriterion("aa2 not in", values, "aa2");
            return (Criteria) this;
        }

        public Criteria andAa2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("aa2 between", value1, value2, "aa2");
            return (Criteria) this;
        }

        public Criteria andAa2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("aa2 not between", value1, value2, "aa2");
            return (Criteria) this;
        }

        public Criteria andAb1IsNull() {
            addCriterion("ab1 is null");
            return (Criteria) this;
        }

        public Criteria andAb1IsNotNull() {
            addCriterion("ab1 is not null");
            return (Criteria) this;
        }

        public Criteria andAb1EqualTo(BigDecimal value) {
            addCriterion("ab1 =", value, "ab1");
            return (Criteria) this;
        }

        public Criteria andAb1NotEqualTo(BigDecimal value) {
            addCriterion("ab1 <>", value, "ab1");
            return (Criteria) this;
        }

        public Criteria andAb1GreaterThan(BigDecimal value) {
            addCriterion("ab1 >", value, "ab1");
            return (Criteria) this;
        }

        public Criteria andAb1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ab1 >=", value, "ab1");
            return (Criteria) this;
        }

        public Criteria andAb1LessThan(BigDecimal value) {
            addCriterion("ab1 <", value, "ab1");
            return (Criteria) this;
        }

        public Criteria andAb1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ab1 <=", value, "ab1");
            return (Criteria) this;
        }

        public Criteria andAb1In(List<BigDecimal> values) {
            addCriterion("ab1 in", values, "ab1");
            return (Criteria) this;
        }

        public Criteria andAb1NotIn(List<BigDecimal> values) {
            addCriterion("ab1 not in", values, "ab1");
            return (Criteria) this;
        }

        public Criteria andAb1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab1 between", value1, value2, "ab1");
            return (Criteria) this;
        }

        public Criteria andAb1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ab1 not between", value1, value2, "ab1");
            return (Criteria) this;
        }

        public Criteria andAc1IsNull() {
            addCriterion("ac1 is null");
            return (Criteria) this;
        }

        public Criteria andAc1IsNotNull() {
            addCriterion("ac1 is not null");
            return (Criteria) this;
        }

        public Criteria andAc1EqualTo(BigDecimal value) {
            addCriterion("ac1 =", value, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc1NotEqualTo(BigDecimal value) {
            addCriterion("ac1 <>", value, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc1GreaterThan(BigDecimal value) {
            addCriterion("ac1 >", value, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ac1 >=", value, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc1LessThan(BigDecimal value) {
            addCriterion("ac1 <", value, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ac1 <=", value, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc1In(List<BigDecimal> values) {
            addCriterion("ac1 in", values, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc1NotIn(List<BigDecimal> values) {
            addCriterion("ac1 not in", values, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac1 between", value1, value2, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac1 not between", value1, value2, "ac1");
            return (Criteria) this;
        }

        public Criteria andAc2IsNull() {
            addCriterion("ac2 is null");
            return (Criteria) this;
        }

        public Criteria andAc2IsNotNull() {
            addCriterion("ac2 is not null");
            return (Criteria) this;
        }

        public Criteria andAc2EqualTo(BigDecimal value) {
            addCriterion("ac2 =", value, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc2NotEqualTo(BigDecimal value) {
            addCriterion("ac2 <>", value, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc2GreaterThan(BigDecimal value) {
            addCriterion("ac2 >", value, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ac2 >=", value, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc2LessThan(BigDecimal value) {
            addCriterion("ac2 <", value, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ac2 <=", value, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc2In(List<BigDecimal> values) {
            addCriterion("ac2 in", values, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc2NotIn(List<BigDecimal> values) {
            addCriterion("ac2 not in", values, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac2 between", value1, value2, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac2 not between", value1, value2, "ac2");
            return (Criteria) this;
        }

        public Criteria andAc3IsNull() {
            addCriterion("ac3 is null");
            return (Criteria) this;
        }

        public Criteria andAc3IsNotNull() {
            addCriterion("ac3 is not null");
            return (Criteria) this;
        }

        public Criteria andAc3EqualTo(BigDecimal value) {
            addCriterion("ac3 =", value, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc3NotEqualTo(BigDecimal value) {
            addCriterion("ac3 <>", value, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc3GreaterThan(BigDecimal value) {
            addCriterion("ac3 >", value, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ac3 >=", value, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc3LessThan(BigDecimal value) {
            addCriterion("ac3 <", value, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ac3 <=", value, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc3In(List<BigDecimal> values) {
            addCriterion("ac3 in", values, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc3NotIn(List<BigDecimal> values) {
            addCriterion("ac3 not in", values, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac3 between", value1, value2, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac3 not between", value1, value2, "ac3");
            return (Criteria) this;
        }

        public Criteria andAc4IsNull() {
            addCriterion("ac4 is null");
            return (Criteria) this;
        }

        public Criteria andAc4IsNotNull() {
            addCriterion("ac4 is not null");
            return (Criteria) this;
        }

        public Criteria andAc4EqualTo(BigDecimal value) {
            addCriterion("ac4 =", value, "ac4");
            return (Criteria) this;
        }

        public Criteria andAc4NotEqualTo(BigDecimal value) {
            addCriterion("ac4 <>", value, "ac4");
            return (Criteria) this;
        }

        public Criteria andAc4GreaterThan(BigDecimal value) {
            addCriterion("ac4 >", value, "ac4");
            return (Criteria) this;
        }

        public Criteria andAc4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ac4 >=", value, "ac4");
            return (Criteria) this;
        }

        public Criteria andAc4LessThan(BigDecimal value) {
            addCriterion("ac4 <", value, "ac4");
            return (Criteria) this;
        }

        public Criteria andAc4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ac4 <=", value, "ac4");
            return (Criteria) this;
        }

        public Criteria andAc4In(List<BigDecimal> values) {
            addCriterion("ac4 in", values, "ac4");
            return (Criteria) this;
        }

        public Criteria andAc4NotIn(List<BigDecimal> values) {
            addCriterion("ac4 not in", values, "ac4");
            return (Criteria) this;
        }

        public Criteria andAc4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac4 between", value1, value2, "ac4");
            return (Criteria) this;
        }

        public Criteria andAc4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac4 not between", value1, value2, "ac4");
            return (Criteria) this;
        }

        public Criteria andAd1IsNull() {
            addCriterion("ad1 is null");
            return (Criteria) this;
        }

        public Criteria andAd1IsNotNull() {
            addCriterion("ad1 is not null");
            return (Criteria) this;
        }

        public Criteria andAd1EqualTo(BigDecimal value) {
            addCriterion("ad1 =", value, "ad1");
            return (Criteria) this;
        }

        public Criteria andAd1NotEqualTo(BigDecimal value) {
            addCriterion("ad1 <>", value, "ad1");
            return (Criteria) this;
        }

        public Criteria andAd1GreaterThan(BigDecimal value) {
            addCriterion("ad1 >", value, "ad1");
            return (Criteria) this;
        }

        public Criteria andAd1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ad1 >=", value, "ad1");
            return (Criteria) this;
        }

        public Criteria andAd1LessThan(BigDecimal value) {
            addCriterion("ad1 <", value, "ad1");
            return (Criteria) this;
        }

        public Criteria andAd1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ad1 <=", value, "ad1");
            return (Criteria) this;
        }

        public Criteria andAd1In(List<BigDecimal> values) {
            addCriterion("ad1 in", values, "ad1");
            return (Criteria) this;
        }

        public Criteria andAd1NotIn(List<BigDecimal> values) {
            addCriterion("ad1 not in", values, "ad1");
            return (Criteria) this;
        }

        public Criteria andAd1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ad1 between", value1, value2, "ad1");
            return (Criteria) this;
        }

        public Criteria andAd1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ad1 not between", value1, value2, "ad1");
            return (Criteria) this;
        }

        public Criteria andBa1IsNull() {
            addCriterion("ba1 is null");
            return (Criteria) this;
        }

        public Criteria andBa1IsNotNull() {
            addCriterion("ba1 is not null");
            return (Criteria) this;
        }

        public Criteria andBa1EqualTo(BigDecimal value) {
            addCriterion("ba1 =", value, "ba1");
            return (Criteria) this;
        }

        public Criteria andBa1NotEqualTo(BigDecimal value) {
            addCriterion("ba1 <>", value, "ba1");
            return (Criteria) this;
        }

        public Criteria andBa1GreaterThan(BigDecimal value) {
            addCriterion("ba1 >", value, "ba1");
            return (Criteria) this;
        }

        public Criteria andBa1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ba1 >=", value, "ba1");
            return (Criteria) this;
        }

        public Criteria andBa1LessThan(BigDecimal value) {
            addCriterion("ba1 <", value, "ba1");
            return (Criteria) this;
        }

        public Criteria andBa1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ba1 <=", value, "ba1");
            return (Criteria) this;
        }

        public Criteria andBa1In(List<BigDecimal> values) {
            addCriterion("ba1 in", values, "ba1");
            return (Criteria) this;
        }

        public Criteria andBa1NotIn(List<BigDecimal> values) {
            addCriterion("ba1 not in", values, "ba1");
            return (Criteria) this;
        }

        public Criteria andBa1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ba1 between", value1, value2, "ba1");
            return (Criteria) this;
        }

        public Criteria andBa1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ba1 not between", value1, value2, "ba1");
            return (Criteria) this;
        }

        public Criteria andBb1IsNull() {
            addCriterion("bb1 is null");
            return (Criteria) this;
        }

        public Criteria andBb1IsNotNull() {
            addCriterion("bb1 is not null");
            return (Criteria) this;
        }

        public Criteria andBb1EqualTo(BigDecimal value) {
            addCriterion("bb1 =", value, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb1NotEqualTo(BigDecimal value) {
            addCriterion("bb1 <>", value, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb1GreaterThan(BigDecimal value) {
            addCriterion("bb1 >", value, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bb1 >=", value, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb1LessThan(BigDecimal value) {
            addCriterion("bb1 <", value, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("bb1 <=", value, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb1In(List<BigDecimal> values) {
            addCriterion("bb1 in", values, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb1NotIn(List<BigDecimal> values) {
            addCriterion("bb1 not in", values, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb1 between", value1, value2, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb1 not between", value1, value2, "bb1");
            return (Criteria) this;
        }

        public Criteria andBb2IsNull() {
            addCriterion("bb2 is null");
            return (Criteria) this;
        }

        public Criteria andBb2IsNotNull() {
            addCriterion("bb2 is not null");
            return (Criteria) this;
        }

        public Criteria andBb2EqualTo(BigDecimal value) {
            addCriterion("bb2 =", value, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb2NotEqualTo(BigDecimal value) {
            addCriterion("bb2 <>", value, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb2GreaterThan(BigDecimal value) {
            addCriterion("bb2 >", value, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bb2 >=", value, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb2LessThan(BigDecimal value) {
            addCriterion("bb2 <", value, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("bb2 <=", value, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb2In(List<BigDecimal> values) {
            addCriterion("bb2 in", values, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb2NotIn(List<BigDecimal> values) {
            addCriterion("bb2 not in", values, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb2 between", value1, value2, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb2 not between", value1, value2, "bb2");
            return (Criteria) this;
        }

        public Criteria andBb3IsNull() {
            addCriterion("bb3 is null");
            return (Criteria) this;
        }

        public Criteria andBb3IsNotNull() {
            addCriterion("bb3 is not null");
            return (Criteria) this;
        }

        public Criteria andBb3EqualTo(BigDecimal value) {
            addCriterion("bb3 =", value, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb3NotEqualTo(BigDecimal value) {
            addCriterion("bb3 <>", value, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb3GreaterThan(BigDecimal value) {
            addCriterion("bb3 >", value, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bb3 >=", value, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb3LessThan(BigDecimal value) {
            addCriterion("bb3 <", value, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("bb3 <=", value, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb3In(List<BigDecimal> values) {
            addCriterion("bb3 in", values, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb3NotIn(List<BigDecimal> values) {
            addCriterion("bb3 not in", values, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb3 between", value1, value2, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb3 not between", value1, value2, "bb3");
            return (Criteria) this;
        }

        public Criteria andBb4IsNull() {
            addCriterion("bb4 is null");
            return (Criteria) this;
        }

        public Criteria andBb4IsNotNull() {
            addCriterion("bb4 is not null");
            return (Criteria) this;
        }

        public Criteria andBb4EqualTo(BigDecimal value) {
            addCriterion("bb4 =", value, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb4NotEqualTo(BigDecimal value) {
            addCriterion("bb4 <>", value, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb4GreaterThan(BigDecimal value) {
            addCriterion("bb4 >", value, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bb4 >=", value, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb4LessThan(BigDecimal value) {
            addCriterion("bb4 <", value, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("bb4 <=", value, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb4In(List<BigDecimal> values) {
            addCriterion("bb4 in", values, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb4NotIn(List<BigDecimal> values) {
            addCriterion("bb4 not in", values, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb4 between", value1, value2, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb4 not between", value1, value2, "bb4");
            return (Criteria) this;
        }

        public Criteria andBb5IsNull() {
            addCriterion("bb5 is null");
            return (Criteria) this;
        }

        public Criteria andBb5IsNotNull() {
            addCriterion("bb5 is not null");
            return (Criteria) this;
        }

        public Criteria andBb5EqualTo(BigDecimal value) {
            addCriterion("bb5 =", value, "bb5");
            return (Criteria) this;
        }

        public Criteria andBb5NotEqualTo(BigDecimal value) {
            addCriterion("bb5 <>", value, "bb5");
            return (Criteria) this;
        }

        public Criteria andBb5GreaterThan(BigDecimal value) {
            addCriterion("bb5 >", value, "bb5");
            return (Criteria) this;
        }

        public Criteria andBb5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bb5 >=", value, "bb5");
            return (Criteria) this;
        }

        public Criteria andBb5LessThan(BigDecimal value) {
            addCriterion("bb5 <", value, "bb5");
            return (Criteria) this;
        }

        public Criteria andBb5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("bb5 <=", value, "bb5");
            return (Criteria) this;
        }

        public Criteria andBb5In(List<BigDecimal> values) {
            addCriterion("bb5 in", values, "bb5");
            return (Criteria) this;
        }

        public Criteria andBb5NotIn(List<BigDecimal> values) {
            addCriterion("bb5 not in", values, "bb5");
            return (Criteria) this;
        }

        public Criteria andBb5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb5 between", value1, value2, "bb5");
            return (Criteria) this;
        }

        public Criteria andBb5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bb5 not between", value1, value2, "bb5");
            return (Criteria) this;
        }

        public Criteria andBc1IsNull() {
            addCriterion("bc1 is null");
            return (Criteria) this;
        }

        public Criteria andBc1IsNotNull() {
            addCriterion("bc1 is not null");
            return (Criteria) this;
        }

        public Criteria andBc1EqualTo(BigDecimal value) {
            addCriterion("bc1 =", value, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc1NotEqualTo(BigDecimal value) {
            addCriterion("bc1 <>", value, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc1GreaterThan(BigDecimal value) {
            addCriterion("bc1 >", value, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bc1 >=", value, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc1LessThan(BigDecimal value) {
            addCriterion("bc1 <", value, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("bc1 <=", value, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc1In(List<BigDecimal> values) {
            addCriterion("bc1 in", values, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc1NotIn(List<BigDecimal> values) {
            addCriterion("bc1 not in", values, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("bc1 between", value1, value2, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bc1 not between", value1, value2, "bc1");
            return (Criteria) this;
        }

        public Criteria andBc2IsNull() {
            addCriterion("bc2 is null");
            return (Criteria) this;
        }

        public Criteria andBc2IsNotNull() {
            addCriterion("bc2 is not null");
            return (Criteria) this;
        }

        public Criteria andBc2EqualTo(BigDecimal value) {
            addCriterion("bc2 =", value, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc2NotEqualTo(BigDecimal value) {
            addCriterion("bc2 <>", value, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc2GreaterThan(BigDecimal value) {
            addCriterion("bc2 >", value, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bc2 >=", value, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc2LessThan(BigDecimal value) {
            addCriterion("bc2 <", value, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("bc2 <=", value, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc2In(List<BigDecimal> values) {
            addCriterion("bc2 in", values, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc2NotIn(List<BigDecimal> values) {
            addCriterion("bc2 not in", values, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("bc2 between", value1, value2, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bc2 not between", value1, value2, "bc2");
            return (Criteria) this;
        }

        public Criteria andBc3IsNull() {
            addCriterion("bc3 is null");
            return (Criteria) this;
        }

        public Criteria andBc3IsNotNull() {
            addCriterion("bc3 is not null");
            return (Criteria) this;
        }

        public Criteria andBc3EqualTo(BigDecimal value) {
            addCriterion("bc3 =", value, "bc3");
            return (Criteria) this;
        }

        public Criteria andBc3NotEqualTo(BigDecimal value) {
            addCriterion("bc3 <>", value, "bc3");
            return (Criteria) this;
        }

        public Criteria andBc3GreaterThan(BigDecimal value) {
            addCriterion("bc3 >", value, "bc3");
            return (Criteria) this;
        }

        public Criteria andBc3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bc3 >=", value, "bc3");
            return (Criteria) this;
        }

        public Criteria andBc3LessThan(BigDecimal value) {
            addCriterion("bc3 <", value, "bc3");
            return (Criteria) this;
        }

        public Criteria andBc3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("bc3 <=", value, "bc3");
            return (Criteria) this;
        }

        public Criteria andBc3In(List<BigDecimal> values) {
            addCriterion("bc3 in", values, "bc3");
            return (Criteria) this;
        }

        public Criteria andBc3NotIn(List<BigDecimal> values) {
            addCriterion("bc3 not in", values, "bc3");
            return (Criteria) this;
        }

        public Criteria andBc3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("bc3 between", value1, value2, "bc3");
            return (Criteria) this;
        }

        public Criteria andBc3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bc3 not between", value1, value2, "bc3");
            return (Criteria) this;
        }

        public Criteria andCa1IsNull() {
            addCriterion("ca1 is null");
            return (Criteria) this;
        }

        public Criteria andCa1IsNotNull() {
            addCriterion("ca1 is not null");
            return (Criteria) this;
        }

        public Criteria andCa1EqualTo(BigDecimal value) {
            addCriterion("ca1 =", value, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa1NotEqualTo(BigDecimal value) {
            addCriterion("ca1 <>", value, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa1GreaterThan(BigDecimal value) {
            addCriterion("ca1 >", value, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ca1 >=", value, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa1LessThan(BigDecimal value) {
            addCriterion("ca1 <", value, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ca1 <=", value, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa1In(List<BigDecimal> values) {
            addCriterion("ca1 in", values, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa1NotIn(List<BigDecimal> values) {
            addCriterion("ca1 not in", values, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca1 between", value1, value2, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca1 not between", value1, value2, "ca1");
            return (Criteria) this;
        }

        public Criteria andCa2IsNull() {
            addCriterion("ca2 is null");
            return (Criteria) this;
        }

        public Criteria andCa2IsNotNull() {
            addCriterion("ca2 is not null");
            return (Criteria) this;
        }

        public Criteria andCa2EqualTo(BigDecimal value) {
            addCriterion("ca2 =", value, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa2NotEqualTo(BigDecimal value) {
            addCriterion("ca2 <>", value, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa2GreaterThan(BigDecimal value) {
            addCriterion("ca2 >", value, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ca2 >=", value, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa2LessThan(BigDecimal value) {
            addCriterion("ca2 <", value, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ca2 <=", value, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa2In(List<BigDecimal> values) {
            addCriterion("ca2 in", values, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa2NotIn(List<BigDecimal> values) {
            addCriterion("ca2 not in", values, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca2 between", value1, value2, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca2 not between", value1, value2, "ca2");
            return (Criteria) this;
        }

        public Criteria andCa3IsNull() {
            addCriterion("ca3 is null");
            return (Criteria) this;
        }

        public Criteria andCa3IsNotNull() {
            addCriterion("ca3 is not null");
            return (Criteria) this;
        }

        public Criteria andCa3EqualTo(BigDecimal value) {
            addCriterion("ca3 =", value, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa3NotEqualTo(BigDecimal value) {
            addCriterion("ca3 <>", value, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa3GreaterThan(BigDecimal value) {
            addCriterion("ca3 >", value, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ca3 >=", value, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa3LessThan(BigDecimal value) {
            addCriterion("ca3 <", value, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ca3 <=", value, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa3In(List<BigDecimal> values) {
            addCriterion("ca3 in", values, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa3NotIn(List<BigDecimal> values) {
            addCriterion("ca3 not in", values, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca3 between", value1, value2, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca3 not between", value1, value2, "ca3");
            return (Criteria) this;
        }

        public Criteria andCa4IsNull() {
            addCriterion("ca4 is null");
            return (Criteria) this;
        }

        public Criteria andCa4IsNotNull() {
            addCriterion("ca4 is not null");
            return (Criteria) this;
        }

        public Criteria andCa4EqualTo(BigDecimal value) {
            addCriterion("ca4 =", value, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa4NotEqualTo(BigDecimal value) {
            addCriterion("ca4 <>", value, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa4GreaterThan(BigDecimal value) {
            addCriterion("ca4 >", value, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ca4 >=", value, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa4LessThan(BigDecimal value) {
            addCriterion("ca4 <", value, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ca4 <=", value, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa4In(List<BigDecimal> values) {
            addCriterion("ca4 in", values, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa4NotIn(List<BigDecimal> values) {
            addCriterion("ca4 not in", values, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca4 between", value1, value2, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca4 not between", value1, value2, "ca4");
            return (Criteria) this;
        }

        public Criteria andCa5IsNull() {
            addCriterion("ca5 is null");
            return (Criteria) this;
        }

        public Criteria andCa5IsNotNull() {
            addCriterion("ca5 is not null");
            return (Criteria) this;
        }

        public Criteria andCa5EqualTo(BigDecimal value) {
            addCriterion("ca5 =", value, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa5NotEqualTo(BigDecimal value) {
            addCriterion("ca5 <>", value, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa5GreaterThan(BigDecimal value) {
            addCriterion("ca5 >", value, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ca5 >=", value, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa5LessThan(BigDecimal value) {
            addCriterion("ca5 <", value, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ca5 <=", value, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa5In(List<BigDecimal> values) {
            addCriterion("ca5 in", values, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa5NotIn(List<BigDecimal> values) {
            addCriterion("ca5 not in", values, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca5 between", value1, value2, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca5 not between", value1, value2, "ca5");
            return (Criteria) this;
        }

        public Criteria andCa6IsNull() {
            addCriterion("ca6 is null");
            return (Criteria) this;
        }

        public Criteria andCa6IsNotNull() {
            addCriterion("ca6 is not null");
            return (Criteria) this;
        }

        public Criteria andCa6EqualTo(BigDecimal value) {
            addCriterion("ca6 =", value, "ca6");
            return (Criteria) this;
        }

        public Criteria andCa6NotEqualTo(BigDecimal value) {
            addCriterion("ca6 <>", value, "ca6");
            return (Criteria) this;
        }

        public Criteria andCa6GreaterThan(BigDecimal value) {
            addCriterion("ca6 >", value, "ca6");
            return (Criteria) this;
        }

        public Criteria andCa6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ca6 >=", value, "ca6");
            return (Criteria) this;
        }

        public Criteria andCa6LessThan(BigDecimal value) {
            addCriterion("ca6 <", value, "ca6");
            return (Criteria) this;
        }

        public Criteria andCa6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ca6 <=", value, "ca6");
            return (Criteria) this;
        }

        public Criteria andCa6In(List<BigDecimal> values) {
            addCriterion("ca6 in", values, "ca6");
            return (Criteria) this;
        }

        public Criteria andCa6NotIn(List<BigDecimal> values) {
            addCriterion("ca6 not in", values, "ca6");
            return (Criteria) this;
        }

        public Criteria andCa6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca6 between", value1, value2, "ca6");
            return (Criteria) this;
        }

        public Criteria andCa6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ca6 not between", value1, value2, "ca6");
            return (Criteria) this;
        }

        public Criteria andCb1IsNull() {
            addCriterion("cb1 is null");
            return (Criteria) this;
        }

        public Criteria andCb1IsNotNull() {
            addCriterion("cb1 is not null");
            return (Criteria) this;
        }

        public Criteria andCb1EqualTo(BigDecimal value) {
            addCriterion("cb1 =", value, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb1NotEqualTo(BigDecimal value) {
            addCriterion("cb1 <>", value, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb1GreaterThan(BigDecimal value) {
            addCriterion("cb1 >", value, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cb1 >=", value, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb1LessThan(BigDecimal value) {
            addCriterion("cb1 <", value, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cb1 <=", value, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb1In(List<BigDecimal> values) {
            addCriterion("cb1 in", values, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb1NotIn(List<BigDecimal> values) {
            addCriterion("cb1 not in", values, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb1 between", value1, value2, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb1 not between", value1, value2, "cb1");
            return (Criteria) this;
        }

        public Criteria andCb2IsNull() {
            addCriterion("cb2 is null");
            return (Criteria) this;
        }

        public Criteria andCb2IsNotNull() {
            addCriterion("cb2 is not null");
            return (Criteria) this;
        }

        public Criteria andCb2EqualTo(BigDecimal value) {
            addCriterion("cb2 =", value, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb2NotEqualTo(BigDecimal value) {
            addCriterion("cb2 <>", value, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb2GreaterThan(BigDecimal value) {
            addCriterion("cb2 >", value, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cb2 >=", value, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb2LessThan(BigDecimal value) {
            addCriterion("cb2 <", value, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cb2 <=", value, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb2In(List<BigDecimal> values) {
            addCriterion("cb2 in", values, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb2NotIn(List<BigDecimal> values) {
            addCriterion("cb2 not in", values, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb2 between", value1, value2, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb2 not between", value1, value2, "cb2");
            return (Criteria) this;
        }

        public Criteria andCb3IsNull() {
            addCriterion("cb3 is null");
            return (Criteria) this;
        }

        public Criteria andCb3IsNotNull() {
            addCriterion("cb3 is not null");
            return (Criteria) this;
        }

        public Criteria andCb3EqualTo(BigDecimal value) {
            addCriterion("cb3 =", value, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb3NotEqualTo(BigDecimal value) {
            addCriterion("cb3 <>", value, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb3GreaterThan(BigDecimal value) {
            addCriterion("cb3 >", value, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cb3 >=", value, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb3LessThan(BigDecimal value) {
            addCriterion("cb3 <", value, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cb3 <=", value, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb3In(List<BigDecimal> values) {
            addCriterion("cb3 in", values, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb3NotIn(List<BigDecimal> values) {
            addCriterion("cb3 not in", values, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb3 between", value1, value2, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb3 not between", value1, value2, "cb3");
            return (Criteria) this;
        }

        public Criteria andCb4IsNull() {
            addCriterion("cb4 is null");
            return (Criteria) this;
        }

        public Criteria andCb4IsNotNull() {
            addCriterion("cb4 is not null");
            return (Criteria) this;
        }

        public Criteria andCb4EqualTo(BigDecimal value) {
            addCriterion("cb4 =", value, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb4NotEqualTo(BigDecimal value) {
            addCriterion("cb4 <>", value, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb4GreaterThan(BigDecimal value) {
            addCriterion("cb4 >", value, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cb4 >=", value, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb4LessThan(BigDecimal value) {
            addCriterion("cb4 <", value, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cb4 <=", value, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb4In(List<BigDecimal> values) {
            addCriterion("cb4 in", values, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb4NotIn(List<BigDecimal> values) {
            addCriterion("cb4 not in", values, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb4 between", value1, value2, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb4 not between", value1, value2, "cb4");
            return (Criteria) this;
        }

        public Criteria andCb5IsNull() {
            addCriterion("cb5 is null");
            return (Criteria) this;
        }

        public Criteria andCb5IsNotNull() {
            addCriterion("cb5 is not null");
            return (Criteria) this;
        }

        public Criteria andCb5EqualTo(BigDecimal value) {
            addCriterion("cb5 =", value, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb5NotEqualTo(BigDecimal value) {
            addCriterion("cb5 <>", value, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb5GreaterThan(BigDecimal value) {
            addCriterion("cb5 >", value, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cb5 >=", value, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb5LessThan(BigDecimal value) {
            addCriterion("cb5 <", value, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cb5 <=", value, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb5In(List<BigDecimal> values) {
            addCriterion("cb5 in", values, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb5NotIn(List<BigDecimal> values) {
            addCriterion("cb5 not in", values, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb5 between", value1, value2, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb5 not between", value1, value2, "cb5");
            return (Criteria) this;
        }

        public Criteria andCb6IsNull() {
            addCriterion("cb6 is null");
            return (Criteria) this;
        }

        public Criteria andCb6IsNotNull() {
            addCriterion("cb6 is not null");
            return (Criteria) this;
        }

        public Criteria andCb6EqualTo(BigDecimal value) {
            addCriterion("cb6 =", value, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb6NotEqualTo(BigDecimal value) {
            addCriterion("cb6 <>", value, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb6GreaterThan(BigDecimal value) {
            addCriterion("cb6 >", value, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cb6 >=", value, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb6LessThan(BigDecimal value) {
            addCriterion("cb6 <", value, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cb6 <=", value, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb6In(List<BigDecimal> values) {
            addCriterion("cb6 in", values, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb6NotIn(List<BigDecimal> values) {
            addCriterion("cb6 not in", values, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb6 between", value1, value2, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb6 not between", value1, value2, "cb6");
            return (Criteria) this;
        }

        public Criteria andCb7IsNull() {
            addCriterion("cb7 is null");
            return (Criteria) this;
        }

        public Criteria andCb7IsNotNull() {
            addCriterion("cb7 is not null");
            return (Criteria) this;
        }

        public Criteria andCb7EqualTo(BigDecimal value) {
            addCriterion("cb7 =", value, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb7NotEqualTo(BigDecimal value) {
            addCriterion("cb7 <>", value, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb7GreaterThan(BigDecimal value) {
            addCriterion("cb7 >", value, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cb7 >=", value, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb7LessThan(BigDecimal value) {
            addCriterion("cb7 <", value, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cb7 <=", value, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb7In(List<BigDecimal> values) {
            addCriterion("cb7 in", values, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb7NotIn(List<BigDecimal> values) {
            addCriterion("cb7 not in", values, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb7 between", value1, value2, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb7 not between", value1, value2, "cb7");
            return (Criteria) this;
        }

        public Criteria andCb8IsNull() {
            addCriterion("cb8 is null");
            return (Criteria) this;
        }

        public Criteria andCb8IsNotNull() {
            addCriterion("cb8 is not null");
            return (Criteria) this;
        }

        public Criteria andCb8EqualTo(BigDecimal value) {
            addCriterion("cb8 =", value, "cb8");
            return (Criteria) this;
        }

        public Criteria andCb8NotEqualTo(BigDecimal value) {
            addCriterion("cb8 <>", value, "cb8");
            return (Criteria) this;
        }

        public Criteria andCb8GreaterThan(BigDecimal value) {
            addCriterion("cb8 >", value, "cb8");
            return (Criteria) this;
        }

        public Criteria andCb8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cb8 >=", value, "cb8");
            return (Criteria) this;
        }

        public Criteria andCb8LessThan(BigDecimal value) {
            addCriterion("cb8 <", value, "cb8");
            return (Criteria) this;
        }

        public Criteria andCb8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cb8 <=", value, "cb8");
            return (Criteria) this;
        }

        public Criteria andCb8In(List<BigDecimal> values) {
            addCriterion("cb8 in", values, "cb8");
            return (Criteria) this;
        }

        public Criteria andCb8NotIn(List<BigDecimal> values) {
            addCriterion("cb8 not in", values, "cb8");
            return (Criteria) this;
        }

        public Criteria andCb8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb8 between", value1, value2, "cb8");
            return (Criteria) this;
        }

        public Criteria andCb8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cb8 not between", value1, value2, "cb8");
            return (Criteria) this;
        }

        public Criteria andCc1IsNull() {
            addCriterion("cc1 is null");
            return (Criteria) this;
        }

        public Criteria andCc1IsNotNull() {
            addCriterion("cc1 is not null");
            return (Criteria) this;
        }

        public Criteria andCc1EqualTo(BigDecimal value) {
            addCriterion("cc1 =", value, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc1NotEqualTo(BigDecimal value) {
            addCriterion("cc1 <>", value, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc1GreaterThan(BigDecimal value) {
            addCriterion("cc1 >", value, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cc1 >=", value, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc1LessThan(BigDecimal value) {
            addCriterion("cc1 <", value, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cc1 <=", value, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc1In(List<BigDecimal> values) {
            addCriterion("cc1 in", values, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc1NotIn(List<BigDecimal> values) {
            addCriterion("cc1 not in", values, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cc1 between", value1, value2, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cc1 not between", value1, value2, "cc1");
            return (Criteria) this;
        }

        public Criteria andCc2IsNull() {
            addCriterion("cc2 is null");
            return (Criteria) this;
        }

        public Criteria andCc2IsNotNull() {
            addCriterion("cc2 is not null");
            return (Criteria) this;
        }

        public Criteria andCc2EqualTo(BigDecimal value) {
            addCriterion("cc2 =", value, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc2NotEqualTo(BigDecimal value) {
            addCriterion("cc2 <>", value, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc2GreaterThan(BigDecimal value) {
            addCriterion("cc2 >", value, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cc2 >=", value, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc2LessThan(BigDecimal value) {
            addCriterion("cc2 <", value, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cc2 <=", value, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc2In(List<BigDecimal> values) {
            addCriterion("cc2 in", values, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc2NotIn(List<BigDecimal> values) {
            addCriterion("cc2 not in", values, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cc2 between", value1, value2, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cc2 not between", value1, value2, "cc2");
            return (Criteria) this;
        }

        public Criteria andCc3IsNull() {
            addCriterion("cc3 is null");
            return (Criteria) this;
        }

        public Criteria andCc3IsNotNull() {
            addCriterion("cc3 is not null");
            return (Criteria) this;
        }

        public Criteria andCc3EqualTo(BigDecimal value) {
            addCriterion("cc3 =", value, "cc3");
            return (Criteria) this;
        }

        public Criteria andCc3NotEqualTo(BigDecimal value) {
            addCriterion("cc3 <>", value, "cc3");
            return (Criteria) this;
        }

        public Criteria andCc3GreaterThan(BigDecimal value) {
            addCriterion("cc3 >", value, "cc3");
            return (Criteria) this;
        }

        public Criteria andCc3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cc3 >=", value, "cc3");
            return (Criteria) this;
        }

        public Criteria andCc3LessThan(BigDecimal value) {
            addCriterion("cc3 <", value, "cc3");
            return (Criteria) this;
        }

        public Criteria andCc3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cc3 <=", value, "cc3");
            return (Criteria) this;
        }

        public Criteria andCc3In(List<BigDecimal> values) {
            addCriterion("cc3 in", values, "cc3");
            return (Criteria) this;
        }

        public Criteria andCc3NotIn(List<BigDecimal> values) {
            addCriterion("cc3 not in", values, "cc3");
            return (Criteria) this;
        }

        public Criteria andCc3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cc3 between", value1, value2, "cc3");
            return (Criteria) this;
        }

        public Criteria andCc3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cc3 not between", value1, value2, "cc3");
            return (Criteria) this;
        }

        public Criteria andCd1IsNull() {
            addCriterion("cd1 is null");
            return (Criteria) this;
        }

        public Criteria andCd1IsNotNull() {
            addCriterion("cd1 is not null");
            return (Criteria) this;
        }

        public Criteria andCd1EqualTo(BigDecimal value) {
            addCriterion("cd1 =", value, "cd1");
            return (Criteria) this;
        }

        public Criteria andCd1NotEqualTo(BigDecimal value) {
            addCriterion("cd1 <>", value, "cd1");
            return (Criteria) this;
        }

        public Criteria andCd1GreaterThan(BigDecimal value) {
            addCriterion("cd1 >", value, "cd1");
            return (Criteria) this;
        }

        public Criteria andCd1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cd1 >=", value, "cd1");
            return (Criteria) this;
        }

        public Criteria andCd1LessThan(BigDecimal value) {
            addCriterion("cd1 <", value, "cd1");
            return (Criteria) this;
        }

        public Criteria andCd1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("cd1 <=", value, "cd1");
            return (Criteria) this;
        }

        public Criteria andCd1In(List<BigDecimal> values) {
            addCriterion("cd1 in", values, "cd1");
            return (Criteria) this;
        }

        public Criteria andCd1NotIn(List<BigDecimal> values) {
            addCriterion("cd1 not in", values, "cd1");
            return (Criteria) this;
        }

        public Criteria andCd1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("cd1 between", value1, value2, "cd1");
            return (Criteria) this;
        }

        public Criteria andCd1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cd1 not between", value1, value2, "cd1");
            return (Criteria) this;
        }

        public Criteria andDa1IsNull() {
            addCriterion("da1 is null");
            return (Criteria) this;
        }

        public Criteria andDa1IsNotNull() {
            addCriterion("da1 is not null");
            return (Criteria) this;
        }

        public Criteria andDa1EqualTo(BigDecimal value) {
            addCriterion("da1 =", value, "da1");
            return (Criteria) this;
        }

        public Criteria andDa1NotEqualTo(BigDecimal value) {
            addCriterion("da1 <>", value, "da1");
            return (Criteria) this;
        }

        public Criteria andDa1GreaterThan(BigDecimal value) {
            addCriterion("da1 >", value, "da1");
            return (Criteria) this;
        }

        public Criteria andDa1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("da1 >=", value, "da1");
            return (Criteria) this;
        }

        public Criteria andDa1LessThan(BigDecimal value) {
            addCriterion("da1 <", value, "da1");
            return (Criteria) this;
        }

        public Criteria andDa1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("da1 <=", value, "da1");
            return (Criteria) this;
        }

        public Criteria andDa1In(List<BigDecimal> values) {
            addCriterion("da1 in", values, "da1");
            return (Criteria) this;
        }

        public Criteria andDa1NotIn(List<BigDecimal> values) {
            addCriterion("da1 not in", values, "da1");
            return (Criteria) this;
        }

        public Criteria andDa1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("da1 between", value1, value2, "da1");
            return (Criteria) this;
        }

        public Criteria andDa1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("da1 not between", value1, value2, "da1");
            return (Criteria) this;
        }

        public Criteria andDd1IsNull() {
            addCriterion("dd1 is null");
            return (Criteria) this;
        }

        public Criteria andDd1IsNotNull() {
            addCriterion("dd1 is not null");
            return (Criteria) this;
        }

        public Criteria andDd1EqualTo(BigDecimal value) {
            addCriterion("dd1 =", value, "dd1");
            return (Criteria) this;
        }

        public Criteria andDd1NotEqualTo(BigDecimal value) {
            addCriterion("dd1 <>", value, "dd1");
            return (Criteria) this;
        }

        public Criteria andDd1GreaterThan(BigDecimal value) {
            addCriterion("dd1 >", value, "dd1");
            return (Criteria) this;
        }

        public Criteria andDd1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("dd1 >=", value, "dd1");
            return (Criteria) this;
        }

        public Criteria andDd1LessThan(BigDecimal value) {
            addCriterion("dd1 <", value, "dd1");
            return (Criteria) this;
        }

        public Criteria andDd1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("dd1 <=", value, "dd1");
            return (Criteria) this;
        }

        public Criteria andDd1In(List<BigDecimal> values) {
            addCriterion("dd1 in", values, "dd1");
            return (Criteria) this;
        }

        public Criteria andDd1NotIn(List<BigDecimal> values) {
            addCriterion("dd1 not in", values, "dd1");
            return (Criteria) this;
        }

        public Criteria andDd1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("dd1 between", value1, value2, "dd1");
            return (Criteria) this;
        }

        public Criteria andDd1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("dd1 not between", value1, value2, "dd1");
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