package com.example.smartmarketss.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class Users(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val FullName: String,
    val email: String,
    val password: String,
    val role: String
)
