package com.facturacion.FacturacionSegundaEntregaGarcia.controller;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Cliente;
import com.facturacion.FacturacionSegundaEntregaGarcia.service.ClienteService;
import com.facturacion.FacturacionSegundaEntregaGarcia.service.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{nrocliente}")
    public Cliente buscarPorNrodeCliente(@PathVariable Integer nrocliente) {
        return clienteService.buscarPorNrodeCliente(nrocliente);
    }

    @PostMapping("/crear")
    public Cliente crear(@RequestBody Cliente cliente) throws Exception {
        return clienteService.crear(cliente);

    }

}
