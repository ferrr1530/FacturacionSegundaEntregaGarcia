CREATE DATABASE ventas;

CREATE TABLE ventas.cliente(
    nrocliente int NOT NULL AUTO_INCREMENT,
    dni int NOT NULL,
    nombre varchar(255) NOT NULL,
    apellido varchar(255),
    domicilio varchar(300),
    telefono int
    PRIMARY KEY (nrocliente)
);

CREATE TABLE ventas.producto (
	id_producto int NOT NULL AUTO_INCREMENT,
    descripcion varchar(255) NOT NULL,
    cantidad int,
    precio FLOAT(7, 2),
    PRIMARY KEY (productoid)
);

CREATE TABLE ventas.comprobante (
    id_comprobante int NOT NULL,
    fecha datetime,
    cantidad int,
    total FLOAT(7, 2),
    nrocliente int,
    PRIMARY KEY (id_comprobante),
    CONSTRAINT FK_cliente FOREIGN KEY (nrocliente)
    REFERENCES cliente(nrocliente)
);

CREATE TABLE ventas.factura (
    id_factura int NOT NULL AUTO_INCREMENT,
    descripcion varchar(255) NOT NULL,
    cantidad int,
    precio FLOAT(9, 2),
    id_comprobante int NOT NULL,
    id_producto int NOT NULL,
    PRIMARY KEY (id_factura),
    CONSTRAINT FK_comprobante FOREIGN KEY (id_comprobante)
    REFERENCES comprobante(id_comprobante),
    CONSTRAINT FK_producto FOREIGN KEY (id_producto)
    REFERENCES producto(id_producto)
);


