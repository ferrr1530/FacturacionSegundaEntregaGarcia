package com.facturacion.FacturacionSegundaEntregaGarcia.service;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Cliente;
import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Producto;
import com.facturacion.FacturacionSegundaEntregaGarcia.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements ProductoService{

        @Autowired
        private ProductoRepository productoRepository;

        @Override
        public Producto buscarPorIdProducto(int id_producto) {
            Producto producto = productoRepository.findById(id_producto).orElse(null);
            return producto;
        }

        @Override
        public List<Producto> buscarTodosLosProductos() {
            return this.productoRepository.findAll();
        }

        @Override
        public Producto crear(Producto producto) {
            return this.productoRepository.save(producto);
        }
}

