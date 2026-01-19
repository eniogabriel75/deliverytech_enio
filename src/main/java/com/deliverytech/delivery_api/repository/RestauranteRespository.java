package com.deliverytech.delivery_api.repository;
import com.deliverytech.delivery_api.model.Restaurante;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestauranteRespository extends JpaRepository<Restaurante, Long> {
  List<Restaurante> findByAtivoTrue();
  List<Restaurante> findByCategory(String categoria);
  List<Restaurante> findByAtivoTrueOrderByRagingDesc();
}
