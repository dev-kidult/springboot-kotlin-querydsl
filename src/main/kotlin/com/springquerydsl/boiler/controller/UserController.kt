package com.springquerydsl.boiler.controller

import com.springquerydsl.boiler.domain.QUser
import com.springquerydsl.boiler.domain.User
import com.springquerydsl.boiler.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

/**
 * @author Yonghui
 * @since 2019. 12. 30
 */
@RestController
class UserController(val userRepository: UserRepository) {
    @GetMapping("/users/{email}")
    fun getUserByEmail(@PathVariable email: String): User? {
        return userRepository.findByEmail(email)
    }

    @GetMapping("/users2/{email}")
    fun getUserByEmailWithQuerydsl(@PathVariable email: String): User? {
        return userRepository.findOne(QUser.user.email.eq(email)).orElseGet(null)
    }
}