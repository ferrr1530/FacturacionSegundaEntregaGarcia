package com.facturacion.FacturacionSegundaEntregaGarcia.service;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Cliente;

import java.util.List;

public interface ClienteService {
    Cliente buscarPorNrodeCliente (int NrodeCliente);
    List<Cliente> buscarTodosLosClientes();
    Cliente crear(Cliente cliente) throws Exception;
}
