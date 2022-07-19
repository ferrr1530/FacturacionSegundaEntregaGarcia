package com.facturacion.FacturacionSegundaEntregaGarcia.controller;

import com.facturacion.FacturacionSegundaEntregaGarcia.service.ComprobanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/comprobante")
public class ComprobanteController {

    @Autowired
    private ComprobanteService comprobanteService;

}
