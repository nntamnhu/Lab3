package nguyenngoctamnhu.Lab3.services;

import jakarta.validation.constraints.NotNull;
import nguyenngoctamnhu.Lab3.entity.Book;
import nguyenngoctamnhu.Lab3.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    public void addBook(Book book) {
        bookRepository.save(book);
    }

    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    public void updateBook(Book book) { bookRepository.save(book); }


    /*public void updateBook(@NotNull Book book) {
        Book existingBook = bookRepository.findById(book.getId())
                .orElse(null);
        Objects.requireNonNull(existingBook).setTitle(book.getTitle());
        existingBook.setAuthor(book.getAuthor());
        existingBook.setPrice(book.getPrice());
        existingBook.setCategory(book.getCategory());
        bookRepository.save(existingBook);
    }*/

}
