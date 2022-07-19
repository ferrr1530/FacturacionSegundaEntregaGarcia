package com.facturacion.FacturacionSegundaEntregaGarcia.repository;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
