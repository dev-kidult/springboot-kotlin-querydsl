package com.springquerydsl.boiler.repository

import com.springquerydsl.boiler.domain.User
import org.springframework.data.querydsl.QuerydslPredicateExecutor
import org.springframework.data.repository.CrudRepository

/**
 * @author Yonghui
 * @since 2019. 12. 30
 */
interface UserRepository : CrudRepository<User, Long>, QuerydslPredicateExecutor<User> {
    fun findByEmail(email: String): User?
}