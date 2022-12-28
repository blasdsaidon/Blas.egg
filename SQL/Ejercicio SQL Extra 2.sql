#1
select codigo_oficina, ciudad from oficina;

#2
select ciudad, telefono, pais from oficina where pais = "España";

#3
select nombre, apellido1, apellido2, email from empleado where codigo_jefe = 7;

#4
select puesto, nombre, apellido1, apellido2, email from empleado where codigo_jefe is null;

#5
select puesto, nombre, apellido1, apellido2 from empleado where puesto != "Representante Ventas";

#6
select nombre_cliente, pais from cliente where pais = "Spain";

#7
select estado from pedido group by estado;

#8
select codigo_cliente from pago where year(fecha_pago) = 2008 group by codigo_cliente;
select codigo_cliente from pago where date_format(fecha_pago, "%Y") = 2008 group by codigo_cliente; 
select codigo_cliente from pago where fecha_pago > "2008-01-01" and fecha_pago <= "2008-12-31" group by codigo_cliente;

#9
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where fecha_entrega > fecha_esperada;

#10
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where datediff(fecha_esperada, fecha_entrega) > 2; 
select codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega from pedido where fecha_esperada > adddate(fecha_entrega, interval 2 day);

#11
select codigo_pedido, estado, fecha_pedido from pedido where estado = "rechazado" and year(fecha_pedido) = 2009;

#12
select codigo_pedido, estado, fecha_entrega from pedido where month(fecha_entrega) = 01 and estado = "entregado";

#13
select fecha_pago, forma_pago, total from pago where forma_pago = "paypal" and year(fecha_pago) = 2008 order by total desc;

#14
select forma_pago from pago group by forma_pago;

#15
select nombre, gama, cantidad_en_stock, precio_venta from producto where cantidad_en_stock > 100 and gama = "ornamentales" order by precio_venta desc;

#16
select nombre_cliente, ciudad, codigo_empleado_rep_ventas from cliente where codigo_empleado_rep_ventas in (11,30) and ciudad = "madrid";

#2.1
select c.nombre_cliente, e.nombre "Nombre representante",  e.apellido1, e.apellido2 from cliente c, empleado e;
select c.nombre_cliente, e.nombre "Nombre representante", e.apellido1, e.apellido2 from cliente c inner join empleado e on codigo_empleado_rep_ventas = codigo_empleado;

#2.2
select c.nombre_cliente, p.codigo_cliente, p.id_transaccion, e.nombre "Nombre representante"
from cliente c, empleado e, pago p
where c.codigo_cliente = p.codigo_cliente and c.codigo_empleado_rep_ventas = e.codigo_empleado;

#2.3
select c.nombre_cliente, p.codigo_cliente, p.id_transaccion, e.nombre "Nombre representante", e.apellido1, e.apellido2
from cliente c inner join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado left join pago p on c.codigo_cliente = p.codigo_cliente
where p.id_transaccion is null;

#2.4
select c.nombre_cliente, p.codigo_cliente, p.id_transaccion, e.nombre "Nombre representante", o.ciudad 
from cliente c inner join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado inner join pago p on c.codigo_cliente = p.codigo_cliente inner join oficina o on e.codigo_oficina = o.codigo_oficina;

#2.5
select c.nombre_cliente, p.codigo_cliente, p.id_transaccion, e.nombre "Nombre representante", o.ciudad 
from cliente c inner join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado left join pago p on c.codigo_cliente = p.codigo_cliente inner join oficina o on e.codigo_oficina = o.codigo_oficina
where p.id_transaccion is null;

#2.6
select o.linea_direccion1, o.linea_direccion2, e.nombre "Nombre Representante", e.apellido1, e.apellido2, c.nombre_cliente, c.ciudad
from cliente c inner join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado inner join oficina o on e.codigo_oficina = o.codigo_oficina
where c.ciudad like "fuenlabrada";

#2.7
select o.ciudad "Ciudad De La Oficina", e.nombre "Nombre Representante", e.apellido1, e.apellido2, c.nombre_cliente
from cliente c inner join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado inner join oficina o on e.codigo_oficina = o.codigo_oficina;

#2.8
select nombre, codigo_empleado, codigo_jefe from empleado;
select j.nombre "Nombre Empleado", e.nombre "Nombre Jefe" from empleado e right join empleado j on e.codigo_empleado = j.codigo_jefe;

#2.9
select c.nombre_cliente, p.fecha_entrega, datediff(fecha_entrega, fecha_esperada) "Dias De Retraso"
from cliente c left join pedido p on c.codigo_cliente = p.codigo_cliente where p.fecha_entrega > p.fecha_esperada;

#2.10
select c.nombre_cliente, t.nombre "Nombre Del Producto", g.gama "Gama Del Producto"
from cliente c right join pedido p on c.codigo_cliente = p.codigo_cliente right join detalle_pedido d on p.codigo_pedido = d.codigo_pedido right join producto t  on d.codigo_producto = t.codigo_producto right join gama_producto g on t.gama = g.gama
where c.nombre_cliente is not null;

#3.1
select c.nombre_cliente, p.id_transaccion
from cliente c left join pago p on c.codigo_cliente = p.codigo_cliente
where p.id_transaccion is null;

#3.2
select c.nombre_cliente, p.codigo_pedido
from cliente c left join pedido p on c.codigo_cliente = p.codigo_cliente
where p.codigo_pedido is null;

#3.3
select c.nombre_cliente, p.id_transaccion, g.codigo_pedido
from cliente c left join pago p on c.codigo_cliente = p.codigo_cliente left join pedido g on p.codigo_cliente = g.codigo_cliente
where p.id_transaccion is null and g.codigo_pedido is null;

#3.4
select e.nombre, o.codigo_oficina
from empleado e left join oficina o on e.codigo_oficina = o.codigo_oficina;

#3.5
select e.nombre "Nombre Del Representante", c.nombre_cliente 
from empleado e left join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas
where c.nombre_cliente is null;

#3.6
select e.nombre "Nombre Del Representante", c.nombre_cliente, o.codigo_oficina
from cliente c right join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado right join oficina o on e.codigo_oficina = o.codigo_oficina
where c.nombre_cliente is null;

#3.7
select p.nombre "Nombre Del Producto", c.codigo_pedido
from producto p left join detalle_pedido d on p.codigo_producto = d.codigo_producto left join pedido c on d.codigo_pedido = c.codigo_pedido
where c.codigo_pedido is null group by p.nombre, c.codigo_pedido;

#3.8
select o.codigo_oficina, e.nombre, e.apellido1, e.apellido2, g.gama
from gama_producto g left join producto p on g.gama = p.gama left join detalle_pedido d on p.codigo_producto = d.codigo_producto left join pedido t on d.codigo_pedido = t.codigo_pedido left join cliente c on t.codigo_cliente = c.codigo_cliente left join empleado e on c.codigo_empleado_rep_ventas = e.codigo_empleado left join oficina o on e.codigo_oficina = o.codigo_oficina
where g.gama != "frutales";

#3.9
select c.nombre_cliente, p.id_transaccion, p.fecha_pago, p.total "Total Abonado", g.codigo_pedido
from cliente c left join pago p on c.codigo_cliente = p.codigo_cliente right join pedido g on c.codigo_cliente = g.codigo_cliente
where p.id_transaccion is null;

#3.10
select j.nombre "Nombre Empleado", e.nombre "Nombre Jefe", c.nombre_cliente
from cliente c right join empleado j on c.codigo_empleado_rep_ventas = j.codigo_empleado right join empleado e on j.codigo_jefe = e.codigo_empleado
where c.nombre_cliente is null and j.nombre is not null;

#4.1
select count(nombre) "Cantidad De Empleados" from empleado;

#4.2
select count(nombre_cliente) "Cantidad De Clientes", pais from cliente group by pais; 

#4.3
select round(avg(total),2) "Pago Medio 2009" from pago where year(fecha_pago) = 2009;

#4.4
select estado, count(estado) "Cantidad"
from pedido group by estado order by 2 desc;

#4.5
select nombre, max(precio_venta), min(precio_venta) from producto group by nombre;   
select max(precio_venta) "Precio Maximo", min(precio_venta) "Precio Minimo" from producto;

#4.6
select count(nombre_cliente) from cliente;

#4.7
select count(nombre_cliente) "Cantidad De Clientes", ciudad from cliente where ciudad = "Madrid";

#4.8
select count(nombre_cliente) "Cantidad De Clientes", ciudad from cliente where ciudad like "M%" group by ciudad;

#4.9
select e.nombre "Nombre Del Representate", count(c.nombre_cliente) "Cantidad De Clientes"
from empleado e right join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas group by e.nombre;

#4.10
select count(c.nombre_cliente) "Cantidad De Clientes Que No Tienen Representante"
from empleado e right join cliente c on e.codigo_empleado = c.codigo_empleado_rep_ventas where c.codigo_empleado_rep_ventas is null;

#4.11
select c.nombre_contactclienteo, c.apellido_contacto, max(p.fecha_pago) "Ultimo Pago", min(p.fecha_pago) "Primer Pago"
from cliente c right join pago p on c.codigo_cliente = p.codigo_cliente group by c.nombre_contacto, c.apellido_contacto;

#4.12
select codigo_pedido "Numero De Pedido", count(codigo_producto) "Cantidad De Productos Diferentes"
from detalle_pedido group by codigo_pedido order by codigo_pedido;

#4.13
select codigo_pedido "Numero De Pedido", sum(cantidad) "Cantidad De Productos Totales"
from detalle_pedido group by codigo_pedido order by codigo_pedido;

#4.14
select p.nombre, d.codigo_producto, sum(d.cantidad) "Cantidad De Productos Vendidos"
from producto p left join detalle_pedido d on p.codigo_producto = d.codigo_producto group by p.nombre, d.codigo_producto order by 3 desc limit 20;

#4.15
select distinct d.codigo_producto, round(sum((d.cantidad) * d.precio_unidad),1) as costo_total, round(sum((d.cantidad) * d.precio_unidad) * (0.21),1) as IVA, round((sum((d.cantidad) * d.precio_unidad) * 1.21),2) as TOTAL
from detalle_pedido d group by d.codigo_producto
order by TOTAL DESC;

#4.16
select distinct d.codigo_producto, round(sum((d.cantidad) * d.precio_unidad),1) as costo_total, round(sum((d.cantidad) * d.precio_unidad) * (0.21),1) as IVA, round((sum((d.cantidad) * d.precio_unidad) * 1.21),2) as TOTAL
from detalle_pedido d group by d.codigo_producto
order by TOTAL DESC;

#4.17
select distinct d.codigo_producto, round(sum((d.cantidad) * d.precio_unidad),1) as costo_total, round(sum((d.cantidad) * d.precio_unidad) * (0.21),1) as IVA, round((sum((d.cantidad) * d.precio_unidad) * 1.21),2) as TOTAL
from detalle_pedido d group by d.codigo_producto having d.codigo_producto like "OR%"
order by TOTAL DESC;

#4.18
select distinct d.codigo_producto, round(sum((d.cantidad) * d.precio_unidad),1) as costo_total, round(sum((d.cantidad) * d.precio_unidad) * (0.21),1) as IVA, round((sum((d.cantidad) * d.precio_unidad) * 1.21),2) as TOTAL
from detalle_pedido d group by d.codigo_producto having TOTAL > 3000
order by TOTAL DESC;

#5.1
select nombre_cliente, limite_credito from cliente where limite_credito = (select max(limite_credito) from cliente);

#5.2
select nombre, precio_venta from producto where precio_venta = (select max(precio_venta) from producto);

#5.3
select nombre from producto
where codigo_producto = (select codigo_producto from (select codigo_producto, sum(cantidad) from detalle_pedido group by codigo_producto order by 2 desc limit 1) as SQ);

#5.4
select c.nombre_cliente, c.limite_credito, sum(p.total) as FINAL from pago p right join cliente c on p.codigo_cliente = c.codigo_cliente group by nombre_cliente, limite_credito having c.limite_credito > FINAL;

#5.5
select distinct nombre, cantidad_en_stock from producto where cantidad_en_stock = (select max(cantidad_en_stock) from producto);

#5.6
select distinct nombre, cantidad_en_stock from producto where cantidad_en_stock = (select min(cantidad_en_stock) from producto);

#5.7
select distinct empleado

                 







