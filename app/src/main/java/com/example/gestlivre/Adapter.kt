import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.bookie.Book
import com.example.gestlivre.R
import com.google.firebase.firestore.core.View

class BookViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun updateWithBook(book: Book) {
        itemView.book_name.text = book.name
    }
}

class BookAdapter : RecyclerView.Adapter<BookViewHolder>() {


    var mbooks = listOf<Book>()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): BookViewHolder {
        val context = viewGroup.context
        val itemView = LayoutInflater.from(context).inflate(R.layout.item_book, viewGroup, false)
        return BookViewHolder(itemView)
    }

    override fun onBindViewHolder(bookViewHolder: BookViewHolder, position: Int) {
        val book = mbooks[position]
        bookViewHolder.updateWithBooks(book)
    }

    override fun getItemCount(): Int = mbooks.size

}