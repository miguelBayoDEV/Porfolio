DROP DATABASE exMIGUELÁNGELPUERTABAYO;
CREATE DATABASE exMIGUELÁNGELPUERTABAYO;

CREATE TABLE Clientes (
CodigoCliente INT PRIMARY KEY AUTO_INCREMENT,
NombreCliente VARCHAR(20),
NombreContacto VARCHAR(20),
ApellidoContacto VARCHAR(20),
Telefono INT,
Direccion VARCHAR(20),
Ciudad VARCHAR(20),
Region VARCHAR(20),
Pais VARCHAR(20),
CodigoPostal INT,
CodigoEmpleadoRepVentas INT,
LimiteCredito DOUBLE
);

CREATE TABLE Pagos (
CodigoCliente INT,
FormaPago VARCHAR(20),
IDTransaccion VARCHAR(20),
FechaPago DATE,
Cantidad INT,
PRIMARY KEY(CodigoCliente,IDTransaccion)
);

CREATE TABLE Empleados (
CodigoEmpleado INT PRIMARY KEY AUTO_INCREMENT,
Nombre VARCHAR(20),
Apellido1 VARCHAR(20),
Apellido2 VARCHAR(20),
Extension INT,
Email VARCHAR(30),
CodigoOficina VARCHAR(20),
CodigoJefe INT,
Puesto VARCHAR(20)
);

CREATE TABLE Oficinas (
CodigoOficina VARCHAR(20) PRIMARY KEY,
Ciudad VARCHAR(20),
Pais VARCHAR(20),
Region VARCHAR(20),
CodigoPostal INT,
Telefono INT,
Direccion VARCHAR(20)
);

CREATE TABLE Pedidos (
CodigoPedido VARCHAR(20) PRIMARY KEY,
FechaPedido DATE,
FechaEsperada DATE,
FechaEntrega DATE,
Estado VARCHAR(20),
CodigoCliente INT
);

CREATE TABLE Productos (
CodigoProducto VARCHAR(20) PRIMARY KEY,
Nombre VARCHAR(20),
Gama VARCHAR(20),
Dimensiones VARCHAR(20),
Proveedor VARCHAR(20),
Descripcion VARCHAR(30),
CantidadEnStock INT,
PrecioVenta DOUBLE,
PrecioProveedor DOUBLE
);

CREATE TABLE DetallePedidos (
CodigoPedido VARCHAR(20),
CodigoProducto VARCHAR(20),
Cantidad INT,
PrecioUnidad DOUBLE,
NumeroLinea VARCHAR(20),
PRIMARY KEY(CodigoPedido,CodigoProducto)
);

ALTER TABLE Pagos
ADD CONSTRAINT FKA_CodCLIENTE FOREIGN KEY (CodigoCliente) REFERENCES Clientes(CodigoCliente);

ALTER TABLE Pedidos
ADD CONSTRAINT FKB_CodCLIENTE FOREIGN KEY (CodigoCliente) REFERENCES Clientes(CodigoCliente);

ALTER TABLE DetallePedidos
ADD CONSTRAINT FK_CodPEDIDO FOREIGN KEY (CodigoPedido) REFERENCES Pedidos(CodigoPedido);


ALTER TABLE Clientes
ADD CONSTRAINT FK_CodCLIENTE FOREIGN KEY (CodigoEmpleadoRepVentas) REFERENCES Empleados(CodigoEmpleado);

ALTER TABLE Empleados
ADD CONSTRAINT FK_CodEMPLEADO FOREIGN KEY (CodigoOficina) REFERENCES Oficinas(CodigoOficina);

INSERT INTO Oficinas VALUES
('GR_ES',	'Granada',	'España',	'Andalucía',	18010,	958141414,	'C/Recogidas, 34'),
('CO_ES',	'Córdoba',	'España',	'Andalucía',	14960,	957151515,	'C/Gran vía, 56');

INSERT INTO Empleados VALUES
(150,	'Juan',	'Pérez',	'García',	345,	'jperez@empresa.es',	'GR_ES',	190,	'Rep.Ventas'),
(190,	'Marta',	'Trajano',	'Molina',	962,	'mtrajano@empresa.es',	'GR_ES',	180,	'Jefe'),
(350,	'Manuel',	'Molina',	'García',	862,	'mmolina@empresa.es',	'CO_ES',	200,	'Jefe'),
(380,	'Ana',	'Ronda',	'Cano',	412,	'aronda@empresa.es',	'CO_ES',	350,	'Rep.Ventas'),
(388,	'Antonio',	'Sanz',	'López',	863,	'asanz@empresa.es',	'GR_ES',	190,	'Administrativo');

INSERT INTO Clientes VALUES
(106,	'Empresa1',	'María',	'López',	958785623,	'C/ Calle1, 56',	'Granada',	'Andalucía',	'España',	18020,	150,	500),
(192,	'Empresa2',	'Justo',	'Abellán',	950969696,	'C/ Calle2, 87, 4ºG',	'Almería',	'Andalucía',	'España',	04150,	150,	600),
(197,	'Empresa3',	'Miguel',	'Rueda',	954121212,	'C/Calle3, 92',	'Sevilla',	'Andalucía',	'España',	41050,	380,	2000),
(230,	'Empresa4',	'Andrea',	'Pulido',	957414141,	'C/ Calle 4, 123',	'Córdoba',	'Andalucía',	'España',	14900,	380,	1500),
(279,	'Empresa5',	'Elisa',	'Reyes',	953363636,	'C/ Calle 5, 23, 8ºA',	'Jaén',	'Andalucía',	'España',	23010,	388,	800);

INSERT INTO Pagos VALUES
(106,	'Transferencia',	'T-34',	'2017-10-17',	877.50),
(279,	'Tarjeta',	'T-35',	'207-11-25',	1215),
(230,	'Tarjeta',	'T-36',	'2018-2-20',	796.75),
(192,	'Transferencia',	'T-37',	'2018-1-11',	828.75),
(197,	'Tarjeta',	'T-38',	'2017-12-14',	1816.5),
(106,	'Transferencia',	'T-39',	'2017-11-23',	636);

INSERT INTO Pedidos VALUES
('PED-123',	'2017-10-10',	'2017-10-15',	'2017-10-16',	'Entregado',		106),
('PED-150',	'2017-11-20',	'2017-11-21',	'2017-11-21',	'Entregado',	279),
('PED-216',	'2017-11-21',	'2017-11-23',	'2017-11-24',	'Entregado',	106),
('PED-630',	'2017-12-10',	'2017-12-11',	'2017-12-15',	'Entregado',		197),
('PED-685',	'2017-12-15',	'2017-12-20',	'2017-12-21',	'Entregado',		230),
('PED-720',	'2018-1-3',	'2018-1-10',	'2018-1-11',	'Entregado',		192),
('PED-735',	'2018-2-10',	'2018-2-15',	'2018-2-18',	'Entregado',		230),
('PED-820',	'2018-3-5',	'2018-3-8',	'2018-3-10',	'Pendiente Entrega',		230);

INSERT INTO DetallePedidos VALUES
('PED-123',	'OR-179',	10,	50.00,	'L1'),
('PED-123',	'OJ-842',	5,	75.50,	'L2'),
('PED-150',	'RT-849',	20,	60.75,	'L1'),
('PED-216',	'TW-140',	40,	15.90,	'L1'),
('PED-630',	'VR-097',	30,	60.55,	'L1'),
('PED-685',	'PJ-510',	5,	37.85,	'L1'),
('PED-720',	'GB-004',	15,	55.25,	'L1'),
('PED-735',	'RT-849',	10,	60.75,	'L1'),
('PED-820',	'TW-140',	20,	15.90,	'L1');

INSERT INTO Productos VALUES
('OR-179',	'Producto1',	'Gama1',	'20x59x15',	'Proveedor1',	'DescripciónP1',	50,	50,	40.50),
('OJ-842',	'Producto2',	'Gama2',	'200x60x30',	'Proveedor3',	'DescripciónP2',	25,	75.50,	70.25),
('RT-849',	'Producto3',	'Gama3',	'80x40x75',	'Proveedor4',	'DescripciónP3',	10,	60.75,	58.68),
('TW-140',	'Producto4',	'Gama1',	'10x15x20',	'Proveedor1',	'DescripciónP4',	100,	15.90,	12.40),
('VR-097',	'Producto5',	'Gama1',	'30x85x60',	'Proveedor1',	'DescripciónP5',	55,	60.55,	55.95),
('PJ-510',	'Producto6',	'Gama4',	'75x75x75',	'Proveedor2',	'DescripciónP6',	30,	37.85,	35.80),
('GB-004',	'Producto7',	'Gama2',	'100x150x75',	'Proveedor3',	'DescripciónP7',	26,	55.25,	52.35);

SELECT CodigoOficina,Ciudad FROM Oficinas;
SELECT COUNT(CodigoEmpleado) FROM Empleados;
SELECT COUNT(CodigoCliente),Pais FROM Clientes;
SELECT AVG(Cantidad) FROM Pagos;
SELECT CodigoCliente,NombreCliente FROM Clientes WHERE ApellidoContacto LIKE "M%";
SELECT COUNT(CodigoPedido),Estado FROM Pedidos ORDER BY COUNT(CodigoPedido) DESC;
SELECT MAX(PrecioVenta),MIN(PrecioVenta) FROM Productos;
SELECT NombreCliente FROM Clientes GROUP BY Clientes HAVING MAX(LimiteCredito);
SELECT Nombre,Apellido1,Puesto FROM Empleados WHERE CodigoEmpleadoRepVentas IS NULL;
SELECT Clientes.NombreCliente,Empleados.Nombre,Empleados.Apellido1 FROM Clientes,Empleados;