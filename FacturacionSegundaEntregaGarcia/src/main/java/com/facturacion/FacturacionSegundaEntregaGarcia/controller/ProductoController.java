package com.facturacion.FacturacionSegundaEntregaGarcia.controller;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Producto;
import com.facturacion.FacturacionSegundaEntregaGarcia.service.ProductoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoServiceImpl productoServiceImpl;

    @GetMapping
    public List<Producto> findAll() {
        return this.productoServiceImpl.buscarTodosLosProductos();
    }
}
