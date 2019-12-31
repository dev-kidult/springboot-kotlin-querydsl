package com.springquerydsl.boiler

import com.springquerydsl.boiler.domain.QUser
import com.springquerydsl.boiler.repository.UserRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.junit.jupiter.SpringExtension

/**
 * @author Yonghui
 * @since 2019. 12. 30
 */

@ExtendWith(SpringExtension::class)
@DataJpaTest
class UserRepositoryTest {

    @Autowired
    lateinit var userRepository: UserRepository

    @Test
    fun findByEmailTest() {
        val user = userRepository.findByEmail("doole3488@gmail.com")
        println(user)
        assertEquals("yonghui", user?.name)
    }

    @Test
    fun findByEmailWithQuerydslTest() {
        val user = userRepository.findOne(QUser.user.email.eq("doole3488@gmail.com")).orElseGet(null)
        println(user)
        assertEquals("yonghui", user?.name)
    }
}