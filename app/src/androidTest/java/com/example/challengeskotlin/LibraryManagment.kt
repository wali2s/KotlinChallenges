package com.example.challengeskotlin

import LibraryManagment.Book
import org.junit.Test

class LibraryManagment {

    val book = Book(1,"free room")

    @Test
    fun testAvailbility(){
        assert(true == book.checkAvailablitiy())
        book.changeAvailablitiy()
        assert(false == book.checkAvailablitiy())
        book.changeAvailablitiy()
        assert(true == book.checkAvailablitiy())
    }
}