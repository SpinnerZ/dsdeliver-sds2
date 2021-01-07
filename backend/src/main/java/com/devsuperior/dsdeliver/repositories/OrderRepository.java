package com.devsuperior.dsdeliver.repositories;

import com.devsuperior.dsdeliver.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {

    // Cria uma consulta no Spring JPA
    // Não usa a linguagem SQL, usa uma específica do JPA, chamda JPQL
    @Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products " +
            "WHERE obj.status = 0 ORDER BY obj.moment ASC")
    List<Order> findOrdersWithProducts();
}
