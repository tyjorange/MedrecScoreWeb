package data.dao.pojo.exp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class MedrecExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedrecExample() {
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

        public Criteria andMrQuarterIsNull() {
            addCriterion("mr_quarter is null");
            return (Criteria) this;
        }

        public Criteria andMrQuarterIsNotNull() {
            addCriterion("mr_quarter is not null");
            return (Criteria) this;
        }

        public Criteria andMrQuarterEqualTo(Boolean value) {
            addCriterion("mr_quarter =", value, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andMrQuarterNotEqualTo(Boolean value) {
            addCriterion("mr_quarter <>", value, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andMrQuarterGreaterThan(Boolean value) {
            addCriterion("mr_quarter >", value, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andMrQuarterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("mr_quarter >=", value, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andMrQuarterLessThan(Boolean value) {
            addCriterion("mr_quarter <", value, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andMrQuarterLessThanOrEqualTo(Boolean value) {
            addCriterion("mr_quarter <=", value, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andMrQuarterIn(List<Boolean> values) {
            addCriterion("mr_quarter in", values, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andMrQuarterNotIn(List<Boolean> values) {
            addCriterion("mr_quarter not in", values, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andMrQuarterBetween(Boolean value1, Boolean value2) {
            addCriterion("mr_quarter between", value1, value2, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andMrQuarterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("mr_quarter not between", value1, value2, "mrQuarter");
            return (Criteria) this;
        }

        public Criteria andC3IsNull() {
            addCriterion("c3 is null");
            return (Criteria) this;
        }

        public Criteria andC3IsNotNull() {
            addCriterion("c3 is not null");
            return (Criteria) this;
        }

        public Criteria andC3EqualTo(String value) {
            addCriterion("c3 =", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotEqualTo(String value) {
            addCriterion("c3 <>", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3GreaterThan(String value) {
            addCriterion("c3 >", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3GreaterThanOrEqualTo(String value) {
            addCriterion("c3 >=", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3LessThan(String value) {
            addCriterion("c3 <", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3LessThanOrEqualTo(String value) {
            addCriterion("c3 <=", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3Like(String value) {
            addCriterion("c3 like", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotLike(String value) {
            addCriterion("c3 not like", value, "c3");
            return (Criteria) this;
        }

        public Criteria andC3In(List<String> values) {
            addCriterion("c3 in", values, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotIn(List<String> values) {
            addCriterion("c3 not in", values, "c3");
            return (Criteria) this;
        }

        public Criteria andC3Between(String value1, String value2) {
            addCriterion("c3 between", value1, value2, "c3");
            return (Criteria) this;
        }

        public Criteria andC3NotBetween(String value1, String value2) {
            addCriterion("c3 not between", value1, value2, "c3");
            return (Criteria) this;
        }

        public Criteria andC4IsNull() {
            addCriterion("c4 is null");
            return (Criteria) this;
        }

        public Criteria andC4IsNotNull() {
            addCriterion("c4 is not null");
            return (Criteria) this;
        }

        public Criteria andC4EqualTo(String value) {
            addCriterion("c4 =", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotEqualTo(String value) {
            addCriterion("c4 <>", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4GreaterThan(String value) {
            addCriterion("c4 >", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4GreaterThanOrEqualTo(String value) {
            addCriterion("c4 >=", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4LessThan(String value) {
            addCriterion("c4 <", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4LessThanOrEqualTo(String value) {
            addCriterion("c4 <=", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4Like(String value) {
            addCriterion("c4 like", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotLike(String value) {
            addCriterion("c4 not like", value, "c4");
            return (Criteria) this;
        }

        public Criteria andC4In(List<String> values) {
            addCriterion("c4 in", values, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotIn(List<String> values) {
            addCriterion("c4 not in", values, "c4");
            return (Criteria) this;
        }

        public Criteria andC4Between(String value1, String value2) {
            addCriterion("c4 between", value1, value2, "c4");
            return (Criteria) this;
        }

        public Criteria andC4NotBetween(String value1, String value2) {
            addCriterion("c4 not between", value1, value2, "c4");
            return (Criteria) this;
        }

        public Criteria andC5IsNull() {
            addCriterion("c5 is null");
            return (Criteria) this;
        }

        public Criteria andC5IsNotNull() {
            addCriterion("c5 is not null");
            return (Criteria) this;
        }

        public Criteria andC5EqualTo(Short value) {
            addCriterion("c5 =", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5NotEqualTo(Short value) {
            addCriterion("c5 <>", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5GreaterThan(Short value) {
            addCriterion("c5 >", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5GreaterThanOrEqualTo(Short value) {
            addCriterion("c5 >=", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5LessThan(Short value) {
            addCriterion("c5 <", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5LessThanOrEqualTo(Short value) {
            addCriterion("c5 <=", value, "c5");
            return (Criteria) this;
        }

        public Criteria andC5In(List<Short> values) {
            addCriterion("c5 in", values, "c5");
            return (Criteria) this;
        }

        public Criteria andC5NotIn(List<Short> values) {
            addCriterion("c5 not in", values, "c5");
            return (Criteria) this;
        }

        public Criteria andC5Between(Short value1, Short value2) {
            addCriterion("c5 between", value1, value2, "c5");
            return (Criteria) this;
        }

        public Criteria andC5NotBetween(Short value1, Short value2) {
            addCriterion("c5 not between", value1, value2, "c5");
            return (Criteria) this;
        }

        public Criteria andC6IsNull() {
            addCriterion("c6 is null");
            return (Criteria) this;
        }

        public Criteria andC6IsNotNull() {
            addCriterion("c6 is not null");
            return (Criteria) this;
        }

        public Criteria andC6EqualTo(String value) {
            addCriterion("c6 =", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6NotEqualTo(String value) {
            addCriterion("c6 <>", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6GreaterThan(String value) {
            addCriterion("c6 >", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6GreaterThanOrEqualTo(String value) {
            addCriterion("c6 >=", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6LessThan(String value) {
            addCriterion("c6 <", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6LessThanOrEqualTo(String value) {
            addCriterion("c6 <=", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6Like(String value) {
            addCriterion("c6 like", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6NotLike(String value) {
            addCriterion("c6 not like", value, "c6");
            return (Criteria) this;
        }

        public Criteria andC6In(List<String> values) {
            addCriterion("c6 in", values, "c6");
            return (Criteria) this;
        }

        public Criteria andC6NotIn(List<String> values) {
            addCriterion("c6 not in", values, "c6");
            return (Criteria) this;
        }

        public Criteria andC6Between(String value1, String value2) {
            addCriterion("c6 between", value1, value2, "c6");
            return (Criteria) this;
        }

        public Criteria andC6NotBetween(String value1, String value2) {
            addCriterion("c6 not between", value1, value2, "c6");
            return (Criteria) this;
        }

        public Criteria andC7IsNull() {
            addCriterion("c7 is null");
            return (Criteria) this;
        }

        public Criteria andC7IsNotNull() {
            addCriterion("c7 is not null");
            return (Criteria) this;
        }

        public Criteria andC7EqualTo(String value) {
            addCriterion("c7 =", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7NotEqualTo(String value) {
            addCriterion("c7 <>", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7GreaterThan(String value) {
            addCriterion("c7 >", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7GreaterThanOrEqualTo(String value) {
            addCriterion("c7 >=", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7LessThan(String value) {
            addCriterion("c7 <", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7LessThanOrEqualTo(String value) {
            addCriterion("c7 <=", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7Like(String value) {
            addCriterion("c7 like", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7NotLike(String value) {
            addCriterion("c7 not like", value, "c7");
            return (Criteria) this;
        }

        public Criteria andC7In(List<String> values) {
            addCriterion("c7 in", values, "c7");
            return (Criteria) this;
        }

        public Criteria andC7NotIn(List<String> values) {
            addCriterion("c7 not in", values, "c7");
            return (Criteria) this;
        }

        public Criteria andC7Between(String value1, String value2) {
            addCriterion("c7 between", value1, value2, "c7");
            return (Criteria) this;
        }

        public Criteria andC7NotBetween(String value1, String value2) {
            addCriterion("c7 not between", value1, value2, "c7");
            return (Criteria) this;
        }

        public Criteria andC8IsNull() {
            addCriterion("c8 is null");
            return (Criteria) this;
        }

        public Criteria andC8IsNotNull() {
            addCriterion("c8 is not null");
            return (Criteria) this;
        }

        public Criteria andC8EqualTo(String value) {
            addCriterion("c8 =", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8NotEqualTo(String value) {
            addCriterion("c8 <>", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8GreaterThan(String value) {
            addCriterion("c8 >", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8GreaterThanOrEqualTo(String value) {
            addCriterion("c8 >=", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8LessThan(String value) {
            addCriterion("c8 <", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8LessThanOrEqualTo(String value) {
            addCriterion("c8 <=", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8Like(String value) {
            addCriterion("c8 like", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8NotLike(String value) {
            addCriterion("c8 not like", value, "c8");
            return (Criteria) this;
        }

        public Criteria andC8In(List<String> values) {
            addCriterion("c8 in", values, "c8");
            return (Criteria) this;
        }

        public Criteria andC8NotIn(List<String> values) {
            addCriterion("c8 not in", values, "c8");
            return (Criteria) this;
        }

        public Criteria andC8Between(String value1, String value2) {
            addCriterion("c8 between", value1, value2, "c8");
            return (Criteria) this;
        }

        public Criteria andC8NotBetween(String value1, String value2) {
            addCriterion("c8 not between", value1, value2, "c8");
            return (Criteria) this;
        }

        public Criteria andC9IsNull() {
            addCriterion("c9 is null");
            return (Criteria) this;
        }

        public Criteria andC9IsNotNull() {
            addCriterion("c9 is not null");
            return (Criteria) this;
        }

        public Criteria andC9EqualTo(Date value) {
            addCriterionForJDBCDate("c9 =", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9NotEqualTo(Date value) {
            addCriterionForJDBCDate("c9 <>", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9GreaterThan(Date value) {
            addCriterionForJDBCDate("c9 >", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c9 >=", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9LessThan(Date value) {
            addCriterionForJDBCDate("c9 <", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c9 <=", value, "c9");
            return (Criteria) this;
        }

        public Criteria andC9In(List<Date> values) {
            addCriterionForJDBCDate("c9 in", values, "c9");
            return (Criteria) this;
        }

        public Criteria andC9NotIn(List<Date> values) {
            addCriterionForJDBCDate("c9 not in", values, "c9");
            return (Criteria) this;
        }

        public Criteria andC9Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c9 between", value1, value2, "c9");
            return (Criteria) this;
        }

        public Criteria andC9NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c9 not between", value1, value2, "c9");
            return (Criteria) this;
        }

        public Criteria andC10IsNull() {
            addCriterion("c10 is null");
            return (Criteria) this;
        }

        public Criteria andC10IsNotNull() {
            addCriterion("c10 is not null");
            return (Criteria) this;
        }

        public Criteria andC10EqualTo(BigDecimal value) {
            addCriterion("c10 =", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotEqualTo(BigDecimal value) {
            addCriterion("c10 <>", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10GreaterThan(BigDecimal value) {
            addCriterion("c10 >", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c10 >=", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10LessThan(BigDecimal value) {
            addCriterion("c10 <", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c10 <=", value, "c10");
            return (Criteria) this;
        }

        public Criteria andC10In(List<BigDecimal> values) {
            addCriterion("c10 in", values, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotIn(List<BigDecimal> values) {
            addCriterion("c10 not in", values, "c10");
            return (Criteria) this;
        }

        public Criteria andC10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c10 between", value1, value2, "c10");
            return (Criteria) this;
        }

        public Criteria andC10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c10 not between", value1, value2, "c10");
            return (Criteria) this;
        }

        public Criteria andC11IsNull() {
            addCriterion("c11 is null");
            return (Criteria) this;
        }

        public Criteria andC11IsNotNull() {
            addCriterion("c11 is not null");
            return (Criteria) this;
        }

        public Criteria andC11EqualTo(String value) {
            addCriterion("c11 =", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotEqualTo(String value) {
            addCriterion("c11 <>", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11GreaterThan(String value) {
            addCriterion("c11 >", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11GreaterThanOrEqualTo(String value) {
            addCriterion("c11 >=", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11LessThan(String value) {
            addCriterion("c11 <", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11LessThanOrEqualTo(String value) {
            addCriterion("c11 <=", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11Like(String value) {
            addCriterion("c11 like", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotLike(String value) {
            addCriterion("c11 not like", value, "c11");
            return (Criteria) this;
        }

        public Criteria andC11In(List<String> values) {
            addCriterion("c11 in", values, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotIn(List<String> values) {
            addCriterion("c11 not in", values, "c11");
            return (Criteria) this;
        }

        public Criteria andC11Between(String value1, String value2) {
            addCriterion("c11 between", value1, value2, "c11");
            return (Criteria) this;
        }

        public Criteria andC11NotBetween(String value1, String value2) {
            addCriterion("c11 not between", value1, value2, "c11");
            return (Criteria) this;
        }

        public Criteria andC12IsNull() {
            addCriterion("c12 is null");
            return (Criteria) this;
        }

        public Criteria andC12IsNotNull() {
            addCriterion("c12 is not null");
            return (Criteria) this;
        }

        public Criteria andC12EqualTo(BigDecimal value) {
            addCriterion("c12 =", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotEqualTo(BigDecimal value) {
            addCriterion("c12 <>", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12GreaterThan(BigDecimal value) {
            addCriterion("c12 >", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c12 >=", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12LessThan(BigDecimal value) {
            addCriterion("c12 <", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c12 <=", value, "c12");
            return (Criteria) this;
        }

        public Criteria andC12In(List<BigDecimal> values) {
            addCriterion("c12 in", values, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotIn(List<BigDecimal> values) {
            addCriterion("c12 not in", values, "c12");
            return (Criteria) this;
        }

        public Criteria andC12Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c12 between", value1, value2, "c12");
            return (Criteria) this;
        }

        public Criteria andC12NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c12 not between", value1, value2, "c12");
            return (Criteria) this;
        }

        public Criteria andC13IsNull() {
            addCriterion("c13 is null");
            return (Criteria) this;
        }

        public Criteria andC13IsNotNull() {
            addCriterion("c13 is not null");
            return (Criteria) this;
        }

        public Criteria andC13EqualTo(Integer value) {
            addCriterion("c13 =", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotEqualTo(Integer value) {
            addCriterion("c13 <>", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13GreaterThan(Integer value) {
            addCriterion("c13 >", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13GreaterThanOrEqualTo(Integer value) {
            addCriterion("c13 >=", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13LessThan(Integer value) {
            addCriterion("c13 <", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13LessThanOrEqualTo(Integer value) {
            addCriterion("c13 <=", value, "c13");
            return (Criteria) this;
        }

        public Criteria andC13In(List<Integer> values) {
            addCriterion("c13 in", values, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotIn(List<Integer> values) {
            addCriterion("c13 not in", values, "c13");
            return (Criteria) this;
        }

        public Criteria andC13Between(Integer value1, Integer value2) {
            addCriterion("c13 between", value1, value2, "c13");
            return (Criteria) this;
        }

        public Criteria andC13NotBetween(Integer value1, Integer value2) {
            addCriterion("c13 not between", value1, value2, "c13");
            return (Criteria) this;
        }

        public Criteria andC14IsNull() {
            addCriterion("c14 is null");
            return (Criteria) this;
        }

        public Criteria andC14IsNotNull() {
            addCriterion("c14 is not null");
            return (Criteria) this;
        }

        public Criteria andC14EqualTo(Integer value) {
            addCriterion("c14 =", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotEqualTo(Integer value) {
            addCriterion("c14 <>", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14GreaterThan(Integer value) {
            addCriterion("c14 >", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14GreaterThanOrEqualTo(Integer value) {
            addCriterion("c14 >=", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14LessThan(Integer value) {
            addCriterion("c14 <", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14LessThanOrEqualTo(Integer value) {
            addCriterion("c14 <=", value, "c14");
            return (Criteria) this;
        }

        public Criteria andC14In(List<Integer> values) {
            addCriterion("c14 in", values, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotIn(List<Integer> values) {
            addCriterion("c14 not in", values, "c14");
            return (Criteria) this;
        }

        public Criteria andC14Between(Integer value1, Integer value2) {
            addCriterion("c14 between", value1, value2, "c14");
            return (Criteria) this;
        }

        public Criteria andC14NotBetween(Integer value1, Integer value2) {
            addCriterion("c14 not between", value1, value2, "c14");
            return (Criteria) this;
        }

        public Criteria andC15IsNull() {
            addCriterion("c15 is null");
            return (Criteria) this;
        }

        public Criteria andC15IsNotNull() {
            addCriterion("c15 is not null");
            return (Criteria) this;
        }

        public Criteria andC15EqualTo(String value) {
            addCriterion("c15 =", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotEqualTo(String value) {
            addCriterion("c15 <>", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15GreaterThan(String value) {
            addCriterion("c15 >", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15GreaterThanOrEqualTo(String value) {
            addCriterion("c15 >=", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15LessThan(String value) {
            addCriterion("c15 <", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15LessThanOrEqualTo(String value) {
            addCriterion("c15 <=", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15Like(String value) {
            addCriterion("c15 like", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotLike(String value) {
            addCriterion("c15 not like", value, "c15");
            return (Criteria) this;
        }

        public Criteria andC15In(List<String> values) {
            addCriterion("c15 in", values, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotIn(List<String> values) {
            addCriterion("c15 not in", values, "c15");
            return (Criteria) this;
        }

        public Criteria andC15Between(String value1, String value2) {
            addCriterion("c15 between", value1, value2, "c15");
            return (Criteria) this;
        }

        public Criteria andC15NotBetween(String value1, String value2) {
            addCriterion("c15 not between", value1, value2, "c15");
            return (Criteria) this;
        }

        public Criteria andC16IsNull() {
            addCriterion("c16 is null");
            return (Criteria) this;
        }

        public Criteria andC16IsNotNull() {
            addCriterion("c16 is not null");
            return (Criteria) this;
        }

        public Criteria andC16EqualTo(String value) {
            addCriterion("c16 =", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotEqualTo(String value) {
            addCriterion("c16 <>", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16GreaterThan(String value) {
            addCriterion("c16 >", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16GreaterThanOrEqualTo(String value) {
            addCriterion("c16 >=", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16LessThan(String value) {
            addCriterion("c16 <", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16LessThanOrEqualTo(String value) {
            addCriterion("c16 <=", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16Like(String value) {
            addCriterion("c16 like", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotLike(String value) {
            addCriterion("c16 not like", value, "c16");
            return (Criteria) this;
        }

        public Criteria andC16In(List<String> values) {
            addCriterion("c16 in", values, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotIn(List<String> values) {
            addCriterion("c16 not in", values, "c16");
            return (Criteria) this;
        }

        public Criteria andC16Between(String value1, String value2) {
            addCriterion("c16 between", value1, value2, "c16");
            return (Criteria) this;
        }

        public Criteria andC16NotBetween(String value1, String value2) {
            addCriterion("c16 not between", value1, value2, "c16");
            return (Criteria) this;
        }

        public Criteria andC17IsNull() {
            addCriterion("c17 is null");
            return (Criteria) this;
        }

        public Criteria andC17IsNotNull() {
            addCriterion("c17 is not null");
            return (Criteria) this;
        }

        public Criteria andC17EqualTo(String value) {
            addCriterion("c17 =", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotEqualTo(String value) {
            addCriterion("c17 <>", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17GreaterThan(String value) {
            addCriterion("c17 >", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17GreaterThanOrEqualTo(String value) {
            addCriterion("c17 >=", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17LessThan(String value) {
            addCriterion("c17 <", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17LessThanOrEqualTo(String value) {
            addCriterion("c17 <=", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17Like(String value) {
            addCriterion("c17 like", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotLike(String value) {
            addCriterion("c17 not like", value, "c17");
            return (Criteria) this;
        }

        public Criteria andC17In(List<String> values) {
            addCriterion("c17 in", values, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotIn(List<String> values) {
            addCriterion("c17 not in", values, "c17");
            return (Criteria) this;
        }

        public Criteria andC17Between(String value1, String value2) {
            addCriterion("c17 between", value1, value2, "c17");
            return (Criteria) this;
        }

        public Criteria andC17NotBetween(String value1, String value2) {
            addCriterion("c17 not between", value1, value2, "c17");
            return (Criteria) this;
        }

        public Criteria andC18IsNull() {
            addCriterion("c18 is null");
            return (Criteria) this;
        }

        public Criteria andC18IsNotNull() {
            addCriterion("c18 is not null");
            return (Criteria) this;
        }

        public Criteria andC18EqualTo(String value) {
            addCriterion("c18 =", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotEqualTo(String value) {
            addCriterion("c18 <>", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18GreaterThan(String value) {
            addCriterion("c18 >", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18GreaterThanOrEqualTo(String value) {
            addCriterion("c18 >=", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18LessThan(String value) {
            addCriterion("c18 <", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18LessThanOrEqualTo(String value) {
            addCriterion("c18 <=", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18Like(String value) {
            addCriterion("c18 like", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotLike(String value) {
            addCriterion("c18 not like", value, "c18");
            return (Criteria) this;
        }

        public Criteria andC18In(List<String> values) {
            addCriterion("c18 in", values, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotIn(List<String> values) {
            addCriterion("c18 not in", values, "c18");
            return (Criteria) this;
        }

        public Criteria andC18Between(String value1, String value2) {
            addCriterion("c18 between", value1, value2, "c18");
            return (Criteria) this;
        }

        public Criteria andC18NotBetween(String value1, String value2) {
            addCriterion("c18 not between", value1, value2, "c18");
            return (Criteria) this;
        }

        public Criteria andC19IsNull() {
            addCriterion("c19 is null");
            return (Criteria) this;
        }

        public Criteria andC19IsNotNull() {
            addCriterion("c19 is not null");
            return (Criteria) this;
        }

        public Criteria andC19EqualTo(String value) {
            addCriterion("c19 =", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotEqualTo(String value) {
            addCriterion("c19 <>", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19GreaterThan(String value) {
            addCriterion("c19 >", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19GreaterThanOrEqualTo(String value) {
            addCriterion("c19 >=", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19LessThan(String value) {
            addCriterion("c19 <", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19LessThanOrEqualTo(String value) {
            addCriterion("c19 <=", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19Like(String value) {
            addCriterion("c19 like", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotLike(String value) {
            addCriterion("c19 not like", value, "c19");
            return (Criteria) this;
        }

        public Criteria andC19In(List<String> values) {
            addCriterion("c19 in", values, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotIn(List<String> values) {
            addCriterion("c19 not in", values, "c19");
            return (Criteria) this;
        }

        public Criteria andC19Between(String value1, String value2) {
            addCriterion("c19 between", value1, value2, "c19");
            return (Criteria) this;
        }

        public Criteria andC19NotBetween(String value1, String value2) {
            addCriterion("c19 not between", value1, value2, "c19");
            return (Criteria) this;
        }

        public Criteria andC20IsNull() {
            addCriterion("c20 is null");
            return (Criteria) this;
        }

        public Criteria andC20IsNotNull() {
            addCriterion("c20 is not null");
            return (Criteria) this;
        }

        public Criteria andC20EqualTo(String value) {
            addCriterion("c20 =", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotEqualTo(String value) {
            addCriterion("c20 <>", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20GreaterThan(String value) {
            addCriterion("c20 >", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20GreaterThanOrEqualTo(String value) {
            addCriterion("c20 >=", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20LessThan(String value) {
            addCriterion("c20 <", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20LessThanOrEqualTo(String value) {
            addCriterion("c20 <=", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20Like(String value) {
            addCriterion("c20 like", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotLike(String value) {
            addCriterion("c20 not like", value, "c20");
            return (Criteria) this;
        }

        public Criteria andC20In(List<String> values) {
            addCriterion("c20 in", values, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotIn(List<String> values) {
            addCriterion("c20 not in", values, "c20");
            return (Criteria) this;
        }

        public Criteria andC20Between(String value1, String value2) {
            addCriterion("c20 between", value1, value2, "c20");
            return (Criteria) this;
        }

        public Criteria andC20NotBetween(String value1, String value2) {
            addCriterion("c20 not between", value1, value2, "c20");
            return (Criteria) this;
        }

        public Criteria andC21IsNull() {
            addCriterion("c21 is null");
            return (Criteria) this;
        }

        public Criteria andC21IsNotNull() {
            addCriterion("c21 is not null");
            return (Criteria) this;
        }

        public Criteria andC21EqualTo(String value) {
            addCriterion("c21 =", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotEqualTo(String value) {
            addCriterion("c21 <>", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21GreaterThan(String value) {
            addCriterion("c21 >", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21GreaterThanOrEqualTo(String value) {
            addCriterion("c21 >=", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21LessThan(String value) {
            addCriterion("c21 <", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21LessThanOrEqualTo(String value) {
            addCriterion("c21 <=", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21Like(String value) {
            addCriterion("c21 like", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotLike(String value) {
            addCriterion("c21 not like", value, "c21");
            return (Criteria) this;
        }

        public Criteria andC21In(List<String> values) {
            addCriterion("c21 in", values, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotIn(List<String> values) {
            addCriterion("c21 not in", values, "c21");
            return (Criteria) this;
        }

        public Criteria andC21Between(String value1, String value2) {
            addCriterion("c21 between", value1, value2, "c21");
            return (Criteria) this;
        }

        public Criteria andC21NotBetween(String value1, String value2) {
            addCriterion("c21 not between", value1, value2, "c21");
            return (Criteria) this;
        }

        public Criteria andC22IsNull() {
            addCriterion("c22 is null");
            return (Criteria) this;
        }

        public Criteria andC22IsNotNull() {
            addCriterion("c22 is not null");
            return (Criteria) this;
        }

        public Criteria andC22EqualTo(String value) {
            addCriterion("c22 =", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotEqualTo(String value) {
            addCriterion("c22 <>", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22GreaterThan(String value) {
            addCriterion("c22 >", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22GreaterThanOrEqualTo(String value) {
            addCriterion("c22 >=", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22LessThan(String value) {
            addCriterion("c22 <", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22LessThanOrEqualTo(String value) {
            addCriterion("c22 <=", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22Like(String value) {
            addCriterion("c22 like", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotLike(String value) {
            addCriterion("c22 not like", value, "c22");
            return (Criteria) this;
        }

        public Criteria andC22In(List<String> values) {
            addCriterion("c22 in", values, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotIn(List<String> values) {
            addCriterion("c22 not in", values, "c22");
            return (Criteria) this;
        }

        public Criteria andC22Between(String value1, String value2) {
            addCriterion("c22 between", value1, value2, "c22");
            return (Criteria) this;
        }

        public Criteria andC22NotBetween(String value1, String value2) {
            addCriterion("c22 not between", value1, value2, "c22");
            return (Criteria) this;
        }

        public Criteria andC23IsNull() {
            addCriterion("c23 is null");
            return (Criteria) this;
        }

        public Criteria andC23IsNotNull() {
            addCriterion("c23 is not null");
            return (Criteria) this;
        }

        public Criteria andC23EqualTo(String value) {
            addCriterion("c23 =", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotEqualTo(String value) {
            addCriterion("c23 <>", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23GreaterThan(String value) {
            addCriterion("c23 >", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23GreaterThanOrEqualTo(String value) {
            addCriterion("c23 >=", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23LessThan(String value) {
            addCriterion("c23 <", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23LessThanOrEqualTo(String value) {
            addCriterion("c23 <=", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23Like(String value) {
            addCriterion("c23 like", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotLike(String value) {
            addCriterion("c23 not like", value, "c23");
            return (Criteria) this;
        }

        public Criteria andC23In(List<String> values) {
            addCriterion("c23 in", values, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotIn(List<String> values) {
            addCriterion("c23 not in", values, "c23");
            return (Criteria) this;
        }

        public Criteria andC23Between(String value1, String value2) {
            addCriterion("c23 between", value1, value2, "c23");
            return (Criteria) this;
        }

        public Criteria andC23NotBetween(String value1, String value2) {
            addCriterion("c23 not between", value1, value2, "c23");
            return (Criteria) this;
        }

        public Criteria andC24IsNull() {
            addCriterion("c24 is null");
            return (Criteria) this;
        }

        public Criteria andC24IsNotNull() {
            addCriterion("c24 is not null");
            return (Criteria) this;
        }

        public Criteria andC24EqualTo(String value) {
            addCriterion("c24 =", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotEqualTo(String value) {
            addCriterion("c24 <>", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24GreaterThan(String value) {
            addCriterion("c24 >", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24GreaterThanOrEqualTo(String value) {
            addCriterion("c24 >=", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24LessThan(String value) {
            addCriterion("c24 <", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24LessThanOrEqualTo(String value) {
            addCriterion("c24 <=", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24Like(String value) {
            addCriterion("c24 like", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotLike(String value) {
            addCriterion("c24 not like", value, "c24");
            return (Criteria) this;
        }

        public Criteria andC24In(List<String> values) {
            addCriterion("c24 in", values, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotIn(List<String> values) {
            addCriterion("c24 not in", values, "c24");
            return (Criteria) this;
        }

        public Criteria andC24Between(String value1, String value2) {
            addCriterion("c24 between", value1, value2, "c24");
            return (Criteria) this;
        }

        public Criteria andC24NotBetween(String value1, String value2) {
            addCriterion("c24 not between", value1, value2, "c24");
            return (Criteria) this;
        }

        public Criteria andC25IsNull() {
            addCriterion("c25 is null");
            return (Criteria) this;
        }

        public Criteria andC25IsNotNull() {
            addCriterion("c25 is not null");
            return (Criteria) this;
        }

        public Criteria andC25EqualTo(String value) {
            addCriterion("c25 =", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotEqualTo(String value) {
            addCriterion("c25 <>", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25GreaterThan(String value) {
            addCriterion("c25 >", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25GreaterThanOrEqualTo(String value) {
            addCriterion("c25 >=", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25LessThan(String value) {
            addCriterion("c25 <", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25LessThanOrEqualTo(String value) {
            addCriterion("c25 <=", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25Like(String value) {
            addCriterion("c25 like", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotLike(String value) {
            addCriterion("c25 not like", value, "c25");
            return (Criteria) this;
        }

        public Criteria andC25In(List<String> values) {
            addCriterion("c25 in", values, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotIn(List<String> values) {
            addCriterion("c25 not in", values, "c25");
            return (Criteria) this;
        }

        public Criteria andC25Between(String value1, String value2) {
            addCriterion("c25 between", value1, value2, "c25");
            return (Criteria) this;
        }

        public Criteria andC25NotBetween(String value1, String value2) {
            addCriterion("c25 not between", value1, value2, "c25");
            return (Criteria) this;
        }

        public Criteria andC26IsNull() {
            addCriterion("c26 is null");
            return (Criteria) this;
        }

        public Criteria andC26IsNotNull() {
            addCriterion("c26 is not null");
            return (Criteria) this;
        }

        public Criteria andC26EqualTo(String value) {
            addCriterion("c26 =", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotEqualTo(String value) {
            addCriterion("c26 <>", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26GreaterThan(String value) {
            addCriterion("c26 >", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26GreaterThanOrEqualTo(String value) {
            addCriterion("c26 >=", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26LessThan(String value) {
            addCriterion("c26 <", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26LessThanOrEqualTo(String value) {
            addCriterion("c26 <=", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26Like(String value) {
            addCriterion("c26 like", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotLike(String value) {
            addCriterion("c26 not like", value, "c26");
            return (Criteria) this;
        }

        public Criteria andC26In(List<String> values) {
            addCriterion("c26 in", values, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotIn(List<String> values) {
            addCriterion("c26 not in", values, "c26");
            return (Criteria) this;
        }

        public Criteria andC26Between(String value1, String value2) {
            addCriterion("c26 between", value1, value2, "c26");
            return (Criteria) this;
        }

        public Criteria andC26NotBetween(String value1, String value2) {
            addCriterion("c26 not between", value1, value2, "c26");
            return (Criteria) this;
        }

        public Criteria andC27IsNull() {
            addCriterion("c27 is null");
            return (Criteria) this;
        }

        public Criteria andC27IsNotNull() {
            addCriterion("c27 is not null");
            return (Criteria) this;
        }

        public Criteria andC27EqualTo(String value) {
            addCriterion("c27 =", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotEqualTo(String value) {
            addCriterion("c27 <>", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27GreaterThan(String value) {
            addCriterion("c27 >", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27GreaterThanOrEqualTo(String value) {
            addCriterion("c27 >=", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27LessThan(String value) {
            addCriterion("c27 <", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27LessThanOrEqualTo(String value) {
            addCriterion("c27 <=", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27Like(String value) {
            addCriterion("c27 like", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotLike(String value) {
            addCriterion("c27 not like", value, "c27");
            return (Criteria) this;
        }

        public Criteria andC27In(List<String> values) {
            addCriterion("c27 in", values, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotIn(List<String> values) {
            addCriterion("c27 not in", values, "c27");
            return (Criteria) this;
        }

        public Criteria andC27Between(String value1, String value2) {
            addCriterion("c27 between", value1, value2, "c27");
            return (Criteria) this;
        }

        public Criteria andC27NotBetween(String value1, String value2) {
            addCriterion("c27 not between", value1, value2, "c27");
            return (Criteria) this;
        }

        public Criteria andC28IsNull() {
            addCriterion("c28 is null");
            return (Criteria) this;
        }

        public Criteria andC28IsNotNull() {
            addCriterion("c28 is not null");
            return (Criteria) this;
        }

        public Criteria andC28EqualTo(String value) {
            addCriterion("c28 =", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotEqualTo(String value) {
            addCriterion("c28 <>", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28GreaterThan(String value) {
            addCriterion("c28 >", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28GreaterThanOrEqualTo(String value) {
            addCriterion("c28 >=", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28LessThan(String value) {
            addCriterion("c28 <", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28LessThanOrEqualTo(String value) {
            addCriterion("c28 <=", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28Like(String value) {
            addCriterion("c28 like", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotLike(String value) {
            addCriterion("c28 not like", value, "c28");
            return (Criteria) this;
        }

        public Criteria andC28In(List<String> values) {
            addCriterion("c28 in", values, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotIn(List<String> values) {
            addCriterion("c28 not in", values, "c28");
            return (Criteria) this;
        }

        public Criteria andC28Between(String value1, String value2) {
            addCriterion("c28 between", value1, value2, "c28");
            return (Criteria) this;
        }

        public Criteria andC28NotBetween(String value1, String value2) {
            addCriterion("c28 not between", value1, value2, "c28");
            return (Criteria) this;
        }

        public Criteria andC29IsNull() {
            addCriterion("c29 is null");
            return (Criteria) this;
        }

        public Criteria andC29IsNotNull() {
            addCriterion("c29 is not null");
            return (Criteria) this;
        }

        public Criteria andC29EqualTo(String value) {
            addCriterion("c29 =", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotEqualTo(String value) {
            addCriterion("c29 <>", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29GreaterThan(String value) {
            addCriterion("c29 >", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29GreaterThanOrEqualTo(String value) {
            addCriterion("c29 >=", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29LessThan(String value) {
            addCriterion("c29 <", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29LessThanOrEqualTo(String value) {
            addCriterion("c29 <=", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29Like(String value) {
            addCriterion("c29 like", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotLike(String value) {
            addCriterion("c29 not like", value, "c29");
            return (Criteria) this;
        }

        public Criteria andC29In(List<String> values) {
            addCriterion("c29 in", values, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotIn(List<String> values) {
            addCriterion("c29 not in", values, "c29");
            return (Criteria) this;
        }

        public Criteria andC29Between(String value1, String value2) {
            addCriterion("c29 between", value1, value2, "c29");
            return (Criteria) this;
        }

        public Criteria andC29NotBetween(String value1, String value2) {
            addCriterion("c29 not between", value1, value2, "c29");
            return (Criteria) this;
        }

        public Criteria andC30IsNull() {
            addCriterion("c30 is null");
            return (Criteria) this;
        }

        public Criteria andC30IsNotNull() {
            addCriterion("c30 is not null");
            return (Criteria) this;
        }

        public Criteria andC30EqualTo(String value) {
            addCriterion("c30 =", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotEqualTo(String value) {
            addCriterion("c30 <>", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30GreaterThan(String value) {
            addCriterion("c30 >", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30GreaterThanOrEqualTo(String value) {
            addCriterion("c30 >=", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30LessThan(String value) {
            addCriterion("c30 <", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30LessThanOrEqualTo(String value) {
            addCriterion("c30 <=", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30Like(String value) {
            addCriterion("c30 like", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotLike(String value) {
            addCriterion("c30 not like", value, "c30");
            return (Criteria) this;
        }

        public Criteria andC30In(List<String> values) {
            addCriterion("c30 in", values, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotIn(List<String> values) {
            addCriterion("c30 not in", values, "c30");
            return (Criteria) this;
        }

        public Criteria andC30Between(String value1, String value2) {
            addCriterion("c30 between", value1, value2, "c30");
            return (Criteria) this;
        }

        public Criteria andC30NotBetween(String value1, String value2) {
            addCriterion("c30 not between", value1, value2, "c30");
            return (Criteria) this;
        }

        public Criteria andC31IsNull() {
            addCriterion("c31 is null");
            return (Criteria) this;
        }

        public Criteria andC31IsNotNull() {
            addCriterion("c31 is not null");
            return (Criteria) this;
        }

        public Criteria andC31EqualTo(String value) {
            addCriterion("c31 =", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotEqualTo(String value) {
            addCriterion("c31 <>", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31GreaterThan(String value) {
            addCriterion("c31 >", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31GreaterThanOrEqualTo(String value) {
            addCriterion("c31 >=", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31LessThan(String value) {
            addCriterion("c31 <", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31LessThanOrEqualTo(String value) {
            addCriterion("c31 <=", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31Like(String value) {
            addCriterion("c31 like", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotLike(String value) {
            addCriterion("c31 not like", value, "c31");
            return (Criteria) this;
        }

        public Criteria andC31In(List<String> values) {
            addCriterion("c31 in", values, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotIn(List<String> values) {
            addCriterion("c31 not in", values, "c31");
            return (Criteria) this;
        }

        public Criteria andC31Between(String value1, String value2) {
            addCriterion("c31 between", value1, value2, "c31");
            return (Criteria) this;
        }

        public Criteria andC31NotBetween(String value1, String value2) {
            addCriterion("c31 not between", value1, value2, "c31");
            return (Criteria) this;
        }

        public Criteria andC32IsNull() {
            addCriterion("c32 is null");
            return (Criteria) this;
        }

        public Criteria andC32IsNotNull() {
            addCriterion("c32 is not null");
            return (Criteria) this;
        }

        public Criteria andC32EqualTo(String value) {
            addCriterion("c32 =", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32NotEqualTo(String value) {
            addCriterion("c32 <>", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32GreaterThan(String value) {
            addCriterion("c32 >", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32GreaterThanOrEqualTo(String value) {
            addCriterion("c32 >=", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32LessThan(String value) {
            addCriterion("c32 <", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32LessThanOrEqualTo(String value) {
            addCriterion("c32 <=", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32Like(String value) {
            addCriterion("c32 like", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32NotLike(String value) {
            addCriterion("c32 not like", value, "c32");
            return (Criteria) this;
        }

        public Criteria andC32In(List<String> values) {
            addCriterion("c32 in", values, "c32");
            return (Criteria) this;
        }

        public Criteria andC32NotIn(List<String> values) {
            addCriterion("c32 not in", values, "c32");
            return (Criteria) this;
        }

        public Criteria andC32Between(String value1, String value2) {
            addCriterion("c32 between", value1, value2, "c32");
            return (Criteria) this;
        }

        public Criteria andC32NotBetween(String value1, String value2) {
            addCriterion("c32 not between", value1, value2, "c32");
            return (Criteria) this;
        }

        public Criteria andC33IsNull() {
            addCriterion("c33 is null");
            return (Criteria) this;
        }

        public Criteria andC33IsNotNull() {
            addCriterion("c33 is not null");
            return (Criteria) this;
        }

        public Criteria andC33EqualTo(String value) {
            addCriterion("c33 =", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33NotEqualTo(String value) {
            addCriterion("c33 <>", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33GreaterThan(String value) {
            addCriterion("c33 >", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33GreaterThanOrEqualTo(String value) {
            addCriterion("c33 >=", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33LessThan(String value) {
            addCriterion("c33 <", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33LessThanOrEqualTo(String value) {
            addCriterion("c33 <=", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33Like(String value) {
            addCriterion("c33 like", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33NotLike(String value) {
            addCriterion("c33 not like", value, "c33");
            return (Criteria) this;
        }

        public Criteria andC33In(List<String> values) {
            addCriterion("c33 in", values, "c33");
            return (Criteria) this;
        }

        public Criteria andC33NotIn(List<String> values) {
            addCriterion("c33 not in", values, "c33");
            return (Criteria) this;
        }

        public Criteria andC33Between(String value1, String value2) {
            addCriterion("c33 between", value1, value2, "c33");
            return (Criteria) this;
        }

        public Criteria andC33NotBetween(String value1, String value2) {
            addCriterion("c33 not between", value1, value2, "c33");
            return (Criteria) this;
        }

        public Criteria andC34IsNull() {
            addCriterion("c34 is null");
            return (Criteria) this;
        }

        public Criteria andC34IsNotNull() {
            addCriterion("c34 is not null");
            return (Criteria) this;
        }

        public Criteria andC34EqualTo(Date value) {
            addCriterionForJDBCDate("c34 =", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34NotEqualTo(Date value) {
            addCriterionForJDBCDate("c34 <>", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34GreaterThan(Date value) {
            addCriterionForJDBCDate("c34 >", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c34 >=", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34LessThan(Date value) {
            addCriterionForJDBCDate("c34 <", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c34 <=", value, "c34");
            return (Criteria) this;
        }

        public Criteria andC34In(List<Date> values) {
            addCriterionForJDBCDate("c34 in", values, "c34");
            return (Criteria) this;
        }

        public Criteria andC34NotIn(List<Date> values) {
            addCriterionForJDBCDate("c34 not in", values, "c34");
            return (Criteria) this;
        }

        public Criteria andC34Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c34 between", value1, value2, "c34");
            return (Criteria) this;
        }

        public Criteria andC34NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c34 not between", value1, value2, "c34");
            return (Criteria) this;
        }

        public Criteria andC35IsNull() {
            addCriterion("c35 is null");
            return (Criteria) this;
        }

        public Criteria andC35IsNotNull() {
            addCriterion("c35 is not null");
            return (Criteria) this;
        }

        public Criteria andC35EqualTo(Byte value) {
            addCriterion("c35 =", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35NotEqualTo(Byte value) {
            addCriterion("c35 <>", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35GreaterThan(Byte value) {
            addCriterion("c35 >", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35GreaterThanOrEqualTo(Byte value) {
            addCriterion("c35 >=", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35LessThan(Byte value) {
            addCriterion("c35 <", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35LessThanOrEqualTo(Byte value) {
            addCriterion("c35 <=", value, "c35");
            return (Criteria) this;
        }

        public Criteria andC35In(List<Byte> values) {
            addCriterion("c35 in", values, "c35");
            return (Criteria) this;
        }

        public Criteria andC35NotIn(List<Byte> values) {
            addCriterion("c35 not in", values, "c35");
            return (Criteria) this;
        }

        public Criteria andC35Between(Byte value1, Byte value2) {
            addCriterion("c35 between", value1, value2, "c35");
            return (Criteria) this;
        }

        public Criteria andC35NotBetween(Byte value1, Byte value2) {
            addCriterion("c35 not between", value1, value2, "c35");
            return (Criteria) this;
        }

        public Criteria andC36IsNull() {
            addCriterion("c36 is null");
            return (Criteria) this;
        }

        public Criteria andC36IsNotNull() {
            addCriterion("c36 is not null");
            return (Criteria) this;
        }

        public Criteria andC36EqualTo(Byte value) {
            addCriterion("c36 =", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36NotEqualTo(Byte value) {
            addCriterion("c36 <>", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36GreaterThan(Byte value) {
            addCriterion("c36 >", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36GreaterThanOrEqualTo(Byte value) {
            addCriterion("c36 >=", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36LessThan(Byte value) {
            addCriterion("c36 <", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36LessThanOrEqualTo(Byte value) {
            addCriterion("c36 <=", value, "c36");
            return (Criteria) this;
        }

        public Criteria andC36In(List<Byte> values) {
            addCriterion("c36 in", values, "c36");
            return (Criteria) this;
        }

        public Criteria andC36NotIn(List<Byte> values) {
            addCriterion("c36 not in", values, "c36");
            return (Criteria) this;
        }

        public Criteria andC36Between(Byte value1, Byte value2) {
            addCriterion("c36 between", value1, value2, "c36");
            return (Criteria) this;
        }

        public Criteria andC36NotBetween(Byte value1, Byte value2) {
            addCriterion("c36 not between", value1, value2, "c36");
            return (Criteria) this;
        }

        public Criteria andC37IsNull() {
            addCriterion("c37 is null");
            return (Criteria) this;
        }

        public Criteria andC37IsNotNull() {
            addCriterion("c37 is not null");
            return (Criteria) this;
        }

        public Criteria andC37EqualTo(String value) {
            addCriterion("c37 =", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37NotEqualTo(String value) {
            addCriterion("c37 <>", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37GreaterThan(String value) {
            addCriterion("c37 >", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37GreaterThanOrEqualTo(String value) {
            addCriterion("c37 >=", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37LessThan(String value) {
            addCriterion("c37 <", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37LessThanOrEqualTo(String value) {
            addCriterion("c37 <=", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37Like(String value) {
            addCriterion("c37 like", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37NotLike(String value) {
            addCriterion("c37 not like", value, "c37");
            return (Criteria) this;
        }

        public Criteria andC37In(List<String> values) {
            addCriterion("c37 in", values, "c37");
            return (Criteria) this;
        }

        public Criteria andC37NotIn(List<String> values) {
            addCriterion("c37 not in", values, "c37");
            return (Criteria) this;
        }

        public Criteria andC37Between(String value1, String value2) {
            addCriterion("c37 between", value1, value2, "c37");
            return (Criteria) this;
        }

        public Criteria andC37NotBetween(String value1, String value2) {
            addCriterion("c37 not between", value1, value2, "c37");
            return (Criteria) this;
        }

        public Criteria andC38IsNull() {
            addCriterion("c38 is null");
            return (Criteria) this;
        }

        public Criteria andC38IsNotNull() {
            addCriterion("c38 is not null");
            return (Criteria) this;
        }

        public Criteria andC38EqualTo(String value) {
            addCriterion("c38 =", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38NotEqualTo(String value) {
            addCriterion("c38 <>", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38GreaterThan(String value) {
            addCriterion("c38 >", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38GreaterThanOrEqualTo(String value) {
            addCriterion("c38 >=", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38LessThan(String value) {
            addCriterion("c38 <", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38LessThanOrEqualTo(String value) {
            addCriterion("c38 <=", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38Like(String value) {
            addCriterion("c38 like", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38NotLike(String value) {
            addCriterion("c38 not like", value, "c38");
            return (Criteria) this;
        }

        public Criteria andC38In(List<String> values) {
            addCriterion("c38 in", values, "c38");
            return (Criteria) this;
        }

        public Criteria andC38NotIn(List<String> values) {
            addCriterion("c38 not in", values, "c38");
            return (Criteria) this;
        }

        public Criteria andC38Between(String value1, String value2) {
            addCriterion("c38 between", value1, value2, "c38");
            return (Criteria) this;
        }

        public Criteria andC38NotBetween(String value1, String value2) {
            addCriterion("c38 not between", value1, value2, "c38");
            return (Criteria) this;
        }

        public Criteria andC39IsNull() {
            addCriterion("c39 is null");
            return (Criteria) this;
        }

        public Criteria andC39IsNotNull() {
            addCriterion("c39 is not null");
            return (Criteria) this;
        }

        public Criteria andC39EqualTo(Date value) {
            addCriterionForJDBCDate("c39 =", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39NotEqualTo(Date value) {
            addCriterionForJDBCDate("c39 <>", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39GreaterThan(Date value) {
            addCriterionForJDBCDate("c39 >", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c39 >=", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39LessThan(Date value) {
            addCriterionForJDBCDate("c39 <", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c39 <=", value, "c39");
            return (Criteria) this;
        }

        public Criteria andC39In(List<Date> values) {
            addCriterionForJDBCDate("c39 in", values, "c39");
            return (Criteria) this;
        }

        public Criteria andC39NotIn(List<Date> values) {
            addCriterionForJDBCDate("c39 not in", values, "c39");
            return (Criteria) this;
        }

        public Criteria andC39Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c39 between", value1, value2, "c39");
            return (Criteria) this;
        }

        public Criteria andC39NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c39 not between", value1, value2, "c39");
            return (Criteria) this;
        }

        public Criteria andC40IsNull() {
            addCriterion("c40 is null");
            return (Criteria) this;
        }

        public Criteria andC40IsNotNull() {
            addCriterion("c40 is not null");
            return (Criteria) this;
        }

        public Criteria andC40EqualTo(Byte value) {
            addCriterion("c40 =", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40NotEqualTo(Byte value) {
            addCriterion("c40 <>", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40GreaterThan(Byte value) {
            addCriterion("c40 >", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40GreaterThanOrEqualTo(Byte value) {
            addCriterion("c40 >=", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40LessThan(Byte value) {
            addCriterion("c40 <", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40LessThanOrEqualTo(Byte value) {
            addCriterion("c40 <=", value, "c40");
            return (Criteria) this;
        }

        public Criteria andC40In(List<Byte> values) {
            addCriterion("c40 in", values, "c40");
            return (Criteria) this;
        }

        public Criteria andC40NotIn(List<Byte> values) {
            addCriterion("c40 not in", values, "c40");
            return (Criteria) this;
        }

        public Criteria andC40Between(Byte value1, Byte value2) {
            addCriterion("c40 between", value1, value2, "c40");
            return (Criteria) this;
        }

        public Criteria andC40NotBetween(Byte value1, Byte value2) {
            addCriterion("c40 not between", value1, value2, "c40");
            return (Criteria) this;
        }

        public Criteria andC41IsNull() {
            addCriterion("c41 is null");
            return (Criteria) this;
        }

        public Criteria andC41IsNotNull() {
            addCriterion("c41 is not null");
            return (Criteria) this;
        }

        public Criteria andC41EqualTo(Byte value) {
            addCriterion("c41 =", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41NotEqualTo(Byte value) {
            addCriterion("c41 <>", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41GreaterThan(Byte value) {
            addCriterion("c41 >", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41GreaterThanOrEqualTo(Byte value) {
            addCriterion("c41 >=", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41LessThan(Byte value) {
            addCriterion("c41 <", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41LessThanOrEqualTo(Byte value) {
            addCriterion("c41 <=", value, "c41");
            return (Criteria) this;
        }

        public Criteria andC41In(List<Byte> values) {
            addCriterion("c41 in", values, "c41");
            return (Criteria) this;
        }

        public Criteria andC41NotIn(List<Byte> values) {
            addCriterion("c41 not in", values, "c41");
            return (Criteria) this;
        }

        public Criteria andC41Between(Byte value1, Byte value2) {
            addCriterion("c41 between", value1, value2, "c41");
            return (Criteria) this;
        }

        public Criteria andC41NotBetween(Byte value1, Byte value2) {
            addCriterion("c41 not between", value1, value2, "c41");
            return (Criteria) this;
        }

        public Criteria andC42IsNull() {
            addCriterion("c42 is null");
            return (Criteria) this;
        }

        public Criteria andC42IsNotNull() {
            addCriterion("c42 is not null");
            return (Criteria) this;
        }

        public Criteria andC42EqualTo(String value) {
            addCriterion("c42 =", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42NotEqualTo(String value) {
            addCriterion("c42 <>", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42GreaterThan(String value) {
            addCriterion("c42 >", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42GreaterThanOrEqualTo(String value) {
            addCriterion("c42 >=", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42LessThan(String value) {
            addCriterion("c42 <", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42LessThanOrEqualTo(String value) {
            addCriterion("c42 <=", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42Like(String value) {
            addCriterion("c42 like", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42NotLike(String value) {
            addCriterion("c42 not like", value, "c42");
            return (Criteria) this;
        }

        public Criteria andC42In(List<String> values) {
            addCriterion("c42 in", values, "c42");
            return (Criteria) this;
        }

        public Criteria andC42NotIn(List<String> values) {
            addCriterion("c42 not in", values, "c42");
            return (Criteria) this;
        }

        public Criteria andC42Between(String value1, String value2) {
            addCriterion("c42 between", value1, value2, "c42");
            return (Criteria) this;
        }

        public Criteria andC42NotBetween(String value1, String value2) {
            addCriterion("c42 not between", value1, value2, "c42");
            return (Criteria) this;
        }

        public Criteria andC43IsNull() {
            addCriterion("c43 is null");
            return (Criteria) this;
        }

        public Criteria andC43IsNotNull() {
            addCriterion("c43 is not null");
            return (Criteria) this;
        }

        public Criteria andC43EqualTo(Short value) {
            addCriterion("c43 =", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43NotEqualTo(Short value) {
            addCriterion("c43 <>", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43GreaterThan(Short value) {
            addCriterion("c43 >", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43GreaterThanOrEqualTo(Short value) {
            addCriterion("c43 >=", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43LessThan(Short value) {
            addCriterion("c43 <", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43LessThanOrEqualTo(Short value) {
            addCriterion("c43 <=", value, "c43");
            return (Criteria) this;
        }

        public Criteria andC43In(List<Short> values) {
            addCriterion("c43 in", values, "c43");
            return (Criteria) this;
        }

        public Criteria andC43NotIn(List<Short> values) {
            addCriterion("c43 not in", values, "c43");
            return (Criteria) this;
        }

        public Criteria andC43Between(Short value1, Short value2) {
            addCriterion("c43 between", value1, value2, "c43");
            return (Criteria) this;
        }

        public Criteria andC43NotBetween(Short value1, Short value2) {
            addCriterion("c43 not between", value1, value2, "c43");
            return (Criteria) this;
        }

        public Criteria andC44IsNull() {
            addCriterion("c44 is null");
            return (Criteria) this;
        }

        public Criteria andC44IsNotNull() {
            addCriterion("c44 is not null");
            return (Criteria) this;
        }

        public Criteria andC44EqualTo(String value) {
            addCriterion("c44 =", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44NotEqualTo(String value) {
            addCriterion("c44 <>", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44GreaterThan(String value) {
            addCriterion("c44 >", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44GreaterThanOrEqualTo(String value) {
            addCriterion("c44 >=", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44LessThan(String value) {
            addCriterion("c44 <", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44LessThanOrEqualTo(String value) {
            addCriterion("c44 <=", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44Like(String value) {
            addCriterion("c44 like", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44NotLike(String value) {
            addCriterion("c44 not like", value, "c44");
            return (Criteria) this;
        }

        public Criteria andC44In(List<String> values) {
            addCriterion("c44 in", values, "c44");
            return (Criteria) this;
        }

        public Criteria andC44NotIn(List<String> values) {
            addCriterion("c44 not in", values, "c44");
            return (Criteria) this;
        }

        public Criteria andC44Between(String value1, String value2) {
            addCriterion("c44 between", value1, value2, "c44");
            return (Criteria) this;
        }

        public Criteria andC44NotBetween(String value1, String value2) {
            addCriterion("c44 not between", value1, value2, "c44");
            return (Criteria) this;
        }

        public Criteria andC45IsNull() {
            addCriterion("c45 is null");
            return (Criteria) this;
        }

        public Criteria andC45IsNotNull() {
            addCriterion("c45 is not null");
            return (Criteria) this;
        }

        public Criteria andC45EqualTo(String value) {
            addCriterion("c45 =", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45NotEqualTo(String value) {
            addCriterion("c45 <>", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45GreaterThan(String value) {
            addCriterion("c45 >", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45GreaterThanOrEqualTo(String value) {
            addCriterion("c45 >=", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45LessThan(String value) {
            addCriterion("c45 <", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45LessThanOrEqualTo(String value) {
            addCriterion("c45 <=", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45Like(String value) {
            addCriterion("c45 like", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45NotLike(String value) {
            addCriterion("c45 not like", value, "c45");
            return (Criteria) this;
        }

        public Criteria andC45In(List<String> values) {
            addCriterion("c45 in", values, "c45");
            return (Criteria) this;
        }

        public Criteria andC45NotIn(List<String> values) {
            addCriterion("c45 not in", values, "c45");
            return (Criteria) this;
        }

        public Criteria andC45Between(String value1, String value2) {
            addCriterion("c45 between", value1, value2, "c45");
            return (Criteria) this;
        }

        public Criteria andC45NotBetween(String value1, String value2) {
            addCriterion("c45 not between", value1, value2, "c45");
            return (Criteria) this;
        }

        public Criteria andC46IsNull() {
            addCriterion("c46 is null");
            return (Criteria) this;
        }

        public Criteria andC46IsNotNull() {
            addCriterion("c46 is not null");
            return (Criteria) this;
        }

        public Criteria andC46EqualTo(String value) {
            addCriterion("c46 =", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46NotEqualTo(String value) {
            addCriterion("c46 <>", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46GreaterThan(String value) {
            addCriterion("c46 >", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46GreaterThanOrEqualTo(String value) {
            addCriterion("c46 >=", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46LessThan(String value) {
            addCriterion("c46 <", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46LessThanOrEqualTo(String value) {
            addCriterion("c46 <=", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46Like(String value) {
            addCriterion("c46 like", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46NotLike(String value) {
            addCriterion("c46 not like", value, "c46");
            return (Criteria) this;
        }

        public Criteria andC46In(List<String> values) {
            addCriterion("c46 in", values, "c46");
            return (Criteria) this;
        }

        public Criteria andC46NotIn(List<String> values) {
            addCriterion("c46 not in", values, "c46");
            return (Criteria) this;
        }

        public Criteria andC46Between(String value1, String value2) {
            addCriterion("c46 between", value1, value2, "c46");
            return (Criteria) this;
        }

        public Criteria andC46NotBetween(String value1, String value2) {
            addCriterion("c46 not between", value1, value2, "c46");
            return (Criteria) this;
        }

        public Criteria andC47IsNull() {
            addCriterion("c47 is null");
            return (Criteria) this;
        }

        public Criteria andC47IsNotNull() {
            addCriterion("c47 is not null");
            return (Criteria) this;
        }

        public Criteria andC47EqualTo(String value) {
            addCriterion("c47 =", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47NotEqualTo(String value) {
            addCriterion("c47 <>", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47GreaterThan(String value) {
            addCriterion("c47 >", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47GreaterThanOrEqualTo(String value) {
            addCriterion("c47 >=", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47LessThan(String value) {
            addCriterion("c47 <", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47LessThanOrEqualTo(String value) {
            addCriterion("c47 <=", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47Like(String value) {
            addCriterion("c47 like", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47NotLike(String value) {
            addCriterion("c47 not like", value, "c47");
            return (Criteria) this;
        }

        public Criteria andC47In(List<String> values) {
            addCriterion("c47 in", values, "c47");
            return (Criteria) this;
        }

        public Criteria andC47NotIn(List<String> values) {
            addCriterion("c47 not in", values, "c47");
            return (Criteria) this;
        }

        public Criteria andC47Between(String value1, String value2) {
            addCriterion("c47 between", value1, value2, "c47");
            return (Criteria) this;
        }

        public Criteria andC47NotBetween(String value1, String value2) {
            addCriterion("c47 not between", value1, value2, "c47");
            return (Criteria) this;
        }

        public Criteria andC48IsNull() {
            addCriterion("c48 is null");
            return (Criteria) this;
        }

        public Criteria andC48IsNotNull() {
            addCriterion("c48 is not null");
            return (Criteria) this;
        }

        public Criteria andC48EqualTo(String value) {
            addCriterion("c48 =", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48NotEqualTo(String value) {
            addCriterion("c48 <>", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48GreaterThan(String value) {
            addCriterion("c48 >", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48GreaterThanOrEqualTo(String value) {
            addCriterion("c48 >=", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48LessThan(String value) {
            addCriterion("c48 <", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48LessThanOrEqualTo(String value) {
            addCriterion("c48 <=", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48Like(String value) {
            addCriterion("c48 like", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48NotLike(String value) {
            addCriterion("c48 not like", value, "c48");
            return (Criteria) this;
        }

        public Criteria andC48In(List<String> values) {
            addCriterion("c48 in", values, "c48");
            return (Criteria) this;
        }

        public Criteria andC48NotIn(List<String> values) {
            addCriterion("c48 not in", values, "c48");
            return (Criteria) this;
        }

        public Criteria andC48Between(String value1, String value2) {
            addCriterion("c48 between", value1, value2, "c48");
            return (Criteria) this;
        }

        public Criteria andC48NotBetween(String value1, String value2) {
            addCriterion("c48 not between", value1, value2, "c48");
            return (Criteria) this;
        }

        public Criteria andC49IsNull() {
            addCriterion("c49 is null");
            return (Criteria) this;
        }

        public Criteria andC49IsNotNull() {
            addCriterion("c49 is not null");
            return (Criteria) this;
        }

        public Criteria andC49EqualTo(String value) {
            addCriterion("c49 =", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49NotEqualTo(String value) {
            addCriterion("c49 <>", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49GreaterThan(String value) {
            addCriterion("c49 >", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49GreaterThanOrEqualTo(String value) {
            addCriterion("c49 >=", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49LessThan(String value) {
            addCriterion("c49 <", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49LessThanOrEqualTo(String value) {
            addCriterion("c49 <=", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49Like(String value) {
            addCriterion("c49 like", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49NotLike(String value) {
            addCriterion("c49 not like", value, "c49");
            return (Criteria) this;
        }

        public Criteria andC49In(List<String> values) {
            addCriterion("c49 in", values, "c49");
            return (Criteria) this;
        }

        public Criteria andC49NotIn(List<String> values) {
            addCriterion("c49 not in", values, "c49");
            return (Criteria) this;
        }

        public Criteria andC49Between(String value1, String value2) {
            addCriterion("c49 between", value1, value2, "c49");
            return (Criteria) this;
        }

        public Criteria andC49NotBetween(String value1, String value2) {
            addCriterion("c49 not between", value1, value2, "c49");
            return (Criteria) this;
        }

        public Criteria andC50IsNull() {
            addCriterion("c50 is null");
            return (Criteria) this;
        }

        public Criteria andC50IsNotNull() {
            addCriterion("c50 is not null");
            return (Criteria) this;
        }

        public Criteria andC50EqualTo(String value) {
            addCriterion("c50 =", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50NotEqualTo(String value) {
            addCriterion("c50 <>", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50GreaterThan(String value) {
            addCriterion("c50 >", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50GreaterThanOrEqualTo(String value) {
            addCriterion("c50 >=", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50LessThan(String value) {
            addCriterion("c50 <", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50LessThanOrEqualTo(String value) {
            addCriterion("c50 <=", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50Like(String value) {
            addCriterion("c50 like", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50NotLike(String value) {
            addCriterion("c50 not like", value, "c50");
            return (Criteria) this;
        }

        public Criteria andC50In(List<String> values) {
            addCriterion("c50 in", values, "c50");
            return (Criteria) this;
        }

        public Criteria andC50NotIn(List<String> values) {
            addCriterion("c50 not in", values, "c50");
            return (Criteria) this;
        }

        public Criteria andC50Between(String value1, String value2) {
            addCriterion("c50 between", value1, value2, "c50");
            return (Criteria) this;
        }

        public Criteria andC50NotBetween(String value1, String value2) {
            addCriterion("c50 not between", value1, value2, "c50");
            return (Criteria) this;
        }

        public Criteria andC51IsNull() {
            addCriterion("c51 is null");
            return (Criteria) this;
        }

        public Criteria andC51IsNotNull() {
            addCriterion("c51 is not null");
            return (Criteria) this;
        }

        public Criteria andC51EqualTo(String value) {
            addCriterion("c51 =", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51NotEqualTo(String value) {
            addCriterion("c51 <>", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51GreaterThan(String value) {
            addCriterion("c51 >", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51GreaterThanOrEqualTo(String value) {
            addCriterion("c51 >=", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51LessThan(String value) {
            addCriterion("c51 <", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51LessThanOrEqualTo(String value) {
            addCriterion("c51 <=", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51Like(String value) {
            addCriterion("c51 like", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51NotLike(String value) {
            addCriterion("c51 not like", value, "c51");
            return (Criteria) this;
        }

        public Criteria andC51In(List<String> values) {
            addCriterion("c51 in", values, "c51");
            return (Criteria) this;
        }

        public Criteria andC51NotIn(List<String> values) {
            addCriterion("c51 not in", values, "c51");
            return (Criteria) this;
        }

        public Criteria andC51Between(String value1, String value2) {
            addCriterion("c51 between", value1, value2, "c51");
            return (Criteria) this;
        }

        public Criteria andC51NotBetween(String value1, String value2) {
            addCriterion("c51 not between", value1, value2, "c51");
            return (Criteria) this;
        }

        public Criteria andC52IsNull() {
            addCriterion("c52 is null");
            return (Criteria) this;
        }

        public Criteria andC52IsNotNull() {
            addCriterion("c52 is not null");
            return (Criteria) this;
        }

        public Criteria andC52EqualTo(String value) {
            addCriterion("c52 =", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52NotEqualTo(String value) {
            addCriterion("c52 <>", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52GreaterThan(String value) {
            addCriterion("c52 >", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52GreaterThanOrEqualTo(String value) {
            addCriterion("c52 >=", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52LessThan(String value) {
            addCriterion("c52 <", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52LessThanOrEqualTo(String value) {
            addCriterion("c52 <=", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52Like(String value) {
            addCriterion("c52 like", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52NotLike(String value) {
            addCriterion("c52 not like", value, "c52");
            return (Criteria) this;
        }

        public Criteria andC52In(List<String> values) {
            addCriterion("c52 in", values, "c52");
            return (Criteria) this;
        }

        public Criteria andC52NotIn(List<String> values) {
            addCriterion("c52 not in", values, "c52");
            return (Criteria) this;
        }

        public Criteria andC52Between(String value1, String value2) {
            addCriterion("c52 between", value1, value2, "c52");
            return (Criteria) this;
        }

        public Criteria andC52NotBetween(String value1, String value2) {
            addCriterion("c52 not between", value1, value2, "c52");
            return (Criteria) this;
        }

        public Criteria andC53IsNull() {
            addCriterion("c53 is null");
            return (Criteria) this;
        }

        public Criteria andC53IsNotNull() {
            addCriterion("c53 is not null");
            return (Criteria) this;
        }

        public Criteria andC53EqualTo(String value) {
            addCriterion("c53 =", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53NotEqualTo(String value) {
            addCriterion("c53 <>", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53GreaterThan(String value) {
            addCriterion("c53 >", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53GreaterThanOrEqualTo(String value) {
            addCriterion("c53 >=", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53LessThan(String value) {
            addCriterion("c53 <", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53LessThanOrEqualTo(String value) {
            addCriterion("c53 <=", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53Like(String value) {
            addCriterion("c53 like", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53NotLike(String value) {
            addCriterion("c53 not like", value, "c53");
            return (Criteria) this;
        }

        public Criteria andC53In(List<String> values) {
            addCriterion("c53 in", values, "c53");
            return (Criteria) this;
        }

        public Criteria andC53NotIn(List<String> values) {
            addCriterion("c53 not in", values, "c53");
            return (Criteria) this;
        }

        public Criteria andC53Between(String value1, String value2) {
            addCriterion("c53 between", value1, value2, "c53");
            return (Criteria) this;
        }

        public Criteria andC53NotBetween(String value1, String value2) {
            addCriterion("c53 not between", value1, value2, "c53");
            return (Criteria) this;
        }

        public Criteria andC54IsNull() {
            addCriterion("c54 is null");
            return (Criteria) this;
        }

        public Criteria andC54IsNotNull() {
            addCriterion("c54 is not null");
            return (Criteria) this;
        }

        public Criteria andC54EqualTo(String value) {
            addCriterion("c54 =", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54NotEqualTo(String value) {
            addCriterion("c54 <>", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54GreaterThan(String value) {
            addCriterion("c54 >", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54GreaterThanOrEqualTo(String value) {
            addCriterion("c54 >=", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54LessThan(String value) {
            addCriterion("c54 <", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54LessThanOrEqualTo(String value) {
            addCriterion("c54 <=", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54Like(String value) {
            addCriterion("c54 like", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54NotLike(String value) {
            addCriterion("c54 not like", value, "c54");
            return (Criteria) this;
        }

        public Criteria andC54In(List<String> values) {
            addCriterion("c54 in", values, "c54");
            return (Criteria) this;
        }

        public Criteria andC54NotIn(List<String> values) {
            addCriterion("c54 not in", values, "c54");
            return (Criteria) this;
        }

        public Criteria andC54Between(String value1, String value2) {
            addCriterion("c54 between", value1, value2, "c54");
            return (Criteria) this;
        }

        public Criteria andC54NotBetween(String value1, String value2) {
            addCriterion("c54 not between", value1, value2, "c54");
            return (Criteria) this;
        }

        public Criteria andC55IsNull() {
            addCriterion("c55 is null");
            return (Criteria) this;
        }

        public Criteria andC55IsNotNull() {
            addCriterion("c55 is not null");
            return (Criteria) this;
        }

        public Criteria andC55EqualTo(String value) {
            addCriterion("c55 =", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55NotEqualTo(String value) {
            addCriterion("c55 <>", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55GreaterThan(String value) {
            addCriterion("c55 >", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55GreaterThanOrEqualTo(String value) {
            addCriterion("c55 >=", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55LessThan(String value) {
            addCriterion("c55 <", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55LessThanOrEqualTo(String value) {
            addCriterion("c55 <=", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55Like(String value) {
            addCriterion("c55 like", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55NotLike(String value) {
            addCriterion("c55 not like", value, "c55");
            return (Criteria) this;
        }

        public Criteria andC55In(List<String> values) {
            addCriterion("c55 in", values, "c55");
            return (Criteria) this;
        }

        public Criteria andC55NotIn(List<String> values) {
            addCriterion("c55 not in", values, "c55");
            return (Criteria) this;
        }

        public Criteria andC55Between(String value1, String value2) {
            addCriterion("c55 between", value1, value2, "c55");
            return (Criteria) this;
        }

        public Criteria andC55NotBetween(String value1, String value2) {
            addCriterion("c55 not between", value1, value2, "c55");
            return (Criteria) this;
        }

        public Criteria andC56IsNull() {
            addCriterion("c56 is null");
            return (Criteria) this;
        }

        public Criteria andC56IsNotNull() {
            addCriterion("c56 is not null");
            return (Criteria) this;
        }

        public Criteria andC56EqualTo(String value) {
            addCriterion("c56 =", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56NotEqualTo(String value) {
            addCriterion("c56 <>", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56GreaterThan(String value) {
            addCriterion("c56 >", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56GreaterThanOrEqualTo(String value) {
            addCriterion("c56 >=", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56LessThan(String value) {
            addCriterion("c56 <", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56LessThanOrEqualTo(String value) {
            addCriterion("c56 <=", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56Like(String value) {
            addCriterion("c56 like", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56NotLike(String value) {
            addCriterion("c56 not like", value, "c56");
            return (Criteria) this;
        }

        public Criteria andC56In(List<String> values) {
            addCriterion("c56 in", values, "c56");
            return (Criteria) this;
        }

        public Criteria andC56NotIn(List<String> values) {
            addCriterion("c56 not in", values, "c56");
            return (Criteria) this;
        }

        public Criteria andC56Between(String value1, String value2) {
            addCriterion("c56 between", value1, value2, "c56");
            return (Criteria) this;
        }

        public Criteria andC56NotBetween(String value1, String value2) {
            addCriterion("c56 not between", value1, value2, "c56");
            return (Criteria) this;
        }

        public Criteria andC57IsNull() {
            addCriterion("c57 is null");
            return (Criteria) this;
        }

        public Criteria andC57IsNotNull() {
            addCriterion("c57 is not null");
            return (Criteria) this;
        }

        public Criteria andC57EqualTo(String value) {
            addCriterion("c57 =", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57NotEqualTo(String value) {
            addCriterion("c57 <>", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57GreaterThan(String value) {
            addCriterion("c57 >", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57GreaterThanOrEqualTo(String value) {
            addCriterion("c57 >=", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57LessThan(String value) {
            addCriterion("c57 <", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57LessThanOrEqualTo(String value) {
            addCriterion("c57 <=", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57Like(String value) {
            addCriterion("c57 like", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57NotLike(String value) {
            addCriterion("c57 not like", value, "c57");
            return (Criteria) this;
        }

        public Criteria andC57In(List<String> values) {
            addCriterion("c57 in", values, "c57");
            return (Criteria) this;
        }

        public Criteria andC57NotIn(List<String> values) {
            addCriterion("c57 not in", values, "c57");
            return (Criteria) this;
        }

        public Criteria andC57Between(String value1, String value2) {
            addCriterion("c57 between", value1, value2, "c57");
            return (Criteria) this;
        }

        public Criteria andC57NotBetween(String value1, String value2) {
            addCriterion("c57 not between", value1, value2, "c57");
            return (Criteria) this;
        }

        public Criteria andC58IsNull() {
            addCriterion("c58 is null");
            return (Criteria) this;
        }

        public Criteria andC58IsNotNull() {
            addCriterion("c58 is not null");
            return (Criteria) this;
        }

        public Criteria andC58EqualTo(String value) {
            addCriterion("c58 =", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58NotEqualTo(String value) {
            addCriterion("c58 <>", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58GreaterThan(String value) {
            addCriterion("c58 >", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58GreaterThanOrEqualTo(String value) {
            addCriterion("c58 >=", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58LessThan(String value) {
            addCriterion("c58 <", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58LessThanOrEqualTo(String value) {
            addCriterion("c58 <=", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58Like(String value) {
            addCriterion("c58 like", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58NotLike(String value) {
            addCriterion("c58 not like", value, "c58");
            return (Criteria) this;
        }

        public Criteria andC58In(List<String> values) {
            addCriterion("c58 in", values, "c58");
            return (Criteria) this;
        }

        public Criteria andC58NotIn(List<String> values) {
            addCriterion("c58 not in", values, "c58");
            return (Criteria) this;
        }

        public Criteria andC58Between(String value1, String value2) {
            addCriterion("c58 between", value1, value2, "c58");
            return (Criteria) this;
        }

        public Criteria andC58NotBetween(String value1, String value2) {
            addCriterion("c58 not between", value1, value2, "c58");
            return (Criteria) this;
        }

        public Criteria andC59IsNull() {
            addCriterion("c59 is null");
            return (Criteria) this;
        }

        public Criteria andC59IsNotNull() {
            addCriterion("c59 is not null");
            return (Criteria) this;
        }

        public Criteria andC59EqualTo(String value) {
            addCriterion("c59 =", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59NotEqualTo(String value) {
            addCriterion("c59 <>", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59GreaterThan(String value) {
            addCriterion("c59 >", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59GreaterThanOrEqualTo(String value) {
            addCriterion("c59 >=", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59LessThan(String value) {
            addCriterion("c59 <", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59LessThanOrEqualTo(String value) {
            addCriterion("c59 <=", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59Like(String value) {
            addCriterion("c59 like", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59NotLike(String value) {
            addCriterion("c59 not like", value, "c59");
            return (Criteria) this;
        }

        public Criteria andC59In(List<String> values) {
            addCriterion("c59 in", values, "c59");
            return (Criteria) this;
        }

        public Criteria andC59NotIn(List<String> values) {
            addCriterion("c59 not in", values, "c59");
            return (Criteria) this;
        }

        public Criteria andC59Between(String value1, String value2) {
            addCriterion("c59 between", value1, value2, "c59");
            return (Criteria) this;
        }

        public Criteria andC59NotBetween(String value1, String value2) {
            addCriterion("c59 not between", value1, value2, "c59");
            return (Criteria) this;
        }

        public Criteria andC60IsNull() {
            addCriterion("c60 is null");
            return (Criteria) this;
        }

        public Criteria andC60IsNotNull() {
            addCriterion("c60 is not null");
            return (Criteria) this;
        }

        public Criteria andC60EqualTo(String value) {
            addCriterion("c60 =", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60NotEqualTo(String value) {
            addCriterion("c60 <>", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60GreaterThan(String value) {
            addCriterion("c60 >", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60GreaterThanOrEqualTo(String value) {
            addCriterion("c60 >=", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60LessThan(String value) {
            addCriterion("c60 <", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60LessThanOrEqualTo(String value) {
            addCriterion("c60 <=", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60Like(String value) {
            addCriterion("c60 like", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60NotLike(String value) {
            addCriterion("c60 not like", value, "c60");
            return (Criteria) this;
        }

        public Criteria andC60In(List<String> values) {
            addCriterion("c60 in", values, "c60");
            return (Criteria) this;
        }

        public Criteria andC60NotIn(List<String> values) {
            addCriterion("c60 not in", values, "c60");
            return (Criteria) this;
        }

        public Criteria andC60Between(String value1, String value2) {
            addCriterion("c60 between", value1, value2, "c60");
            return (Criteria) this;
        }

        public Criteria andC60NotBetween(String value1, String value2) {
            addCriterion("c60 not between", value1, value2, "c60");
            return (Criteria) this;
        }

        public Criteria andC61IsNull() {
            addCriterion("c61 is null");
            return (Criteria) this;
        }

        public Criteria andC61IsNotNull() {
            addCriterion("c61 is not null");
            return (Criteria) this;
        }

        public Criteria andC61EqualTo(String value) {
            addCriterion("c61 =", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61NotEqualTo(String value) {
            addCriterion("c61 <>", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61GreaterThan(String value) {
            addCriterion("c61 >", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61GreaterThanOrEqualTo(String value) {
            addCriterion("c61 >=", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61LessThan(String value) {
            addCriterion("c61 <", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61LessThanOrEqualTo(String value) {
            addCriterion("c61 <=", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61Like(String value) {
            addCriterion("c61 like", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61NotLike(String value) {
            addCriterion("c61 not like", value, "c61");
            return (Criteria) this;
        }

        public Criteria andC61In(List<String> values) {
            addCriterion("c61 in", values, "c61");
            return (Criteria) this;
        }

        public Criteria andC61NotIn(List<String> values) {
            addCriterion("c61 not in", values, "c61");
            return (Criteria) this;
        }

        public Criteria andC61Between(String value1, String value2) {
            addCriterion("c61 between", value1, value2, "c61");
            return (Criteria) this;
        }

        public Criteria andC61NotBetween(String value1, String value2) {
            addCriterion("c61 not between", value1, value2, "c61");
            return (Criteria) this;
        }

        public Criteria andC62IsNull() {
            addCriterion("c62 is null");
            return (Criteria) this;
        }

        public Criteria andC62IsNotNull() {
            addCriterion("c62 is not null");
            return (Criteria) this;
        }

        public Criteria andC62EqualTo(String value) {
            addCriterion("c62 =", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62NotEqualTo(String value) {
            addCriterion("c62 <>", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62GreaterThan(String value) {
            addCriterion("c62 >", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62GreaterThanOrEqualTo(String value) {
            addCriterion("c62 >=", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62LessThan(String value) {
            addCriterion("c62 <", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62LessThanOrEqualTo(String value) {
            addCriterion("c62 <=", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62Like(String value) {
            addCriterion("c62 like", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62NotLike(String value) {
            addCriterion("c62 not like", value, "c62");
            return (Criteria) this;
        }

        public Criteria andC62In(List<String> values) {
            addCriterion("c62 in", values, "c62");
            return (Criteria) this;
        }

        public Criteria andC62NotIn(List<String> values) {
            addCriterion("c62 not in", values, "c62");
            return (Criteria) this;
        }

        public Criteria andC62Between(String value1, String value2) {
            addCriterion("c62 between", value1, value2, "c62");
            return (Criteria) this;
        }

        public Criteria andC62NotBetween(String value1, String value2) {
            addCriterion("c62 not between", value1, value2, "c62");
            return (Criteria) this;
        }

        public Criteria andC63IsNull() {
            addCriterion("c63 is null");
            return (Criteria) this;
        }

        public Criteria andC63IsNotNull() {
            addCriterion("c63 is not null");
            return (Criteria) this;
        }

        public Criteria andC63EqualTo(String value) {
            addCriterion("c63 =", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63NotEqualTo(String value) {
            addCriterion("c63 <>", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63GreaterThan(String value) {
            addCriterion("c63 >", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63GreaterThanOrEqualTo(String value) {
            addCriterion("c63 >=", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63LessThan(String value) {
            addCriterion("c63 <", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63LessThanOrEqualTo(String value) {
            addCriterion("c63 <=", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63Like(String value) {
            addCriterion("c63 like", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63NotLike(String value) {
            addCriterion("c63 not like", value, "c63");
            return (Criteria) this;
        }

        public Criteria andC63In(List<String> values) {
            addCriterion("c63 in", values, "c63");
            return (Criteria) this;
        }

        public Criteria andC63NotIn(List<String> values) {
            addCriterion("c63 not in", values, "c63");
            return (Criteria) this;
        }

        public Criteria andC63Between(String value1, String value2) {
            addCriterion("c63 between", value1, value2, "c63");
            return (Criteria) this;
        }

        public Criteria andC63NotBetween(String value1, String value2) {
            addCriterion("c63 not between", value1, value2, "c63");
            return (Criteria) this;
        }

        public Criteria andC64IsNull() {
            addCriterion("c64 is null");
            return (Criteria) this;
        }

        public Criteria andC64IsNotNull() {
            addCriterion("c64 is not null");
            return (Criteria) this;
        }

        public Criteria andC64EqualTo(String value) {
            addCriterion("c64 =", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64NotEqualTo(String value) {
            addCriterion("c64 <>", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64GreaterThan(String value) {
            addCriterion("c64 >", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64GreaterThanOrEqualTo(String value) {
            addCriterion("c64 >=", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64LessThan(String value) {
            addCriterion("c64 <", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64LessThanOrEqualTo(String value) {
            addCriterion("c64 <=", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64Like(String value) {
            addCriterion("c64 like", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64NotLike(String value) {
            addCriterion("c64 not like", value, "c64");
            return (Criteria) this;
        }

        public Criteria andC64In(List<String> values) {
            addCriterion("c64 in", values, "c64");
            return (Criteria) this;
        }

        public Criteria andC64NotIn(List<String> values) {
            addCriterion("c64 not in", values, "c64");
            return (Criteria) this;
        }

        public Criteria andC64Between(String value1, String value2) {
            addCriterion("c64 between", value1, value2, "c64");
            return (Criteria) this;
        }

        public Criteria andC64NotBetween(String value1, String value2) {
            addCriterion("c64 not between", value1, value2, "c64");
            return (Criteria) this;
        }

        public Criteria andC65IsNull() {
            addCriterion("c65 is null");
            return (Criteria) this;
        }

        public Criteria andC65IsNotNull() {
            addCriterion("c65 is not null");
            return (Criteria) this;
        }

        public Criteria andC65EqualTo(String value) {
            addCriterion("c65 =", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65NotEqualTo(String value) {
            addCriterion("c65 <>", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65GreaterThan(String value) {
            addCriterion("c65 >", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65GreaterThanOrEqualTo(String value) {
            addCriterion("c65 >=", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65LessThan(String value) {
            addCriterion("c65 <", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65LessThanOrEqualTo(String value) {
            addCriterion("c65 <=", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65Like(String value) {
            addCriterion("c65 like", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65NotLike(String value) {
            addCriterion("c65 not like", value, "c65");
            return (Criteria) this;
        }

        public Criteria andC65In(List<String> values) {
            addCriterion("c65 in", values, "c65");
            return (Criteria) this;
        }

        public Criteria andC65NotIn(List<String> values) {
            addCriterion("c65 not in", values, "c65");
            return (Criteria) this;
        }

        public Criteria andC65Between(String value1, String value2) {
            addCriterion("c65 between", value1, value2, "c65");
            return (Criteria) this;
        }

        public Criteria andC65NotBetween(String value1, String value2) {
            addCriterion("c65 not between", value1, value2, "c65");
            return (Criteria) this;
        }

        public Criteria andC66IsNull() {
            addCriterion("c66 is null");
            return (Criteria) this;
        }

        public Criteria andC66IsNotNull() {
            addCriterion("c66 is not null");
            return (Criteria) this;
        }

        public Criteria andC66EqualTo(String value) {
            addCriterion("c66 =", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66NotEqualTo(String value) {
            addCriterion("c66 <>", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66GreaterThan(String value) {
            addCriterion("c66 >", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66GreaterThanOrEqualTo(String value) {
            addCriterion("c66 >=", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66LessThan(String value) {
            addCriterion("c66 <", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66LessThanOrEqualTo(String value) {
            addCriterion("c66 <=", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66Like(String value) {
            addCriterion("c66 like", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66NotLike(String value) {
            addCriterion("c66 not like", value, "c66");
            return (Criteria) this;
        }

        public Criteria andC66In(List<String> values) {
            addCriterion("c66 in", values, "c66");
            return (Criteria) this;
        }

        public Criteria andC66NotIn(List<String> values) {
            addCriterion("c66 not in", values, "c66");
            return (Criteria) this;
        }

        public Criteria andC66Between(String value1, String value2) {
            addCriterion("c66 between", value1, value2, "c66");
            return (Criteria) this;
        }

        public Criteria andC66NotBetween(String value1, String value2) {
            addCriterion("c66 not between", value1, value2, "c66");
            return (Criteria) this;
        }

        public Criteria andC67IsNull() {
            addCriterion("c67 is null");
            return (Criteria) this;
        }

        public Criteria andC67IsNotNull() {
            addCriterion("c67 is not null");
            return (Criteria) this;
        }

        public Criteria andC67EqualTo(String value) {
            addCriterion("c67 =", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67NotEqualTo(String value) {
            addCriterion("c67 <>", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67GreaterThan(String value) {
            addCriterion("c67 >", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67GreaterThanOrEqualTo(String value) {
            addCriterion("c67 >=", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67LessThan(String value) {
            addCriterion("c67 <", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67LessThanOrEqualTo(String value) {
            addCriterion("c67 <=", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67Like(String value) {
            addCriterion("c67 like", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67NotLike(String value) {
            addCriterion("c67 not like", value, "c67");
            return (Criteria) this;
        }

        public Criteria andC67In(List<String> values) {
            addCriterion("c67 in", values, "c67");
            return (Criteria) this;
        }

        public Criteria andC67NotIn(List<String> values) {
            addCriterion("c67 not in", values, "c67");
            return (Criteria) this;
        }

        public Criteria andC67Between(String value1, String value2) {
            addCriterion("c67 between", value1, value2, "c67");
            return (Criteria) this;
        }

        public Criteria andC67NotBetween(String value1, String value2) {
            addCriterion("c67 not between", value1, value2, "c67");
            return (Criteria) this;
        }

        public Criteria andC68IsNull() {
            addCriterion("c68 is null");
            return (Criteria) this;
        }

        public Criteria andC68IsNotNull() {
            addCriterion("c68 is not null");
            return (Criteria) this;
        }

        public Criteria andC68EqualTo(String value) {
            addCriterion("c68 =", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68NotEqualTo(String value) {
            addCriterion("c68 <>", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68GreaterThan(String value) {
            addCriterion("c68 >", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68GreaterThanOrEqualTo(String value) {
            addCriterion("c68 >=", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68LessThan(String value) {
            addCriterion("c68 <", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68LessThanOrEqualTo(String value) {
            addCriterion("c68 <=", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68Like(String value) {
            addCriterion("c68 like", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68NotLike(String value) {
            addCriterion("c68 not like", value, "c68");
            return (Criteria) this;
        }

        public Criteria andC68In(List<String> values) {
            addCriterion("c68 in", values, "c68");
            return (Criteria) this;
        }

        public Criteria andC68NotIn(List<String> values) {
            addCriterion("c68 not in", values, "c68");
            return (Criteria) this;
        }

        public Criteria andC68Between(String value1, String value2) {
            addCriterion("c68 between", value1, value2, "c68");
            return (Criteria) this;
        }

        public Criteria andC68NotBetween(String value1, String value2) {
            addCriterion("c68 not between", value1, value2, "c68");
            return (Criteria) this;
        }

        public Criteria andC69IsNull() {
            addCriterion("c69 is null");
            return (Criteria) this;
        }

        public Criteria andC69IsNotNull() {
            addCriterion("c69 is not null");
            return (Criteria) this;
        }

        public Criteria andC69EqualTo(String value) {
            addCriterion("c69 =", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69NotEqualTo(String value) {
            addCriterion("c69 <>", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69GreaterThan(String value) {
            addCriterion("c69 >", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69GreaterThanOrEqualTo(String value) {
            addCriterion("c69 >=", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69LessThan(String value) {
            addCriterion("c69 <", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69LessThanOrEqualTo(String value) {
            addCriterion("c69 <=", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69Like(String value) {
            addCriterion("c69 like", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69NotLike(String value) {
            addCriterion("c69 not like", value, "c69");
            return (Criteria) this;
        }

        public Criteria andC69In(List<String> values) {
            addCriterion("c69 in", values, "c69");
            return (Criteria) this;
        }

        public Criteria andC69NotIn(List<String> values) {
            addCriterion("c69 not in", values, "c69");
            return (Criteria) this;
        }

        public Criteria andC69Between(String value1, String value2) {
            addCriterion("c69 between", value1, value2, "c69");
            return (Criteria) this;
        }

        public Criteria andC69NotBetween(String value1, String value2) {
            addCriterion("c69 not between", value1, value2, "c69");
            return (Criteria) this;
        }

        public Criteria andC70IsNull() {
            addCriterion("c70 is null");
            return (Criteria) this;
        }

        public Criteria andC70IsNotNull() {
            addCriterion("c70 is not null");
            return (Criteria) this;
        }

        public Criteria andC70EqualTo(String value) {
            addCriterion("c70 =", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70NotEqualTo(String value) {
            addCriterion("c70 <>", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70GreaterThan(String value) {
            addCriterion("c70 >", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70GreaterThanOrEqualTo(String value) {
            addCriterion("c70 >=", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70LessThan(String value) {
            addCriterion("c70 <", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70LessThanOrEqualTo(String value) {
            addCriterion("c70 <=", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70Like(String value) {
            addCriterion("c70 like", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70NotLike(String value) {
            addCriterion("c70 not like", value, "c70");
            return (Criteria) this;
        }

        public Criteria andC70In(List<String> values) {
            addCriterion("c70 in", values, "c70");
            return (Criteria) this;
        }

        public Criteria andC70NotIn(List<String> values) {
            addCriterion("c70 not in", values, "c70");
            return (Criteria) this;
        }

        public Criteria andC70Between(String value1, String value2) {
            addCriterion("c70 between", value1, value2, "c70");
            return (Criteria) this;
        }

        public Criteria andC70NotBetween(String value1, String value2) {
            addCriterion("c70 not between", value1, value2, "c70");
            return (Criteria) this;
        }

        public Criteria andC71IsNull() {
            addCriterion("c71 is null");
            return (Criteria) this;
        }

        public Criteria andC71IsNotNull() {
            addCriterion("c71 is not null");
            return (Criteria) this;
        }

        public Criteria andC71EqualTo(String value) {
            addCriterion("c71 =", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71NotEqualTo(String value) {
            addCriterion("c71 <>", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71GreaterThan(String value) {
            addCriterion("c71 >", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71GreaterThanOrEqualTo(String value) {
            addCriterion("c71 >=", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71LessThan(String value) {
            addCriterion("c71 <", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71LessThanOrEqualTo(String value) {
            addCriterion("c71 <=", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71Like(String value) {
            addCriterion("c71 like", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71NotLike(String value) {
            addCriterion("c71 not like", value, "c71");
            return (Criteria) this;
        }

        public Criteria andC71In(List<String> values) {
            addCriterion("c71 in", values, "c71");
            return (Criteria) this;
        }

        public Criteria andC71NotIn(List<String> values) {
            addCriterion("c71 not in", values, "c71");
            return (Criteria) this;
        }

        public Criteria andC71Between(String value1, String value2) {
            addCriterion("c71 between", value1, value2, "c71");
            return (Criteria) this;
        }

        public Criteria andC71NotBetween(String value1, String value2) {
            addCriterion("c71 not between", value1, value2, "c71");
            return (Criteria) this;
        }

        public Criteria andC72IsNull() {
            addCriterion("c72 is null");
            return (Criteria) this;
        }

        public Criteria andC72IsNotNull() {
            addCriterion("c72 is not null");
            return (Criteria) this;
        }

        public Criteria andC72EqualTo(String value) {
            addCriterion("c72 =", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72NotEqualTo(String value) {
            addCriterion("c72 <>", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72GreaterThan(String value) {
            addCriterion("c72 >", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72GreaterThanOrEqualTo(String value) {
            addCriterion("c72 >=", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72LessThan(String value) {
            addCriterion("c72 <", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72LessThanOrEqualTo(String value) {
            addCriterion("c72 <=", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72Like(String value) {
            addCriterion("c72 like", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72NotLike(String value) {
            addCriterion("c72 not like", value, "c72");
            return (Criteria) this;
        }

        public Criteria andC72In(List<String> values) {
            addCriterion("c72 in", values, "c72");
            return (Criteria) this;
        }

        public Criteria andC72NotIn(List<String> values) {
            addCriterion("c72 not in", values, "c72");
            return (Criteria) this;
        }

        public Criteria andC72Between(String value1, String value2) {
            addCriterion("c72 between", value1, value2, "c72");
            return (Criteria) this;
        }

        public Criteria andC72NotBetween(String value1, String value2) {
            addCriterion("c72 not between", value1, value2, "c72");
            return (Criteria) this;
        }

        public Criteria andC73IsNull() {
            addCriterion("c73 is null");
            return (Criteria) this;
        }

        public Criteria andC73IsNotNull() {
            addCriterion("c73 is not null");
            return (Criteria) this;
        }

        public Criteria andC73EqualTo(String value) {
            addCriterion("c73 =", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73NotEqualTo(String value) {
            addCriterion("c73 <>", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73GreaterThan(String value) {
            addCriterion("c73 >", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73GreaterThanOrEqualTo(String value) {
            addCriterion("c73 >=", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73LessThan(String value) {
            addCriterion("c73 <", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73LessThanOrEqualTo(String value) {
            addCriterion("c73 <=", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73Like(String value) {
            addCriterion("c73 like", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73NotLike(String value) {
            addCriterion("c73 not like", value, "c73");
            return (Criteria) this;
        }

        public Criteria andC73In(List<String> values) {
            addCriterion("c73 in", values, "c73");
            return (Criteria) this;
        }

        public Criteria andC73NotIn(List<String> values) {
            addCriterion("c73 not in", values, "c73");
            return (Criteria) this;
        }

        public Criteria andC73Between(String value1, String value2) {
            addCriterion("c73 between", value1, value2, "c73");
            return (Criteria) this;
        }

        public Criteria andC73NotBetween(String value1, String value2) {
            addCriterion("c73 not between", value1, value2, "c73");
            return (Criteria) this;
        }

        public Criteria andC74IsNull() {
            addCriterion("c74 is null");
            return (Criteria) this;
        }

        public Criteria andC74IsNotNull() {
            addCriterion("c74 is not null");
            return (Criteria) this;
        }

        public Criteria andC74EqualTo(String value) {
            addCriterion("c74 =", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74NotEqualTo(String value) {
            addCriterion("c74 <>", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74GreaterThan(String value) {
            addCriterion("c74 >", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74GreaterThanOrEqualTo(String value) {
            addCriterion("c74 >=", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74LessThan(String value) {
            addCriterion("c74 <", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74LessThanOrEqualTo(String value) {
            addCriterion("c74 <=", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74Like(String value) {
            addCriterion("c74 like", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74NotLike(String value) {
            addCriterion("c74 not like", value, "c74");
            return (Criteria) this;
        }

        public Criteria andC74In(List<String> values) {
            addCriterion("c74 in", values, "c74");
            return (Criteria) this;
        }

        public Criteria andC74NotIn(List<String> values) {
            addCriterion("c74 not in", values, "c74");
            return (Criteria) this;
        }

        public Criteria andC74Between(String value1, String value2) {
            addCriterion("c74 between", value1, value2, "c74");
            return (Criteria) this;
        }

        public Criteria andC74NotBetween(String value1, String value2) {
            addCriterion("c74 not between", value1, value2, "c74");
            return (Criteria) this;
        }

        public Criteria andC75IsNull() {
            addCriterion("c75 is null");
            return (Criteria) this;
        }

        public Criteria andC75IsNotNull() {
            addCriterion("c75 is not null");
            return (Criteria) this;
        }

        public Criteria andC75EqualTo(String value) {
            addCriterion("c75 =", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75NotEqualTo(String value) {
            addCriterion("c75 <>", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75GreaterThan(String value) {
            addCriterion("c75 >", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75GreaterThanOrEqualTo(String value) {
            addCriterion("c75 >=", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75LessThan(String value) {
            addCriterion("c75 <", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75LessThanOrEqualTo(String value) {
            addCriterion("c75 <=", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75Like(String value) {
            addCriterion("c75 like", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75NotLike(String value) {
            addCriterion("c75 not like", value, "c75");
            return (Criteria) this;
        }

        public Criteria andC75In(List<String> values) {
            addCriterion("c75 in", values, "c75");
            return (Criteria) this;
        }

        public Criteria andC75NotIn(List<String> values) {
            addCriterion("c75 not in", values, "c75");
            return (Criteria) this;
        }

        public Criteria andC75Between(String value1, String value2) {
            addCriterion("c75 between", value1, value2, "c75");
            return (Criteria) this;
        }

        public Criteria andC75NotBetween(String value1, String value2) {
            addCriterion("c75 not between", value1, value2, "c75");
            return (Criteria) this;
        }

        public Criteria andC76IsNull() {
            addCriterion("c76 is null");
            return (Criteria) this;
        }

        public Criteria andC76IsNotNull() {
            addCriterion("c76 is not null");
            return (Criteria) this;
        }

        public Criteria andC76EqualTo(String value) {
            addCriterion("c76 =", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76NotEqualTo(String value) {
            addCriterion("c76 <>", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76GreaterThan(String value) {
            addCriterion("c76 >", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76GreaterThanOrEqualTo(String value) {
            addCriterion("c76 >=", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76LessThan(String value) {
            addCriterion("c76 <", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76LessThanOrEqualTo(String value) {
            addCriterion("c76 <=", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76Like(String value) {
            addCriterion("c76 like", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76NotLike(String value) {
            addCriterion("c76 not like", value, "c76");
            return (Criteria) this;
        }

        public Criteria andC76In(List<String> values) {
            addCriterion("c76 in", values, "c76");
            return (Criteria) this;
        }

        public Criteria andC76NotIn(List<String> values) {
            addCriterion("c76 not in", values, "c76");
            return (Criteria) this;
        }

        public Criteria andC76Between(String value1, String value2) {
            addCriterion("c76 between", value1, value2, "c76");
            return (Criteria) this;
        }

        public Criteria andC76NotBetween(String value1, String value2) {
            addCriterion("c76 not between", value1, value2, "c76");
            return (Criteria) this;
        }

        public Criteria andC77IsNull() {
            addCriterion("c77 is null");
            return (Criteria) this;
        }

        public Criteria andC77IsNotNull() {
            addCriterion("c77 is not null");
            return (Criteria) this;
        }

        public Criteria andC77EqualTo(String value) {
            addCriterion("c77 =", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77NotEqualTo(String value) {
            addCriterion("c77 <>", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77GreaterThan(String value) {
            addCriterion("c77 >", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77GreaterThanOrEqualTo(String value) {
            addCriterion("c77 >=", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77LessThan(String value) {
            addCriterion("c77 <", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77LessThanOrEqualTo(String value) {
            addCriterion("c77 <=", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77Like(String value) {
            addCriterion("c77 like", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77NotLike(String value) {
            addCriterion("c77 not like", value, "c77");
            return (Criteria) this;
        }

        public Criteria andC77In(List<String> values) {
            addCriterion("c77 in", values, "c77");
            return (Criteria) this;
        }

        public Criteria andC77NotIn(List<String> values) {
            addCriterion("c77 not in", values, "c77");
            return (Criteria) this;
        }

        public Criteria andC77Between(String value1, String value2) {
            addCriterion("c77 between", value1, value2, "c77");
            return (Criteria) this;
        }

        public Criteria andC77NotBetween(String value1, String value2) {
            addCriterion("c77 not between", value1, value2, "c77");
            return (Criteria) this;
        }

        public Criteria andC78IsNull() {
            addCriterion("c78 is null");
            return (Criteria) this;
        }

        public Criteria andC78IsNotNull() {
            addCriterion("c78 is not null");
            return (Criteria) this;
        }

        public Criteria andC78EqualTo(String value) {
            addCriterion("c78 =", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78NotEqualTo(String value) {
            addCriterion("c78 <>", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78GreaterThan(String value) {
            addCriterion("c78 >", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78GreaterThanOrEqualTo(String value) {
            addCriterion("c78 >=", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78LessThan(String value) {
            addCriterion("c78 <", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78LessThanOrEqualTo(String value) {
            addCriterion("c78 <=", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78Like(String value) {
            addCriterion("c78 like", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78NotLike(String value) {
            addCriterion("c78 not like", value, "c78");
            return (Criteria) this;
        }

        public Criteria andC78In(List<String> values) {
            addCriterion("c78 in", values, "c78");
            return (Criteria) this;
        }

        public Criteria andC78NotIn(List<String> values) {
            addCriterion("c78 not in", values, "c78");
            return (Criteria) this;
        }

        public Criteria andC78Between(String value1, String value2) {
            addCriterion("c78 between", value1, value2, "c78");
            return (Criteria) this;
        }

        public Criteria andC78NotBetween(String value1, String value2) {
            addCriterion("c78 not between", value1, value2, "c78");
            return (Criteria) this;
        }

        public Criteria andC79IsNull() {
            addCriterion("c79 is null");
            return (Criteria) this;
        }

        public Criteria andC79IsNotNull() {
            addCriterion("c79 is not null");
            return (Criteria) this;
        }

        public Criteria andC79EqualTo(String value) {
            addCriterion("c79 =", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79NotEqualTo(String value) {
            addCriterion("c79 <>", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79GreaterThan(String value) {
            addCriterion("c79 >", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79GreaterThanOrEqualTo(String value) {
            addCriterion("c79 >=", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79LessThan(String value) {
            addCriterion("c79 <", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79LessThanOrEqualTo(String value) {
            addCriterion("c79 <=", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79Like(String value) {
            addCriterion("c79 like", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79NotLike(String value) {
            addCriterion("c79 not like", value, "c79");
            return (Criteria) this;
        }

        public Criteria andC79In(List<String> values) {
            addCriterion("c79 in", values, "c79");
            return (Criteria) this;
        }

        public Criteria andC79NotIn(List<String> values) {
            addCriterion("c79 not in", values, "c79");
            return (Criteria) this;
        }

        public Criteria andC79Between(String value1, String value2) {
            addCriterion("c79 between", value1, value2, "c79");
            return (Criteria) this;
        }

        public Criteria andC79NotBetween(String value1, String value2) {
            addCriterion("c79 not between", value1, value2, "c79");
            return (Criteria) this;
        }

        public Criteria andC80IsNull() {
            addCriterion("c80 is null");
            return (Criteria) this;
        }

        public Criteria andC80IsNotNull() {
            addCriterion("c80 is not null");
            return (Criteria) this;
        }

        public Criteria andC80EqualTo(String value) {
            addCriterion("c80 =", value, "c80");
            return (Criteria) this;
        }

        public Criteria andC80NotEqualTo(String value) {
            addCriterion("c80 <>", value, "c80");
            return (Criteria) this;
        }

        public Criteria andC80GreaterThan(String value) {
            addCriterion("c80 >", value, "c80");
            return (Criteria) this;
        }

        public Criteria andC80GreaterThanOrEqualTo(String value) {
            addCriterion("c80 >=", value, "c80");
            return (Criteria) this;
        }

        public Criteria andC80LessThan(String value) {
            addCriterion("c80 <", value, "c80");
            return (Criteria) this;
        }

        public Criteria andC80LessThanOrEqualTo(String value) {
            addCriterion("c80 <=", value, "c80");
            return (Criteria) this;
        }

        public Criteria andC80Like(String value) {
            addCriterion("c80 like", value, "c80");
            return (Criteria) this;
        }

        public Criteria andC80NotLike(String value) {
            addCriterion("c80 not like", value, "c80");
            return (Criteria) this;
        }

        public Criteria andC80In(List<String> values) {
            addCriterion("c80 in", values, "c80");
            return (Criteria) this;
        }

        public Criteria andC80NotIn(List<String> values) {
            addCriterion("c80 not in", values, "c80");
            return (Criteria) this;
        }

        public Criteria andC80Between(String value1, String value2) {
            addCriterion("c80 between", value1, value2, "c80");
            return (Criteria) this;
        }

        public Criteria andC80NotBetween(String value1, String value2) {
            addCriterion("c80 not between", value1, value2, "c80");
            return (Criteria) this;
        }

        public Criteria andC81IsNull() {
            addCriterion("c81 is null");
            return (Criteria) this;
        }

        public Criteria andC81IsNotNull() {
            addCriterion("c81 is not null");
            return (Criteria) this;
        }

        public Criteria andC81EqualTo(String value) {
            addCriterion("c81 =", value, "c81");
            return (Criteria) this;
        }

        public Criteria andC81NotEqualTo(String value) {
            addCriterion("c81 <>", value, "c81");
            return (Criteria) this;
        }

        public Criteria andC81GreaterThan(String value) {
            addCriterion("c81 >", value, "c81");
            return (Criteria) this;
        }

        public Criteria andC81GreaterThanOrEqualTo(String value) {
            addCriterion("c81 >=", value, "c81");
            return (Criteria) this;
        }

        public Criteria andC81LessThan(String value) {
            addCriterion("c81 <", value, "c81");
            return (Criteria) this;
        }

        public Criteria andC81LessThanOrEqualTo(String value) {
            addCriterion("c81 <=", value, "c81");
            return (Criteria) this;
        }

        public Criteria andC81Like(String value) {
            addCriterion("c81 like", value, "c81");
            return (Criteria) this;
        }

        public Criteria andC81NotLike(String value) {
            addCriterion("c81 not like", value, "c81");
            return (Criteria) this;
        }

        public Criteria andC81In(List<String> values) {
            addCriterion("c81 in", values, "c81");
            return (Criteria) this;
        }

        public Criteria andC81NotIn(List<String> values) {
            addCriterion("c81 not in", values, "c81");
            return (Criteria) this;
        }

        public Criteria andC81Between(String value1, String value2) {
            addCriterion("c81 between", value1, value2, "c81");
            return (Criteria) this;
        }

        public Criteria andC81NotBetween(String value1, String value2) {
            addCriterion("c81 not between", value1, value2, "c81");
            return (Criteria) this;
        }

        public Criteria andC82IsNull() {
            addCriterion("c82 is null");
            return (Criteria) this;
        }

        public Criteria andC82IsNotNull() {
            addCriterion("c82 is not null");
            return (Criteria) this;
        }

        public Criteria andC82EqualTo(String value) {
            addCriterion("c82 =", value, "c82");
            return (Criteria) this;
        }

        public Criteria andC82NotEqualTo(String value) {
            addCriterion("c82 <>", value, "c82");
            return (Criteria) this;
        }

        public Criteria andC82GreaterThan(String value) {
            addCriterion("c82 >", value, "c82");
            return (Criteria) this;
        }

        public Criteria andC82GreaterThanOrEqualTo(String value) {
            addCriterion("c82 >=", value, "c82");
            return (Criteria) this;
        }

        public Criteria andC82LessThan(String value) {
            addCriterion("c82 <", value, "c82");
            return (Criteria) this;
        }

        public Criteria andC82LessThanOrEqualTo(String value) {
            addCriterion("c82 <=", value, "c82");
            return (Criteria) this;
        }

        public Criteria andC82Like(String value) {
            addCriterion("c82 like", value, "c82");
            return (Criteria) this;
        }

        public Criteria andC82NotLike(String value) {
            addCriterion("c82 not like", value, "c82");
            return (Criteria) this;
        }

        public Criteria andC82In(List<String> values) {
            addCriterion("c82 in", values, "c82");
            return (Criteria) this;
        }

        public Criteria andC82NotIn(List<String> values) {
            addCriterion("c82 not in", values, "c82");
            return (Criteria) this;
        }

        public Criteria andC82Between(String value1, String value2) {
            addCriterion("c82 between", value1, value2, "c82");
            return (Criteria) this;
        }

        public Criteria andC82NotBetween(String value1, String value2) {
            addCriterion("c82 not between", value1, value2, "c82");
            return (Criteria) this;
        }

        public Criteria andC83IsNull() {
            addCriterion("c83 is null");
            return (Criteria) this;
        }

        public Criteria andC83IsNotNull() {
            addCriterion("c83 is not null");
            return (Criteria) this;
        }

        public Criteria andC83EqualTo(String value) {
            addCriterion("c83 =", value, "c83");
            return (Criteria) this;
        }

        public Criteria andC83NotEqualTo(String value) {
            addCriterion("c83 <>", value, "c83");
            return (Criteria) this;
        }

        public Criteria andC83GreaterThan(String value) {
            addCriterion("c83 >", value, "c83");
            return (Criteria) this;
        }

        public Criteria andC83GreaterThanOrEqualTo(String value) {
            addCriterion("c83 >=", value, "c83");
            return (Criteria) this;
        }

        public Criteria andC83LessThan(String value) {
            addCriterion("c83 <", value, "c83");
            return (Criteria) this;
        }

        public Criteria andC83LessThanOrEqualTo(String value) {
            addCriterion("c83 <=", value, "c83");
            return (Criteria) this;
        }

        public Criteria andC83Like(String value) {
            addCriterion("c83 like", value, "c83");
            return (Criteria) this;
        }

        public Criteria andC83NotLike(String value) {
            addCriterion("c83 not like", value, "c83");
            return (Criteria) this;
        }

        public Criteria andC83In(List<String> values) {
            addCriterion("c83 in", values, "c83");
            return (Criteria) this;
        }

        public Criteria andC83NotIn(List<String> values) {
            addCriterion("c83 not in", values, "c83");
            return (Criteria) this;
        }

        public Criteria andC83Between(String value1, String value2) {
            addCriterion("c83 between", value1, value2, "c83");
            return (Criteria) this;
        }

        public Criteria andC83NotBetween(String value1, String value2) {
            addCriterion("c83 not between", value1, value2, "c83");
            return (Criteria) this;
        }

        public Criteria andC84IsNull() {
            addCriterion("c84 is null");
            return (Criteria) this;
        }

        public Criteria andC84IsNotNull() {
            addCriterion("c84 is not null");
            return (Criteria) this;
        }

        public Criteria andC84EqualTo(String value) {
            addCriterion("c84 =", value, "c84");
            return (Criteria) this;
        }

        public Criteria andC84NotEqualTo(String value) {
            addCriterion("c84 <>", value, "c84");
            return (Criteria) this;
        }

        public Criteria andC84GreaterThan(String value) {
            addCriterion("c84 >", value, "c84");
            return (Criteria) this;
        }

        public Criteria andC84GreaterThanOrEqualTo(String value) {
            addCriterion("c84 >=", value, "c84");
            return (Criteria) this;
        }

        public Criteria andC84LessThan(String value) {
            addCriterion("c84 <", value, "c84");
            return (Criteria) this;
        }

        public Criteria andC84LessThanOrEqualTo(String value) {
            addCriterion("c84 <=", value, "c84");
            return (Criteria) this;
        }

        public Criteria andC84Like(String value) {
            addCriterion("c84 like", value, "c84");
            return (Criteria) this;
        }

        public Criteria andC84NotLike(String value) {
            addCriterion("c84 not like", value, "c84");
            return (Criteria) this;
        }

        public Criteria andC84In(List<String> values) {
            addCriterion("c84 in", values, "c84");
            return (Criteria) this;
        }

        public Criteria andC84NotIn(List<String> values) {
            addCriterion("c84 not in", values, "c84");
            return (Criteria) this;
        }

        public Criteria andC84Between(String value1, String value2) {
            addCriterion("c84 between", value1, value2, "c84");
            return (Criteria) this;
        }

        public Criteria andC84NotBetween(String value1, String value2) {
            addCriterion("c84 not between", value1, value2, "c84");
            return (Criteria) this;
        }

        public Criteria andC85IsNull() {
            addCriterion("c85 is null");
            return (Criteria) this;
        }

        public Criteria andC85IsNotNull() {
            addCriterion("c85 is not null");
            return (Criteria) this;
        }

        public Criteria andC85EqualTo(String value) {
            addCriterion("c85 =", value, "c85");
            return (Criteria) this;
        }

        public Criteria andC85NotEqualTo(String value) {
            addCriterion("c85 <>", value, "c85");
            return (Criteria) this;
        }

        public Criteria andC85GreaterThan(String value) {
            addCriterion("c85 >", value, "c85");
            return (Criteria) this;
        }

        public Criteria andC85GreaterThanOrEqualTo(String value) {
            addCriterion("c85 >=", value, "c85");
            return (Criteria) this;
        }

        public Criteria andC85LessThan(String value) {
            addCriterion("c85 <", value, "c85");
            return (Criteria) this;
        }

        public Criteria andC85LessThanOrEqualTo(String value) {
            addCriterion("c85 <=", value, "c85");
            return (Criteria) this;
        }

        public Criteria andC85Like(String value) {
            addCriterion("c85 like", value, "c85");
            return (Criteria) this;
        }

        public Criteria andC85NotLike(String value) {
            addCriterion("c85 not like", value, "c85");
            return (Criteria) this;
        }

        public Criteria andC85In(List<String> values) {
            addCriterion("c85 in", values, "c85");
            return (Criteria) this;
        }

        public Criteria andC85NotIn(List<String> values) {
            addCriterion("c85 not in", values, "c85");
            return (Criteria) this;
        }

        public Criteria andC85Between(String value1, String value2) {
            addCriterion("c85 between", value1, value2, "c85");
            return (Criteria) this;
        }

        public Criteria andC85NotBetween(String value1, String value2) {
            addCriterion("c85 not between", value1, value2, "c85");
            return (Criteria) this;
        }

        public Criteria andC86IsNull() {
            addCriterion("c86 is null");
            return (Criteria) this;
        }

        public Criteria andC86IsNotNull() {
            addCriterion("c86 is not null");
            return (Criteria) this;
        }

        public Criteria andC86EqualTo(String value) {
            addCriterion("c86 =", value, "c86");
            return (Criteria) this;
        }

        public Criteria andC86NotEqualTo(String value) {
            addCriterion("c86 <>", value, "c86");
            return (Criteria) this;
        }

        public Criteria andC86GreaterThan(String value) {
            addCriterion("c86 >", value, "c86");
            return (Criteria) this;
        }

        public Criteria andC86GreaterThanOrEqualTo(String value) {
            addCriterion("c86 >=", value, "c86");
            return (Criteria) this;
        }

        public Criteria andC86LessThan(String value) {
            addCriterion("c86 <", value, "c86");
            return (Criteria) this;
        }

        public Criteria andC86LessThanOrEqualTo(String value) {
            addCriterion("c86 <=", value, "c86");
            return (Criteria) this;
        }

        public Criteria andC86Like(String value) {
            addCriterion("c86 like", value, "c86");
            return (Criteria) this;
        }

        public Criteria andC86NotLike(String value) {
            addCriterion("c86 not like", value, "c86");
            return (Criteria) this;
        }

        public Criteria andC86In(List<String> values) {
            addCriterion("c86 in", values, "c86");
            return (Criteria) this;
        }

        public Criteria andC86NotIn(List<String> values) {
            addCriterion("c86 not in", values, "c86");
            return (Criteria) this;
        }

        public Criteria andC86Between(String value1, String value2) {
            addCriterion("c86 between", value1, value2, "c86");
            return (Criteria) this;
        }

        public Criteria andC86NotBetween(String value1, String value2) {
            addCriterion("c86 not between", value1, value2, "c86");
            return (Criteria) this;
        }

        public Criteria andC87IsNull() {
            addCriterion("c87 is null");
            return (Criteria) this;
        }

        public Criteria andC87IsNotNull() {
            addCriterion("c87 is not null");
            return (Criteria) this;
        }

        public Criteria andC87EqualTo(String value) {
            addCriterion("c87 =", value, "c87");
            return (Criteria) this;
        }

        public Criteria andC87NotEqualTo(String value) {
            addCriterion("c87 <>", value, "c87");
            return (Criteria) this;
        }

        public Criteria andC87GreaterThan(String value) {
            addCriterion("c87 >", value, "c87");
            return (Criteria) this;
        }

        public Criteria andC87GreaterThanOrEqualTo(String value) {
            addCriterion("c87 >=", value, "c87");
            return (Criteria) this;
        }

        public Criteria andC87LessThan(String value) {
            addCriterion("c87 <", value, "c87");
            return (Criteria) this;
        }

        public Criteria andC87LessThanOrEqualTo(String value) {
            addCriterion("c87 <=", value, "c87");
            return (Criteria) this;
        }

        public Criteria andC87Like(String value) {
            addCriterion("c87 like", value, "c87");
            return (Criteria) this;
        }

        public Criteria andC87NotLike(String value) {
            addCriterion("c87 not like", value, "c87");
            return (Criteria) this;
        }

        public Criteria andC87In(List<String> values) {
            addCriterion("c87 in", values, "c87");
            return (Criteria) this;
        }

        public Criteria andC87NotIn(List<String> values) {
            addCriterion("c87 not in", values, "c87");
            return (Criteria) this;
        }

        public Criteria andC87Between(String value1, String value2) {
            addCriterion("c87 between", value1, value2, "c87");
            return (Criteria) this;
        }

        public Criteria andC87NotBetween(String value1, String value2) {
            addCriterion("c87 not between", value1, value2, "c87");
            return (Criteria) this;
        }

        public Criteria andC88IsNull() {
            addCriterion("c88 is null");
            return (Criteria) this;
        }

        public Criteria andC88IsNotNull() {
            addCriterion("c88 is not null");
            return (Criteria) this;
        }

        public Criteria andC88EqualTo(String value) {
            addCriterion("c88 =", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88NotEqualTo(String value) {
            addCriterion("c88 <>", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88GreaterThan(String value) {
            addCriterion("c88 >", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88GreaterThanOrEqualTo(String value) {
            addCriterion("c88 >=", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88LessThan(String value) {
            addCriterion("c88 <", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88LessThanOrEqualTo(String value) {
            addCriterion("c88 <=", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88Like(String value) {
            addCriterion("c88 like", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88NotLike(String value) {
            addCriterion("c88 not like", value, "c88");
            return (Criteria) this;
        }

        public Criteria andC88In(List<String> values) {
            addCriterion("c88 in", values, "c88");
            return (Criteria) this;
        }

        public Criteria andC88NotIn(List<String> values) {
            addCriterion("c88 not in", values, "c88");
            return (Criteria) this;
        }

        public Criteria andC88Between(String value1, String value2) {
            addCriterion("c88 between", value1, value2, "c88");
            return (Criteria) this;
        }

        public Criteria andC88NotBetween(String value1, String value2) {
            addCriterion("c88 not between", value1, value2, "c88");
            return (Criteria) this;
        }

        public Criteria andC89IsNull() {
            addCriterion("c89 is null");
            return (Criteria) this;
        }

        public Criteria andC89IsNotNull() {
            addCriterion("c89 is not null");
            return (Criteria) this;
        }

        public Criteria andC89EqualTo(String value) {
            addCriterion("c89 =", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89NotEqualTo(String value) {
            addCriterion("c89 <>", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89GreaterThan(String value) {
            addCriterion("c89 >", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89GreaterThanOrEqualTo(String value) {
            addCriterion("c89 >=", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89LessThan(String value) {
            addCriterion("c89 <", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89LessThanOrEqualTo(String value) {
            addCriterion("c89 <=", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89Like(String value) {
            addCriterion("c89 like", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89NotLike(String value) {
            addCriterion("c89 not like", value, "c89");
            return (Criteria) this;
        }

        public Criteria andC89In(List<String> values) {
            addCriterion("c89 in", values, "c89");
            return (Criteria) this;
        }

        public Criteria andC89NotIn(List<String> values) {
            addCriterion("c89 not in", values, "c89");
            return (Criteria) this;
        }

        public Criteria andC89Between(String value1, String value2) {
            addCriterion("c89 between", value1, value2, "c89");
            return (Criteria) this;
        }

        public Criteria andC89NotBetween(String value1, String value2) {
            addCriterion("c89 not between", value1, value2, "c89");
            return (Criteria) this;
        }

        public Criteria andC90IsNull() {
            addCriterion("c90 is null");
            return (Criteria) this;
        }

        public Criteria andC90IsNotNull() {
            addCriterion("c90 is not null");
            return (Criteria) this;
        }

        public Criteria andC90EqualTo(String value) {
            addCriterion("c90 =", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90NotEqualTo(String value) {
            addCriterion("c90 <>", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90GreaterThan(String value) {
            addCriterion("c90 >", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90GreaterThanOrEqualTo(String value) {
            addCriterion("c90 >=", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90LessThan(String value) {
            addCriterion("c90 <", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90LessThanOrEqualTo(String value) {
            addCriterion("c90 <=", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90Like(String value) {
            addCriterion("c90 like", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90NotLike(String value) {
            addCriterion("c90 not like", value, "c90");
            return (Criteria) this;
        }

        public Criteria andC90In(List<String> values) {
            addCriterion("c90 in", values, "c90");
            return (Criteria) this;
        }

        public Criteria andC90NotIn(List<String> values) {
            addCriterion("c90 not in", values, "c90");
            return (Criteria) this;
        }

        public Criteria andC90Between(String value1, String value2) {
            addCriterion("c90 between", value1, value2, "c90");
            return (Criteria) this;
        }

        public Criteria andC90NotBetween(String value1, String value2) {
            addCriterion("c90 not between", value1, value2, "c90");
            return (Criteria) this;
        }

        public Criteria andC91IsNull() {
            addCriterion("c91 is null");
            return (Criteria) this;
        }

        public Criteria andC91IsNotNull() {
            addCriterion("c91 is not null");
            return (Criteria) this;
        }

        public Criteria andC91EqualTo(String value) {
            addCriterion("c91 =", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91NotEqualTo(String value) {
            addCriterion("c91 <>", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91GreaterThan(String value) {
            addCriterion("c91 >", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91GreaterThanOrEqualTo(String value) {
            addCriterion("c91 >=", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91LessThan(String value) {
            addCriterion("c91 <", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91LessThanOrEqualTo(String value) {
            addCriterion("c91 <=", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91Like(String value) {
            addCriterion("c91 like", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91NotLike(String value) {
            addCriterion("c91 not like", value, "c91");
            return (Criteria) this;
        }

        public Criteria andC91In(List<String> values) {
            addCriterion("c91 in", values, "c91");
            return (Criteria) this;
        }

        public Criteria andC91NotIn(List<String> values) {
            addCriterion("c91 not in", values, "c91");
            return (Criteria) this;
        }

        public Criteria andC91Between(String value1, String value2) {
            addCriterion("c91 between", value1, value2, "c91");
            return (Criteria) this;
        }

        public Criteria andC91NotBetween(String value1, String value2) {
            addCriterion("c91 not between", value1, value2, "c91");
            return (Criteria) this;
        }

        public Criteria andC92IsNull() {
            addCriterion("c92 is null");
            return (Criteria) this;
        }

        public Criteria andC92IsNotNull() {
            addCriterion("c92 is not null");
            return (Criteria) this;
        }

        public Criteria andC92EqualTo(String value) {
            addCriterion("c92 =", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92NotEqualTo(String value) {
            addCriterion("c92 <>", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92GreaterThan(String value) {
            addCriterion("c92 >", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92GreaterThanOrEqualTo(String value) {
            addCriterion("c92 >=", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92LessThan(String value) {
            addCriterion("c92 <", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92LessThanOrEqualTo(String value) {
            addCriterion("c92 <=", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92Like(String value) {
            addCriterion("c92 like", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92NotLike(String value) {
            addCriterion("c92 not like", value, "c92");
            return (Criteria) this;
        }

        public Criteria andC92In(List<String> values) {
            addCriterion("c92 in", values, "c92");
            return (Criteria) this;
        }

        public Criteria andC92NotIn(List<String> values) {
            addCriterion("c92 not in", values, "c92");
            return (Criteria) this;
        }

        public Criteria andC92Between(String value1, String value2) {
            addCriterion("c92 between", value1, value2, "c92");
            return (Criteria) this;
        }

        public Criteria andC92NotBetween(String value1, String value2) {
            addCriterion("c92 not between", value1, value2, "c92");
            return (Criteria) this;
        }

        public Criteria andC93IsNull() {
            addCriterion("c93 is null");
            return (Criteria) this;
        }

        public Criteria andC93IsNotNull() {
            addCriterion("c93 is not null");
            return (Criteria) this;
        }

        public Criteria andC93EqualTo(String value) {
            addCriterion("c93 =", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93NotEqualTo(String value) {
            addCriterion("c93 <>", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93GreaterThan(String value) {
            addCriterion("c93 >", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93GreaterThanOrEqualTo(String value) {
            addCriterion("c93 >=", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93LessThan(String value) {
            addCriterion("c93 <", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93LessThanOrEqualTo(String value) {
            addCriterion("c93 <=", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93Like(String value) {
            addCriterion("c93 like", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93NotLike(String value) {
            addCriterion("c93 not like", value, "c93");
            return (Criteria) this;
        }

        public Criteria andC93In(List<String> values) {
            addCriterion("c93 in", values, "c93");
            return (Criteria) this;
        }

        public Criteria andC93NotIn(List<String> values) {
            addCriterion("c93 not in", values, "c93");
            return (Criteria) this;
        }

        public Criteria andC93Between(String value1, String value2) {
            addCriterion("c93 between", value1, value2, "c93");
            return (Criteria) this;
        }

        public Criteria andC93NotBetween(String value1, String value2) {
            addCriterion("c93 not between", value1, value2, "c93");
            return (Criteria) this;
        }

        public Criteria andC94IsNull() {
            addCriterion("c94 is null");
            return (Criteria) this;
        }

        public Criteria andC94IsNotNull() {
            addCriterion("c94 is not null");
            return (Criteria) this;
        }

        public Criteria andC94EqualTo(String value) {
            addCriterion("c94 =", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94NotEqualTo(String value) {
            addCriterion("c94 <>", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94GreaterThan(String value) {
            addCriterion("c94 >", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94GreaterThanOrEqualTo(String value) {
            addCriterion("c94 >=", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94LessThan(String value) {
            addCriterion("c94 <", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94LessThanOrEqualTo(String value) {
            addCriterion("c94 <=", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94Like(String value) {
            addCriterion("c94 like", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94NotLike(String value) {
            addCriterion("c94 not like", value, "c94");
            return (Criteria) this;
        }

        public Criteria andC94In(List<String> values) {
            addCriterion("c94 in", values, "c94");
            return (Criteria) this;
        }

        public Criteria andC94NotIn(List<String> values) {
            addCriterion("c94 not in", values, "c94");
            return (Criteria) this;
        }

        public Criteria andC94Between(String value1, String value2) {
            addCriterion("c94 between", value1, value2, "c94");
            return (Criteria) this;
        }

        public Criteria andC94NotBetween(String value1, String value2) {
            addCriterion("c94 not between", value1, value2, "c94");
            return (Criteria) this;
        }

        public Criteria andC95IsNull() {
            addCriterion("c95 is null");
            return (Criteria) this;
        }

        public Criteria andC95IsNotNull() {
            addCriterion("c95 is not null");
            return (Criteria) this;
        }

        public Criteria andC95EqualTo(String value) {
            addCriterion("c95 =", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95NotEqualTo(String value) {
            addCriterion("c95 <>", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95GreaterThan(String value) {
            addCriterion("c95 >", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95GreaterThanOrEqualTo(String value) {
            addCriterion("c95 >=", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95LessThan(String value) {
            addCriterion("c95 <", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95LessThanOrEqualTo(String value) {
            addCriterion("c95 <=", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95Like(String value) {
            addCriterion("c95 like", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95NotLike(String value) {
            addCriterion("c95 not like", value, "c95");
            return (Criteria) this;
        }

        public Criteria andC95In(List<String> values) {
            addCriterion("c95 in", values, "c95");
            return (Criteria) this;
        }

        public Criteria andC95NotIn(List<String> values) {
            addCriterion("c95 not in", values, "c95");
            return (Criteria) this;
        }

        public Criteria andC95Between(String value1, String value2) {
            addCriterion("c95 between", value1, value2, "c95");
            return (Criteria) this;
        }

        public Criteria andC95NotBetween(String value1, String value2) {
            addCriterion("c95 not between", value1, value2, "c95");
            return (Criteria) this;
        }

        public Criteria andC96IsNull() {
            addCriterion("c96 is null");
            return (Criteria) this;
        }

        public Criteria andC96IsNotNull() {
            addCriterion("c96 is not null");
            return (Criteria) this;
        }

        public Criteria andC96EqualTo(String value) {
            addCriterion("c96 =", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96NotEqualTo(String value) {
            addCriterion("c96 <>", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96GreaterThan(String value) {
            addCriterion("c96 >", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96GreaterThanOrEqualTo(String value) {
            addCriterion("c96 >=", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96LessThan(String value) {
            addCriterion("c96 <", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96LessThanOrEqualTo(String value) {
            addCriterion("c96 <=", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96Like(String value) {
            addCriterion("c96 like", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96NotLike(String value) {
            addCriterion("c96 not like", value, "c96");
            return (Criteria) this;
        }

        public Criteria andC96In(List<String> values) {
            addCriterion("c96 in", values, "c96");
            return (Criteria) this;
        }

        public Criteria andC96NotIn(List<String> values) {
            addCriterion("c96 not in", values, "c96");
            return (Criteria) this;
        }

        public Criteria andC96Between(String value1, String value2) {
            addCriterion("c96 between", value1, value2, "c96");
            return (Criteria) this;
        }

        public Criteria andC96NotBetween(String value1, String value2) {
            addCriterion("c96 not between", value1, value2, "c96");
            return (Criteria) this;
        }

        public Criteria andC97IsNull() {
            addCriterion("c97 is null");
            return (Criteria) this;
        }

        public Criteria andC97IsNotNull() {
            addCriterion("c97 is not null");
            return (Criteria) this;
        }

        public Criteria andC97EqualTo(String value) {
            addCriterion("c97 =", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97NotEqualTo(String value) {
            addCriterion("c97 <>", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97GreaterThan(String value) {
            addCriterion("c97 >", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97GreaterThanOrEqualTo(String value) {
            addCriterion("c97 >=", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97LessThan(String value) {
            addCriterion("c97 <", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97LessThanOrEqualTo(String value) {
            addCriterion("c97 <=", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97Like(String value) {
            addCriterion("c97 like", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97NotLike(String value) {
            addCriterion("c97 not like", value, "c97");
            return (Criteria) this;
        }

        public Criteria andC97In(List<String> values) {
            addCriterion("c97 in", values, "c97");
            return (Criteria) this;
        }

        public Criteria andC97NotIn(List<String> values) {
            addCriterion("c97 not in", values, "c97");
            return (Criteria) this;
        }

        public Criteria andC97Between(String value1, String value2) {
            addCriterion("c97 between", value1, value2, "c97");
            return (Criteria) this;
        }

        public Criteria andC97NotBetween(String value1, String value2) {
            addCriterion("c97 not between", value1, value2, "c97");
            return (Criteria) this;
        }

        public Criteria andC98IsNull() {
            addCriterion("c98 is null");
            return (Criteria) this;
        }

        public Criteria andC98IsNotNull() {
            addCriterion("c98 is not null");
            return (Criteria) this;
        }

        public Criteria andC98EqualTo(String value) {
            addCriterion("c98 =", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98NotEqualTo(String value) {
            addCriterion("c98 <>", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98GreaterThan(String value) {
            addCriterion("c98 >", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98GreaterThanOrEqualTo(String value) {
            addCriterion("c98 >=", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98LessThan(String value) {
            addCriterion("c98 <", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98LessThanOrEqualTo(String value) {
            addCriterion("c98 <=", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98Like(String value) {
            addCriterion("c98 like", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98NotLike(String value) {
            addCriterion("c98 not like", value, "c98");
            return (Criteria) this;
        }

        public Criteria andC98In(List<String> values) {
            addCriterion("c98 in", values, "c98");
            return (Criteria) this;
        }

        public Criteria andC98NotIn(List<String> values) {
            addCriterion("c98 not in", values, "c98");
            return (Criteria) this;
        }

        public Criteria andC98Between(String value1, String value2) {
            addCriterion("c98 between", value1, value2, "c98");
            return (Criteria) this;
        }

        public Criteria andC98NotBetween(String value1, String value2) {
            addCriterion("c98 not between", value1, value2, "c98");
            return (Criteria) this;
        }

        public Criteria andC99IsNull() {
            addCriterion("c99 is null");
            return (Criteria) this;
        }

        public Criteria andC99IsNotNull() {
            addCriterion("c99 is not null");
            return (Criteria) this;
        }

        public Criteria andC99EqualTo(String value) {
            addCriterion("c99 =", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99NotEqualTo(String value) {
            addCriterion("c99 <>", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99GreaterThan(String value) {
            addCriterion("c99 >", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99GreaterThanOrEqualTo(String value) {
            addCriterion("c99 >=", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99LessThan(String value) {
            addCriterion("c99 <", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99LessThanOrEqualTo(String value) {
            addCriterion("c99 <=", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99Like(String value) {
            addCriterion("c99 like", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99NotLike(String value) {
            addCriterion("c99 not like", value, "c99");
            return (Criteria) this;
        }

        public Criteria andC99In(List<String> values) {
            addCriterion("c99 in", values, "c99");
            return (Criteria) this;
        }

        public Criteria andC99NotIn(List<String> values) {
            addCriterion("c99 not in", values, "c99");
            return (Criteria) this;
        }

        public Criteria andC99Between(String value1, String value2) {
            addCriterion("c99 between", value1, value2, "c99");
            return (Criteria) this;
        }

        public Criteria andC99NotBetween(String value1, String value2) {
            addCriterion("c99 not between", value1, value2, "c99");
            return (Criteria) this;
        }

        public Criteria andC100IsNull() {
            addCriterion("c100 is null");
            return (Criteria) this;
        }

        public Criteria andC100IsNotNull() {
            addCriterion("c100 is not null");
            return (Criteria) this;
        }

        public Criteria andC100EqualTo(String value) {
            addCriterion("c100 =", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100NotEqualTo(String value) {
            addCriterion("c100 <>", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100GreaterThan(String value) {
            addCriterion("c100 >", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100GreaterThanOrEqualTo(String value) {
            addCriterion("c100 >=", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100LessThan(String value) {
            addCriterion("c100 <", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100LessThanOrEqualTo(String value) {
            addCriterion("c100 <=", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100Like(String value) {
            addCriterion("c100 like", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100NotLike(String value) {
            addCriterion("c100 not like", value, "c100");
            return (Criteria) this;
        }

        public Criteria andC100In(List<String> values) {
            addCriterion("c100 in", values, "c100");
            return (Criteria) this;
        }

        public Criteria andC100NotIn(List<String> values) {
            addCriterion("c100 not in", values, "c100");
            return (Criteria) this;
        }

        public Criteria andC100Between(String value1, String value2) {
            addCriterion("c100 between", value1, value2, "c100");
            return (Criteria) this;
        }

        public Criteria andC100NotBetween(String value1, String value2) {
            addCriterion("c100 not between", value1, value2, "c100");
            return (Criteria) this;
        }

        public Criteria andC101IsNull() {
            addCriterion("c101 is null");
            return (Criteria) this;
        }

        public Criteria andC101IsNotNull() {
            addCriterion("c101 is not null");
            return (Criteria) this;
        }

        public Criteria andC101EqualTo(String value) {
            addCriterion("c101 =", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101NotEqualTo(String value) {
            addCriterion("c101 <>", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101GreaterThan(String value) {
            addCriterion("c101 >", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101GreaterThanOrEqualTo(String value) {
            addCriterion("c101 >=", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101LessThan(String value) {
            addCriterion("c101 <", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101LessThanOrEqualTo(String value) {
            addCriterion("c101 <=", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101Like(String value) {
            addCriterion("c101 like", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101NotLike(String value) {
            addCriterion("c101 not like", value, "c101");
            return (Criteria) this;
        }

        public Criteria andC101In(List<String> values) {
            addCriterion("c101 in", values, "c101");
            return (Criteria) this;
        }

        public Criteria andC101NotIn(List<String> values) {
            addCriterion("c101 not in", values, "c101");
            return (Criteria) this;
        }

        public Criteria andC101Between(String value1, String value2) {
            addCriterion("c101 between", value1, value2, "c101");
            return (Criteria) this;
        }

        public Criteria andC101NotBetween(String value1, String value2) {
            addCriterion("c101 not between", value1, value2, "c101");
            return (Criteria) this;
        }

        public Criteria andC102IsNull() {
            addCriterion("c102 is null");
            return (Criteria) this;
        }

        public Criteria andC102IsNotNull() {
            addCriterion("c102 is not null");
            return (Criteria) this;
        }

        public Criteria andC102EqualTo(String value) {
            addCriterion("c102 =", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102NotEqualTo(String value) {
            addCriterion("c102 <>", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102GreaterThan(String value) {
            addCriterion("c102 >", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102GreaterThanOrEqualTo(String value) {
            addCriterion("c102 >=", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102LessThan(String value) {
            addCriterion("c102 <", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102LessThanOrEqualTo(String value) {
            addCriterion("c102 <=", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102Like(String value) {
            addCriterion("c102 like", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102NotLike(String value) {
            addCriterion("c102 not like", value, "c102");
            return (Criteria) this;
        }

        public Criteria andC102In(List<String> values) {
            addCriterion("c102 in", values, "c102");
            return (Criteria) this;
        }

        public Criteria andC102NotIn(List<String> values) {
            addCriterion("c102 not in", values, "c102");
            return (Criteria) this;
        }

        public Criteria andC102Between(String value1, String value2) {
            addCriterion("c102 between", value1, value2, "c102");
            return (Criteria) this;
        }

        public Criteria andC102NotBetween(String value1, String value2) {
            addCriterion("c102 not between", value1, value2, "c102");
            return (Criteria) this;
        }

        public Criteria andC103IsNull() {
            addCriterion("c103 is null");
            return (Criteria) this;
        }

        public Criteria andC103IsNotNull() {
            addCriterion("c103 is not null");
            return (Criteria) this;
        }

        public Criteria andC103EqualTo(String value) {
            addCriterion("c103 =", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103NotEqualTo(String value) {
            addCriterion("c103 <>", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103GreaterThan(String value) {
            addCriterion("c103 >", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103GreaterThanOrEqualTo(String value) {
            addCriterion("c103 >=", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103LessThan(String value) {
            addCriterion("c103 <", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103LessThanOrEqualTo(String value) {
            addCriterion("c103 <=", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103Like(String value) {
            addCriterion("c103 like", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103NotLike(String value) {
            addCriterion("c103 not like", value, "c103");
            return (Criteria) this;
        }

        public Criteria andC103In(List<String> values) {
            addCriterion("c103 in", values, "c103");
            return (Criteria) this;
        }

        public Criteria andC103NotIn(List<String> values) {
            addCriterion("c103 not in", values, "c103");
            return (Criteria) this;
        }

        public Criteria andC103Between(String value1, String value2) {
            addCriterion("c103 between", value1, value2, "c103");
            return (Criteria) this;
        }

        public Criteria andC103NotBetween(String value1, String value2) {
            addCriterion("c103 not between", value1, value2, "c103");
            return (Criteria) this;
        }

        public Criteria andC104IsNull() {
            addCriterion("c104 is null");
            return (Criteria) this;
        }

        public Criteria andC104IsNotNull() {
            addCriterion("c104 is not null");
            return (Criteria) this;
        }

        public Criteria andC104EqualTo(String value) {
            addCriterion("c104 =", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104NotEqualTo(String value) {
            addCriterion("c104 <>", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104GreaterThan(String value) {
            addCriterion("c104 >", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104GreaterThanOrEqualTo(String value) {
            addCriterion("c104 >=", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104LessThan(String value) {
            addCriterion("c104 <", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104LessThanOrEqualTo(String value) {
            addCriterion("c104 <=", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104Like(String value) {
            addCriterion("c104 like", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104NotLike(String value) {
            addCriterion("c104 not like", value, "c104");
            return (Criteria) this;
        }

        public Criteria andC104In(List<String> values) {
            addCriterion("c104 in", values, "c104");
            return (Criteria) this;
        }

        public Criteria andC104NotIn(List<String> values) {
            addCriterion("c104 not in", values, "c104");
            return (Criteria) this;
        }

        public Criteria andC104Between(String value1, String value2) {
            addCriterion("c104 between", value1, value2, "c104");
            return (Criteria) this;
        }

        public Criteria andC104NotBetween(String value1, String value2) {
            addCriterion("c104 not between", value1, value2, "c104");
            return (Criteria) this;
        }

        public Criteria andC105IsNull() {
            addCriterion("c105 is null");
            return (Criteria) this;
        }

        public Criteria andC105IsNotNull() {
            addCriterion("c105 is not null");
            return (Criteria) this;
        }

        public Criteria andC105EqualTo(String value) {
            addCriterion("c105 =", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105NotEqualTo(String value) {
            addCriterion("c105 <>", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105GreaterThan(String value) {
            addCriterion("c105 >", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105GreaterThanOrEqualTo(String value) {
            addCriterion("c105 >=", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105LessThan(String value) {
            addCriterion("c105 <", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105LessThanOrEqualTo(String value) {
            addCriterion("c105 <=", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105Like(String value) {
            addCriterion("c105 like", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105NotLike(String value) {
            addCriterion("c105 not like", value, "c105");
            return (Criteria) this;
        }

        public Criteria andC105In(List<String> values) {
            addCriterion("c105 in", values, "c105");
            return (Criteria) this;
        }

        public Criteria andC105NotIn(List<String> values) {
            addCriterion("c105 not in", values, "c105");
            return (Criteria) this;
        }

        public Criteria andC105Between(String value1, String value2) {
            addCriterion("c105 between", value1, value2, "c105");
            return (Criteria) this;
        }

        public Criteria andC105NotBetween(String value1, String value2) {
            addCriterion("c105 not between", value1, value2, "c105");
            return (Criteria) this;
        }

        public Criteria andC106IsNull() {
            addCriterion("c106 is null");
            return (Criteria) this;
        }

        public Criteria andC106IsNotNull() {
            addCriterion("c106 is not null");
            return (Criteria) this;
        }

        public Criteria andC106EqualTo(String value) {
            addCriterion("c106 =", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106NotEqualTo(String value) {
            addCriterion("c106 <>", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106GreaterThan(String value) {
            addCriterion("c106 >", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106GreaterThanOrEqualTo(String value) {
            addCriterion("c106 >=", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106LessThan(String value) {
            addCriterion("c106 <", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106LessThanOrEqualTo(String value) {
            addCriterion("c106 <=", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106Like(String value) {
            addCriterion("c106 like", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106NotLike(String value) {
            addCriterion("c106 not like", value, "c106");
            return (Criteria) this;
        }

        public Criteria andC106In(List<String> values) {
            addCriterion("c106 in", values, "c106");
            return (Criteria) this;
        }

        public Criteria andC106NotIn(List<String> values) {
            addCriterion("c106 not in", values, "c106");
            return (Criteria) this;
        }

        public Criteria andC106Between(String value1, String value2) {
            addCriterion("c106 between", value1, value2, "c106");
            return (Criteria) this;
        }

        public Criteria andC106NotBetween(String value1, String value2) {
            addCriterion("c106 not between", value1, value2, "c106");
            return (Criteria) this;
        }

        public Criteria andC107IsNull() {
            addCriterion("c107 is null");
            return (Criteria) this;
        }

        public Criteria andC107IsNotNull() {
            addCriterion("c107 is not null");
            return (Criteria) this;
        }

        public Criteria andC107EqualTo(String value) {
            addCriterion("c107 =", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107NotEqualTo(String value) {
            addCriterion("c107 <>", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107GreaterThan(String value) {
            addCriterion("c107 >", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107GreaterThanOrEqualTo(String value) {
            addCriterion("c107 >=", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107LessThan(String value) {
            addCriterion("c107 <", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107LessThanOrEqualTo(String value) {
            addCriterion("c107 <=", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107Like(String value) {
            addCriterion("c107 like", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107NotLike(String value) {
            addCriterion("c107 not like", value, "c107");
            return (Criteria) this;
        }

        public Criteria andC107In(List<String> values) {
            addCriterion("c107 in", values, "c107");
            return (Criteria) this;
        }

        public Criteria andC107NotIn(List<String> values) {
            addCriterion("c107 not in", values, "c107");
            return (Criteria) this;
        }

        public Criteria andC107Between(String value1, String value2) {
            addCriterion("c107 between", value1, value2, "c107");
            return (Criteria) this;
        }

        public Criteria andC107NotBetween(String value1, String value2) {
            addCriterion("c107 not between", value1, value2, "c107");
            return (Criteria) this;
        }

        public Criteria andC108IsNull() {
            addCriterion("c108 is null");
            return (Criteria) this;
        }

        public Criteria andC108IsNotNull() {
            addCriterion("c108 is not null");
            return (Criteria) this;
        }

        public Criteria andC108EqualTo(String value) {
            addCriterion("c108 =", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108NotEqualTo(String value) {
            addCriterion("c108 <>", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108GreaterThan(String value) {
            addCriterion("c108 >", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108GreaterThanOrEqualTo(String value) {
            addCriterion("c108 >=", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108LessThan(String value) {
            addCriterion("c108 <", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108LessThanOrEqualTo(String value) {
            addCriterion("c108 <=", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108Like(String value) {
            addCriterion("c108 like", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108NotLike(String value) {
            addCriterion("c108 not like", value, "c108");
            return (Criteria) this;
        }

        public Criteria andC108In(List<String> values) {
            addCriterion("c108 in", values, "c108");
            return (Criteria) this;
        }

        public Criteria andC108NotIn(List<String> values) {
            addCriterion("c108 not in", values, "c108");
            return (Criteria) this;
        }

        public Criteria andC108Between(String value1, String value2) {
            addCriterion("c108 between", value1, value2, "c108");
            return (Criteria) this;
        }

        public Criteria andC108NotBetween(String value1, String value2) {
            addCriterion("c108 not between", value1, value2, "c108");
            return (Criteria) this;
        }

        public Criteria andC109IsNull() {
            addCriterion("c109 is null");
            return (Criteria) this;
        }

        public Criteria andC109IsNotNull() {
            addCriterion("c109 is not null");
            return (Criteria) this;
        }

        public Criteria andC109EqualTo(String value) {
            addCriterion("c109 =", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109NotEqualTo(String value) {
            addCriterion("c109 <>", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109GreaterThan(String value) {
            addCriterion("c109 >", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109GreaterThanOrEqualTo(String value) {
            addCriterion("c109 >=", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109LessThan(String value) {
            addCriterion("c109 <", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109LessThanOrEqualTo(String value) {
            addCriterion("c109 <=", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109Like(String value) {
            addCriterion("c109 like", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109NotLike(String value) {
            addCriterion("c109 not like", value, "c109");
            return (Criteria) this;
        }

        public Criteria andC109In(List<String> values) {
            addCriterion("c109 in", values, "c109");
            return (Criteria) this;
        }

        public Criteria andC109NotIn(List<String> values) {
            addCriterion("c109 not in", values, "c109");
            return (Criteria) this;
        }

        public Criteria andC109Between(String value1, String value2) {
            addCriterion("c109 between", value1, value2, "c109");
            return (Criteria) this;
        }

        public Criteria andC109NotBetween(String value1, String value2) {
            addCriterion("c109 not between", value1, value2, "c109");
            return (Criteria) this;
        }

        public Criteria andC110IsNull() {
            addCriterion("c110 is null");
            return (Criteria) this;
        }

        public Criteria andC110IsNotNull() {
            addCriterion("c110 is not null");
            return (Criteria) this;
        }

        public Criteria andC110EqualTo(String value) {
            addCriterion("c110 =", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110NotEqualTo(String value) {
            addCriterion("c110 <>", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110GreaterThan(String value) {
            addCriterion("c110 >", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110GreaterThanOrEqualTo(String value) {
            addCriterion("c110 >=", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110LessThan(String value) {
            addCriterion("c110 <", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110LessThanOrEqualTo(String value) {
            addCriterion("c110 <=", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110Like(String value) {
            addCriterion("c110 like", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110NotLike(String value) {
            addCriterion("c110 not like", value, "c110");
            return (Criteria) this;
        }

        public Criteria andC110In(List<String> values) {
            addCriterion("c110 in", values, "c110");
            return (Criteria) this;
        }

        public Criteria andC110NotIn(List<String> values) {
            addCriterion("c110 not in", values, "c110");
            return (Criteria) this;
        }

        public Criteria andC110Between(String value1, String value2) {
            addCriterion("c110 between", value1, value2, "c110");
            return (Criteria) this;
        }

        public Criteria andC110NotBetween(String value1, String value2) {
            addCriterion("c110 not between", value1, value2, "c110");
            return (Criteria) this;
        }

        public Criteria andC111IsNull() {
            addCriterion("c111 is null");
            return (Criteria) this;
        }

        public Criteria andC111IsNotNull() {
            addCriterion("c111 is not null");
            return (Criteria) this;
        }

        public Criteria andC111EqualTo(String value) {
            addCriterion("c111 =", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111NotEqualTo(String value) {
            addCriterion("c111 <>", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111GreaterThan(String value) {
            addCriterion("c111 >", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111GreaterThanOrEqualTo(String value) {
            addCriterion("c111 >=", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111LessThan(String value) {
            addCriterion("c111 <", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111LessThanOrEqualTo(String value) {
            addCriterion("c111 <=", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111Like(String value) {
            addCriterion("c111 like", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111NotLike(String value) {
            addCriterion("c111 not like", value, "c111");
            return (Criteria) this;
        }

        public Criteria andC111In(List<String> values) {
            addCriterion("c111 in", values, "c111");
            return (Criteria) this;
        }

        public Criteria andC111NotIn(List<String> values) {
            addCriterion("c111 not in", values, "c111");
            return (Criteria) this;
        }

        public Criteria andC111Between(String value1, String value2) {
            addCriterion("c111 between", value1, value2, "c111");
            return (Criteria) this;
        }

        public Criteria andC111NotBetween(String value1, String value2) {
            addCriterion("c111 not between", value1, value2, "c111");
            return (Criteria) this;
        }

        public Criteria andC112IsNull() {
            addCriterion("c112 is null");
            return (Criteria) this;
        }

        public Criteria andC112IsNotNull() {
            addCriterion("c112 is not null");
            return (Criteria) this;
        }

        public Criteria andC112EqualTo(String value) {
            addCriterion("c112 =", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112NotEqualTo(String value) {
            addCriterion("c112 <>", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112GreaterThan(String value) {
            addCriterion("c112 >", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112GreaterThanOrEqualTo(String value) {
            addCriterion("c112 >=", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112LessThan(String value) {
            addCriterion("c112 <", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112LessThanOrEqualTo(String value) {
            addCriterion("c112 <=", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112Like(String value) {
            addCriterion("c112 like", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112NotLike(String value) {
            addCriterion("c112 not like", value, "c112");
            return (Criteria) this;
        }

        public Criteria andC112In(List<String> values) {
            addCriterion("c112 in", values, "c112");
            return (Criteria) this;
        }

        public Criteria andC112NotIn(List<String> values) {
            addCriterion("c112 not in", values, "c112");
            return (Criteria) this;
        }

        public Criteria andC112Between(String value1, String value2) {
            addCriterion("c112 between", value1, value2, "c112");
            return (Criteria) this;
        }

        public Criteria andC112NotBetween(String value1, String value2) {
            addCriterion("c112 not between", value1, value2, "c112");
            return (Criteria) this;
        }

        public Criteria andC113IsNull() {
            addCriterion("c113 is null");
            return (Criteria) this;
        }

        public Criteria andC113IsNotNull() {
            addCriterion("c113 is not null");
            return (Criteria) this;
        }

        public Criteria andC113EqualTo(String value) {
            addCriterion("c113 =", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113NotEqualTo(String value) {
            addCriterion("c113 <>", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113GreaterThan(String value) {
            addCriterion("c113 >", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113GreaterThanOrEqualTo(String value) {
            addCriterion("c113 >=", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113LessThan(String value) {
            addCriterion("c113 <", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113LessThanOrEqualTo(String value) {
            addCriterion("c113 <=", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113Like(String value) {
            addCriterion("c113 like", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113NotLike(String value) {
            addCriterion("c113 not like", value, "c113");
            return (Criteria) this;
        }

        public Criteria andC113In(List<String> values) {
            addCriterion("c113 in", values, "c113");
            return (Criteria) this;
        }

        public Criteria andC113NotIn(List<String> values) {
            addCriterion("c113 not in", values, "c113");
            return (Criteria) this;
        }

        public Criteria andC113Between(String value1, String value2) {
            addCriterion("c113 between", value1, value2, "c113");
            return (Criteria) this;
        }

        public Criteria andC113NotBetween(String value1, String value2) {
            addCriterion("c113 not between", value1, value2, "c113");
            return (Criteria) this;
        }

        public Criteria andC114IsNull() {
            addCriterion("c114 is null");
            return (Criteria) this;
        }

        public Criteria andC114IsNotNull() {
            addCriterion("c114 is not null");
            return (Criteria) this;
        }

        public Criteria andC114EqualTo(String value) {
            addCriterion("c114 =", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114NotEqualTo(String value) {
            addCriterion("c114 <>", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114GreaterThan(String value) {
            addCriterion("c114 >", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114GreaterThanOrEqualTo(String value) {
            addCriterion("c114 >=", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114LessThan(String value) {
            addCriterion("c114 <", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114LessThanOrEqualTo(String value) {
            addCriterion("c114 <=", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114Like(String value) {
            addCriterion("c114 like", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114NotLike(String value) {
            addCriterion("c114 not like", value, "c114");
            return (Criteria) this;
        }

        public Criteria andC114In(List<String> values) {
            addCriterion("c114 in", values, "c114");
            return (Criteria) this;
        }

        public Criteria andC114NotIn(List<String> values) {
            addCriterion("c114 not in", values, "c114");
            return (Criteria) this;
        }

        public Criteria andC114Between(String value1, String value2) {
            addCriterion("c114 between", value1, value2, "c114");
            return (Criteria) this;
        }

        public Criteria andC114NotBetween(String value1, String value2) {
            addCriterion("c114 not between", value1, value2, "c114");
            return (Criteria) this;
        }

        public Criteria andC115IsNull() {
            addCriterion("c115 is null");
            return (Criteria) this;
        }

        public Criteria andC115IsNotNull() {
            addCriterion("c115 is not null");
            return (Criteria) this;
        }

        public Criteria andC115EqualTo(Date value) {
            addCriterionForJDBCDate("c115 =", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115NotEqualTo(Date value) {
            addCriterionForJDBCDate("c115 <>", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115GreaterThan(Date value) {
            addCriterionForJDBCDate("c115 >", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c115 >=", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115LessThan(Date value) {
            addCriterionForJDBCDate("c115 <", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c115 <=", value, "c115");
            return (Criteria) this;
        }

        public Criteria andC115In(List<Date> values) {
            addCriterionForJDBCDate("c115 in", values, "c115");
            return (Criteria) this;
        }

        public Criteria andC115NotIn(List<Date> values) {
            addCriterionForJDBCDate("c115 not in", values, "c115");
            return (Criteria) this;
        }

        public Criteria andC115Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c115 between", value1, value2, "c115");
            return (Criteria) this;
        }

        public Criteria andC115NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c115 not between", value1, value2, "c115");
            return (Criteria) this;
        }

        public Criteria andC116IsNull() {
            addCriterion("c116 is null");
            return (Criteria) this;
        }

        public Criteria andC116IsNotNull() {
            addCriterion("c116 is not null");
            return (Criteria) this;
        }

        public Criteria andC116EqualTo(String value) {
            addCriterion("c116 =", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116NotEqualTo(String value) {
            addCriterion("c116 <>", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116GreaterThan(String value) {
            addCriterion("c116 >", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116GreaterThanOrEqualTo(String value) {
            addCriterion("c116 >=", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116LessThan(String value) {
            addCriterion("c116 <", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116LessThanOrEqualTo(String value) {
            addCriterion("c116 <=", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116Like(String value) {
            addCriterion("c116 like", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116NotLike(String value) {
            addCriterion("c116 not like", value, "c116");
            return (Criteria) this;
        }

        public Criteria andC116In(List<String> values) {
            addCriterion("c116 in", values, "c116");
            return (Criteria) this;
        }

        public Criteria andC116NotIn(List<String> values) {
            addCriterion("c116 not in", values, "c116");
            return (Criteria) this;
        }

        public Criteria andC116Between(String value1, String value2) {
            addCriterion("c116 between", value1, value2, "c116");
            return (Criteria) this;
        }

        public Criteria andC116NotBetween(String value1, String value2) {
            addCriterion("c116 not between", value1, value2, "c116");
            return (Criteria) this;
        }

        public Criteria andC117IsNull() {
            addCriterion("c117 is null");
            return (Criteria) this;
        }

        public Criteria andC117IsNotNull() {
            addCriterion("c117 is not null");
            return (Criteria) this;
        }

        public Criteria andC117EqualTo(Date value) {
            addCriterionForJDBCDate("c117 =", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117NotEqualTo(Date value) {
            addCriterionForJDBCDate("c117 <>", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117GreaterThan(Date value) {
            addCriterionForJDBCDate("c117 >", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c117 >=", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117LessThan(Date value) {
            addCriterionForJDBCDate("c117 <", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c117 <=", value, "c117");
            return (Criteria) this;
        }

        public Criteria andC117In(List<Date> values) {
            addCriterionForJDBCDate("c117 in", values, "c117");
            return (Criteria) this;
        }

        public Criteria andC117NotIn(List<Date> values) {
            addCriterionForJDBCDate("c117 not in", values, "c117");
            return (Criteria) this;
        }

        public Criteria andC117Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c117 between", value1, value2, "c117");
            return (Criteria) this;
        }

        public Criteria andC117NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c117 not between", value1, value2, "c117");
            return (Criteria) this;
        }

        public Criteria andC118IsNull() {
            addCriterion("c118 is null");
            return (Criteria) this;
        }

        public Criteria andC118IsNotNull() {
            addCriterion("c118 is not null");
            return (Criteria) this;
        }

        public Criteria andC118EqualTo(String value) {
            addCriterion("c118 =", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118NotEqualTo(String value) {
            addCriterion("c118 <>", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118GreaterThan(String value) {
            addCriterion("c118 >", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118GreaterThanOrEqualTo(String value) {
            addCriterion("c118 >=", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118LessThan(String value) {
            addCriterion("c118 <", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118LessThanOrEqualTo(String value) {
            addCriterion("c118 <=", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118Like(String value) {
            addCriterion("c118 like", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118NotLike(String value) {
            addCriterion("c118 not like", value, "c118");
            return (Criteria) this;
        }

        public Criteria andC118In(List<String> values) {
            addCriterion("c118 in", values, "c118");
            return (Criteria) this;
        }

        public Criteria andC118NotIn(List<String> values) {
            addCriterion("c118 not in", values, "c118");
            return (Criteria) this;
        }

        public Criteria andC118Between(String value1, String value2) {
            addCriterion("c118 between", value1, value2, "c118");
            return (Criteria) this;
        }

        public Criteria andC118NotBetween(String value1, String value2) {
            addCriterion("c118 not between", value1, value2, "c118");
            return (Criteria) this;
        }

        public Criteria andC119IsNull() {
            addCriterion("c119 is null");
            return (Criteria) this;
        }

        public Criteria andC119IsNotNull() {
            addCriterion("c119 is not null");
            return (Criteria) this;
        }

        public Criteria andC119EqualTo(String value) {
            addCriterion("c119 =", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119NotEqualTo(String value) {
            addCriterion("c119 <>", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119GreaterThan(String value) {
            addCriterion("c119 >", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119GreaterThanOrEqualTo(String value) {
            addCriterion("c119 >=", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119LessThan(String value) {
            addCriterion("c119 <", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119LessThanOrEqualTo(String value) {
            addCriterion("c119 <=", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119Like(String value) {
            addCriterion("c119 like", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119NotLike(String value) {
            addCriterion("c119 not like", value, "c119");
            return (Criteria) this;
        }

        public Criteria andC119In(List<String> values) {
            addCriterion("c119 in", values, "c119");
            return (Criteria) this;
        }

        public Criteria andC119NotIn(List<String> values) {
            addCriterion("c119 not in", values, "c119");
            return (Criteria) this;
        }

        public Criteria andC119Between(String value1, String value2) {
            addCriterion("c119 between", value1, value2, "c119");
            return (Criteria) this;
        }

        public Criteria andC119NotBetween(String value1, String value2) {
            addCriterion("c119 not between", value1, value2, "c119");
            return (Criteria) this;
        }

        public Criteria andC120IsNull() {
            addCriterion("c120 is null");
            return (Criteria) this;
        }

        public Criteria andC120IsNotNull() {
            addCriterion("c120 is not null");
            return (Criteria) this;
        }

        public Criteria andC120EqualTo(String value) {
            addCriterion("c120 =", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120NotEqualTo(String value) {
            addCriterion("c120 <>", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120GreaterThan(String value) {
            addCriterion("c120 >", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120GreaterThanOrEqualTo(String value) {
            addCriterion("c120 >=", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120LessThan(String value) {
            addCriterion("c120 <", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120LessThanOrEqualTo(String value) {
            addCriterion("c120 <=", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120Like(String value) {
            addCriterion("c120 like", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120NotLike(String value) {
            addCriterion("c120 not like", value, "c120");
            return (Criteria) this;
        }

        public Criteria andC120In(List<String> values) {
            addCriterion("c120 in", values, "c120");
            return (Criteria) this;
        }

        public Criteria andC120NotIn(List<String> values) {
            addCriterion("c120 not in", values, "c120");
            return (Criteria) this;
        }

        public Criteria andC120Between(String value1, String value2) {
            addCriterion("c120 between", value1, value2, "c120");
            return (Criteria) this;
        }

        public Criteria andC120NotBetween(String value1, String value2) {
            addCriterion("c120 not between", value1, value2, "c120");
            return (Criteria) this;
        }

        public Criteria andC121IsNull() {
            addCriterion("c121 is null");
            return (Criteria) this;
        }

        public Criteria andC121IsNotNull() {
            addCriterion("c121 is not null");
            return (Criteria) this;
        }

        public Criteria andC121EqualTo(String value) {
            addCriterion("c121 =", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121NotEqualTo(String value) {
            addCriterion("c121 <>", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121GreaterThan(String value) {
            addCriterion("c121 >", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121GreaterThanOrEqualTo(String value) {
            addCriterion("c121 >=", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121LessThan(String value) {
            addCriterion("c121 <", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121LessThanOrEqualTo(String value) {
            addCriterion("c121 <=", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121Like(String value) {
            addCriterion("c121 like", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121NotLike(String value) {
            addCriterion("c121 not like", value, "c121");
            return (Criteria) this;
        }

        public Criteria andC121In(List<String> values) {
            addCriterion("c121 in", values, "c121");
            return (Criteria) this;
        }

        public Criteria andC121NotIn(List<String> values) {
            addCriterion("c121 not in", values, "c121");
            return (Criteria) this;
        }

        public Criteria andC121Between(String value1, String value2) {
            addCriterion("c121 between", value1, value2, "c121");
            return (Criteria) this;
        }

        public Criteria andC121NotBetween(String value1, String value2) {
            addCriterion("c121 not between", value1, value2, "c121");
            return (Criteria) this;
        }

        public Criteria andC122IsNull() {
            addCriterion("c122 is null");
            return (Criteria) this;
        }

        public Criteria andC122IsNotNull() {
            addCriterion("c122 is not null");
            return (Criteria) this;
        }

        public Criteria andC122EqualTo(String value) {
            addCriterion("c122 =", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122NotEqualTo(String value) {
            addCriterion("c122 <>", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122GreaterThan(String value) {
            addCriterion("c122 >", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122GreaterThanOrEqualTo(String value) {
            addCriterion("c122 >=", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122LessThan(String value) {
            addCriterion("c122 <", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122LessThanOrEqualTo(String value) {
            addCriterion("c122 <=", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122Like(String value) {
            addCriterion("c122 like", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122NotLike(String value) {
            addCriterion("c122 not like", value, "c122");
            return (Criteria) this;
        }

        public Criteria andC122In(List<String> values) {
            addCriterion("c122 in", values, "c122");
            return (Criteria) this;
        }

        public Criteria andC122NotIn(List<String> values) {
            addCriterion("c122 not in", values, "c122");
            return (Criteria) this;
        }

        public Criteria andC122Between(String value1, String value2) {
            addCriterion("c122 between", value1, value2, "c122");
            return (Criteria) this;
        }

        public Criteria andC122NotBetween(String value1, String value2) {
            addCriterion("c122 not between", value1, value2, "c122");
            return (Criteria) this;
        }

        public Criteria andC123IsNull() {
            addCriterion("c123 is null");
            return (Criteria) this;
        }

        public Criteria andC123IsNotNull() {
            addCriterion("c123 is not null");
            return (Criteria) this;
        }

        public Criteria andC123EqualTo(String value) {
            addCriterion("c123 =", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123NotEqualTo(String value) {
            addCriterion("c123 <>", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123GreaterThan(String value) {
            addCriterion("c123 >", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123GreaterThanOrEqualTo(String value) {
            addCriterion("c123 >=", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123LessThan(String value) {
            addCriterion("c123 <", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123LessThanOrEqualTo(String value) {
            addCriterion("c123 <=", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123Like(String value) {
            addCriterion("c123 like", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123NotLike(String value) {
            addCriterion("c123 not like", value, "c123");
            return (Criteria) this;
        }

        public Criteria andC123In(List<String> values) {
            addCriterion("c123 in", values, "c123");
            return (Criteria) this;
        }

        public Criteria andC123NotIn(List<String> values) {
            addCriterion("c123 not in", values, "c123");
            return (Criteria) this;
        }

        public Criteria andC123Between(String value1, String value2) {
            addCriterion("c123 between", value1, value2, "c123");
            return (Criteria) this;
        }

        public Criteria andC123NotBetween(String value1, String value2) {
            addCriterion("c123 not between", value1, value2, "c123");
            return (Criteria) this;
        }

        public Criteria andC124IsNull() {
            addCriterion("c124 is null");
            return (Criteria) this;
        }

        public Criteria andC124IsNotNull() {
            addCriterion("c124 is not null");
            return (Criteria) this;
        }

        public Criteria andC124EqualTo(String value) {
            addCriterion("c124 =", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124NotEqualTo(String value) {
            addCriterion("c124 <>", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124GreaterThan(String value) {
            addCriterion("c124 >", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124GreaterThanOrEqualTo(String value) {
            addCriterion("c124 >=", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124LessThan(String value) {
            addCriterion("c124 <", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124LessThanOrEqualTo(String value) {
            addCriterion("c124 <=", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124Like(String value) {
            addCriterion("c124 like", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124NotLike(String value) {
            addCriterion("c124 not like", value, "c124");
            return (Criteria) this;
        }

        public Criteria andC124In(List<String> values) {
            addCriterion("c124 in", values, "c124");
            return (Criteria) this;
        }

        public Criteria andC124NotIn(List<String> values) {
            addCriterion("c124 not in", values, "c124");
            return (Criteria) this;
        }

        public Criteria andC124Between(String value1, String value2) {
            addCriterion("c124 between", value1, value2, "c124");
            return (Criteria) this;
        }

        public Criteria andC124NotBetween(String value1, String value2) {
            addCriterion("c124 not between", value1, value2, "c124");
            return (Criteria) this;
        }

        public Criteria andC125IsNull() {
            addCriterion("c125 is null");
            return (Criteria) this;
        }

        public Criteria andC125IsNotNull() {
            addCriterion("c125 is not null");
            return (Criteria) this;
        }

        public Criteria andC125EqualTo(String value) {
            addCriterion("c125 =", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125NotEqualTo(String value) {
            addCriterion("c125 <>", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125GreaterThan(String value) {
            addCriterion("c125 >", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125GreaterThanOrEqualTo(String value) {
            addCriterion("c125 >=", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125LessThan(String value) {
            addCriterion("c125 <", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125LessThanOrEqualTo(String value) {
            addCriterion("c125 <=", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125Like(String value) {
            addCriterion("c125 like", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125NotLike(String value) {
            addCriterion("c125 not like", value, "c125");
            return (Criteria) this;
        }

        public Criteria andC125In(List<String> values) {
            addCriterion("c125 in", values, "c125");
            return (Criteria) this;
        }

        public Criteria andC125NotIn(List<String> values) {
            addCriterion("c125 not in", values, "c125");
            return (Criteria) this;
        }

        public Criteria andC125Between(String value1, String value2) {
            addCriterion("c125 between", value1, value2, "c125");
            return (Criteria) this;
        }

        public Criteria andC125NotBetween(String value1, String value2) {
            addCriterion("c125 not between", value1, value2, "c125");
            return (Criteria) this;
        }

        public Criteria andC126IsNull() {
            addCriterion("c126 is null");
            return (Criteria) this;
        }

        public Criteria andC126IsNotNull() {
            addCriterion("c126 is not null");
            return (Criteria) this;
        }

        public Criteria andC126EqualTo(String value) {
            addCriterion("c126 =", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126NotEqualTo(String value) {
            addCriterion("c126 <>", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126GreaterThan(String value) {
            addCriterion("c126 >", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126GreaterThanOrEqualTo(String value) {
            addCriterion("c126 >=", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126LessThan(String value) {
            addCriterion("c126 <", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126LessThanOrEqualTo(String value) {
            addCriterion("c126 <=", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126Like(String value) {
            addCriterion("c126 like", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126NotLike(String value) {
            addCriterion("c126 not like", value, "c126");
            return (Criteria) this;
        }

        public Criteria andC126In(List<String> values) {
            addCriterion("c126 in", values, "c126");
            return (Criteria) this;
        }

        public Criteria andC126NotIn(List<String> values) {
            addCriterion("c126 not in", values, "c126");
            return (Criteria) this;
        }

        public Criteria andC126Between(String value1, String value2) {
            addCriterion("c126 between", value1, value2, "c126");
            return (Criteria) this;
        }

        public Criteria andC126NotBetween(String value1, String value2) {
            addCriterion("c126 not between", value1, value2, "c126");
            return (Criteria) this;
        }

        public Criteria andC127IsNull() {
            addCriterion("c127 is null");
            return (Criteria) this;
        }

        public Criteria andC127IsNotNull() {
            addCriterion("c127 is not null");
            return (Criteria) this;
        }

        public Criteria andC127EqualTo(String value) {
            addCriterion("c127 =", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127NotEqualTo(String value) {
            addCriterion("c127 <>", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127GreaterThan(String value) {
            addCriterion("c127 >", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127GreaterThanOrEqualTo(String value) {
            addCriterion("c127 >=", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127LessThan(String value) {
            addCriterion("c127 <", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127LessThanOrEqualTo(String value) {
            addCriterion("c127 <=", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127Like(String value) {
            addCriterion("c127 like", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127NotLike(String value) {
            addCriterion("c127 not like", value, "c127");
            return (Criteria) this;
        }

        public Criteria andC127In(List<String> values) {
            addCriterion("c127 in", values, "c127");
            return (Criteria) this;
        }

        public Criteria andC127NotIn(List<String> values) {
            addCriterion("c127 not in", values, "c127");
            return (Criteria) this;
        }

        public Criteria andC127Between(String value1, String value2) {
            addCriterion("c127 between", value1, value2, "c127");
            return (Criteria) this;
        }

        public Criteria andC127NotBetween(String value1, String value2) {
            addCriterion("c127 not between", value1, value2, "c127");
            return (Criteria) this;
        }

        public Criteria andC128IsNull() {
            addCriterion("c128 is null");
            return (Criteria) this;
        }

        public Criteria andC128IsNotNull() {
            addCriterion("c128 is not null");
            return (Criteria) this;
        }

        public Criteria andC128EqualTo(Date value) {
            addCriterionForJDBCDate("c128 =", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128NotEqualTo(Date value) {
            addCriterionForJDBCDate("c128 <>", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128GreaterThan(Date value) {
            addCriterionForJDBCDate("c128 >", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c128 >=", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128LessThan(Date value) {
            addCriterionForJDBCDate("c128 <", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c128 <=", value, "c128");
            return (Criteria) this;
        }

        public Criteria andC128In(List<Date> values) {
            addCriterionForJDBCDate("c128 in", values, "c128");
            return (Criteria) this;
        }

        public Criteria andC128NotIn(List<Date> values) {
            addCriterionForJDBCDate("c128 not in", values, "c128");
            return (Criteria) this;
        }

        public Criteria andC128Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c128 between", value1, value2, "c128");
            return (Criteria) this;
        }

        public Criteria andC128NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c128 not between", value1, value2, "c128");
            return (Criteria) this;
        }

        public Criteria andC129IsNull() {
            addCriterion("c129 is null");
            return (Criteria) this;
        }

        public Criteria andC129IsNotNull() {
            addCriterion("c129 is not null");
            return (Criteria) this;
        }

        public Criteria andC129EqualTo(String value) {
            addCriterion("c129 =", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129NotEqualTo(String value) {
            addCriterion("c129 <>", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129GreaterThan(String value) {
            addCriterion("c129 >", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129GreaterThanOrEqualTo(String value) {
            addCriterion("c129 >=", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129LessThan(String value) {
            addCriterion("c129 <", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129LessThanOrEqualTo(String value) {
            addCriterion("c129 <=", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129Like(String value) {
            addCriterion("c129 like", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129NotLike(String value) {
            addCriterion("c129 not like", value, "c129");
            return (Criteria) this;
        }

        public Criteria andC129In(List<String> values) {
            addCriterion("c129 in", values, "c129");
            return (Criteria) this;
        }

        public Criteria andC129NotIn(List<String> values) {
            addCriterion("c129 not in", values, "c129");
            return (Criteria) this;
        }

        public Criteria andC129Between(String value1, String value2) {
            addCriterion("c129 between", value1, value2, "c129");
            return (Criteria) this;
        }

        public Criteria andC129NotBetween(String value1, String value2) {
            addCriterion("c129 not between", value1, value2, "c129");
            return (Criteria) this;
        }

        public Criteria andC130IsNull() {
            addCriterion("c130 is null");
            return (Criteria) this;
        }

        public Criteria andC130IsNotNull() {
            addCriterion("c130 is not null");
            return (Criteria) this;
        }

        public Criteria andC130EqualTo(String value) {
            addCriterion("c130 =", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130NotEqualTo(String value) {
            addCriterion("c130 <>", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130GreaterThan(String value) {
            addCriterion("c130 >", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130GreaterThanOrEqualTo(String value) {
            addCriterion("c130 >=", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130LessThan(String value) {
            addCriterion("c130 <", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130LessThanOrEqualTo(String value) {
            addCriterion("c130 <=", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130Like(String value) {
            addCriterion("c130 like", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130NotLike(String value) {
            addCriterion("c130 not like", value, "c130");
            return (Criteria) this;
        }

        public Criteria andC130In(List<String> values) {
            addCriterion("c130 in", values, "c130");
            return (Criteria) this;
        }

        public Criteria andC130NotIn(List<String> values) {
            addCriterion("c130 not in", values, "c130");
            return (Criteria) this;
        }

        public Criteria andC130Between(String value1, String value2) {
            addCriterion("c130 between", value1, value2, "c130");
            return (Criteria) this;
        }

        public Criteria andC130NotBetween(String value1, String value2) {
            addCriterion("c130 not between", value1, value2, "c130");
            return (Criteria) this;
        }

        public Criteria andC131IsNull() {
            addCriterion("c131 is null");
            return (Criteria) this;
        }

        public Criteria andC131IsNotNull() {
            addCriterion("c131 is not null");
            return (Criteria) this;
        }

        public Criteria andC131EqualTo(String value) {
            addCriterion("c131 =", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131NotEqualTo(String value) {
            addCriterion("c131 <>", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131GreaterThan(String value) {
            addCriterion("c131 >", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131GreaterThanOrEqualTo(String value) {
            addCriterion("c131 >=", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131LessThan(String value) {
            addCriterion("c131 <", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131LessThanOrEqualTo(String value) {
            addCriterion("c131 <=", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131Like(String value) {
            addCriterion("c131 like", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131NotLike(String value) {
            addCriterion("c131 not like", value, "c131");
            return (Criteria) this;
        }

        public Criteria andC131In(List<String> values) {
            addCriterion("c131 in", values, "c131");
            return (Criteria) this;
        }

        public Criteria andC131NotIn(List<String> values) {
            addCriterion("c131 not in", values, "c131");
            return (Criteria) this;
        }

        public Criteria andC131Between(String value1, String value2) {
            addCriterion("c131 between", value1, value2, "c131");
            return (Criteria) this;
        }

        public Criteria andC131NotBetween(String value1, String value2) {
            addCriterion("c131 not between", value1, value2, "c131");
            return (Criteria) this;
        }

        public Criteria andC132IsNull() {
            addCriterion("c132 is null");
            return (Criteria) this;
        }

        public Criteria andC132IsNotNull() {
            addCriterion("c132 is not null");
            return (Criteria) this;
        }

        public Criteria andC132EqualTo(String value) {
            addCriterion("c132 =", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132NotEqualTo(String value) {
            addCriterion("c132 <>", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132GreaterThan(String value) {
            addCriterion("c132 >", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132GreaterThanOrEqualTo(String value) {
            addCriterion("c132 >=", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132LessThan(String value) {
            addCriterion("c132 <", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132LessThanOrEqualTo(String value) {
            addCriterion("c132 <=", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132Like(String value) {
            addCriterion("c132 like", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132NotLike(String value) {
            addCriterion("c132 not like", value, "c132");
            return (Criteria) this;
        }

        public Criteria andC132In(List<String> values) {
            addCriterion("c132 in", values, "c132");
            return (Criteria) this;
        }

        public Criteria andC132NotIn(List<String> values) {
            addCriterion("c132 not in", values, "c132");
            return (Criteria) this;
        }

        public Criteria andC132Between(String value1, String value2) {
            addCriterion("c132 between", value1, value2, "c132");
            return (Criteria) this;
        }

        public Criteria andC132NotBetween(String value1, String value2) {
            addCriterion("c132 not between", value1, value2, "c132");
            return (Criteria) this;
        }

        public Criteria andC133IsNull() {
            addCriterion("c133 is null");
            return (Criteria) this;
        }

        public Criteria andC133IsNotNull() {
            addCriterion("c133 is not null");
            return (Criteria) this;
        }

        public Criteria andC133EqualTo(String value) {
            addCriterion("c133 =", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133NotEqualTo(String value) {
            addCriterion("c133 <>", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133GreaterThan(String value) {
            addCriterion("c133 >", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133GreaterThanOrEqualTo(String value) {
            addCriterion("c133 >=", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133LessThan(String value) {
            addCriterion("c133 <", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133LessThanOrEqualTo(String value) {
            addCriterion("c133 <=", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133Like(String value) {
            addCriterion("c133 like", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133NotLike(String value) {
            addCriterion("c133 not like", value, "c133");
            return (Criteria) this;
        }

        public Criteria andC133In(List<String> values) {
            addCriterion("c133 in", values, "c133");
            return (Criteria) this;
        }

        public Criteria andC133NotIn(List<String> values) {
            addCriterion("c133 not in", values, "c133");
            return (Criteria) this;
        }

        public Criteria andC133Between(String value1, String value2) {
            addCriterion("c133 between", value1, value2, "c133");
            return (Criteria) this;
        }

        public Criteria andC133NotBetween(String value1, String value2) {
            addCriterion("c133 not between", value1, value2, "c133");
            return (Criteria) this;
        }

        public Criteria andC134IsNull() {
            addCriterion("c134 is null");
            return (Criteria) this;
        }

        public Criteria andC134IsNotNull() {
            addCriterion("c134 is not null");
            return (Criteria) this;
        }

        public Criteria andC134EqualTo(String value) {
            addCriterion("c134 =", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134NotEqualTo(String value) {
            addCriterion("c134 <>", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134GreaterThan(String value) {
            addCriterion("c134 >", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134GreaterThanOrEqualTo(String value) {
            addCriterion("c134 >=", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134LessThan(String value) {
            addCriterion("c134 <", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134LessThanOrEqualTo(String value) {
            addCriterion("c134 <=", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134Like(String value) {
            addCriterion("c134 like", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134NotLike(String value) {
            addCriterion("c134 not like", value, "c134");
            return (Criteria) this;
        }

        public Criteria andC134In(List<String> values) {
            addCriterion("c134 in", values, "c134");
            return (Criteria) this;
        }

        public Criteria andC134NotIn(List<String> values) {
            addCriterion("c134 not in", values, "c134");
            return (Criteria) this;
        }

        public Criteria andC134Between(String value1, String value2) {
            addCriterion("c134 between", value1, value2, "c134");
            return (Criteria) this;
        }

        public Criteria andC134NotBetween(String value1, String value2) {
            addCriterion("c134 not between", value1, value2, "c134");
            return (Criteria) this;
        }

        public Criteria andC135IsNull() {
            addCriterion("c135 is null");
            return (Criteria) this;
        }

        public Criteria andC135IsNotNull() {
            addCriterion("c135 is not null");
            return (Criteria) this;
        }

        public Criteria andC135EqualTo(String value) {
            addCriterion("c135 =", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135NotEqualTo(String value) {
            addCriterion("c135 <>", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135GreaterThan(String value) {
            addCriterion("c135 >", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135GreaterThanOrEqualTo(String value) {
            addCriterion("c135 >=", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135LessThan(String value) {
            addCriterion("c135 <", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135LessThanOrEqualTo(String value) {
            addCriterion("c135 <=", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135Like(String value) {
            addCriterion("c135 like", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135NotLike(String value) {
            addCriterion("c135 not like", value, "c135");
            return (Criteria) this;
        }

        public Criteria andC135In(List<String> values) {
            addCriterion("c135 in", values, "c135");
            return (Criteria) this;
        }

        public Criteria andC135NotIn(List<String> values) {
            addCriterion("c135 not in", values, "c135");
            return (Criteria) this;
        }

        public Criteria andC135Between(String value1, String value2) {
            addCriterion("c135 between", value1, value2, "c135");
            return (Criteria) this;
        }

        public Criteria andC135NotBetween(String value1, String value2) {
            addCriterion("c135 not between", value1, value2, "c135");
            return (Criteria) this;
        }

        public Criteria andC136IsNull() {
            addCriterion("c136 is null");
            return (Criteria) this;
        }

        public Criteria andC136IsNotNull() {
            addCriterion("c136 is not null");
            return (Criteria) this;
        }

        public Criteria andC136EqualTo(String value) {
            addCriterion("c136 =", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136NotEqualTo(String value) {
            addCriterion("c136 <>", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136GreaterThan(String value) {
            addCriterion("c136 >", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136GreaterThanOrEqualTo(String value) {
            addCriterion("c136 >=", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136LessThan(String value) {
            addCriterion("c136 <", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136LessThanOrEqualTo(String value) {
            addCriterion("c136 <=", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136Like(String value) {
            addCriterion("c136 like", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136NotLike(String value) {
            addCriterion("c136 not like", value, "c136");
            return (Criteria) this;
        }

        public Criteria andC136In(List<String> values) {
            addCriterion("c136 in", values, "c136");
            return (Criteria) this;
        }

        public Criteria andC136NotIn(List<String> values) {
            addCriterion("c136 not in", values, "c136");
            return (Criteria) this;
        }

        public Criteria andC136Between(String value1, String value2) {
            addCriterion("c136 between", value1, value2, "c136");
            return (Criteria) this;
        }

        public Criteria andC136NotBetween(String value1, String value2) {
            addCriterion("c136 not between", value1, value2, "c136");
            return (Criteria) this;
        }

        public Criteria andC137IsNull() {
            addCriterion("c137 is null");
            return (Criteria) this;
        }

        public Criteria andC137IsNotNull() {
            addCriterion("c137 is not null");
            return (Criteria) this;
        }

        public Criteria andC137EqualTo(String value) {
            addCriterion("c137 =", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137NotEqualTo(String value) {
            addCriterion("c137 <>", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137GreaterThan(String value) {
            addCriterion("c137 >", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137GreaterThanOrEqualTo(String value) {
            addCriterion("c137 >=", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137LessThan(String value) {
            addCriterion("c137 <", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137LessThanOrEqualTo(String value) {
            addCriterion("c137 <=", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137Like(String value) {
            addCriterion("c137 like", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137NotLike(String value) {
            addCriterion("c137 not like", value, "c137");
            return (Criteria) this;
        }

        public Criteria andC137In(List<String> values) {
            addCriterion("c137 in", values, "c137");
            return (Criteria) this;
        }

        public Criteria andC137NotIn(List<String> values) {
            addCriterion("c137 not in", values, "c137");
            return (Criteria) this;
        }

        public Criteria andC137Between(String value1, String value2) {
            addCriterion("c137 between", value1, value2, "c137");
            return (Criteria) this;
        }

        public Criteria andC137NotBetween(String value1, String value2) {
            addCriterion("c137 not between", value1, value2, "c137");
            return (Criteria) this;
        }

        public Criteria andC138IsNull() {
            addCriterion("c138 is null");
            return (Criteria) this;
        }

        public Criteria andC138IsNotNull() {
            addCriterion("c138 is not null");
            return (Criteria) this;
        }

        public Criteria andC138EqualTo(String value) {
            addCriterion("c138 =", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138NotEqualTo(String value) {
            addCriterion("c138 <>", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138GreaterThan(String value) {
            addCriterion("c138 >", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138GreaterThanOrEqualTo(String value) {
            addCriterion("c138 >=", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138LessThan(String value) {
            addCriterion("c138 <", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138LessThanOrEqualTo(String value) {
            addCriterion("c138 <=", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138Like(String value) {
            addCriterion("c138 like", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138NotLike(String value) {
            addCriterion("c138 not like", value, "c138");
            return (Criteria) this;
        }

        public Criteria andC138In(List<String> values) {
            addCriterion("c138 in", values, "c138");
            return (Criteria) this;
        }

        public Criteria andC138NotIn(List<String> values) {
            addCriterion("c138 not in", values, "c138");
            return (Criteria) this;
        }

        public Criteria andC138Between(String value1, String value2) {
            addCriterion("c138 between", value1, value2, "c138");
            return (Criteria) this;
        }

        public Criteria andC138NotBetween(String value1, String value2) {
            addCriterion("c138 not between", value1, value2, "c138");
            return (Criteria) this;
        }

        public Criteria andC139IsNull() {
            addCriterion("c139 is null");
            return (Criteria) this;
        }

        public Criteria andC139IsNotNull() {
            addCriterion("c139 is not null");
            return (Criteria) this;
        }

        public Criteria andC139EqualTo(Date value) {
            addCriterionForJDBCDate("c139 =", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139NotEqualTo(Date value) {
            addCriterionForJDBCDate("c139 <>", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139GreaterThan(Date value) {
            addCriterionForJDBCDate("c139 >", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c139 >=", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139LessThan(Date value) {
            addCriterionForJDBCDate("c139 <", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c139 <=", value, "c139");
            return (Criteria) this;
        }

        public Criteria andC139In(List<Date> values) {
            addCriterionForJDBCDate("c139 in", values, "c139");
            return (Criteria) this;
        }

        public Criteria andC139NotIn(List<Date> values) {
            addCriterionForJDBCDate("c139 not in", values, "c139");
            return (Criteria) this;
        }

        public Criteria andC139Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c139 between", value1, value2, "c139");
            return (Criteria) this;
        }

        public Criteria andC139NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c139 not between", value1, value2, "c139");
            return (Criteria) this;
        }

        public Criteria andC140IsNull() {
            addCriterion("c140 is null");
            return (Criteria) this;
        }

        public Criteria andC140IsNotNull() {
            addCriterion("c140 is not null");
            return (Criteria) this;
        }

        public Criteria andC140EqualTo(String value) {
            addCriterion("c140 =", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140NotEqualTo(String value) {
            addCriterion("c140 <>", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140GreaterThan(String value) {
            addCriterion("c140 >", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140GreaterThanOrEqualTo(String value) {
            addCriterion("c140 >=", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140LessThan(String value) {
            addCriterion("c140 <", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140LessThanOrEqualTo(String value) {
            addCriterion("c140 <=", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140Like(String value) {
            addCriterion("c140 like", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140NotLike(String value) {
            addCriterion("c140 not like", value, "c140");
            return (Criteria) this;
        }

        public Criteria andC140In(List<String> values) {
            addCriterion("c140 in", values, "c140");
            return (Criteria) this;
        }

        public Criteria andC140NotIn(List<String> values) {
            addCriterion("c140 not in", values, "c140");
            return (Criteria) this;
        }

        public Criteria andC140Between(String value1, String value2) {
            addCriterion("c140 between", value1, value2, "c140");
            return (Criteria) this;
        }

        public Criteria andC140NotBetween(String value1, String value2) {
            addCriterion("c140 not between", value1, value2, "c140");
            return (Criteria) this;
        }

        public Criteria andC141IsNull() {
            addCriterion("c141 is null");
            return (Criteria) this;
        }

        public Criteria andC141IsNotNull() {
            addCriterion("c141 is not null");
            return (Criteria) this;
        }

        public Criteria andC141EqualTo(String value) {
            addCriterion("c141 =", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141NotEqualTo(String value) {
            addCriterion("c141 <>", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141GreaterThan(String value) {
            addCriterion("c141 >", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141GreaterThanOrEqualTo(String value) {
            addCriterion("c141 >=", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141LessThan(String value) {
            addCriterion("c141 <", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141LessThanOrEqualTo(String value) {
            addCriterion("c141 <=", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141Like(String value) {
            addCriterion("c141 like", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141NotLike(String value) {
            addCriterion("c141 not like", value, "c141");
            return (Criteria) this;
        }

        public Criteria andC141In(List<String> values) {
            addCriterion("c141 in", values, "c141");
            return (Criteria) this;
        }

        public Criteria andC141NotIn(List<String> values) {
            addCriterion("c141 not in", values, "c141");
            return (Criteria) this;
        }

        public Criteria andC141Between(String value1, String value2) {
            addCriterion("c141 between", value1, value2, "c141");
            return (Criteria) this;
        }

        public Criteria andC141NotBetween(String value1, String value2) {
            addCriterion("c141 not between", value1, value2, "c141");
            return (Criteria) this;
        }

        public Criteria andC142IsNull() {
            addCriterion("c142 is null");
            return (Criteria) this;
        }

        public Criteria andC142IsNotNull() {
            addCriterion("c142 is not null");
            return (Criteria) this;
        }

        public Criteria andC142EqualTo(String value) {
            addCriterion("c142 =", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142NotEqualTo(String value) {
            addCriterion("c142 <>", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142GreaterThan(String value) {
            addCriterion("c142 >", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142GreaterThanOrEqualTo(String value) {
            addCriterion("c142 >=", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142LessThan(String value) {
            addCriterion("c142 <", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142LessThanOrEqualTo(String value) {
            addCriterion("c142 <=", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142Like(String value) {
            addCriterion("c142 like", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142NotLike(String value) {
            addCriterion("c142 not like", value, "c142");
            return (Criteria) this;
        }

        public Criteria andC142In(List<String> values) {
            addCriterion("c142 in", values, "c142");
            return (Criteria) this;
        }

        public Criteria andC142NotIn(List<String> values) {
            addCriterion("c142 not in", values, "c142");
            return (Criteria) this;
        }

        public Criteria andC142Between(String value1, String value2) {
            addCriterion("c142 between", value1, value2, "c142");
            return (Criteria) this;
        }

        public Criteria andC142NotBetween(String value1, String value2) {
            addCriterion("c142 not between", value1, value2, "c142");
            return (Criteria) this;
        }

        public Criteria andC143IsNull() {
            addCriterion("c143 is null");
            return (Criteria) this;
        }

        public Criteria andC143IsNotNull() {
            addCriterion("c143 is not null");
            return (Criteria) this;
        }

        public Criteria andC143EqualTo(String value) {
            addCriterion("c143 =", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143NotEqualTo(String value) {
            addCriterion("c143 <>", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143GreaterThan(String value) {
            addCriterion("c143 >", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143GreaterThanOrEqualTo(String value) {
            addCriterion("c143 >=", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143LessThan(String value) {
            addCriterion("c143 <", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143LessThanOrEqualTo(String value) {
            addCriterion("c143 <=", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143Like(String value) {
            addCriterion("c143 like", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143NotLike(String value) {
            addCriterion("c143 not like", value, "c143");
            return (Criteria) this;
        }

        public Criteria andC143In(List<String> values) {
            addCriterion("c143 in", values, "c143");
            return (Criteria) this;
        }

        public Criteria andC143NotIn(List<String> values) {
            addCriterion("c143 not in", values, "c143");
            return (Criteria) this;
        }

        public Criteria andC143Between(String value1, String value2) {
            addCriterion("c143 between", value1, value2, "c143");
            return (Criteria) this;
        }

        public Criteria andC143NotBetween(String value1, String value2) {
            addCriterion("c143 not between", value1, value2, "c143");
            return (Criteria) this;
        }

        public Criteria andC144IsNull() {
            addCriterion("c144 is null");
            return (Criteria) this;
        }

        public Criteria andC144IsNotNull() {
            addCriterion("c144 is not null");
            return (Criteria) this;
        }

        public Criteria andC144EqualTo(String value) {
            addCriterion("c144 =", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144NotEqualTo(String value) {
            addCriterion("c144 <>", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144GreaterThan(String value) {
            addCriterion("c144 >", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144GreaterThanOrEqualTo(String value) {
            addCriterion("c144 >=", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144LessThan(String value) {
            addCriterion("c144 <", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144LessThanOrEqualTo(String value) {
            addCriterion("c144 <=", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144Like(String value) {
            addCriterion("c144 like", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144NotLike(String value) {
            addCriterion("c144 not like", value, "c144");
            return (Criteria) this;
        }

        public Criteria andC144In(List<String> values) {
            addCriterion("c144 in", values, "c144");
            return (Criteria) this;
        }

        public Criteria andC144NotIn(List<String> values) {
            addCriterion("c144 not in", values, "c144");
            return (Criteria) this;
        }

        public Criteria andC144Between(String value1, String value2) {
            addCriterion("c144 between", value1, value2, "c144");
            return (Criteria) this;
        }

        public Criteria andC144NotBetween(String value1, String value2) {
            addCriterion("c144 not between", value1, value2, "c144");
            return (Criteria) this;
        }

        public Criteria andC145IsNull() {
            addCriterion("c145 is null");
            return (Criteria) this;
        }

        public Criteria andC145IsNotNull() {
            addCriterion("c145 is not null");
            return (Criteria) this;
        }

        public Criteria andC145EqualTo(String value) {
            addCriterion("c145 =", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145NotEqualTo(String value) {
            addCriterion("c145 <>", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145GreaterThan(String value) {
            addCriterion("c145 >", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145GreaterThanOrEqualTo(String value) {
            addCriterion("c145 >=", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145LessThan(String value) {
            addCriterion("c145 <", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145LessThanOrEqualTo(String value) {
            addCriterion("c145 <=", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145Like(String value) {
            addCriterion("c145 like", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145NotLike(String value) {
            addCriterion("c145 not like", value, "c145");
            return (Criteria) this;
        }

        public Criteria andC145In(List<String> values) {
            addCriterion("c145 in", values, "c145");
            return (Criteria) this;
        }

        public Criteria andC145NotIn(List<String> values) {
            addCriterion("c145 not in", values, "c145");
            return (Criteria) this;
        }

        public Criteria andC145Between(String value1, String value2) {
            addCriterion("c145 between", value1, value2, "c145");
            return (Criteria) this;
        }

        public Criteria andC145NotBetween(String value1, String value2) {
            addCriterion("c145 not between", value1, value2, "c145");
            return (Criteria) this;
        }

        public Criteria andC146IsNull() {
            addCriterion("c146 is null");
            return (Criteria) this;
        }

        public Criteria andC146IsNotNull() {
            addCriterion("c146 is not null");
            return (Criteria) this;
        }

        public Criteria andC146EqualTo(String value) {
            addCriterion("c146 =", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146NotEqualTo(String value) {
            addCriterion("c146 <>", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146GreaterThan(String value) {
            addCriterion("c146 >", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146GreaterThanOrEqualTo(String value) {
            addCriterion("c146 >=", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146LessThan(String value) {
            addCriterion("c146 <", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146LessThanOrEqualTo(String value) {
            addCriterion("c146 <=", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146Like(String value) {
            addCriterion("c146 like", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146NotLike(String value) {
            addCriterion("c146 not like", value, "c146");
            return (Criteria) this;
        }

        public Criteria andC146In(List<String> values) {
            addCriterion("c146 in", values, "c146");
            return (Criteria) this;
        }

        public Criteria andC146NotIn(List<String> values) {
            addCriterion("c146 not in", values, "c146");
            return (Criteria) this;
        }

        public Criteria andC146Between(String value1, String value2) {
            addCriterion("c146 between", value1, value2, "c146");
            return (Criteria) this;
        }

        public Criteria andC146NotBetween(String value1, String value2) {
            addCriterion("c146 not between", value1, value2, "c146");
            return (Criteria) this;
        }

        public Criteria andC147IsNull() {
            addCriterion("c147 is null");
            return (Criteria) this;
        }

        public Criteria andC147IsNotNull() {
            addCriterion("c147 is not null");
            return (Criteria) this;
        }

        public Criteria andC147EqualTo(String value) {
            addCriterion("c147 =", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147NotEqualTo(String value) {
            addCriterion("c147 <>", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147GreaterThan(String value) {
            addCriterion("c147 >", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147GreaterThanOrEqualTo(String value) {
            addCriterion("c147 >=", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147LessThan(String value) {
            addCriterion("c147 <", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147LessThanOrEqualTo(String value) {
            addCriterion("c147 <=", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147Like(String value) {
            addCriterion("c147 like", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147NotLike(String value) {
            addCriterion("c147 not like", value, "c147");
            return (Criteria) this;
        }

        public Criteria andC147In(List<String> values) {
            addCriterion("c147 in", values, "c147");
            return (Criteria) this;
        }

        public Criteria andC147NotIn(List<String> values) {
            addCriterion("c147 not in", values, "c147");
            return (Criteria) this;
        }

        public Criteria andC147Between(String value1, String value2) {
            addCriterion("c147 between", value1, value2, "c147");
            return (Criteria) this;
        }

        public Criteria andC147NotBetween(String value1, String value2) {
            addCriterion("c147 not between", value1, value2, "c147");
            return (Criteria) this;
        }

        public Criteria andC148IsNull() {
            addCriterion("c148 is null");
            return (Criteria) this;
        }

        public Criteria andC148IsNotNull() {
            addCriterion("c148 is not null");
            return (Criteria) this;
        }

        public Criteria andC148EqualTo(String value) {
            addCriterion("c148 =", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148NotEqualTo(String value) {
            addCriterion("c148 <>", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148GreaterThan(String value) {
            addCriterion("c148 >", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148GreaterThanOrEqualTo(String value) {
            addCriterion("c148 >=", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148LessThan(String value) {
            addCriterion("c148 <", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148LessThanOrEqualTo(String value) {
            addCriterion("c148 <=", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148Like(String value) {
            addCriterion("c148 like", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148NotLike(String value) {
            addCriterion("c148 not like", value, "c148");
            return (Criteria) this;
        }

        public Criteria andC148In(List<String> values) {
            addCriterion("c148 in", values, "c148");
            return (Criteria) this;
        }

        public Criteria andC148NotIn(List<String> values) {
            addCriterion("c148 not in", values, "c148");
            return (Criteria) this;
        }

        public Criteria andC148Between(String value1, String value2) {
            addCriterion("c148 between", value1, value2, "c148");
            return (Criteria) this;
        }

        public Criteria andC148NotBetween(String value1, String value2) {
            addCriterion("c148 not between", value1, value2, "c148");
            return (Criteria) this;
        }

        public Criteria andC149IsNull() {
            addCriterion("c149 is null");
            return (Criteria) this;
        }

        public Criteria andC149IsNotNull() {
            addCriterion("c149 is not null");
            return (Criteria) this;
        }

        public Criteria andC149EqualTo(String value) {
            addCriterion("c149 =", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149NotEqualTo(String value) {
            addCriterion("c149 <>", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149GreaterThan(String value) {
            addCriterion("c149 >", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149GreaterThanOrEqualTo(String value) {
            addCriterion("c149 >=", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149LessThan(String value) {
            addCriterion("c149 <", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149LessThanOrEqualTo(String value) {
            addCriterion("c149 <=", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149Like(String value) {
            addCriterion("c149 like", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149NotLike(String value) {
            addCriterion("c149 not like", value, "c149");
            return (Criteria) this;
        }

        public Criteria andC149In(List<String> values) {
            addCriterion("c149 in", values, "c149");
            return (Criteria) this;
        }

        public Criteria andC149NotIn(List<String> values) {
            addCriterion("c149 not in", values, "c149");
            return (Criteria) this;
        }

        public Criteria andC149Between(String value1, String value2) {
            addCriterion("c149 between", value1, value2, "c149");
            return (Criteria) this;
        }

        public Criteria andC149NotBetween(String value1, String value2) {
            addCriterion("c149 not between", value1, value2, "c149");
            return (Criteria) this;
        }

        public Criteria andC150IsNull() {
            addCriterion("c150 is null");
            return (Criteria) this;
        }

        public Criteria andC150IsNotNull() {
            addCriterion("c150 is not null");
            return (Criteria) this;
        }

        public Criteria andC150EqualTo(Date value) {
            addCriterionForJDBCDate("c150 =", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150NotEqualTo(Date value) {
            addCriterionForJDBCDate("c150 <>", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150GreaterThan(Date value) {
            addCriterionForJDBCDate("c150 >", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c150 >=", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150LessThan(Date value) {
            addCriterionForJDBCDate("c150 <", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c150 <=", value, "c150");
            return (Criteria) this;
        }

        public Criteria andC150In(List<Date> values) {
            addCriterionForJDBCDate("c150 in", values, "c150");
            return (Criteria) this;
        }

        public Criteria andC150NotIn(List<Date> values) {
            addCriterionForJDBCDate("c150 not in", values, "c150");
            return (Criteria) this;
        }

        public Criteria andC150Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c150 between", value1, value2, "c150");
            return (Criteria) this;
        }

        public Criteria andC150NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c150 not between", value1, value2, "c150");
            return (Criteria) this;
        }

        public Criteria andC151IsNull() {
            addCriterion("c151 is null");
            return (Criteria) this;
        }

        public Criteria andC151IsNotNull() {
            addCriterion("c151 is not null");
            return (Criteria) this;
        }

        public Criteria andC151EqualTo(String value) {
            addCriterion("c151 =", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151NotEqualTo(String value) {
            addCriterion("c151 <>", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151GreaterThan(String value) {
            addCriterion("c151 >", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151GreaterThanOrEqualTo(String value) {
            addCriterion("c151 >=", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151LessThan(String value) {
            addCriterion("c151 <", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151LessThanOrEqualTo(String value) {
            addCriterion("c151 <=", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151Like(String value) {
            addCriterion("c151 like", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151NotLike(String value) {
            addCriterion("c151 not like", value, "c151");
            return (Criteria) this;
        }

        public Criteria andC151In(List<String> values) {
            addCriterion("c151 in", values, "c151");
            return (Criteria) this;
        }

        public Criteria andC151NotIn(List<String> values) {
            addCriterion("c151 not in", values, "c151");
            return (Criteria) this;
        }

        public Criteria andC151Between(String value1, String value2) {
            addCriterion("c151 between", value1, value2, "c151");
            return (Criteria) this;
        }

        public Criteria andC151NotBetween(String value1, String value2) {
            addCriterion("c151 not between", value1, value2, "c151");
            return (Criteria) this;
        }

        public Criteria andC152IsNull() {
            addCriterion("c152 is null");
            return (Criteria) this;
        }

        public Criteria andC152IsNotNull() {
            addCriterion("c152 is not null");
            return (Criteria) this;
        }

        public Criteria andC152EqualTo(String value) {
            addCriterion("c152 =", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152NotEqualTo(String value) {
            addCriterion("c152 <>", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152GreaterThan(String value) {
            addCriterion("c152 >", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152GreaterThanOrEqualTo(String value) {
            addCriterion("c152 >=", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152LessThan(String value) {
            addCriterion("c152 <", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152LessThanOrEqualTo(String value) {
            addCriterion("c152 <=", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152Like(String value) {
            addCriterion("c152 like", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152NotLike(String value) {
            addCriterion("c152 not like", value, "c152");
            return (Criteria) this;
        }

        public Criteria andC152In(List<String> values) {
            addCriterion("c152 in", values, "c152");
            return (Criteria) this;
        }

        public Criteria andC152NotIn(List<String> values) {
            addCriterion("c152 not in", values, "c152");
            return (Criteria) this;
        }

        public Criteria andC152Between(String value1, String value2) {
            addCriterion("c152 between", value1, value2, "c152");
            return (Criteria) this;
        }

        public Criteria andC152NotBetween(String value1, String value2) {
            addCriterion("c152 not between", value1, value2, "c152");
            return (Criteria) this;
        }

        public Criteria andC153IsNull() {
            addCriterion("c153 is null");
            return (Criteria) this;
        }

        public Criteria andC153IsNotNull() {
            addCriterion("c153 is not null");
            return (Criteria) this;
        }

        public Criteria andC153EqualTo(String value) {
            addCriterion("c153 =", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153NotEqualTo(String value) {
            addCriterion("c153 <>", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153GreaterThan(String value) {
            addCriterion("c153 >", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153GreaterThanOrEqualTo(String value) {
            addCriterion("c153 >=", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153LessThan(String value) {
            addCriterion("c153 <", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153LessThanOrEqualTo(String value) {
            addCriterion("c153 <=", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153Like(String value) {
            addCriterion("c153 like", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153NotLike(String value) {
            addCriterion("c153 not like", value, "c153");
            return (Criteria) this;
        }

        public Criteria andC153In(List<String> values) {
            addCriterion("c153 in", values, "c153");
            return (Criteria) this;
        }

        public Criteria andC153NotIn(List<String> values) {
            addCriterion("c153 not in", values, "c153");
            return (Criteria) this;
        }

        public Criteria andC153Between(String value1, String value2) {
            addCriterion("c153 between", value1, value2, "c153");
            return (Criteria) this;
        }

        public Criteria andC153NotBetween(String value1, String value2) {
            addCriterion("c153 not between", value1, value2, "c153");
            return (Criteria) this;
        }

        public Criteria andC154IsNull() {
            addCriterion("c154 is null");
            return (Criteria) this;
        }

        public Criteria andC154IsNotNull() {
            addCriterion("c154 is not null");
            return (Criteria) this;
        }

        public Criteria andC154EqualTo(String value) {
            addCriterion("c154 =", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154NotEqualTo(String value) {
            addCriterion("c154 <>", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154GreaterThan(String value) {
            addCriterion("c154 >", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154GreaterThanOrEqualTo(String value) {
            addCriterion("c154 >=", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154LessThan(String value) {
            addCriterion("c154 <", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154LessThanOrEqualTo(String value) {
            addCriterion("c154 <=", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154Like(String value) {
            addCriterion("c154 like", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154NotLike(String value) {
            addCriterion("c154 not like", value, "c154");
            return (Criteria) this;
        }

        public Criteria andC154In(List<String> values) {
            addCriterion("c154 in", values, "c154");
            return (Criteria) this;
        }

        public Criteria andC154NotIn(List<String> values) {
            addCriterion("c154 not in", values, "c154");
            return (Criteria) this;
        }

        public Criteria andC154Between(String value1, String value2) {
            addCriterion("c154 between", value1, value2, "c154");
            return (Criteria) this;
        }

        public Criteria andC154NotBetween(String value1, String value2) {
            addCriterion("c154 not between", value1, value2, "c154");
            return (Criteria) this;
        }

        public Criteria andC155IsNull() {
            addCriterion("c155 is null");
            return (Criteria) this;
        }

        public Criteria andC155IsNotNull() {
            addCriterion("c155 is not null");
            return (Criteria) this;
        }

        public Criteria andC155EqualTo(String value) {
            addCriterion("c155 =", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155NotEqualTo(String value) {
            addCriterion("c155 <>", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155GreaterThan(String value) {
            addCriterion("c155 >", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155GreaterThanOrEqualTo(String value) {
            addCriterion("c155 >=", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155LessThan(String value) {
            addCriterion("c155 <", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155LessThanOrEqualTo(String value) {
            addCriterion("c155 <=", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155Like(String value) {
            addCriterion("c155 like", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155NotLike(String value) {
            addCriterion("c155 not like", value, "c155");
            return (Criteria) this;
        }

        public Criteria andC155In(List<String> values) {
            addCriterion("c155 in", values, "c155");
            return (Criteria) this;
        }

        public Criteria andC155NotIn(List<String> values) {
            addCriterion("c155 not in", values, "c155");
            return (Criteria) this;
        }

        public Criteria andC155Between(String value1, String value2) {
            addCriterion("c155 between", value1, value2, "c155");
            return (Criteria) this;
        }

        public Criteria andC155NotBetween(String value1, String value2) {
            addCriterion("c155 not between", value1, value2, "c155");
            return (Criteria) this;
        }

        public Criteria andC156IsNull() {
            addCriterion("c156 is null");
            return (Criteria) this;
        }

        public Criteria andC156IsNotNull() {
            addCriterion("c156 is not null");
            return (Criteria) this;
        }

        public Criteria andC156EqualTo(String value) {
            addCriterion("c156 =", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156NotEqualTo(String value) {
            addCriterion("c156 <>", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156GreaterThan(String value) {
            addCriterion("c156 >", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156GreaterThanOrEqualTo(String value) {
            addCriterion("c156 >=", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156LessThan(String value) {
            addCriterion("c156 <", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156LessThanOrEqualTo(String value) {
            addCriterion("c156 <=", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156Like(String value) {
            addCriterion("c156 like", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156NotLike(String value) {
            addCriterion("c156 not like", value, "c156");
            return (Criteria) this;
        }

        public Criteria andC156In(List<String> values) {
            addCriterion("c156 in", values, "c156");
            return (Criteria) this;
        }

        public Criteria andC156NotIn(List<String> values) {
            addCriterion("c156 not in", values, "c156");
            return (Criteria) this;
        }

        public Criteria andC156Between(String value1, String value2) {
            addCriterion("c156 between", value1, value2, "c156");
            return (Criteria) this;
        }

        public Criteria andC156NotBetween(String value1, String value2) {
            addCriterion("c156 not between", value1, value2, "c156");
            return (Criteria) this;
        }

        public Criteria andC157IsNull() {
            addCriterion("c157 is null");
            return (Criteria) this;
        }

        public Criteria andC157IsNotNull() {
            addCriterion("c157 is not null");
            return (Criteria) this;
        }

        public Criteria andC157EqualTo(String value) {
            addCriterion("c157 =", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157NotEqualTo(String value) {
            addCriterion("c157 <>", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157GreaterThan(String value) {
            addCriterion("c157 >", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157GreaterThanOrEqualTo(String value) {
            addCriterion("c157 >=", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157LessThan(String value) {
            addCriterion("c157 <", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157LessThanOrEqualTo(String value) {
            addCriterion("c157 <=", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157Like(String value) {
            addCriterion("c157 like", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157NotLike(String value) {
            addCriterion("c157 not like", value, "c157");
            return (Criteria) this;
        }

        public Criteria andC157In(List<String> values) {
            addCriterion("c157 in", values, "c157");
            return (Criteria) this;
        }

        public Criteria andC157NotIn(List<String> values) {
            addCriterion("c157 not in", values, "c157");
            return (Criteria) this;
        }

        public Criteria andC157Between(String value1, String value2) {
            addCriterion("c157 between", value1, value2, "c157");
            return (Criteria) this;
        }

        public Criteria andC157NotBetween(String value1, String value2) {
            addCriterion("c157 not between", value1, value2, "c157");
            return (Criteria) this;
        }

        public Criteria andC158IsNull() {
            addCriterion("c158 is null");
            return (Criteria) this;
        }

        public Criteria andC158IsNotNull() {
            addCriterion("c158 is not null");
            return (Criteria) this;
        }

        public Criteria andC158EqualTo(String value) {
            addCriterion("c158 =", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158NotEqualTo(String value) {
            addCriterion("c158 <>", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158GreaterThan(String value) {
            addCriterion("c158 >", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158GreaterThanOrEqualTo(String value) {
            addCriterion("c158 >=", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158LessThan(String value) {
            addCriterion("c158 <", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158LessThanOrEqualTo(String value) {
            addCriterion("c158 <=", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158Like(String value) {
            addCriterion("c158 like", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158NotLike(String value) {
            addCriterion("c158 not like", value, "c158");
            return (Criteria) this;
        }

        public Criteria andC158In(List<String> values) {
            addCriterion("c158 in", values, "c158");
            return (Criteria) this;
        }

        public Criteria andC158NotIn(List<String> values) {
            addCriterion("c158 not in", values, "c158");
            return (Criteria) this;
        }

        public Criteria andC158Between(String value1, String value2) {
            addCriterion("c158 between", value1, value2, "c158");
            return (Criteria) this;
        }

        public Criteria andC158NotBetween(String value1, String value2) {
            addCriterion("c158 not between", value1, value2, "c158");
            return (Criteria) this;
        }

        public Criteria andC159IsNull() {
            addCriterion("c159 is null");
            return (Criteria) this;
        }

        public Criteria andC159IsNotNull() {
            addCriterion("c159 is not null");
            return (Criteria) this;
        }

        public Criteria andC159EqualTo(String value) {
            addCriterion("c159 =", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159NotEqualTo(String value) {
            addCriterion("c159 <>", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159GreaterThan(String value) {
            addCriterion("c159 >", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159GreaterThanOrEqualTo(String value) {
            addCriterion("c159 >=", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159LessThan(String value) {
            addCriterion("c159 <", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159LessThanOrEqualTo(String value) {
            addCriterion("c159 <=", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159Like(String value) {
            addCriterion("c159 like", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159NotLike(String value) {
            addCriterion("c159 not like", value, "c159");
            return (Criteria) this;
        }

        public Criteria andC159In(List<String> values) {
            addCriterion("c159 in", values, "c159");
            return (Criteria) this;
        }

        public Criteria andC159NotIn(List<String> values) {
            addCriterion("c159 not in", values, "c159");
            return (Criteria) this;
        }

        public Criteria andC159Between(String value1, String value2) {
            addCriterion("c159 between", value1, value2, "c159");
            return (Criteria) this;
        }

        public Criteria andC159NotBetween(String value1, String value2) {
            addCriterion("c159 not between", value1, value2, "c159");
            return (Criteria) this;
        }

        public Criteria andC160IsNull() {
            addCriterion("c160 is null");
            return (Criteria) this;
        }

        public Criteria andC160IsNotNull() {
            addCriterion("c160 is not null");
            return (Criteria) this;
        }

        public Criteria andC160EqualTo(String value) {
            addCriterion("c160 =", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160NotEqualTo(String value) {
            addCriterion("c160 <>", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160GreaterThan(String value) {
            addCriterion("c160 >", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160GreaterThanOrEqualTo(String value) {
            addCriterion("c160 >=", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160LessThan(String value) {
            addCriterion("c160 <", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160LessThanOrEqualTo(String value) {
            addCriterion("c160 <=", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160Like(String value) {
            addCriterion("c160 like", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160NotLike(String value) {
            addCriterion("c160 not like", value, "c160");
            return (Criteria) this;
        }

        public Criteria andC160In(List<String> values) {
            addCriterion("c160 in", values, "c160");
            return (Criteria) this;
        }

        public Criteria andC160NotIn(List<String> values) {
            addCriterion("c160 not in", values, "c160");
            return (Criteria) this;
        }

        public Criteria andC160Between(String value1, String value2) {
            addCriterion("c160 between", value1, value2, "c160");
            return (Criteria) this;
        }

        public Criteria andC160NotBetween(String value1, String value2) {
            addCriterion("c160 not between", value1, value2, "c160");
            return (Criteria) this;
        }

        public Criteria andC161IsNull() {
            addCriterion("c161 is null");
            return (Criteria) this;
        }

        public Criteria andC161IsNotNull() {
            addCriterion("c161 is not null");
            return (Criteria) this;
        }

        public Criteria andC161EqualTo(Date value) {
            addCriterionForJDBCDate("c161 =", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161NotEqualTo(Date value) {
            addCriterionForJDBCDate("c161 <>", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161GreaterThan(Date value) {
            addCriterionForJDBCDate("c161 >", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c161 >=", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161LessThan(Date value) {
            addCriterionForJDBCDate("c161 <", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c161 <=", value, "c161");
            return (Criteria) this;
        }

        public Criteria andC161In(List<Date> values) {
            addCriterionForJDBCDate("c161 in", values, "c161");
            return (Criteria) this;
        }

        public Criteria andC161NotIn(List<Date> values) {
            addCriterionForJDBCDate("c161 not in", values, "c161");
            return (Criteria) this;
        }

        public Criteria andC161Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c161 between", value1, value2, "c161");
            return (Criteria) this;
        }

        public Criteria andC161NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c161 not between", value1, value2, "c161");
            return (Criteria) this;
        }

        public Criteria andC162IsNull() {
            addCriterion("c162 is null");
            return (Criteria) this;
        }

        public Criteria andC162IsNotNull() {
            addCriterion("c162 is not null");
            return (Criteria) this;
        }

        public Criteria andC162EqualTo(String value) {
            addCriterion("c162 =", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162NotEqualTo(String value) {
            addCriterion("c162 <>", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162GreaterThan(String value) {
            addCriterion("c162 >", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162GreaterThanOrEqualTo(String value) {
            addCriterion("c162 >=", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162LessThan(String value) {
            addCriterion("c162 <", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162LessThanOrEqualTo(String value) {
            addCriterion("c162 <=", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162Like(String value) {
            addCriterion("c162 like", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162NotLike(String value) {
            addCriterion("c162 not like", value, "c162");
            return (Criteria) this;
        }

        public Criteria andC162In(List<String> values) {
            addCriterion("c162 in", values, "c162");
            return (Criteria) this;
        }

        public Criteria andC162NotIn(List<String> values) {
            addCriterion("c162 not in", values, "c162");
            return (Criteria) this;
        }

        public Criteria andC162Between(String value1, String value2) {
            addCriterion("c162 between", value1, value2, "c162");
            return (Criteria) this;
        }

        public Criteria andC162NotBetween(String value1, String value2) {
            addCriterion("c162 not between", value1, value2, "c162");
            return (Criteria) this;
        }

        public Criteria andC163IsNull() {
            addCriterion("c163 is null");
            return (Criteria) this;
        }

        public Criteria andC163IsNotNull() {
            addCriterion("c163 is not null");
            return (Criteria) this;
        }

        public Criteria andC163EqualTo(String value) {
            addCriterion("c163 =", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163NotEqualTo(String value) {
            addCriterion("c163 <>", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163GreaterThan(String value) {
            addCriterion("c163 >", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163GreaterThanOrEqualTo(String value) {
            addCriterion("c163 >=", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163LessThan(String value) {
            addCriterion("c163 <", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163LessThanOrEqualTo(String value) {
            addCriterion("c163 <=", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163Like(String value) {
            addCriterion("c163 like", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163NotLike(String value) {
            addCriterion("c163 not like", value, "c163");
            return (Criteria) this;
        }

        public Criteria andC163In(List<String> values) {
            addCriterion("c163 in", values, "c163");
            return (Criteria) this;
        }

        public Criteria andC163NotIn(List<String> values) {
            addCriterion("c163 not in", values, "c163");
            return (Criteria) this;
        }

        public Criteria andC163Between(String value1, String value2) {
            addCriterion("c163 between", value1, value2, "c163");
            return (Criteria) this;
        }

        public Criteria andC163NotBetween(String value1, String value2) {
            addCriterion("c163 not between", value1, value2, "c163");
            return (Criteria) this;
        }

        public Criteria andC164IsNull() {
            addCriterion("c164 is null");
            return (Criteria) this;
        }

        public Criteria andC164IsNotNull() {
            addCriterion("c164 is not null");
            return (Criteria) this;
        }

        public Criteria andC164EqualTo(String value) {
            addCriterion("c164 =", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164NotEqualTo(String value) {
            addCriterion("c164 <>", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164GreaterThan(String value) {
            addCriterion("c164 >", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164GreaterThanOrEqualTo(String value) {
            addCriterion("c164 >=", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164LessThan(String value) {
            addCriterion("c164 <", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164LessThanOrEqualTo(String value) {
            addCriterion("c164 <=", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164Like(String value) {
            addCriterion("c164 like", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164NotLike(String value) {
            addCriterion("c164 not like", value, "c164");
            return (Criteria) this;
        }

        public Criteria andC164In(List<String> values) {
            addCriterion("c164 in", values, "c164");
            return (Criteria) this;
        }

        public Criteria andC164NotIn(List<String> values) {
            addCriterion("c164 not in", values, "c164");
            return (Criteria) this;
        }

        public Criteria andC164Between(String value1, String value2) {
            addCriterion("c164 between", value1, value2, "c164");
            return (Criteria) this;
        }

        public Criteria andC164NotBetween(String value1, String value2) {
            addCriterion("c164 not between", value1, value2, "c164");
            return (Criteria) this;
        }

        public Criteria andC165IsNull() {
            addCriterion("c165 is null");
            return (Criteria) this;
        }

        public Criteria andC165IsNotNull() {
            addCriterion("c165 is not null");
            return (Criteria) this;
        }

        public Criteria andC165EqualTo(String value) {
            addCriterion("c165 =", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165NotEqualTo(String value) {
            addCriterion("c165 <>", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165GreaterThan(String value) {
            addCriterion("c165 >", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165GreaterThanOrEqualTo(String value) {
            addCriterion("c165 >=", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165LessThan(String value) {
            addCriterion("c165 <", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165LessThanOrEqualTo(String value) {
            addCriterion("c165 <=", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165Like(String value) {
            addCriterion("c165 like", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165NotLike(String value) {
            addCriterion("c165 not like", value, "c165");
            return (Criteria) this;
        }

        public Criteria andC165In(List<String> values) {
            addCriterion("c165 in", values, "c165");
            return (Criteria) this;
        }

        public Criteria andC165NotIn(List<String> values) {
            addCriterion("c165 not in", values, "c165");
            return (Criteria) this;
        }

        public Criteria andC165Between(String value1, String value2) {
            addCriterion("c165 between", value1, value2, "c165");
            return (Criteria) this;
        }

        public Criteria andC165NotBetween(String value1, String value2) {
            addCriterion("c165 not between", value1, value2, "c165");
            return (Criteria) this;
        }

        public Criteria andC166IsNull() {
            addCriterion("c166 is null");
            return (Criteria) this;
        }

        public Criteria andC166IsNotNull() {
            addCriterion("c166 is not null");
            return (Criteria) this;
        }

        public Criteria andC166EqualTo(String value) {
            addCriterion("c166 =", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166NotEqualTo(String value) {
            addCriterion("c166 <>", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166GreaterThan(String value) {
            addCriterion("c166 >", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166GreaterThanOrEqualTo(String value) {
            addCriterion("c166 >=", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166LessThan(String value) {
            addCriterion("c166 <", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166LessThanOrEqualTo(String value) {
            addCriterion("c166 <=", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166Like(String value) {
            addCriterion("c166 like", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166NotLike(String value) {
            addCriterion("c166 not like", value, "c166");
            return (Criteria) this;
        }

        public Criteria andC166In(List<String> values) {
            addCriterion("c166 in", values, "c166");
            return (Criteria) this;
        }

        public Criteria andC166NotIn(List<String> values) {
            addCriterion("c166 not in", values, "c166");
            return (Criteria) this;
        }

        public Criteria andC166Between(String value1, String value2) {
            addCriterion("c166 between", value1, value2, "c166");
            return (Criteria) this;
        }

        public Criteria andC166NotBetween(String value1, String value2) {
            addCriterion("c166 not between", value1, value2, "c166");
            return (Criteria) this;
        }

        public Criteria andC167IsNull() {
            addCriterion("c167 is null");
            return (Criteria) this;
        }

        public Criteria andC167IsNotNull() {
            addCriterion("c167 is not null");
            return (Criteria) this;
        }

        public Criteria andC167EqualTo(String value) {
            addCriterion("c167 =", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167NotEqualTo(String value) {
            addCriterion("c167 <>", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167GreaterThan(String value) {
            addCriterion("c167 >", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167GreaterThanOrEqualTo(String value) {
            addCriterion("c167 >=", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167LessThan(String value) {
            addCriterion("c167 <", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167LessThanOrEqualTo(String value) {
            addCriterion("c167 <=", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167Like(String value) {
            addCriterion("c167 like", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167NotLike(String value) {
            addCriterion("c167 not like", value, "c167");
            return (Criteria) this;
        }

        public Criteria andC167In(List<String> values) {
            addCriterion("c167 in", values, "c167");
            return (Criteria) this;
        }

        public Criteria andC167NotIn(List<String> values) {
            addCriterion("c167 not in", values, "c167");
            return (Criteria) this;
        }

        public Criteria andC167Between(String value1, String value2) {
            addCriterion("c167 between", value1, value2, "c167");
            return (Criteria) this;
        }

        public Criteria andC167NotBetween(String value1, String value2) {
            addCriterion("c167 not between", value1, value2, "c167");
            return (Criteria) this;
        }

        public Criteria andC168IsNull() {
            addCriterion("c168 is null");
            return (Criteria) this;
        }

        public Criteria andC168IsNotNull() {
            addCriterion("c168 is not null");
            return (Criteria) this;
        }

        public Criteria andC168EqualTo(String value) {
            addCriterion("c168 =", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168NotEqualTo(String value) {
            addCriterion("c168 <>", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168GreaterThan(String value) {
            addCriterion("c168 >", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168GreaterThanOrEqualTo(String value) {
            addCriterion("c168 >=", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168LessThan(String value) {
            addCriterion("c168 <", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168LessThanOrEqualTo(String value) {
            addCriterion("c168 <=", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168Like(String value) {
            addCriterion("c168 like", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168NotLike(String value) {
            addCriterion("c168 not like", value, "c168");
            return (Criteria) this;
        }

        public Criteria andC168In(List<String> values) {
            addCriterion("c168 in", values, "c168");
            return (Criteria) this;
        }

        public Criteria andC168NotIn(List<String> values) {
            addCriterion("c168 not in", values, "c168");
            return (Criteria) this;
        }

        public Criteria andC168Between(String value1, String value2) {
            addCriterion("c168 between", value1, value2, "c168");
            return (Criteria) this;
        }

        public Criteria andC168NotBetween(String value1, String value2) {
            addCriterion("c168 not between", value1, value2, "c168");
            return (Criteria) this;
        }

        public Criteria andC169IsNull() {
            addCriterion("c169 is null");
            return (Criteria) this;
        }

        public Criteria andC169IsNotNull() {
            addCriterion("c169 is not null");
            return (Criteria) this;
        }

        public Criteria andC169EqualTo(String value) {
            addCriterion("c169 =", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169NotEqualTo(String value) {
            addCriterion("c169 <>", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169GreaterThan(String value) {
            addCriterion("c169 >", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169GreaterThanOrEqualTo(String value) {
            addCriterion("c169 >=", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169LessThan(String value) {
            addCriterion("c169 <", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169LessThanOrEqualTo(String value) {
            addCriterion("c169 <=", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169Like(String value) {
            addCriterion("c169 like", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169NotLike(String value) {
            addCriterion("c169 not like", value, "c169");
            return (Criteria) this;
        }

        public Criteria andC169In(List<String> values) {
            addCriterion("c169 in", values, "c169");
            return (Criteria) this;
        }

        public Criteria andC169NotIn(List<String> values) {
            addCriterion("c169 not in", values, "c169");
            return (Criteria) this;
        }

        public Criteria andC169Between(String value1, String value2) {
            addCriterion("c169 between", value1, value2, "c169");
            return (Criteria) this;
        }

        public Criteria andC169NotBetween(String value1, String value2) {
            addCriterion("c169 not between", value1, value2, "c169");
            return (Criteria) this;
        }

        public Criteria andC170IsNull() {
            addCriterion("c170 is null");
            return (Criteria) this;
        }

        public Criteria andC170IsNotNull() {
            addCriterion("c170 is not null");
            return (Criteria) this;
        }

        public Criteria andC170EqualTo(String value) {
            addCriterion("c170 =", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170NotEqualTo(String value) {
            addCriterion("c170 <>", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170GreaterThan(String value) {
            addCriterion("c170 >", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170GreaterThanOrEqualTo(String value) {
            addCriterion("c170 >=", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170LessThan(String value) {
            addCriterion("c170 <", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170LessThanOrEqualTo(String value) {
            addCriterion("c170 <=", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170Like(String value) {
            addCriterion("c170 like", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170NotLike(String value) {
            addCriterion("c170 not like", value, "c170");
            return (Criteria) this;
        }

        public Criteria andC170In(List<String> values) {
            addCriterion("c170 in", values, "c170");
            return (Criteria) this;
        }

        public Criteria andC170NotIn(List<String> values) {
            addCriterion("c170 not in", values, "c170");
            return (Criteria) this;
        }

        public Criteria andC170Between(String value1, String value2) {
            addCriterion("c170 between", value1, value2, "c170");
            return (Criteria) this;
        }

        public Criteria andC170NotBetween(String value1, String value2) {
            addCriterion("c170 not between", value1, value2, "c170");
            return (Criteria) this;
        }

        public Criteria andC171IsNull() {
            addCriterion("c171 is null");
            return (Criteria) this;
        }

        public Criteria andC171IsNotNull() {
            addCriterion("c171 is not null");
            return (Criteria) this;
        }

        public Criteria andC171EqualTo(String value) {
            addCriterion("c171 =", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171NotEqualTo(String value) {
            addCriterion("c171 <>", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171GreaterThan(String value) {
            addCriterion("c171 >", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171GreaterThanOrEqualTo(String value) {
            addCriterion("c171 >=", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171LessThan(String value) {
            addCriterion("c171 <", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171LessThanOrEqualTo(String value) {
            addCriterion("c171 <=", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171Like(String value) {
            addCriterion("c171 like", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171NotLike(String value) {
            addCriterion("c171 not like", value, "c171");
            return (Criteria) this;
        }

        public Criteria andC171In(List<String> values) {
            addCriterion("c171 in", values, "c171");
            return (Criteria) this;
        }

        public Criteria andC171NotIn(List<String> values) {
            addCriterion("c171 not in", values, "c171");
            return (Criteria) this;
        }

        public Criteria andC171Between(String value1, String value2) {
            addCriterion("c171 between", value1, value2, "c171");
            return (Criteria) this;
        }

        public Criteria andC171NotBetween(String value1, String value2) {
            addCriterion("c171 not between", value1, value2, "c171");
            return (Criteria) this;
        }

        public Criteria andC172IsNull() {
            addCriterion("c172 is null");
            return (Criteria) this;
        }

        public Criteria andC172IsNotNull() {
            addCriterion("c172 is not null");
            return (Criteria) this;
        }

        public Criteria andC172EqualTo(Date value) {
            addCriterionForJDBCDate("c172 =", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172NotEqualTo(Date value) {
            addCriterionForJDBCDate("c172 <>", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172GreaterThan(Date value) {
            addCriterionForJDBCDate("c172 >", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c172 >=", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172LessThan(Date value) {
            addCriterionForJDBCDate("c172 <", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c172 <=", value, "c172");
            return (Criteria) this;
        }

        public Criteria andC172In(List<Date> values) {
            addCriterionForJDBCDate("c172 in", values, "c172");
            return (Criteria) this;
        }

        public Criteria andC172NotIn(List<Date> values) {
            addCriterionForJDBCDate("c172 not in", values, "c172");
            return (Criteria) this;
        }

        public Criteria andC172Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c172 between", value1, value2, "c172");
            return (Criteria) this;
        }

        public Criteria andC172NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c172 not between", value1, value2, "c172");
            return (Criteria) this;
        }

        public Criteria andC173IsNull() {
            addCriterion("c173 is null");
            return (Criteria) this;
        }

        public Criteria andC173IsNotNull() {
            addCriterion("c173 is not null");
            return (Criteria) this;
        }

        public Criteria andC173EqualTo(String value) {
            addCriterion("c173 =", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173NotEqualTo(String value) {
            addCriterion("c173 <>", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173GreaterThan(String value) {
            addCriterion("c173 >", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173GreaterThanOrEqualTo(String value) {
            addCriterion("c173 >=", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173LessThan(String value) {
            addCriterion("c173 <", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173LessThanOrEqualTo(String value) {
            addCriterion("c173 <=", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173Like(String value) {
            addCriterion("c173 like", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173NotLike(String value) {
            addCriterion("c173 not like", value, "c173");
            return (Criteria) this;
        }

        public Criteria andC173In(List<String> values) {
            addCriterion("c173 in", values, "c173");
            return (Criteria) this;
        }

        public Criteria andC173NotIn(List<String> values) {
            addCriterion("c173 not in", values, "c173");
            return (Criteria) this;
        }

        public Criteria andC173Between(String value1, String value2) {
            addCriterion("c173 between", value1, value2, "c173");
            return (Criteria) this;
        }

        public Criteria andC173NotBetween(String value1, String value2) {
            addCriterion("c173 not between", value1, value2, "c173");
            return (Criteria) this;
        }

        public Criteria andC174IsNull() {
            addCriterion("c174 is null");
            return (Criteria) this;
        }

        public Criteria andC174IsNotNull() {
            addCriterion("c174 is not null");
            return (Criteria) this;
        }

        public Criteria andC174EqualTo(String value) {
            addCriterion("c174 =", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174NotEqualTo(String value) {
            addCriterion("c174 <>", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174GreaterThan(String value) {
            addCriterion("c174 >", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174GreaterThanOrEqualTo(String value) {
            addCriterion("c174 >=", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174LessThan(String value) {
            addCriterion("c174 <", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174LessThanOrEqualTo(String value) {
            addCriterion("c174 <=", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174Like(String value) {
            addCriterion("c174 like", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174NotLike(String value) {
            addCriterion("c174 not like", value, "c174");
            return (Criteria) this;
        }

        public Criteria andC174In(List<String> values) {
            addCriterion("c174 in", values, "c174");
            return (Criteria) this;
        }

        public Criteria andC174NotIn(List<String> values) {
            addCriterion("c174 not in", values, "c174");
            return (Criteria) this;
        }

        public Criteria andC174Between(String value1, String value2) {
            addCriterion("c174 between", value1, value2, "c174");
            return (Criteria) this;
        }

        public Criteria andC174NotBetween(String value1, String value2) {
            addCriterion("c174 not between", value1, value2, "c174");
            return (Criteria) this;
        }

        public Criteria andC175IsNull() {
            addCriterion("c175 is null");
            return (Criteria) this;
        }

        public Criteria andC175IsNotNull() {
            addCriterion("c175 is not null");
            return (Criteria) this;
        }

        public Criteria andC175EqualTo(String value) {
            addCriterion("c175 =", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175NotEqualTo(String value) {
            addCriterion("c175 <>", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175GreaterThan(String value) {
            addCriterion("c175 >", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175GreaterThanOrEqualTo(String value) {
            addCriterion("c175 >=", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175LessThan(String value) {
            addCriterion("c175 <", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175LessThanOrEqualTo(String value) {
            addCriterion("c175 <=", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175Like(String value) {
            addCriterion("c175 like", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175NotLike(String value) {
            addCriterion("c175 not like", value, "c175");
            return (Criteria) this;
        }

        public Criteria andC175In(List<String> values) {
            addCriterion("c175 in", values, "c175");
            return (Criteria) this;
        }

        public Criteria andC175NotIn(List<String> values) {
            addCriterion("c175 not in", values, "c175");
            return (Criteria) this;
        }

        public Criteria andC175Between(String value1, String value2) {
            addCriterion("c175 between", value1, value2, "c175");
            return (Criteria) this;
        }

        public Criteria andC175NotBetween(String value1, String value2) {
            addCriterion("c175 not between", value1, value2, "c175");
            return (Criteria) this;
        }

        public Criteria andC176IsNull() {
            addCriterion("c176 is null");
            return (Criteria) this;
        }

        public Criteria andC176IsNotNull() {
            addCriterion("c176 is not null");
            return (Criteria) this;
        }

        public Criteria andC176EqualTo(String value) {
            addCriterion("c176 =", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176NotEqualTo(String value) {
            addCriterion("c176 <>", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176GreaterThan(String value) {
            addCriterion("c176 >", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176GreaterThanOrEqualTo(String value) {
            addCriterion("c176 >=", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176LessThan(String value) {
            addCriterion("c176 <", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176LessThanOrEqualTo(String value) {
            addCriterion("c176 <=", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176Like(String value) {
            addCriterion("c176 like", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176NotLike(String value) {
            addCriterion("c176 not like", value, "c176");
            return (Criteria) this;
        }

        public Criteria andC176In(List<String> values) {
            addCriterion("c176 in", values, "c176");
            return (Criteria) this;
        }

        public Criteria andC176NotIn(List<String> values) {
            addCriterion("c176 not in", values, "c176");
            return (Criteria) this;
        }

        public Criteria andC176Between(String value1, String value2) {
            addCriterion("c176 between", value1, value2, "c176");
            return (Criteria) this;
        }

        public Criteria andC176NotBetween(String value1, String value2) {
            addCriterion("c176 not between", value1, value2, "c176");
            return (Criteria) this;
        }

        public Criteria andC177IsNull() {
            addCriterion("c177 is null");
            return (Criteria) this;
        }

        public Criteria andC177IsNotNull() {
            addCriterion("c177 is not null");
            return (Criteria) this;
        }

        public Criteria andC177EqualTo(String value) {
            addCriterion("c177 =", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177NotEqualTo(String value) {
            addCriterion("c177 <>", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177GreaterThan(String value) {
            addCriterion("c177 >", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177GreaterThanOrEqualTo(String value) {
            addCriterion("c177 >=", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177LessThan(String value) {
            addCriterion("c177 <", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177LessThanOrEqualTo(String value) {
            addCriterion("c177 <=", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177Like(String value) {
            addCriterion("c177 like", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177NotLike(String value) {
            addCriterion("c177 not like", value, "c177");
            return (Criteria) this;
        }

        public Criteria andC177In(List<String> values) {
            addCriterion("c177 in", values, "c177");
            return (Criteria) this;
        }

        public Criteria andC177NotIn(List<String> values) {
            addCriterion("c177 not in", values, "c177");
            return (Criteria) this;
        }

        public Criteria andC177Between(String value1, String value2) {
            addCriterion("c177 between", value1, value2, "c177");
            return (Criteria) this;
        }

        public Criteria andC177NotBetween(String value1, String value2) {
            addCriterion("c177 not between", value1, value2, "c177");
            return (Criteria) this;
        }

        public Criteria andC178IsNull() {
            addCriterion("c178 is null");
            return (Criteria) this;
        }

        public Criteria andC178IsNotNull() {
            addCriterion("c178 is not null");
            return (Criteria) this;
        }

        public Criteria andC178EqualTo(String value) {
            addCriterion("c178 =", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178NotEqualTo(String value) {
            addCriterion("c178 <>", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178GreaterThan(String value) {
            addCriterion("c178 >", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178GreaterThanOrEqualTo(String value) {
            addCriterion("c178 >=", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178LessThan(String value) {
            addCriterion("c178 <", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178LessThanOrEqualTo(String value) {
            addCriterion("c178 <=", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178Like(String value) {
            addCriterion("c178 like", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178NotLike(String value) {
            addCriterion("c178 not like", value, "c178");
            return (Criteria) this;
        }

        public Criteria andC178In(List<String> values) {
            addCriterion("c178 in", values, "c178");
            return (Criteria) this;
        }

        public Criteria andC178NotIn(List<String> values) {
            addCriterion("c178 not in", values, "c178");
            return (Criteria) this;
        }

        public Criteria andC178Between(String value1, String value2) {
            addCriterion("c178 between", value1, value2, "c178");
            return (Criteria) this;
        }

        public Criteria andC178NotBetween(String value1, String value2) {
            addCriterion("c178 not between", value1, value2, "c178");
            return (Criteria) this;
        }

        public Criteria andC179IsNull() {
            addCriterion("c179 is null");
            return (Criteria) this;
        }

        public Criteria andC179IsNotNull() {
            addCriterion("c179 is not null");
            return (Criteria) this;
        }

        public Criteria andC179EqualTo(String value) {
            addCriterion("c179 =", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179NotEqualTo(String value) {
            addCriterion("c179 <>", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179GreaterThan(String value) {
            addCriterion("c179 >", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179GreaterThanOrEqualTo(String value) {
            addCriterion("c179 >=", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179LessThan(String value) {
            addCriterion("c179 <", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179LessThanOrEqualTo(String value) {
            addCriterion("c179 <=", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179Like(String value) {
            addCriterion("c179 like", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179NotLike(String value) {
            addCriterion("c179 not like", value, "c179");
            return (Criteria) this;
        }

        public Criteria andC179In(List<String> values) {
            addCriterion("c179 in", values, "c179");
            return (Criteria) this;
        }

        public Criteria andC179NotIn(List<String> values) {
            addCriterion("c179 not in", values, "c179");
            return (Criteria) this;
        }

        public Criteria andC179Between(String value1, String value2) {
            addCriterion("c179 between", value1, value2, "c179");
            return (Criteria) this;
        }

        public Criteria andC179NotBetween(String value1, String value2) {
            addCriterion("c179 not between", value1, value2, "c179");
            return (Criteria) this;
        }

        public Criteria andC180IsNull() {
            addCriterion("c180 is null");
            return (Criteria) this;
        }

        public Criteria andC180IsNotNull() {
            addCriterion("c180 is not null");
            return (Criteria) this;
        }

        public Criteria andC180EqualTo(String value) {
            addCriterion("c180 =", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180NotEqualTo(String value) {
            addCriterion("c180 <>", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180GreaterThan(String value) {
            addCriterion("c180 >", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180GreaterThanOrEqualTo(String value) {
            addCriterion("c180 >=", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180LessThan(String value) {
            addCriterion("c180 <", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180LessThanOrEqualTo(String value) {
            addCriterion("c180 <=", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180Like(String value) {
            addCriterion("c180 like", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180NotLike(String value) {
            addCriterion("c180 not like", value, "c180");
            return (Criteria) this;
        }

        public Criteria andC180In(List<String> values) {
            addCriterion("c180 in", values, "c180");
            return (Criteria) this;
        }

        public Criteria andC180NotIn(List<String> values) {
            addCriterion("c180 not in", values, "c180");
            return (Criteria) this;
        }

        public Criteria andC180Between(String value1, String value2) {
            addCriterion("c180 between", value1, value2, "c180");
            return (Criteria) this;
        }

        public Criteria andC180NotBetween(String value1, String value2) {
            addCriterion("c180 not between", value1, value2, "c180");
            return (Criteria) this;
        }

        public Criteria andC181IsNull() {
            addCriterion("c181 is null");
            return (Criteria) this;
        }

        public Criteria andC181IsNotNull() {
            addCriterion("c181 is not null");
            return (Criteria) this;
        }

        public Criteria andC181EqualTo(String value) {
            addCriterion("c181 =", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181NotEqualTo(String value) {
            addCriterion("c181 <>", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181GreaterThan(String value) {
            addCriterion("c181 >", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181GreaterThanOrEqualTo(String value) {
            addCriterion("c181 >=", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181LessThan(String value) {
            addCriterion("c181 <", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181LessThanOrEqualTo(String value) {
            addCriterion("c181 <=", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181Like(String value) {
            addCriterion("c181 like", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181NotLike(String value) {
            addCriterion("c181 not like", value, "c181");
            return (Criteria) this;
        }

        public Criteria andC181In(List<String> values) {
            addCriterion("c181 in", values, "c181");
            return (Criteria) this;
        }

        public Criteria andC181NotIn(List<String> values) {
            addCriterion("c181 not in", values, "c181");
            return (Criteria) this;
        }

        public Criteria andC181Between(String value1, String value2) {
            addCriterion("c181 between", value1, value2, "c181");
            return (Criteria) this;
        }

        public Criteria andC181NotBetween(String value1, String value2) {
            addCriterion("c181 not between", value1, value2, "c181");
            return (Criteria) this;
        }

        public Criteria andC182IsNull() {
            addCriterion("c182 is null");
            return (Criteria) this;
        }

        public Criteria andC182IsNotNull() {
            addCriterion("c182 is not null");
            return (Criteria) this;
        }

        public Criteria andC182EqualTo(String value) {
            addCriterion("c182 =", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182NotEqualTo(String value) {
            addCriterion("c182 <>", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182GreaterThan(String value) {
            addCriterion("c182 >", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182GreaterThanOrEqualTo(String value) {
            addCriterion("c182 >=", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182LessThan(String value) {
            addCriterion("c182 <", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182LessThanOrEqualTo(String value) {
            addCriterion("c182 <=", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182Like(String value) {
            addCriterion("c182 like", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182NotLike(String value) {
            addCriterion("c182 not like", value, "c182");
            return (Criteria) this;
        }

        public Criteria andC182In(List<String> values) {
            addCriterion("c182 in", values, "c182");
            return (Criteria) this;
        }

        public Criteria andC182NotIn(List<String> values) {
            addCriterion("c182 not in", values, "c182");
            return (Criteria) this;
        }

        public Criteria andC182Between(String value1, String value2) {
            addCriterion("c182 between", value1, value2, "c182");
            return (Criteria) this;
        }

        public Criteria andC182NotBetween(String value1, String value2) {
            addCriterion("c182 not between", value1, value2, "c182");
            return (Criteria) this;
        }

        public Criteria andC183IsNull() {
            addCriterion("c183 is null");
            return (Criteria) this;
        }

        public Criteria andC183IsNotNull() {
            addCriterion("c183 is not null");
            return (Criteria) this;
        }

        public Criteria andC183EqualTo(Date value) {
            addCriterionForJDBCDate("c183 =", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183NotEqualTo(Date value) {
            addCriterionForJDBCDate("c183 <>", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183GreaterThan(Date value) {
            addCriterionForJDBCDate("c183 >", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183GreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c183 >=", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183LessThan(Date value) {
            addCriterionForJDBCDate("c183 <", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183LessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c183 <=", value, "c183");
            return (Criteria) this;
        }

        public Criteria andC183In(List<Date> values) {
            addCriterionForJDBCDate("c183 in", values, "c183");
            return (Criteria) this;
        }

        public Criteria andC183NotIn(List<Date> values) {
            addCriterionForJDBCDate("c183 not in", values, "c183");
            return (Criteria) this;
        }

        public Criteria andC183Between(Date value1, Date value2) {
            addCriterionForJDBCDate("c183 between", value1, value2, "c183");
            return (Criteria) this;
        }

        public Criteria andC183NotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c183 not between", value1, value2, "c183");
            return (Criteria) this;
        }

        public Criteria andC184IsNull() {
            addCriterion("c184 is null");
            return (Criteria) this;
        }

        public Criteria andC184IsNotNull() {
            addCriterion("c184 is not null");
            return (Criteria) this;
        }

        public Criteria andC184EqualTo(String value) {
            addCriterion("c184 =", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184NotEqualTo(String value) {
            addCriterion("c184 <>", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184GreaterThan(String value) {
            addCriterion("c184 >", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184GreaterThanOrEqualTo(String value) {
            addCriterion("c184 >=", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184LessThan(String value) {
            addCriterion("c184 <", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184LessThanOrEqualTo(String value) {
            addCriterion("c184 <=", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184Like(String value) {
            addCriterion("c184 like", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184NotLike(String value) {
            addCriterion("c184 not like", value, "c184");
            return (Criteria) this;
        }

        public Criteria andC184In(List<String> values) {
            addCriterion("c184 in", values, "c184");
            return (Criteria) this;
        }

        public Criteria andC184NotIn(List<String> values) {
            addCriterion("c184 not in", values, "c184");
            return (Criteria) this;
        }

        public Criteria andC184Between(String value1, String value2) {
            addCriterion("c184 between", value1, value2, "c184");
            return (Criteria) this;
        }

        public Criteria andC184NotBetween(String value1, String value2) {
            addCriterion("c184 not between", value1, value2, "c184");
            return (Criteria) this;
        }

        public Criteria andC185IsNull() {
            addCriterion("c185 is null");
            return (Criteria) this;
        }

        public Criteria andC185IsNotNull() {
            addCriterion("c185 is not null");
            return (Criteria) this;
        }

        public Criteria andC185EqualTo(String value) {
            addCriterion("c185 =", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185NotEqualTo(String value) {
            addCriterion("c185 <>", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185GreaterThan(String value) {
            addCriterion("c185 >", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185GreaterThanOrEqualTo(String value) {
            addCriterion("c185 >=", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185LessThan(String value) {
            addCriterion("c185 <", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185LessThanOrEqualTo(String value) {
            addCriterion("c185 <=", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185Like(String value) {
            addCriterion("c185 like", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185NotLike(String value) {
            addCriterion("c185 not like", value, "c185");
            return (Criteria) this;
        }

        public Criteria andC185In(List<String> values) {
            addCriterion("c185 in", values, "c185");
            return (Criteria) this;
        }

        public Criteria andC185NotIn(List<String> values) {
            addCriterion("c185 not in", values, "c185");
            return (Criteria) this;
        }

        public Criteria andC185Between(String value1, String value2) {
            addCriterion("c185 between", value1, value2, "c185");
            return (Criteria) this;
        }

        public Criteria andC185NotBetween(String value1, String value2) {
            addCriterion("c185 not between", value1, value2, "c185");
            return (Criteria) this;
        }

        public Criteria andC186IsNull() {
            addCriterion("c186 is null");
            return (Criteria) this;
        }

        public Criteria andC186IsNotNull() {
            addCriterion("c186 is not null");
            return (Criteria) this;
        }

        public Criteria andC186EqualTo(String value) {
            addCriterion("c186 =", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186NotEqualTo(String value) {
            addCriterion("c186 <>", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186GreaterThan(String value) {
            addCriterion("c186 >", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186GreaterThanOrEqualTo(String value) {
            addCriterion("c186 >=", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186LessThan(String value) {
            addCriterion("c186 <", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186LessThanOrEqualTo(String value) {
            addCriterion("c186 <=", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186Like(String value) {
            addCriterion("c186 like", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186NotLike(String value) {
            addCriterion("c186 not like", value, "c186");
            return (Criteria) this;
        }

        public Criteria andC186In(List<String> values) {
            addCriterion("c186 in", values, "c186");
            return (Criteria) this;
        }

        public Criteria andC186NotIn(List<String> values) {
            addCriterion("c186 not in", values, "c186");
            return (Criteria) this;
        }

        public Criteria andC186Between(String value1, String value2) {
            addCriterion("c186 between", value1, value2, "c186");
            return (Criteria) this;
        }

        public Criteria andC186NotBetween(String value1, String value2) {
            addCriterion("c186 not between", value1, value2, "c186");
            return (Criteria) this;
        }

        public Criteria andC187IsNull() {
            addCriterion("c187 is null");
            return (Criteria) this;
        }

        public Criteria andC187IsNotNull() {
            addCriterion("c187 is not null");
            return (Criteria) this;
        }

        public Criteria andC187EqualTo(String value) {
            addCriterion("c187 =", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187NotEqualTo(String value) {
            addCriterion("c187 <>", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187GreaterThan(String value) {
            addCriterion("c187 >", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187GreaterThanOrEqualTo(String value) {
            addCriterion("c187 >=", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187LessThan(String value) {
            addCriterion("c187 <", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187LessThanOrEqualTo(String value) {
            addCriterion("c187 <=", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187Like(String value) {
            addCriterion("c187 like", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187NotLike(String value) {
            addCriterion("c187 not like", value, "c187");
            return (Criteria) this;
        }

        public Criteria andC187In(List<String> values) {
            addCriterion("c187 in", values, "c187");
            return (Criteria) this;
        }

        public Criteria andC187NotIn(List<String> values) {
            addCriterion("c187 not in", values, "c187");
            return (Criteria) this;
        }

        public Criteria andC187Between(String value1, String value2) {
            addCriterion("c187 between", value1, value2, "c187");
            return (Criteria) this;
        }

        public Criteria andC187NotBetween(String value1, String value2) {
            addCriterion("c187 not between", value1, value2, "c187");
            return (Criteria) this;
        }

        public Criteria andC188IsNull() {
            addCriterion("c188 is null");
            return (Criteria) this;
        }

        public Criteria andC188IsNotNull() {
            addCriterion("c188 is not null");
            return (Criteria) this;
        }

        public Criteria andC188EqualTo(String value) {
            addCriterion("c188 =", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188NotEqualTo(String value) {
            addCriterion("c188 <>", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188GreaterThan(String value) {
            addCriterion("c188 >", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188GreaterThanOrEqualTo(String value) {
            addCriterion("c188 >=", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188LessThan(String value) {
            addCriterion("c188 <", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188LessThanOrEqualTo(String value) {
            addCriterion("c188 <=", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188Like(String value) {
            addCriterion("c188 like", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188NotLike(String value) {
            addCriterion("c188 not like", value, "c188");
            return (Criteria) this;
        }

        public Criteria andC188In(List<String> values) {
            addCriterion("c188 in", values, "c188");
            return (Criteria) this;
        }

        public Criteria andC188NotIn(List<String> values) {
            addCriterion("c188 not in", values, "c188");
            return (Criteria) this;
        }

        public Criteria andC188Between(String value1, String value2) {
            addCriterion("c188 between", value1, value2, "c188");
            return (Criteria) this;
        }

        public Criteria andC188NotBetween(String value1, String value2) {
            addCriterion("c188 not between", value1, value2, "c188");
            return (Criteria) this;
        }

        public Criteria andC189IsNull() {
            addCriterion("c189 is null");
            return (Criteria) this;
        }

        public Criteria andC189IsNotNull() {
            addCriterion("c189 is not null");
            return (Criteria) this;
        }

        public Criteria andC189EqualTo(String value) {
            addCriterion("c189 =", value, "c189");
            return (Criteria) this;
        }

        public Criteria andC189NotEqualTo(String value) {
            addCriterion("c189 <>", value, "c189");
            return (Criteria) this;
        }

        public Criteria andC189GreaterThan(String value) {
            addCriterion("c189 >", value, "c189");
            return (Criteria) this;
        }

        public Criteria andC189GreaterThanOrEqualTo(String value) {
            addCriterion("c189 >=", value, "c189");
            return (Criteria) this;
        }

        public Criteria andC189LessThan(String value) {
            addCriterion("c189 <", value, "c189");
            return (Criteria) this;
        }

        public Criteria andC189LessThanOrEqualTo(String value) {
            addCriterion("c189 <=", value, "c189");
            return (Criteria) this;
        }

        public Criteria andC189Like(String value) {
            addCriterion("c189 like", value, "c189");
            return (Criteria) this;
        }

        public Criteria andC189NotLike(String value) {
            addCriterion("c189 not like", value, "c189");
            return (Criteria) this;
        }

        public Criteria andC189In(List<String> values) {
            addCriterion("c189 in", values, "c189");
            return (Criteria) this;
        }

        public Criteria andC189NotIn(List<String> values) {
            addCriterion("c189 not in", values, "c189");
            return (Criteria) this;
        }

        public Criteria andC189Between(String value1, String value2) {
            addCriterion("c189 between", value1, value2, "c189");
            return (Criteria) this;
        }

        public Criteria andC189NotBetween(String value1, String value2) {
            addCriterion("c189 not between", value1, value2, "c189");
            return (Criteria) this;
        }

        public Criteria andC190IsNull() {
            addCriterion("c190 is null");
            return (Criteria) this;
        }

        public Criteria andC190IsNotNull() {
            addCriterion("c190 is not null");
            return (Criteria) this;
        }

        public Criteria andC190EqualTo(String value) {
            addCriterion("c190 =", value, "c190");
            return (Criteria) this;
        }

        public Criteria andC190NotEqualTo(String value) {
            addCriterion("c190 <>", value, "c190");
            return (Criteria) this;
        }

        public Criteria andC190GreaterThan(String value) {
            addCriterion("c190 >", value, "c190");
            return (Criteria) this;
        }

        public Criteria andC190GreaterThanOrEqualTo(String value) {
            addCriterion("c190 >=", value, "c190");
            return (Criteria) this;
        }

        public Criteria andC190LessThan(String value) {
            addCriterion("c190 <", value, "c190");
            return (Criteria) this;
        }

        public Criteria andC190LessThanOrEqualTo(String value) {
            addCriterion("c190 <=", value, "c190");
            return (Criteria) this;
        }

        public Criteria andC190Like(String value) {
            addCriterion("c190 like", value, "c190");
            return (Criteria) this;
        }

        public Criteria andC190NotLike(String value) {
            addCriterion("c190 not like", value, "c190");
            return (Criteria) this;
        }

        public Criteria andC190In(List<String> values) {
            addCriterion("c190 in", values, "c190");
            return (Criteria) this;
        }

        public Criteria andC190NotIn(List<String> values) {
            addCriterion("c190 not in", values, "c190");
            return (Criteria) this;
        }

        public Criteria andC190Between(String value1, String value2) {
            addCriterion("c190 between", value1, value2, "c190");
            return (Criteria) this;
        }

        public Criteria andC190NotBetween(String value1, String value2) {
            addCriterion("c190 not between", value1, value2, "c190");
            return (Criteria) this;
        }

        public Criteria andC191IsNull() {
            addCriterion("c191 is null");
            return (Criteria) this;
        }

        public Criteria andC191IsNotNull() {
            addCriterion("c191 is not null");
            return (Criteria) this;
        }

        public Criteria andC191EqualTo(String value) {
            addCriterion("c191 =", value, "c191");
            return (Criteria) this;
        }

        public Criteria andC191NotEqualTo(String value) {
            addCriterion("c191 <>", value, "c191");
            return (Criteria) this;
        }

        public Criteria andC191GreaterThan(String value) {
            addCriterion("c191 >", value, "c191");
            return (Criteria) this;
        }

        public Criteria andC191GreaterThanOrEqualTo(String value) {
            addCriterion("c191 >=", value, "c191");
            return (Criteria) this;
        }

        public Criteria andC191LessThan(String value) {
            addCriterion("c191 <", value, "c191");
            return (Criteria) this;
        }

        public Criteria andC191LessThanOrEqualTo(String value) {
            addCriterion("c191 <=", value, "c191");
            return (Criteria) this;
        }

        public Criteria andC191Like(String value) {
            addCriterion("c191 like", value, "c191");
            return (Criteria) this;
        }

        public Criteria andC191NotLike(String value) {
            addCriterion("c191 not like", value, "c191");
            return (Criteria) this;
        }

        public Criteria andC191In(List<String> values) {
            addCriterion("c191 in", values, "c191");
            return (Criteria) this;
        }

        public Criteria andC191NotIn(List<String> values) {
            addCriterion("c191 not in", values, "c191");
            return (Criteria) this;
        }

        public Criteria andC191Between(String value1, String value2) {
            addCriterion("c191 between", value1, value2, "c191");
            return (Criteria) this;
        }

        public Criteria andC191NotBetween(String value1, String value2) {
            addCriterion("c191 not between", value1, value2, "c191");
            return (Criteria) this;
        }

        public Criteria andC192IsNull() {
            addCriterion("c192 is null");
            return (Criteria) this;
        }

        public Criteria andC192IsNotNull() {
            addCriterion("c192 is not null");
            return (Criteria) this;
        }

        public Criteria andC192EqualTo(String value) {
            addCriterion("c192 =", value, "c192");
            return (Criteria) this;
        }

        public Criteria andC192NotEqualTo(String value) {
            addCriterion("c192 <>", value, "c192");
            return (Criteria) this;
        }

        public Criteria andC192GreaterThan(String value) {
            addCriterion("c192 >", value, "c192");
            return (Criteria) this;
        }

        public Criteria andC192GreaterThanOrEqualTo(String value) {
            addCriterion("c192 >=", value, "c192");
            return (Criteria) this;
        }

        public Criteria andC192LessThan(String value) {
            addCriterion("c192 <", value, "c192");
            return (Criteria) this;
        }

        public Criteria andC192LessThanOrEqualTo(String value) {
            addCriterion("c192 <=", value, "c192");
            return (Criteria) this;
        }

        public Criteria andC192Like(String value) {
            addCriterion("c192 like", value, "c192");
            return (Criteria) this;
        }

        public Criteria andC192NotLike(String value) {
            addCriterion("c192 not like", value, "c192");
            return (Criteria) this;
        }

        public Criteria andC192In(List<String> values) {
            addCriterion("c192 in", values, "c192");
            return (Criteria) this;
        }

        public Criteria andC192NotIn(List<String> values) {
            addCriterion("c192 not in", values, "c192");
            return (Criteria) this;
        }

        public Criteria andC192Between(String value1, String value2) {
            addCriterion("c192 between", value1, value2, "c192");
            return (Criteria) this;
        }

        public Criteria andC192NotBetween(String value1, String value2) {
            addCriterion("c192 not between", value1, value2, "c192");
            return (Criteria) this;
        }

        public Criteria andC193IsNull() {
            addCriterion("c193 is null");
            return (Criteria) this;
        }

        public Criteria andC193IsNotNull() {
            addCriterion("c193 is not null");
            return (Criteria) this;
        }

        public Criteria andC193EqualTo(String value) {
            addCriterion("c193 =", value, "c193");
            return (Criteria) this;
        }

        public Criteria andC193NotEqualTo(String value) {
            addCriterion("c193 <>", value, "c193");
            return (Criteria) this;
        }

        public Criteria andC193GreaterThan(String value) {
            addCriterion("c193 >", value, "c193");
            return (Criteria) this;
        }

        public Criteria andC193GreaterThanOrEqualTo(String value) {
            addCriterion("c193 >=", value, "c193");
            return (Criteria) this;
        }

        public Criteria andC193LessThan(String value) {
            addCriterion("c193 <", value, "c193");
            return (Criteria) this;
        }

        public Criteria andC193LessThanOrEqualTo(String value) {
            addCriterion("c193 <=", value, "c193");
            return (Criteria) this;
        }

        public Criteria andC193Like(String value) {
            addCriterion("c193 like", value, "c193");
            return (Criteria) this;
        }

        public Criteria andC193NotLike(String value) {
            addCriterion("c193 not like", value, "c193");
            return (Criteria) this;
        }

        public Criteria andC193In(List<String> values) {
            addCriterion("c193 in", values, "c193");
            return (Criteria) this;
        }

        public Criteria andC193NotIn(List<String> values) {
            addCriterion("c193 not in", values, "c193");
            return (Criteria) this;
        }

        public Criteria andC193Between(String value1, String value2) {
            addCriterion("c193 between", value1, value2, "c193");
            return (Criteria) this;
        }

        public Criteria andC193NotBetween(String value1, String value2) {
            addCriterion("c193 not between", value1, value2, "c193");
            return (Criteria) this;
        }

        public Criteria andC194IsNull() {
            addCriterion("c194 is null");
            return (Criteria) this;
        }

        public Criteria andC194IsNotNull() {
            addCriterion("c194 is not null");
            return (Criteria) this;
        }

        public Criteria andC194EqualTo(String value) {
            addCriterion("c194 =", value, "c194");
            return (Criteria) this;
        }

        public Criteria andC194NotEqualTo(String value) {
            addCriterion("c194 <>", value, "c194");
            return (Criteria) this;
        }

        public Criteria andC194GreaterThan(String value) {
            addCriterion("c194 >", value, "c194");
            return (Criteria) this;
        }

        public Criteria andC194GreaterThanOrEqualTo(String value) {
            addCriterion("c194 >=", value, "c194");
            return (Criteria) this;
        }

        public Criteria andC194LessThan(String value) {
            addCriterion("c194 <", value, "c194");
            return (Criteria) this;
        }

        public Criteria andC194LessThanOrEqualTo(String value) {
            addCriterion("c194 <=", value, "c194");
            return (Criteria) this;
        }

        public Criteria andC194Like(String value) {
            addCriterion("c194 like", value, "c194");
            return (Criteria) this;
        }

        public Criteria andC194NotLike(String value) {
            addCriterion("c194 not like", value, "c194");
            return (Criteria) this;
        }

        public Criteria andC194In(List<String> values) {
            addCriterion("c194 in", values, "c194");
            return (Criteria) this;
        }

        public Criteria andC194NotIn(List<String> values) {
            addCriterion("c194 not in", values, "c194");
            return (Criteria) this;
        }

        public Criteria andC194Between(String value1, String value2) {
            addCriterion("c194 between", value1, value2, "c194");
            return (Criteria) this;
        }

        public Criteria andC194NotBetween(String value1, String value2) {
            addCriterion("c194 not between", value1, value2, "c194");
            return (Criteria) this;
        }

        public Criteria andC195IsNull() {
            addCriterion("c195 is null");
            return (Criteria) this;
        }

        public Criteria andC195IsNotNull() {
            addCriterion("c195 is not null");
            return (Criteria) this;
        }

        public Criteria andC195EqualTo(String value) {
            addCriterion("c195 =", value, "c195");
            return (Criteria) this;
        }

        public Criteria andC195NotEqualTo(String value) {
            addCriterion("c195 <>", value, "c195");
            return (Criteria) this;
        }

        public Criteria andC195GreaterThan(String value) {
            addCriterion("c195 >", value, "c195");
            return (Criteria) this;
        }

        public Criteria andC195GreaterThanOrEqualTo(String value) {
            addCriterion("c195 >=", value, "c195");
            return (Criteria) this;
        }

        public Criteria andC195LessThan(String value) {
            addCriterion("c195 <", value, "c195");
            return (Criteria) this;
        }

        public Criteria andC195LessThanOrEqualTo(String value) {
            addCriterion("c195 <=", value, "c195");
            return (Criteria) this;
        }

        public Criteria andC195Like(String value) {
            addCriterion("c195 like", value, "c195");
            return (Criteria) this;
        }

        public Criteria andC195NotLike(String value) {
            addCriterion("c195 not like", value, "c195");
            return (Criteria) this;
        }

        public Criteria andC195In(List<String> values) {
            addCriterion("c195 in", values, "c195");
            return (Criteria) this;
        }

        public Criteria andC195NotIn(List<String> values) {
            addCriterion("c195 not in", values, "c195");
            return (Criteria) this;
        }

        public Criteria andC195Between(String value1, String value2) {
            addCriterion("c195 between", value1, value2, "c195");
            return (Criteria) this;
        }

        public Criteria andC195NotBetween(String value1, String value2) {
            addCriterion("c195 not between", value1, value2, "c195");
            return (Criteria) this;
        }

        public Criteria andC196IsNull() {
            addCriterion("c196 is null");
            return (Criteria) this;
        }

        public Criteria andC196IsNotNull() {
            addCriterion("c196 is not null");
            return (Criteria) this;
        }

        public Criteria andC196EqualTo(String value) {
            addCriterion("c196 =", value, "c196");
            return (Criteria) this;
        }

        public Criteria andC196NotEqualTo(String value) {
            addCriterion("c196 <>", value, "c196");
            return (Criteria) this;
        }

        public Criteria andC196GreaterThan(String value) {
            addCriterion("c196 >", value, "c196");
            return (Criteria) this;
        }

        public Criteria andC196GreaterThanOrEqualTo(String value) {
            addCriterion("c196 >=", value, "c196");
            return (Criteria) this;
        }

        public Criteria andC196LessThan(String value) {
            addCriterion("c196 <", value, "c196");
            return (Criteria) this;
        }

        public Criteria andC196LessThanOrEqualTo(String value) {
            addCriterion("c196 <=", value, "c196");
            return (Criteria) this;
        }

        public Criteria andC196Like(String value) {
            addCriterion("c196 like", value, "c196");
            return (Criteria) this;
        }

        public Criteria andC196NotLike(String value) {
            addCriterion("c196 not like", value, "c196");
            return (Criteria) this;
        }

        public Criteria andC196In(List<String> values) {
            addCriterion("c196 in", values, "c196");
            return (Criteria) this;
        }

        public Criteria andC196NotIn(List<String> values) {
            addCriterion("c196 not in", values, "c196");
            return (Criteria) this;
        }

        public Criteria andC196Between(String value1, String value2) {
            addCriterion("c196 between", value1, value2, "c196");
            return (Criteria) this;
        }

        public Criteria andC196NotBetween(String value1, String value2) {
            addCriterion("c196 not between", value1, value2, "c196");
            return (Criteria) this;
        }

        public Criteria andC197IsNull() {
            addCriterion("c197 is null");
            return (Criteria) this;
        }

        public Criteria andC197IsNotNull() {
            addCriterion("c197 is not null");
            return (Criteria) this;
        }

        public Criteria andC197EqualTo(String value) {
            addCriterion("c197 =", value, "c197");
            return (Criteria) this;
        }

        public Criteria andC197NotEqualTo(String value) {
            addCriterion("c197 <>", value, "c197");
            return (Criteria) this;
        }

        public Criteria andC197GreaterThan(String value) {
            addCriterion("c197 >", value, "c197");
            return (Criteria) this;
        }

        public Criteria andC197GreaterThanOrEqualTo(String value) {
            addCriterion("c197 >=", value, "c197");
            return (Criteria) this;
        }

        public Criteria andC197LessThan(String value) {
            addCriterion("c197 <", value, "c197");
            return (Criteria) this;
        }

        public Criteria andC197LessThanOrEqualTo(String value) {
            addCriterion("c197 <=", value, "c197");
            return (Criteria) this;
        }

        public Criteria andC197Like(String value) {
            addCriterion("c197 like", value, "c197");
            return (Criteria) this;
        }

        public Criteria andC197NotLike(String value) {
            addCriterion("c197 not like", value, "c197");
            return (Criteria) this;
        }

        public Criteria andC197In(List<String> values) {
            addCriterion("c197 in", values, "c197");
            return (Criteria) this;
        }

        public Criteria andC197NotIn(List<String> values) {
            addCriterion("c197 not in", values, "c197");
            return (Criteria) this;
        }

        public Criteria andC197Between(String value1, String value2) {
            addCriterion("c197 between", value1, value2, "c197");
            return (Criteria) this;
        }

        public Criteria andC197NotBetween(String value1, String value2) {
            addCriterion("c197 not between", value1, value2, "c197");
            return (Criteria) this;
        }

        public Criteria andC198IsNull() {
            addCriterion("c198 is null");
            return (Criteria) this;
        }

        public Criteria andC198IsNotNull() {
            addCriterion("c198 is not null");
            return (Criteria) this;
        }

        public Criteria andC198EqualTo(Integer value) {
            addCriterion("c198 =", value, "c198");
            return (Criteria) this;
        }

        public Criteria andC198NotEqualTo(Integer value) {
            addCriterion("c198 <>", value, "c198");
            return (Criteria) this;
        }

        public Criteria andC198GreaterThan(Integer value) {
            addCriterion("c198 >", value, "c198");
            return (Criteria) this;
        }

        public Criteria andC198GreaterThanOrEqualTo(Integer value) {
            addCriterion("c198 >=", value, "c198");
            return (Criteria) this;
        }

        public Criteria andC198LessThan(Integer value) {
            addCriterion("c198 <", value, "c198");
            return (Criteria) this;
        }

        public Criteria andC198LessThanOrEqualTo(Integer value) {
            addCriterion("c198 <=", value, "c198");
            return (Criteria) this;
        }

        public Criteria andC198In(List<Integer> values) {
            addCriterion("c198 in", values, "c198");
            return (Criteria) this;
        }

        public Criteria andC198NotIn(List<Integer> values) {
            addCriterion("c198 not in", values, "c198");
            return (Criteria) this;
        }

        public Criteria andC198Between(Integer value1, Integer value2) {
            addCriterion("c198 between", value1, value2, "c198");
            return (Criteria) this;
        }

        public Criteria andC198NotBetween(Integer value1, Integer value2) {
            addCriterion("c198 not between", value1, value2, "c198");
            return (Criteria) this;
        }

        public Criteria andC199IsNull() {
            addCriterion("c199 is null");
            return (Criteria) this;
        }

        public Criteria andC199IsNotNull() {
            addCriterion("c199 is not null");
            return (Criteria) this;
        }

        public Criteria andC199EqualTo(Byte value) {
            addCriterion("c199 =", value, "c199");
            return (Criteria) this;
        }

        public Criteria andC199NotEqualTo(Byte value) {
            addCriterion("c199 <>", value, "c199");
            return (Criteria) this;
        }

        public Criteria andC199GreaterThan(Byte value) {
            addCriterion("c199 >", value, "c199");
            return (Criteria) this;
        }

        public Criteria andC199GreaterThanOrEqualTo(Byte value) {
            addCriterion("c199 >=", value, "c199");
            return (Criteria) this;
        }

        public Criteria andC199LessThan(Byte value) {
            addCriterion("c199 <", value, "c199");
            return (Criteria) this;
        }

        public Criteria andC199LessThanOrEqualTo(Byte value) {
            addCriterion("c199 <=", value, "c199");
            return (Criteria) this;
        }

        public Criteria andC199In(List<Byte> values) {
            addCriterion("c199 in", values, "c199");
            return (Criteria) this;
        }

        public Criteria andC199NotIn(List<Byte> values) {
            addCriterion("c199 not in", values, "c199");
            return (Criteria) this;
        }

        public Criteria andC199Between(Byte value1, Byte value2) {
            addCriterion("c199 between", value1, value2, "c199");
            return (Criteria) this;
        }

        public Criteria andC199NotBetween(Byte value1, Byte value2) {
            addCriterion("c199 not between", value1, value2, "c199");
            return (Criteria) this;
        }

        public Criteria andC200IsNull() {
            addCriterion("c200 is null");
            return (Criteria) this;
        }

        public Criteria andC200IsNotNull() {
            addCriterion("c200 is not null");
            return (Criteria) this;
        }

        public Criteria andC200EqualTo(Byte value) {
            addCriterion("c200 =", value, "c200");
            return (Criteria) this;
        }

        public Criteria andC200NotEqualTo(Byte value) {
            addCriterion("c200 <>", value, "c200");
            return (Criteria) this;
        }

        public Criteria andC200GreaterThan(Byte value) {
            addCriterion("c200 >", value, "c200");
            return (Criteria) this;
        }

        public Criteria andC200GreaterThanOrEqualTo(Byte value) {
            addCriterion("c200 >=", value, "c200");
            return (Criteria) this;
        }

        public Criteria andC200LessThan(Byte value) {
            addCriterion("c200 <", value, "c200");
            return (Criteria) this;
        }

        public Criteria andC200LessThanOrEqualTo(Byte value) {
            addCriterion("c200 <=", value, "c200");
            return (Criteria) this;
        }

        public Criteria andC200In(List<Byte> values) {
            addCriterion("c200 in", values, "c200");
            return (Criteria) this;
        }

        public Criteria andC200NotIn(List<Byte> values) {
            addCriterion("c200 not in", values, "c200");
            return (Criteria) this;
        }

        public Criteria andC200Between(Byte value1, Byte value2) {
            addCriterion("c200 between", value1, value2, "c200");
            return (Criteria) this;
        }

        public Criteria andC200NotBetween(Byte value1, Byte value2) {
            addCriterion("c200 not between", value1, value2, "c200");
            return (Criteria) this;
        }

        public Criteria andC201IsNull() {
            addCriterion("c201 is null");
            return (Criteria) this;
        }

        public Criteria andC201IsNotNull() {
            addCriterion("c201 is not null");
            return (Criteria) this;
        }

        public Criteria andC201EqualTo(Integer value) {
            addCriterion("c201 =", value, "c201");
            return (Criteria) this;
        }

        public Criteria andC201NotEqualTo(Integer value) {
            addCriterion("c201 <>", value, "c201");
            return (Criteria) this;
        }

        public Criteria andC201GreaterThan(Integer value) {
            addCriterion("c201 >", value, "c201");
            return (Criteria) this;
        }

        public Criteria andC201GreaterThanOrEqualTo(Integer value) {
            addCriterion("c201 >=", value, "c201");
            return (Criteria) this;
        }

        public Criteria andC201LessThan(Integer value) {
            addCriterion("c201 <", value, "c201");
            return (Criteria) this;
        }

        public Criteria andC201LessThanOrEqualTo(Integer value) {
            addCriterion("c201 <=", value, "c201");
            return (Criteria) this;
        }

        public Criteria andC201In(List<Integer> values) {
            addCriterion("c201 in", values, "c201");
            return (Criteria) this;
        }

        public Criteria andC201NotIn(List<Integer> values) {
            addCriterion("c201 not in", values, "c201");
            return (Criteria) this;
        }

        public Criteria andC201Between(Integer value1, Integer value2) {
            addCriterion("c201 between", value1, value2, "c201");
            return (Criteria) this;
        }

        public Criteria andC201NotBetween(Integer value1, Integer value2) {
            addCriterion("c201 not between", value1, value2, "c201");
            return (Criteria) this;
        }

        public Criteria andC202IsNull() {
            addCriterion("c202 is null");
            return (Criteria) this;
        }

        public Criteria andC202IsNotNull() {
            addCriterion("c202 is not null");
            return (Criteria) this;
        }

        public Criteria andC202EqualTo(Byte value) {
            addCriterion("c202 =", value, "c202");
            return (Criteria) this;
        }

        public Criteria andC202NotEqualTo(Byte value) {
            addCriterion("c202 <>", value, "c202");
            return (Criteria) this;
        }

        public Criteria andC202GreaterThan(Byte value) {
            addCriterion("c202 >", value, "c202");
            return (Criteria) this;
        }

        public Criteria andC202GreaterThanOrEqualTo(Byte value) {
            addCriterion("c202 >=", value, "c202");
            return (Criteria) this;
        }

        public Criteria andC202LessThan(Byte value) {
            addCriterion("c202 <", value, "c202");
            return (Criteria) this;
        }

        public Criteria andC202LessThanOrEqualTo(Byte value) {
            addCriterion("c202 <=", value, "c202");
            return (Criteria) this;
        }

        public Criteria andC202In(List<Byte> values) {
            addCriterion("c202 in", values, "c202");
            return (Criteria) this;
        }

        public Criteria andC202NotIn(List<Byte> values) {
            addCriterion("c202 not in", values, "c202");
            return (Criteria) this;
        }

        public Criteria andC202Between(Byte value1, Byte value2) {
            addCriterion("c202 between", value1, value2, "c202");
            return (Criteria) this;
        }

        public Criteria andC202NotBetween(Byte value1, Byte value2) {
            addCriterion("c202 not between", value1, value2, "c202");
            return (Criteria) this;
        }

        public Criteria andC203IsNull() {
            addCriterion("c203 is null");
            return (Criteria) this;
        }

        public Criteria andC203IsNotNull() {
            addCriterion("c203 is not null");
            return (Criteria) this;
        }

        public Criteria andC203EqualTo(Byte value) {
            addCriterion("c203 =", value, "c203");
            return (Criteria) this;
        }

        public Criteria andC203NotEqualTo(Byte value) {
            addCriterion("c203 <>", value, "c203");
            return (Criteria) this;
        }

        public Criteria andC203GreaterThan(Byte value) {
            addCriterion("c203 >", value, "c203");
            return (Criteria) this;
        }

        public Criteria andC203GreaterThanOrEqualTo(Byte value) {
            addCriterion("c203 >=", value, "c203");
            return (Criteria) this;
        }

        public Criteria andC203LessThan(Byte value) {
            addCriterion("c203 <", value, "c203");
            return (Criteria) this;
        }

        public Criteria andC203LessThanOrEqualTo(Byte value) {
            addCriterion("c203 <=", value, "c203");
            return (Criteria) this;
        }

        public Criteria andC203In(List<Byte> values) {
            addCriterion("c203 in", values, "c203");
            return (Criteria) this;
        }

        public Criteria andC203NotIn(List<Byte> values) {
            addCriterion("c203 not in", values, "c203");
            return (Criteria) this;
        }

        public Criteria andC203Between(Byte value1, Byte value2) {
            addCriterion("c203 between", value1, value2, "c203");
            return (Criteria) this;
        }

        public Criteria andC203NotBetween(Byte value1, Byte value2) {
            addCriterion("c203 not between", value1, value2, "c203");
            return (Criteria) this;
        }

        public Criteria andC204IsNull() {
            addCriterion("c204 is null");
            return (Criteria) this;
        }

        public Criteria andC204IsNotNull() {
            addCriterion("c204 is not null");
            return (Criteria) this;
        }

        public Criteria andC204EqualTo(BigDecimal value) {
            addCriterion("c204 =", value, "c204");
            return (Criteria) this;
        }

        public Criteria andC204NotEqualTo(BigDecimal value) {
            addCriterion("c204 <>", value, "c204");
            return (Criteria) this;
        }

        public Criteria andC204GreaterThan(BigDecimal value) {
            addCriterion("c204 >", value, "c204");
            return (Criteria) this;
        }

        public Criteria andC204GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c204 >=", value, "c204");
            return (Criteria) this;
        }

        public Criteria andC204LessThan(BigDecimal value) {
            addCriterion("c204 <", value, "c204");
            return (Criteria) this;
        }

        public Criteria andC204LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c204 <=", value, "c204");
            return (Criteria) this;
        }

        public Criteria andC204In(List<BigDecimal> values) {
            addCriterion("c204 in", values, "c204");
            return (Criteria) this;
        }

        public Criteria andC204NotIn(List<BigDecimal> values) {
            addCriterion("c204 not in", values, "c204");
            return (Criteria) this;
        }

        public Criteria andC204Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c204 between", value1, value2, "c204");
            return (Criteria) this;
        }

        public Criteria andC204NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c204 not between", value1, value2, "c204");
            return (Criteria) this;
        }

        public Criteria andC205IsNull() {
            addCriterion("c205 is null");
            return (Criteria) this;
        }

        public Criteria andC205IsNotNull() {
            addCriterion("c205 is not null");
            return (Criteria) this;
        }

        public Criteria andC205EqualTo(BigDecimal value) {
            addCriterion("c205 =", value, "c205");
            return (Criteria) this;
        }

        public Criteria andC205NotEqualTo(BigDecimal value) {
            addCriterion("c205 <>", value, "c205");
            return (Criteria) this;
        }

        public Criteria andC205GreaterThan(BigDecimal value) {
            addCriterion("c205 >", value, "c205");
            return (Criteria) this;
        }

        public Criteria andC205GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c205 >=", value, "c205");
            return (Criteria) this;
        }

        public Criteria andC205LessThan(BigDecimal value) {
            addCriterion("c205 <", value, "c205");
            return (Criteria) this;
        }

        public Criteria andC205LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c205 <=", value, "c205");
            return (Criteria) this;
        }

        public Criteria andC205In(List<BigDecimal> values) {
            addCriterion("c205 in", values, "c205");
            return (Criteria) this;
        }

        public Criteria andC205NotIn(List<BigDecimal> values) {
            addCriterion("c205 not in", values, "c205");
            return (Criteria) this;
        }

        public Criteria andC205Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c205 between", value1, value2, "c205");
            return (Criteria) this;
        }

        public Criteria andC205NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c205 not between", value1, value2, "c205");
            return (Criteria) this;
        }

        public Criteria andC206IsNull() {
            addCriterion("c206 is null");
            return (Criteria) this;
        }

        public Criteria andC206IsNotNull() {
            addCriterion("c206 is not null");
            return (Criteria) this;
        }

        public Criteria andC206EqualTo(BigDecimal value) {
            addCriterion("c206 =", value, "c206");
            return (Criteria) this;
        }

        public Criteria andC206NotEqualTo(BigDecimal value) {
            addCriterion("c206 <>", value, "c206");
            return (Criteria) this;
        }

        public Criteria andC206GreaterThan(BigDecimal value) {
            addCriterion("c206 >", value, "c206");
            return (Criteria) this;
        }

        public Criteria andC206GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c206 >=", value, "c206");
            return (Criteria) this;
        }

        public Criteria andC206LessThan(BigDecimal value) {
            addCriterion("c206 <", value, "c206");
            return (Criteria) this;
        }

        public Criteria andC206LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c206 <=", value, "c206");
            return (Criteria) this;
        }

        public Criteria andC206In(List<BigDecimal> values) {
            addCriterion("c206 in", values, "c206");
            return (Criteria) this;
        }

        public Criteria andC206NotIn(List<BigDecimal> values) {
            addCriterion("c206 not in", values, "c206");
            return (Criteria) this;
        }

        public Criteria andC206Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c206 between", value1, value2, "c206");
            return (Criteria) this;
        }

        public Criteria andC206NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c206 not between", value1, value2, "c206");
            return (Criteria) this;
        }

        public Criteria andC207IsNull() {
            addCriterion("c207 is null");
            return (Criteria) this;
        }

        public Criteria andC207IsNotNull() {
            addCriterion("c207 is not null");
            return (Criteria) this;
        }

        public Criteria andC207EqualTo(BigDecimal value) {
            addCriterion("c207 =", value, "c207");
            return (Criteria) this;
        }

        public Criteria andC207NotEqualTo(BigDecimal value) {
            addCriterion("c207 <>", value, "c207");
            return (Criteria) this;
        }

        public Criteria andC207GreaterThan(BigDecimal value) {
            addCriterion("c207 >", value, "c207");
            return (Criteria) this;
        }

        public Criteria andC207GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c207 >=", value, "c207");
            return (Criteria) this;
        }

        public Criteria andC207LessThan(BigDecimal value) {
            addCriterion("c207 <", value, "c207");
            return (Criteria) this;
        }

        public Criteria andC207LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c207 <=", value, "c207");
            return (Criteria) this;
        }

        public Criteria andC207In(List<BigDecimal> values) {
            addCriterion("c207 in", values, "c207");
            return (Criteria) this;
        }

        public Criteria andC207NotIn(List<BigDecimal> values) {
            addCriterion("c207 not in", values, "c207");
            return (Criteria) this;
        }

        public Criteria andC207Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c207 between", value1, value2, "c207");
            return (Criteria) this;
        }

        public Criteria andC207NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c207 not between", value1, value2, "c207");
            return (Criteria) this;
        }

        public Criteria andC208IsNull() {
            addCriterion("c208 is null");
            return (Criteria) this;
        }

        public Criteria andC208IsNotNull() {
            addCriterion("c208 is not null");
            return (Criteria) this;
        }

        public Criteria andC208EqualTo(BigDecimal value) {
            addCriterion("c208 =", value, "c208");
            return (Criteria) this;
        }

        public Criteria andC208NotEqualTo(BigDecimal value) {
            addCriterion("c208 <>", value, "c208");
            return (Criteria) this;
        }

        public Criteria andC208GreaterThan(BigDecimal value) {
            addCriterion("c208 >", value, "c208");
            return (Criteria) this;
        }

        public Criteria andC208GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c208 >=", value, "c208");
            return (Criteria) this;
        }

        public Criteria andC208LessThan(BigDecimal value) {
            addCriterion("c208 <", value, "c208");
            return (Criteria) this;
        }

        public Criteria andC208LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c208 <=", value, "c208");
            return (Criteria) this;
        }

        public Criteria andC208In(List<BigDecimal> values) {
            addCriterion("c208 in", values, "c208");
            return (Criteria) this;
        }

        public Criteria andC208NotIn(List<BigDecimal> values) {
            addCriterion("c208 not in", values, "c208");
            return (Criteria) this;
        }

        public Criteria andC208Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c208 between", value1, value2, "c208");
            return (Criteria) this;
        }

        public Criteria andC208NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c208 not between", value1, value2, "c208");
            return (Criteria) this;
        }

        public Criteria andC209IsNull() {
            addCriterion("c209 is null");
            return (Criteria) this;
        }

        public Criteria andC209IsNotNull() {
            addCriterion("c209 is not null");
            return (Criteria) this;
        }

        public Criteria andC209EqualTo(BigDecimal value) {
            addCriterion("c209 =", value, "c209");
            return (Criteria) this;
        }

        public Criteria andC209NotEqualTo(BigDecimal value) {
            addCriterion("c209 <>", value, "c209");
            return (Criteria) this;
        }

        public Criteria andC209GreaterThan(BigDecimal value) {
            addCriterion("c209 >", value, "c209");
            return (Criteria) this;
        }

        public Criteria andC209GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c209 >=", value, "c209");
            return (Criteria) this;
        }

        public Criteria andC209LessThan(BigDecimal value) {
            addCriterion("c209 <", value, "c209");
            return (Criteria) this;
        }

        public Criteria andC209LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c209 <=", value, "c209");
            return (Criteria) this;
        }

        public Criteria andC209In(List<BigDecimal> values) {
            addCriterion("c209 in", values, "c209");
            return (Criteria) this;
        }

        public Criteria andC209NotIn(List<BigDecimal> values) {
            addCriterion("c209 not in", values, "c209");
            return (Criteria) this;
        }

        public Criteria andC209Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c209 between", value1, value2, "c209");
            return (Criteria) this;
        }

        public Criteria andC209NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c209 not between", value1, value2, "c209");
            return (Criteria) this;
        }

        public Criteria andC210IsNull() {
            addCriterion("c210 is null");
            return (Criteria) this;
        }

        public Criteria andC210IsNotNull() {
            addCriterion("c210 is not null");
            return (Criteria) this;
        }

        public Criteria andC210EqualTo(BigDecimal value) {
            addCriterion("c210 =", value, "c210");
            return (Criteria) this;
        }

        public Criteria andC210NotEqualTo(BigDecimal value) {
            addCriterion("c210 <>", value, "c210");
            return (Criteria) this;
        }

        public Criteria andC210GreaterThan(BigDecimal value) {
            addCriterion("c210 >", value, "c210");
            return (Criteria) this;
        }

        public Criteria andC210GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c210 >=", value, "c210");
            return (Criteria) this;
        }

        public Criteria andC210LessThan(BigDecimal value) {
            addCriterion("c210 <", value, "c210");
            return (Criteria) this;
        }

        public Criteria andC210LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c210 <=", value, "c210");
            return (Criteria) this;
        }

        public Criteria andC210In(List<BigDecimal> values) {
            addCriterion("c210 in", values, "c210");
            return (Criteria) this;
        }

        public Criteria andC210NotIn(List<BigDecimal> values) {
            addCriterion("c210 not in", values, "c210");
            return (Criteria) this;
        }

        public Criteria andC210Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c210 between", value1, value2, "c210");
            return (Criteria) this;
        }

        public Criteria andC210NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c210 not between", value1, value2, "c210");
            return (Criteria) this;
        }

        public Criteria andC211IsNull() {
            addCriterion("c211 is null");
            return (Criteria) this;
        }

        public Criteria andC211IsNotNull() {
            addCriterion("c211 is not null");
            return (Criteria) this;
        }

        public Criteria andC211EqualTo(BigDecimal value) {
            addCriterion("c211 =", value, "c211");
            return (Criteria) this;
        }

        public Criteria andC211NotEqualTo(BigDecimal value) {
            addCriterion("c211 <>", value, "c211");
            return (Criteria) this;
        }

        public Criteria andC211GreaterThan(BigDecimal value) {
            addCriterion("c211 >", value, "c211");
            return (Criteria) this;
        }

        public Criteria andC211GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c211 >=", value, "c211");
            return (Criteria) this;
        }

        public Criteria andC211LessThan(BigDecimal value) {
            addCriterion("c211 <", value, "c211");
            return (Criteria) this;
        }

        public Criteria andC211LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c211 <=", value, "c211");
            return (Criteria) this;
        }

        public Criteria andC211In(List<BigDecimal> values) {
            addCriterion("c211 in", values, "c211");
            return (Criteria) this;
        }

        public Criteria andC211NotIn(List<BigDecimal> values) {
            addCriterion("c211 not in", values, "c211");
            return (Criteria) this;
        }

        public Criteria andC211Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c211 between", value1, value2, "c211");
            return (Criteria) this;
        }

        public Criteria andC211NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c211 not between", value1, value2, "c211");
            return (Criteria) this;
        }

        public Criteria andC212IsNull() {
            addCriterion("c212 is null");
            return (Criteria) this;
        }

        public Criteria andC212IsNotNull() {
            addCriterion("c212 is not null");
            return (Criteria) this;
        }

        public Criteria andC212EqualTo(BigDecimal value) {
            addCriterion("c212 =", value, "c212");
            return (Criteria) this;
        }

        public Criteria andC212NotEqualTo(BigDecimal value) {
            addCriterion("c212 <>", value, "c212");
            return (Criteria) this;
        }

        public Criteria andC212GreaterThan(BigDecimal value) {
            addCriterion("c212 >", value, "c212");
            return (Criteria) this;
        }

        public Criteria andC212GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c212 >=", value, "c212");
            return (Criteria) this;
        }

        public Criteria andC212LessThan(BigDecimal value) {
            addCriterion("c212 <", value, "c212");
            return (Criteria) this;
        }

        public Criteria andC212LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c212 <=", value, "c212");
            return (Criteria) this;
        }

        public Criteria andC212In(List<BigDecimal> values) {
            addCriterion("c212 in", values, "c212");
            return (Criteria) this;
        }

        public Criteria andC212NotIn(List<BigDecimal> values) {
            addCriterion("c212 not in", values, "c212");
            return (Criteria) this;
        }

        public Criteria andC212Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c212 between", value1, value2, "c212");
            return (Criteria) this;
        }

        public Criteria andC212NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c212 not between", value1, value2, "c212");
            return (Criteria) this;
        }

        public Criteria andC213IsNull() {
            addCriterion("c213 is null");
            return (Criteria) this;
        }

        public Criteria andC213IsNotNull() {
            addCriterion("c213 is not null");
            return (Criteria) this;
        }

        public Criteria andC213EqualTo(BigDecimal value) {
            addCriterion("c213 =", value, "c213");
            return (Criteria) this;
        }

        public Criteria andC213NotEqualTo(BigDecimal value) {
            addCriterion("c213 <>", value, "c213");
            return (Criteria) this;
        }

        public Criteria andC213GreaterThan(BigDecimal value) {
            addCriterion("c213 >", value, "c213");
            return (Criteria) this;
        }

        public Criteria andC213GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c213 >=", value, "c213");
            return (Criteria) this;
        }

        public Criteria andC213LessThan(BigDecimal value) {
            addCriterion("c213 <", value, "c213");
            return (Criteria) this;
        }

        public Criteria andC213LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c213 <=", value, "c213");
            return (Criteria) this;
        }

        public Criteria andC213In(List<BigDecimal> values) {
            addCriterion("c213 in", values, "c213");
            return (Criteria) this;
        }

        public Criteria andC213NotIn(List<BigDecimal> values) {
            addCriterion("c213 not in", values, "c213");
            return (Criteria) this;
        }

        public Criteria andC213Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c213 between", value1, value2, "c213");
            return (Criteria) this;
        }

        public Criteria andC213NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c213 not between", value1, value2, "c213");
            return (Criteria) this;
        }

        public Criteria andC214IsNull() {
            addCriterion("c214 is null");
            return (Criteria) this;
        }

        public Criteria andC214IsNotNull() {
            addCriterion("c214 is not null");
            return (Criteria) this;
        }

        public Criteria andC214EqualTo(BigDecimal value) {
            addCriterion("c214 =", value, "c214");
            return (Criteria) this;
        }

        public Criteria andC214NotEqualTo(BigDecimal value) {
            addCriterion("c214 <>", value, "c214");
            return (Criteria) this;
        }

        public Criteria andC214GreaterThan(BigDecimal value) {
            addCriterion("c214 >", value, "c214");
            return (Criteria) this;
        }

        public Criteria andC214GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c214 >=", value, "c214");
            return (Criteria) this;
        }

        public Criteria andC214LessThan(BigDecimal value) {
            addCriterion("c214 <", value, "c214");
            return (Criteria) this;
        }

        public Criteria andC214LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c214 <=", value, "c214");
            return (Criteria) this;
        }

        public Criteria andC214In(List<BigDecimal> values) {
            addCriterion("c214 in", values, "c214");
            return (Criteria) this;
        }

        public Criteria andC214NotIn(List<BigDecimal> values) {
            addCriterion("c214 not in", values, "c214");
            return (Criteria) this;
        }

        public Criteria andC214Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c214 between", value1, value2, "c214");
            return (Criteria) this;
        }

        public Criteria andC214NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c214 not between", value1, value2, "c214");
            return (Criteria) this;
        }

        public Criteria andC215IsNull() {
            addCriterion("c215 is null");
            return (Criteria) this;
        }

        public Criteria andC215IsNotNull() {
            addCriterion("c215 is not null");
            return (Criteria) this;
        }

        public Criteria andC215EqualTo(BigDecimal value) {
            addCriterion("c215 =", value, "c215");
            return (Criteria) this;
        }

        public Criteria andC215NotEqualTo(BigDecimal value) {
            addCriterion("c215 <>", value, "c215");
            return (Criteria) this;
        }

        public Criteria andC215GreaterThan(BigDecimal value) {
            addCriterion("c215 >", value, "c215");
            return (Criteria) this;
        }

        public Criteria andC215GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c215 >=", value, "c215");
            return (Criteria) this;
        }

        public Criteria andC215LessThan(BigDecimal value) {
            addCriterion("c215 <", value, "c215");
            return (Criteria) this;
        }

        public Criteria andC215LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c215 <=", value, "c215");
            return (Criteria) this;
        }

        public Criteria andC215In(List<BigDecimal> values) {
            addCriterion("c215 in", values, "c215");
            return (Criteria) this;
        }

        public Criteria andC215NotIn(List<BigDecimal> values) {
            addCriterion("c215 not in", values, "c215");
            return (Criteria) this;
        }

        public Criteria andC215Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c215 between", value1, value2, "c215");
            return (Criteria) this;
        }

        public Criteria andC215NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c215 not between", value1, value2, "c215");
            return (Criteria) this;
        }

        public Criteria andC216IsNull() {
            addCriterion("c216 is null");
            return (Criteria) this;
        }

        public Criteria andC216IsNotNull() {
            addCriterion("c216 is not null");
            return (Criteria) this;
        }

        public Criteria andC216EqualTo(BigDecimal value) {
            addCriterion("c216 =", value, "c216");
            return (Criteria) this;
        }

        public Criteria andC216NotEqualTo(BigDecimal value) {
            addCriterion("c216 <>", value, "c216");
            return (Criteria) this;
        }

        public Criteria andC216GreaterThan(BigDecimal value) {
            addCriterion("c216 >", value, "c216");
            return (Criteria) this;
        }

        public Criteria andC216GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c216 >=", value, "c216");
            return (Criteria) this;
        }

        public Criteria andC216LessThan(BigDecimal value) {
            addCriterion("c216 <", value, "c216");
            return (Criteria) this;
        }

        public Criteria andC216LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c216 <=", value, "c216");
            return (Criteria) this;
        }

        public Criteria andC216In(List<BigDecimal> values) {
            addCriterion("c216 in", values, "c216");
            return (Criteria) this;
        }

        public Criteria andC216NotIn(List<BigDecimal> values) {
            addCriterion("c216 not in", values, "c216");
            return (Criteria) this;
        }

        public Criteria andC216Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c216 between", value1, value2, "c216");
            return (Criteria) this;
        }

        public Criteria andC216NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c216 not between", value1, value2, "c216");
            return (Criteria) this;
        }

        public Criteria andC217IsNull() {
            addCriterion("c217 is null");
            return (Criteria) this;
        }

        public Criteria andC217IsNotNull() {
            addCriterion("c217 is not null");
            return (Criteria) this;
        }

        public Criteria andC217EqualTo(BigDecimal value) {
            addCriterion("c217 =", value, "c217");
            return (Criteria) this;
        }

        public Criteria andC217NotEqualTo(BigDecimal value) {
            addCriterion("c217 <>", value, "c217");
            return (Criteria) this;
        }

        public Criteria andC217GreaterThan(BigDecimal value) {
            addCriterion("c217 >", value, "c217");
            return (Criteria) this;
        }

        public Criteria andC217GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c217 >=", value, "c217");
            return (Criteria) this;
        }

        public Criteria andC217LessThan(BigDecimal value) {
            addCriterion("c217 <", value, "c217");
            return (Criteria) this;
        }

        public Criteria andC217LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c217 <=", value, "c217");
            return (Criteria) this;
        }

        public Criteria andC217In(List<BigDecimal> values) {
            addCriterion("c217 in", values, "c217");
            return (Criteria) this;
        }

        public Criteria andC217NotIn(List<BigDecimal> values) {
            addCriterion("c217 not in", values, "c217");
            return (Criteria) this;
        }

        public Criteria andC217Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c217 between", value1, value2, "c217");
            return (Criteria) this;
        }

        public Criteria andC217NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c217 not between", value1, value2, "c217");
            return (Criteria) this;
        }

        public Criteria andC218IsNull() {
            addCriterion("c218 is null");
            return (Criteria) this;
        }

        public Criteria andC218IsNotNull() {
            addCriterion("c218 is not null");
            return (Criteria) this;
        }

        public Criteria andC218EqualTo(BigDecimal value) {
            addCriterion("c218 =", value, "c218");
            return (Criteria) this;
        }

        public Criteria andC218NotEqualTo(BigDecimal value) {
            addCriterion("c218 <>", value, "c218");
            return (Criteria) this;
        }

        public Criteria andC218GreaterThan(BigDecimal value) {
            addCriterion("c218 >", value, "c218");
            return (Criteria) this;
        }

        public Criteria andC218GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c218 >=", value, "c218");
            return (Criteria) this;
        }

        public Criteria andC218LessThan(BigDecimal value) {
            addCriterion("c218 <", value, "c218");
            return (Criteria) this;
        }

        public Criteria andC218LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c218 <=", value, "c218");
            return (Criteria) this;
        }

        public Criteria andC218In(List<BigDecimal> values) {
            addCriterion("c218 in", values, "c218");
            return (Criteria) this;
        }

        public Criteria andC218NotIn(List<BigDecimal> values) {
            addCriterion("c218 not in", values, "c218");
            return (Criteria) this;
        }

        public Criteria andC218Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c218 between", value1, value2, "c218");
            return (Criteria) this;
        }

        public Criteria andC218NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c218 not between", value1, value2, "c218");
            return (Criteria) this;
        }

        public Criteria andC219IsNull() {
            addCriterion("c219 is null");
            return (Criteria) this;
        }

        public Criteria andC219IsNotNull() {
            addCriterion("c219 is not null");
            return (Criteria) this;
        }

        public Criteria andC219EqualTo(BigDecimal value) {
            addCriterion("c219 =", value, "c219");
            return (Criteria) this;
        }

        public Criteria andC219NotEqualTo(BigDecimal value) {
            addCriterion("c219 <>", value, "c219");
            return (Criteria) this;
        }

        public Criteria andC219GreaterThan(BigDecimal value) {
            addCriterion("c219 >", value, "c219");
            return (Criteria) this;
        }

        public Criteria andC219GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c219 >=", value, "c219");
            return (Criteria) this;
        }

        public Criteria andC219LessThan(BigDecimal value) {
            addCriterion("c219 <", value, "c219");
            return (Criteria) this;
        }

        public Criteria andC219LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c219 <=", value, "c219");
            return (Criteria) this;
        }

        public Criteria andC219In(List<BigDecimal> values) {
            addCriterion("c219 in", values, "c219");
            return (Criteria) this;
        }

        public Criteria andC219NotIn(List<BigDecimal> values) {
            addCriterion("c219 not in", values, "c219");
            return (Criteria) this;
        }

        public Criteria andC219Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c219 between", value1, value2, "c219");
            return (Criteria) this;
        }

        public Criteria andC219NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c219 not between", value1, value2, "c219");
            return (Criteria) this;
        }

        public Criteria andC220IsNull() {
            addCriterion("c220 is null");
            return (Criteria) this;
        }

        public Criteria andC220IsNotNull() {
            addCriterion("c220 is not null");
            return (Criteria) this;
        }

        public Criteria andC220EqualTo(BigDecimal value) {
            addCriterion("c220 =", value, "c220");
            return (Criteria) this;
        }

        public Criteria andC220NotEqualTo(BigDecimal value) {
            addCriterion("c220 <>", value, "c220");
            return (Criteria) this;
        }

        public Criteria andC220GreaterThan(BigDecimal value) {
            addCriterion("c220 >", value, "c220");
            return (Criteria) this;
        }

        public Criteria andC220GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c220 >=", value, "c220");
            return (Criteria) this;
        }

        public Criteria andC220LessThan(BigDecimal value) {
            addCriterion("c220 <", value, "c220");
            return (Criteria) this;
        }

        public Criteria andC220LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c220 <=", value, "c220");
            return (Criteria) this;
        }

        public Criteria andC220In(List<BigDecimal> values) {
            addCriterion("c220 in", values, "c220");
            return (Criteria) this;
        }

        public Criteria andC220NotIn(List<BigDecimal> values) {
            addCriterion("c220 not in", values, "c220");
            return (Criteria) this;
        }

        public Criteria andC220Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c220 between", value1, value2, "c220");
            return (Criteria) this;
        }

        public Criteria andC220NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c220 not between", value1, value2, "c220");
            return (Criteria) this;
        }

        public Criteria andC221IsNull() {
            addCriterion("c221 is null");
            return (Criteria) this;
        }

        public Criteria andC221IsNotNull() {
            addCriterion("c221 is not null");
            return (Criteria) this;
        }

        public Criteria andC221EqualTo(BigDecimal value) {
            addCriterion("c221 =", value, "c221");
            return (Criteria) this;
        }

        public Criteria andC221NotEqualTo(BigDecimal value) {
            addCriterion("c221 <>", value, "c221");
            return (Criteria) this;
        }

        public Criteria andC221GreaterThan(BigDecimal value) {
            addCriterion("c221 >", value, "c221");
            return (Criteria) this;
        }

        public Criteria andC221GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c221 >=", value, "c221");
            return (Criteria) this;
        }

        public Criteria andC221LessThan(BigDecimal value) {
            addCriterion("c221 <", value, "c221");
            return (Criteria) this;
        }

        public Criteria andC221LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c221 <=", value, "c221");
            return (Criteria) this;
        }

        public Criteria andC221In(List<BigDecimal> values) {
            addCriterion("c221 in", values, "c221");
            return (Criteria) this;
        }

        public Criteria andC221NotIn(List<BigDecimal> values) {
            addCriterion("c221 not in", values, "c221");
            return (Criteria) this;
        }

        public Criteria andC221Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c221 between", value1, value2, "c221");
            return (Criteria) this;
        }

        public Criteria andC221NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c221 not between", value1, value2, "c221");
            return (Criteria) this;
        }

        public Criteria andC222IsNull() {
            addCriterion("c222 is null");
            return (Criteria) this;
        }

        public Criteria andC222IsNotNull() {
            addCriterion("c222 is not null");
            return (Criteria) this;
        }

        public Criteria andC222EqualTo(BigDecimal value) {
            addCriterion("c222 =", value, "c222");
            return (Criteria) this;
        }

        public Criteria andC222NotEqualTo(BigDecimal value) {
            addCriterion("c222 <>", value, "c222");
            return (Criteria) this;
        }

        public Criteria andC222GreaterThan(BigDecimal value) {
            addCriterion("c222 >", value, "c222");
            return (Criteria) this;
        }

        public Criteria andC222GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c222 >=", value, "c222");
            return (Criteria) this;
        }

        public Criteria andC222LessThan(BigDecimal value) {
            addCriterion("c222 <", value, "c222");
            return (Criteria) this;
        }

        public Criteria andC222LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c222 <=", value, "c222");
            return (Criteria) this;
        }

        public Criteria andC222In(List<BigDecimal> values) {
            addCriterion("c222 in", values, "c222");
            return (Criteria) this;
        }

        public Criteria andC222NotIn(List<BigDecimal> values) {
            addCriterion("c222 not in", values, "c222");
            return (Criteria) this;
        }

        public Criteria andC222Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c222 between", value1, value2, "c222");
            return (Criteria) this;
        }

        public Criteria andC222NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c222 not between", value1, value2, "c222");
            return (Criteria) this;
        }

        public Criteria andC223IsNull() {
            addCriterion("c223 is null");
            return (Criteria) this;
        }

        public Criteria andC223IsNotNull() {
            addCriterion("c223 is not null");
            return (Criteria) this;
        }

        public Criteria andC223EqualTo(BigDecimal value) {
            addCriterion("c223 =", value, "c223");
            return (Criteria) this;
        }

        public Criteria andC223NotEqualTo(BigDecimal value) {
            addCriterion("c223 <>", value, "c223");
            return (Criteria) this;
        }

        public Criteria andC223GreaterThan(BigDecimal value) {
            addCriterion("c223 >", value, "c223");
            return (Criteria) this;
        }

        public Criteria andC223GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c223 >=", value, "c223");
            return (Criteria) this;
        }

        public Criteria andC223LessThan(BigDecimal value) {
            addCriterion("c223 <", value, "c223");
            return (Criteria) this;
        }

        public Criteria andC223LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c223 <=", value, "c223");
            return (Criteria) this;
        }

        public Criteria andC223In(List<BigDecimal> values) {
            addCriterion("c223 in", values, "c223");
            return (Criteria) this;
        }

        public Criteria andC223NotIn(List<BigDecimal> values) {
            addCriterion("c223 not in", values, "c223");
            return (Criteria) this;
        }

        public Criteria andC223Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c223 between", value1, value2, "c223");
            return (Criteria) this;
        }

        public Criteria andC223NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c223 not between", value1, value2, "c223");
            return (Criteria) this;
        }

        public Criteria andC224IsNull() {
            addCriterion("c224 is null");
            return (Criteria) this;
        }

        public Criteria andC224IsNotNull() {
            addCriterion("c224 is not null");
            return (Criteria) this;
        }

        public Criteria andC224EqualTo(BigDecimal value) {
            addCriterion("c224 =", value, "c224");
            return (Criteria) this;
        }

        public Criteria andC224NotEqualTo(BigDecimal value) {
            addCriterion("c224 <>", value, "c224");
            return (Criteria) this;
        }

        public Criteria andC224GreaterThan(BigDecimal value) {
            addCriterion("c224 >", value, "c224");
            return (Criteria) this;
        }

        public Criteria andC224GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c224 >=", value, "c224");
            return (Criteria) this;
        }

        public Criteria andC224LessThan(BigDecimal value) {
            addCriterion("c224 <", value, "c224");
            return (Criteria) this;
        }

        public Criteria andC224LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c224 <=", value, "c224");
            return (Criteria) this;
        }

        public Criteria andC224In(List<BigDecimal> values) {
            addCriterion("c224 in", values, "c224");
            return (Criteria) this;
        }

        public Criteria andC224NotIn(List<BigDecimal> values) {
            addCriterion("c224 not in", values, "c224");
            return (Criteria) this;
        }

        public Criteria andC224Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c224 between", value1, value2, "c224");
            return (Criteria) this;
        }

        public Criteria andC224NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c224 not between", value1, value2, "c224");
            return (Criteria) this;
        }

        public Criteria andC225IsNull() {
            addCriterion("c225 is null");
            return (Criteria) this;
        }

        public Criteria andC225IsNotNull() {
            addCriterion("c225 is not null");
            return (Criteria) this;
        }

        public Criteria andC225EqualTo(BigDecimal value) {
            addCriterion("c225 =", value, "c225");
            return (Criteria) this;
        }

        public Criteria andC225NotEqualTo(BigDecimal value) {
            addCriterion("c225 <>", value, "c225");
            return (Criteria) this;
        }

        public Criteria andC225GreaterThan(BigDecimal value) {
            addCriterion("c225 >", value, "c225");
            return (Criteria) this;
        }

        public Criteria andC225GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c225 >=", value, "c225");
            return (Criteria) this;
        }

        public Criteria andC225LessThan(BigDecimal value) {
            addCriterion("c225 <", value, "c225");
            return (Criteria) this;
        }

        public Criteria andC225LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c225 <=", value, "c225");
            return (Criteria) this;
        }

        public Criteria andC225In(List<BigDecimal> values) {
            addCriterion("c225 in", values, "c225");
            return (Criteria) this;
        }

        public Criteria andC225NotIn(List<BigDecimal> values) {
            addCriterion("c225 not in", values, "c225");
            return (Criteria) this;
        }

        public Criteria andC225Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c225 between", value1, value2, "c225");
            return (Criteria) this;
        }

        public Criteria andC225NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c225 not between", value1, value2, "c225");
            return (Criteria) this;
        }

        public Criteria andC226IsNull() {
            addCriterion("c226 is null");
            return (Criteria) this;
        }

        public Criteria andC226IsNotNull() {
            addCriterion("c226 is not null");
            return (Criteria) this;
        }

        public Criteria andC226EqualTo(BigDecimal value) {
            addCriterion("c226 =", value, "c226");
            return (Criteria) this;
        }

        public Criteria andC226NotEqualTo(BigDecimal value) {
            addCriterion("c226 <>", value, "c226");
            return (Criteria) this;
        }

        public Criteria andC226GreaterThan(BigDecimal value) {
            addCriterion("c226 >", value, "c226");
            return (Criteria) this;
        }

        public Criteria andC226GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c226 >=", value, "c226");
            return (Criteria) this;
        }

        public Criteria andC226LessThan(BigDecimal value) {
            addCriterion("c226 <", value, "c226");
            return (Criteria) this;
        }

        public Criteria andC226LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c226 <=", value, "c226");
            return (Criteria) this;
        }

        public Criteria andC226In(List<BigDecimal> values) {
            addCriterion("c226 in", values, "c226");
            return (Criteria) this;
        }

        public Criteria andC226NotIn(List<BigDecimal> values) {
            addCriterion("c226 not in", values, "c226");
            return (Criteria) this;
        }

        public Criteria andC226Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c226 between", value1, value2, "c226");
            return (Criteria) this;
        }

        public Criteria andC226NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c226 not between", value1, value2, "c226");
            return (Criteria) this;
        }

        public Criteria andC227IsNull() {
            addCriterion("c227 is null");
            return (Criteria) this;
        }

        public Criteria andC227IsNotNull() {
            addCriterion("c227 is not null");
            return (Criteria) this;
        }

        public Criteria andC227EqualTo(BigDecimal value) {
            addCriterion("c227 =", value, "c227");
            return (Criteria) this;
        }

        public Criteria andC227NotEqualTo(BigDecimal value) {
            addCriterion("c227 <>", value, "c227");
            return (Criteria) this;
        }

        public Criteria andC227GreaterThan(BigDecimal value) {
            addCriterion("c227 >", value, "c227");
            return (Criteria) this;
        }

        public Criteria andC227GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c227 >=", value, "c227");
            return (Criteria) this;
        }

        public Criteria andC227LessThan(BigDecimal value) {
            addCriterion("c227 <", value, "c227");
            return (Criteria) this;
        }

        public Criteria andC227LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c227 <=", value, "c227");
            return (Criteria) this;
        }

        public Criteria andC227In(List<BigDecimal> values) {
            addCriterion("c227 in", values, "c227");
            return (Criteria) this;
        }

        public Criteria andC227NotIn(List<BigDecimal> values) {
            addCriterion("c227 not in", values, "c227");
            return (Criteria) this;
        }

        public Criteria andC227Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c227 between", value1, value2, "c227");
            return (Criteria) this;
        }

        public Criteria andC227NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c227 not between", value1, value2, "c227");
            return (Criteria) this;
        }

        public Criteria andC228IsNull() {
            addCriterion("c228 is null");
            return (Criteria) this;
        }

        public Criteria andC228IsNotNull() {
            addCriterion("c228 is not null");
            return (Criteria) this;
        }

        public Criteria andC228EqualTo(BigDecimal value) {
            addCriterion("c228 =", value, "c228");
            return (Criteria) this;
        }

        public Criteria andC228NotEqualTo(BigDecimal value) {
            addCriterion("c228 <>", value, "c228");
            return (Criteria) this;
        }

        public Criteria andC228GreaterThan(BigDecimal value) {
            addCriterion("c228 >", value, "c228");
            return (Criteria) this;
        }

        public Criteria andC228GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c228 >=", value, "c228");
            return (Criteria) this;
        }

        public Criteria andC228LessThan(BigDecimal value) {
            addCriterion("c228 <", value, "c228");
            return (Criteria) this;
        }

        public Criteria andC228LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c228 <=", value, "c228");
            return (Criteria) this;
        }

        public Criteria andC228In(List<BigDecimal> values) {
            addCriterion("c228 in", values, "c228");
            return (Criteria) this;
        }

        public Criteria andC228NotIn(List<BigDecimal> values) {
            addCriterion("c228 not in", values, "c228");
            return (Criteria) this;
        }

        public Criteria andC228Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c228 between", value1, value2, "c228");
            return (Criteria) this;
        }

        public Criteria andC228NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c228 not between", value1, value2, "c228");
            return (Criteria) this;
        }

        public Criteria andC229IsNull() {
            addCriterion("c229 is null");
            return (Criteria) this;
        }

        public Criteria andC229IsNotNull() {
            addCriterion("c229 is not null");
            return (Criteria) this;
        }

        public Criteria andC229EqualTo(BigDecimal value) {
            addCriterion("c229 =", value, "c229");
            return (Criteria) this;
        }

        public Criteria andC229NotEqualTo(BigDecimal value) {
            addCriterion("c229 <>", value, "c229");
            return (Criteria) this;
        }

        public Criteria andC229GreaterThan(BigDecimal value) {
            addCriterion("c229 >", value, "c229");
            return (Criteria) this;
        }

        public Criteria andC229GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c229 >=", value, "c229");
            return (Criteria) this;
        }

        public Criteria andC229LessThan(BigDecimal value) {
            addCriterion("c229 <", value, "c229");
            return (Criteria) this;
        }

        public Criteria andC229LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c229 <=", value, "c229");
            return (Criteria) this;
        }

        public Criteria andC229In(List<BigDecimal> values) {
            addCriterion("c229 in", values, "c229");
            return (Criteria) this;
        }

        public Criteria andC229NotIn(List<BigDecimal> values) {
            addCriterion("c229 not in", values, "c229");
            return (Criteria) this;
        }

        public Criteria andC229Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c229 between", value1, value2, "c229");
            return (Criteria) this;
        }

        public Criteria andC229NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c229 not between", value1, value2, "c229");
            return (Criteria) this;
        }

        public Criteria andC230IsNull() {
            addCriterion("c230 is null");
            return (Criteria) this;
        }

        public Criteria andC230IsNotNull() {
            addCriterion("c230 is not null");
            return (Criteria) this;
        }

        public Criteria andC230EqualTo(BigDecimal value) {
            addCriterion("c230 =", value, "c230");
            return (Criteria) this;
        }

        public Criteria andC230NotEqualTo(BigDecimal value) {
            addCriterion("c230 <>", value, "c230");
            return (Criteria) this;
        }

        public Criteria andC230GreaterThan(BigDecimal value) {
            addCriterion("c230 >", value, "c230");
            return (Criteria) this;
        }

        public Criteria andC230GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c230 >=", value, "c230");
            return (Criteria) this;
        }

        public Criteria andC230LessThan(BigDecimal value) {
            addCriterion("c230 <", value, "c230");
            return (Criteria) this;
        }

        public Criteria andC230LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c230 <=", value, "c230");
            return (Criteria) this;
        }

        public Criteria andC230In(List<BigDecimal> values) {
            addCriterion("c230 in", values, "c230");
            return (Criteria) this;
        }

        public Criteria andC230NotIn(List<BigDecimal> values) {
            addCriterion("c230 not in", values, "c230");
            return (Criteria) this;
        }

        public Criteria andC230Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c230 between", value1, value2, "c230");
            return (Criteria) this;
        }

        public Criteria andC230NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c230 not between", value1, value2, "c230");
            return (Criteria) this;
        }

        public Criteria andC231IsNull() {
            addCriterion("c231 is null");
            return (Criteria) this;
        }

        public Criteria andC231IsNotNull() {
            addCriterion("c231 is not null");
            return (Criteria) this;
        }

        public Criteria andC231EqualTo(BigDecimal value) {
            addCriterion("c231 =", value, "c231");
            return (Criteria) this;
        }

        public Criteria andC231NotEqualTo(BigDecimal value) {
            addCriterion("c231 <>", value, "c231");
            return (Criteria) this;
        }

        public Criteria andC231GreaterThan(BigDecimal value) {
            addCriterion("c231 >", value, "c231");
            return (Criteria) this;
        }

        public Criteria andC231GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c231 >=", value, "c231");
            return (Criteria) this;
        }

        public Criteria andC231LessThan(BigDecimal value) {
            addCriterion("c231 <", value, "c231");
            return (Criteria) this;
        }

        public Criteria andC231LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c231 <=", value, "c231");
            return (Criteria) this;
        }

        public Criteria andC231In(List<BigDecimal> values) {
            addCriterion("c231 in", values, "c231");
            return (Criteria) this;
        }

        public Criteria andC231NotIn(List<BigDecimal> values) {
            addCriterion("c231 not in", values, "c231");
            return (Criteria) this;
        }

        public Criteria andC231Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c231 between", value1, value2, "c231");
            return (Criteria) this;
        }

        public Criteria andC231NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c231 not between", value1, value2, "c231");
            return (Criteria) this;
        }

        public Criteria andC232IsNull() {
            addCriterion("c232 is null");
            return (Criteria) this;
        }

        public Criteria andC232IsNotNull() {
            addCriterion("c232 is not null");
            return (Criteria) this;
        }

        public Criteria andC232EqualTo(BigDecimal value) {
            addCriterion("c232 =", value, "c232");
            return (Criteria) this;
        }

        public Criteria andC232NotEqualTo(BigDecimal value) {
            addCriterion("c232 <>", value, "c232");
            return (Criteria) this;
        }

        public Criteria andC232GreaterThan(BigDecimal value) {
            addCriterion("c232 >", value, "c232");
            return (Criteria) this;
        }

        public Criteria andC232GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c232 >=", value, "c232");
            return (Criteria) this;
        }

        public Criteria andC232LessThan(BigDecimal value) {
            addCriterion("c232 <", value, "c232");
            return (Criteria) this;
        }

        public Criteria andC232LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c232 <=", value, "c232");
            return (Criteria) this;
        }

        public Criteria andC232In(List<BigDecimal> values) {
            addCriterion("c232 in", values, "c232");
            return (Criteria) this;
        }

        public Criteria andC232NotIn(List<BigDecimal> values) {
            addCriterion("c232 not in", values, "c232");
            return (Criteria) this;
        }

        public Criteria andC232Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c232 between", value1, value2, "c232");
            return (Criteria) this;
        }

        public Criteria andC232NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c232 not between", value1, value2, "c232");
            return (Criteria) this;
        }

        public Criteria andC233IsNull() {
            addCriterion("c233 is null");
            return (Criteria) this;
        }

        public Criteria andC233IsNotNull() {
            addCriterion("c233 is not null");
            return (Criteria) this;
        }

        public Criteria andC233EqualTo(BigDecimal value) {
            addCriterion("c233 =", value, "c233");
            return (Criteria) this;
        }

        public Criteria andC233NotEqualTo(BigDecimal value) {
            addCriterion("c233 <>", value, "c233");
            return (Criteria) this;
        }

        public Criteria andC233GreaterThan(BigDecimal value) {
            addCriterion("c233 >", value, "c233");
            return (Criteria) this;
        }

        public Criteria andC233GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("c233 >=", value, "c233");
            return (Criteria) this;
        }

        public Criteria andC233LessThan(BigDecimal value) {
            addCriterion("c233 <", value, "c233");
            return (Criteria) this;
        }

        public Criteria andC233LessThanOrEqualTo(BigDecimal value) {
            addCriterion("c233 <=", value, "c233");
            return (Criteria) this;
        }

        public Criteria andC233In(List<BigDecimal> values) {
            addCriterion("c233 in", values, "c233");
            return (Criteria) this;
        }

        public Criteria andC233NotIn(List<BigDecimal> values) {
            addCriterion("c233 not in", values, "c233");
            return (Criteria) this;
        }

        public Criteria andC233Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("c233 between", value1, value2, "c233");
            return (Criteria) this;
        }

        public Criteria andC233NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("c233 not between", value1, value2, "c233");
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