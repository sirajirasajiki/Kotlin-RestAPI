package com.example.demo

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String>{
    fun findByText(text: String): List<Message>
}
