package com.deliverytech.delivery_api.repository;
import com.deliverytech.delivery_api.model.Produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
  List<Produto> findByRestaurantId(Long restauranteId);
  List<Produto> findByCategoria(String categoria);
  List<Produto> findByAvalible();
}
