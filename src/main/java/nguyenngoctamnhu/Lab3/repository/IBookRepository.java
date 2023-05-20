package nguyenngoctamnhu.Lab3.repository;

import nguyenngoctamnhu.Lab3.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
