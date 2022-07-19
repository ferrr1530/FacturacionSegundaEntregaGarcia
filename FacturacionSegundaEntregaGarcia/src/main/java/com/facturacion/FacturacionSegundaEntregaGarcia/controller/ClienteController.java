package com.facturacion.FacturacionSegundaEntregaGarcia.controller;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Cliente;
import com.facturacion.FacturacionSegundaEntregaGarcia.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> findAll() {
        return this.clienteService.findAll();}

}
