package com.github.app.data.source.local.user

import com.github.app.data.source.local.LocalDataSource

interface UserLocalDataSource : LocalDataSource {
    fun writeUserName(username: String)
    fun getUserName(): String
}