package com.springquerydsl.boiler.domain

import javax.persistence.Entity
import javax.persistence.Id

/**
 * @author Yonghui
 * @since 2019. 12. 30
 */
@Entity
data class User(
        @Id
        val id: Long,
        val password: String,
        val name: String,
        val email: String
)