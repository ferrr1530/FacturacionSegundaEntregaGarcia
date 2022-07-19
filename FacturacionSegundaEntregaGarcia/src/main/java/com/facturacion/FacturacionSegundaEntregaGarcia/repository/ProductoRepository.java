package com.facturacion.FacturacionSegundaEntregaGarcia.repository;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
}
