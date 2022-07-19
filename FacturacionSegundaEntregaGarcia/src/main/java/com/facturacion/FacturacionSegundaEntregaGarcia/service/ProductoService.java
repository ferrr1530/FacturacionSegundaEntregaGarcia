package com.facturacion.FacturacionSegundaEntregaGarcia.service;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Producto;
import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoService {

        @Autowired
        private ProductoRepository productoRepository;

        public List<Producto> findAll() {
            return this.productoRepository.findAll();
        }

        public Producto save(Producto cliente) {
            return this.productoRepository.save(cliente);
        }

}
