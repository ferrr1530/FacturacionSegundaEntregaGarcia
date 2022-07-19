package com.facturacion.FacturacionSegundaEntregaGarcia.service;

import com.facturacion.FacturacionSegundaEntregaGarcia.entidad.Producto;

import java.util.List;

public interface ProductoService {
    Producto buscarPorIdProducto(int id_producto);
    List<Producto> buscarTodosLosProductos();
    Producto crear(Producto producto) throws Exception;
}