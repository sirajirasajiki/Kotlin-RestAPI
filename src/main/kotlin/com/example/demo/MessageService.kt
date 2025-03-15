package com.example.demo


import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class MessageService(private val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findAll().toList()

    fun findMessageById(id: String): Message? = db.findByIdOrNull(id)

    fun findMessageByText(text: String): List<Message> = db.findByText(text)

    fun save(message: Message): Message = db.save(message)
}