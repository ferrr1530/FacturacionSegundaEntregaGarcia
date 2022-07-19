package com.facturacion.FacturacionSegundaEntregaGarcia.service;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Cliente;
import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Comprobante;

import java.util.List;

public interface ComprobanteService {
    Cliente buscarPorIdComprobante (int id_comprobante);
    List<Comprobante> buscarTodosLosComprobantes();
    Comprobante crear(Comprobante comprobante);
}
