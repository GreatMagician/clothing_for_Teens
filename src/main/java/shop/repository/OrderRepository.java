package shop.repository;

import org.springframework.data.repository.CrudRepository;
import shop.model.Order;

/**
 * Created by Alexander on 08.07.2017.
 */
public interface OrderRepository extends CrudRepository<Order, Long> {
}
