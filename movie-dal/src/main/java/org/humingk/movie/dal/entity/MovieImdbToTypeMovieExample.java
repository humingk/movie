package org.humingk.movie.dal.entity;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Repository;

/** @author humingk */
@Repository
@Data
@AllArgsConstructor
public class MovieImdbToTypeMovieExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MovieImdbToTypeMovieExample() {
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

    public Criteria start() {
        clear();
        return createCriteriaInternal();
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

        public Criteria andIdMovieImdbIsNull() {
            addCriterion("id_movie_imdb is null");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbIsNotNull() {
            addCriterion("id_movie_imdb is not null");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbEqualTo(Long value) {
            addCriterion("id_movie_imdb =", value, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbNotEqualTo(Long value) {
            addCriterion("id_movie_imdb <>", value, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbGreaterThan(Long value) {
            addCriterion("id_movie_imdb >", value, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbGreaterThanOrEqualTo(Long value) {
            addCriterion("id_movie_imdb >=", value, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbLessThan(Long value) {
            addCriterion("id_movie_imdb <", value, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbLessThanOrEqualTo(Long value) {
            addCriterion("id_movie_imdb <=", value, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbIn(List<Long> values) {
            addCriterion("id_movie_imdb in", values, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbNotIn(List<Long> values) {
            addCriterion("id_movie_imdb not in", values, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbBetween(Long value1, Long value2) {
            addCriterion("id_movie_imdb between", value1, value2, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdMovieImdbNotBetween(Long value1, Long value2) {
            addCriterion("id_movie_imdb not between", value1, value2, "idMovieImdb");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieIsNull() {
            addCriterion("id_type_movie is null");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieIsNotNull() {
            addCriterion("id_type_movie is not null");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieEqualTo(Short value) {
            addCriterion("id_type_movie =", value, "idTypeMovie");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieNotEqualTo(Short value) {
            addCriterion("id_type_movie <>", value, "idTypeMovie");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieGreaterThan(Short value) {
            addCriterion("id_type_movie >", value, "idTypeMovie");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieGreaterThanOrEqualTo(Short value) {
            addCriterion("id_type_movie >=", value, "idTypeMovie");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieLessThan(Short value) {
            addCriterion("id_type_movie <", value, "idTypeMovie");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieLessThanOrEqualTo(Short value) {
            addCriterion("id_type_movie <=", value, "idTypeMovie");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieIn(List<Short> values) {
            addCriterion("id_type_movie in", values, "idTypeMovie");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieNotIn(List<Short> values) {
            addCriterion("id_type_movie not in", values, "idTypeMovie");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieBetween(Short value1, Short value2) {
            addCriterion("id_type_movie between", value1, value2, "idTypeMovie");
            return (Criteria) this;
        }

        public Criteria andIdTypeMovieNotBetween(Short value1, Short value2) {
            addCriterion("id_type_movie not between", value1, value2, "idTypeMovie");
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