package nguyenngoctamnhu.Lab3.repository;

import nguyenngoctamnhu.Lab3.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
