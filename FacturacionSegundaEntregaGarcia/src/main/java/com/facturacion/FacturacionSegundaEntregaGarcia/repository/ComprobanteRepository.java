package com.facturacion.FacturacionSegundaEntregaGarcia.repository;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComprobanteRepository extends JpaRepository<Comprobante, Integer> {
}
