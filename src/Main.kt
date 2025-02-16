import java.awt.print.Book

fun main() {

    var myBook = Book(title ="moonstone",  author= "Richerd", genre="fiction",  yearPublished =2020)
    myBook.getBookInfo()
//    myBook.title = "moonstone"
//    myBook.author = "Richerd"
//    myBook.yearPublished = 2020
//    println(myBook.title + " " + myBook.author + " " + myBook.yearPublished)
}

class Book(var title: String, var author: String, var genre: String, var yearPublished: Int) {
//    var title: String = ""
//    var author: String = ""
//    var yearPublished: Int = 0

    fun getBookInfo() {
        println(" title: $title, author: $author, genre: $genre, yearPublished: $yearPublished")
    }
}
