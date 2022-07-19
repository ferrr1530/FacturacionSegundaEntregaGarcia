package com.facturacion.FacturacionSegundaEntregaGarcia.service;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Cliente;
import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente buscarPorNrodeCliente(int NrodeCliente) {
        Cliente cliente = clienteRepository.findById(NrodeCliente).orElse(null);
        return cliente;
    }

    @Override
    public List<Cliente> buscarTodosLosClientes() {
        return clienteRepository.findAll();
    }

    public Cliente crear(Cliente cliente) throws Exception {
        if (buscarPorNrodeCliente(cliente.getNrocliente()) == null) {
            return cliente;
        } else {
            throw new Exception("Cliente ya existe");
        }
    }



}




