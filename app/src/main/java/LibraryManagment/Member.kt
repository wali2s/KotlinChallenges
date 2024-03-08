package LibraryManagment

import android.util.Log

class Member(private val id: Int, private val name: String, private val library: Library) {

    private val borowedBooks: MutableList<Book> = mutableListOf()
    init {
        library.addMember(this)
    }
    fun borowBook(book:Book){
            if(library.canBorowBook(book,this)){
                borowedBooks.add(book)
                library.borowCompletion(book,this)
                book.changeAvailablitiy()

            }

        Log.d("borow","come later membership")
    }

    fun returnBook(book:Book){
        borowedBooks.remove(book)
    }
}