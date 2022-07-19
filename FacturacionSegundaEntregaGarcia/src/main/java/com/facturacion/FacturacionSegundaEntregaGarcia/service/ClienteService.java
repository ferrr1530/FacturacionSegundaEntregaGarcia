package com.facturacion.FacturacionSegundaEntregaGarcia.service;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Cliente;
import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll() {
        return this.clienteRepository.findAll();
    }

    public Cliente save(Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

}
