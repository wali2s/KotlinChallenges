package com.example.challengeskotlin

import LibraryManagment.Book
import LibraryManagment.Library
import LibraryManagment.Member
import org.junit.Test

class LibraryManagment {

    val book = Book(1,"free room")
    val library = Library("StadtsBibliothek")
    val member = Member(12,"Wahid",library)
    @Test
    fun testAvailbility(){
        assert(true == book.checkAvailablitiy())
        book.changeAvailablitiy()
        assert(false == book.checkAvailablitiy())
        book.changeAvailablitiy()
        assert(true == book.checkAvailablitiy())
    }

    @Test
    fun testAddBook(){
        assert(!library.isBookAvailable(book))
        library.addBook(book)
        assert(library.isBookAvailable(book))
    }

    @Test
    fun testMembership(){
        assert(library.isMember(member))
    }

    @Test
    fun testCanBorowBook(){
      assert( library.canBorowBook(book,member))
      member.borowBook(book)
      assert(!library.canBorowBook(book,member))
    }

    @Test
    fun testBorowedBook(){
        member.borowBook(book)
        assert(library.getBorowedBooks().containsKey(book))
    }
}