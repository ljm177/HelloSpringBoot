package kr.ac.hansung.cse.repo;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.ProductTable;


public interface ProductTableRepository extends CrudRepository<ProductTable,Long> {
	List<ProductTable> findByCategory(String category);
}
