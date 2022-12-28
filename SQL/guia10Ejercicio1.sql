select * from empleado where cod_jefe = '31.840.269';
select * from departamento where id_depto = 3500;
select nombre_depto from departamento;
select nombre,salario from empleado;
select comision from empleado;
select * from empleado where cargo='Secretaria';
select * from empleado order by nombre;
select nombre,cargo from empleado order by salario;
select 'nombre',nombre,'cargo',cargo from empleado;
select comision,salario from empleado e where id_depto = 2000 order by comision;
select nombre,salario+comision+500 as T_total,'<-Monto a pagar' as referencia from empleado where id_depto=3000 order by nombre;
select * from empleado where nombre like 'J%';
select comision,salario,comision+salario as total, nombre from empleado where comision > 1000; 
select comision,salario,comision+salario as total, nombre from empleado where comision = 0; 
select * from empleado where comision > salario;
select * from empleado where comision <= (salario * .3);
select * from empleado where nombre not like '%MA%';
select nombre_depto from departamento where nombre_depto   in ('VENTAS','INVESTIGACIÓN','MANTENIMIENTO');
select nombre_depto from departamento where nombre_depto  not in ('VENTAS','INVESTIGACIÓN','MANTENIMIENTO');
select * from empleado order by salario desc limit 1;/*select max(salario) from empleado;*/
select * from empleado order by nombre desc limit 1;/*select max(nombre) from empleado;*/
select max(salario) as maximo,min(salario) as minimo,max(salario)-min(salario) as diferencia from empleado;
select e.id_depto,d.nombre_depto,avg(salario) from empleado e, departamento d where e.id_depto = d.id_depto group by e.id_depto;
select e.id_depto,d.nombre_depto,count(e.id_empleado) as cantidad_empleados from empleado e, departamento d where e.id_depto = d.id_depto group by e.id_depto having count(e.id_empleado) > 3;
select e.cod_jefe,e.nombre,e.cargo,count(e.id_empleado) as cantidad_empleados from empleado e group by e.cod_jefe having count(e.id_empleado) >= 2;
select e.id_depto,d.nombre_depto,count(e.id_empleado) as cantidad_empleados from empleado e, departamento d where e.id_depto = d.id_depto group by e.id_depto having count(e.id_empleado) = 0;
select nombre,salario from empleado where salario >= (select avg(salario) from empleado ) order by id_depto;

