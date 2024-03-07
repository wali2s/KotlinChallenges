package LibraryManagment

class Book(private val bookId: Int, private val name:String) {

    private var isAvailable: Boolean = true
    fun getName():String{
        return this.name
    }

    fun changeAvailablitiy(){
        this.isAvailable = !isAvailable
    }

    fun checkAvailablitiy():Boolean{
        return isAvailable
    }

}