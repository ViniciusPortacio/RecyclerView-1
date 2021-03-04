package com.example.recyclerview.model

data class Email(

    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    val selected: Boolean = false
)

class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false
    var selected: Boolean = false

    fun build() : Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails():MutableList<Email> = mutableListOf(
    email{
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você "
        preview = "Olá Vinicius, voce precisa fumar crack "
        date = "26 jun"
        stared = false
    },
    email{
        user = "Gmail"
        subject = "Veja nossas três dicas principais para você "
        preview = "Olá Vinicius, voce precisa fumar crack "
        date = "26 jun"
        stared = false
    },
    email{
        user = "Carguero"
        subject = "Veja nossas três dicas principais para você "
        preview = "Olá Vinicius, voce precisa fumar crack "
        date = "26 jun"
        stared = false
    },
    email{
        user = "Vinicius"
        subject = "Veja nossas três dicas principais para você "
        preview = "Olá Vinicius, voce precisa fumar crack "
        date = "26 jun"
        stared = false
    },
    email{
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você "
        preview = "Olá Vinicius, voce precisa fumar crack "
        date = "26 jun"
        stared = false
    },
    email{
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você "
        preview = "Olá Vinicius, voce precisa fumar crack "
        date = "26 jun"
        stared = false
    },
    email{
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você "
        preview = "Olá Vinicius, voce precisa fumar crack "
        date = "26 jun"
        stared = false
    },
    email{
        user = "Facebook"
        subject = "Veja nossas três dicas principais para você "
        preview = "Olá Vinicius, voce precisa fumar crack "
        date = "26 jun"
        stared = false
    }
)