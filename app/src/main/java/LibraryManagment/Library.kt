package LibraryManagment

class Library (private val name: String){

    val books : MutableList<Book> = mutableListOf()
    val members: MutableList<Member> = mutableListOf()


}