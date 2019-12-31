package com.springquerydsl.boiler.config

import com.querydsl.jpa.impl.JPAQueryFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

/**
 * @author Yonghui
 * @since 2019. 12. 30
 */
@Configuration
class QuerydslConfig(@PersistenceContext val entityManager: EntityManager) {
    @Bean
    fun jpaQueryFactory(): JPAQueryFactory {
        return JPAQueryFactory(entityManager)
    }
}