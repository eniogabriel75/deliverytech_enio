package com.deliverytech.delivery_api.repository;
import com.deliverytech.delivery_api.model.Pedido;
import com.deliverytech.delivery_api.enums.StatusPedidos;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByStatus(StatusPedidos status);
    List<Pedido> findByClientId(Long clienteId);

    @Query("""
        SELECT p FROM Pedido p
        WHERE p.dataPedido BETWEEN :inicio AND :fim
        """)
        
    List<Pedido> findByDateTime (
        @Param("inicio") LocalDateTime inicio,
        @Param("fim") LocalDateTime fim
    );
}
