package LibraryManagment

class Member(private val id: Int, private val name: String) {

    val borowedBooks: MutableList<Book> = mutableListOf()
    fun borowBook(book:Book){
        borowedBooks.add(book)
    }

    fun returnBook(book:Book){
        borowedBooks.remove(book)
    }
}