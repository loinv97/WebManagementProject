package  com.loinv.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loinv.entity.OrderDetail;



public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long>{
}