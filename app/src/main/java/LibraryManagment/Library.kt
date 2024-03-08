package LibraryManagment

import android.util.Log

class Library (private val name: String){

   private val books : MutableList<Book> = mutableListOf()
   private val members: MutableList<Member> = mutableListOf()
   private val borowedBook = HashMap<Book,Member>()
    fun addBook(book:Book){
        this.books.add(book)
    }

    fun removeBook(book: Book){
        if (isBookAvailable(book)){
            this.books.remove(book)
        }
        Log.d("remove","there is no ${book.getName()} as a book in the library")
    }

    fun addMember(member: Member){
        this.members.add(member)
    }

    fun isMember(member: Member):Boolean{
        if (members.contains(member)){
            return true
        }
        return false
    }

    fun isBookAvailable(book: Book):Boolean{
        if (books.contains(book)){
            return true
        }
        return false
    }
    fun removeMember(member: Member){
        if (isMember(member)){
            this.members.remove(member)
        }
    }

    fun canBorowBook(book: Book,member: Member):Boolean{
        if(isMember(member)){
            if (book.checkAvailablitiy()){
                return true
            }
        }
        return false
    }
    fun borowCompletion(book: Book,member: Member){
        this.borowedBook.put(book,member)
    }

    fun getBorowedBooks():HashMap<Book,Member>{
        return this.borowedBook
    }
}