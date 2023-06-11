package com.example.todolist

import android.app.Application

class TodoApplication: Application() {
    private val database by lazy{ TaskItemDataBase.getDatabase(this)}
    val repository by lazy { TaskItemRepository(database.taskItemDao())}
}