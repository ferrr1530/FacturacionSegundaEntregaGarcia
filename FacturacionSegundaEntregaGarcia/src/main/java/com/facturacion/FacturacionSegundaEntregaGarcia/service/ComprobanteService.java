package com.facturacion.FacturacionSegundaEntregaGarcia.service;

import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ClienteRepository;
import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ComprobanteRepository;
import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class ComprobanteService {

    @Autowired
    private ComprobanteRepository comprobanteRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private RestTemplate restTemplate;
}

