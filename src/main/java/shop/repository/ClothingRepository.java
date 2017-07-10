package shop.repository;

import org.springframework.data.repository.CrudRepository;
import shop.model.Clothing;

/**
 * Created by Alexander on 08.07.2017.
 */
public interface ClothingRepository extends CrudRepository<Clothing, Long> {
}
