package com.facturacion.FacturacionSegundaEntregaGarcia.service;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Cliente;
import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Comprobante;
import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ClienteRepository;
import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ComprobanteRepository;
import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class ComprobanteServiceImpl implements ComprobanteService {

    @Autowired
    private ComprobanteRepository comprobanteRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Cliente buscarPorIdComprobante(int id_comprobante) {
        Cliente comprobante = clienteRepository.findById(id_comprobante).orElse(null);
        return comprobante;
    }

    @Override
    public List<Comprobante> buscarTodosLosComprobantes() {
        return comprobanteRepository.findAll();
    }

    @Override
    public Comprobante crear(Comprobante comprobante) {
        return this.comprobanteRepository.save(comprobante);
    }
}

