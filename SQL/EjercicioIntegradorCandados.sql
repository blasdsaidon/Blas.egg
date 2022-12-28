select asistencias_por_partido from estadistica order by Asistencias_por_partido desc ;
/*Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.*/
select jugador from estadistica where Asistencias_por_partido>(select count(codigo) from jugador where nombre_equipo="heat");
/*Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.*/
select sum(j.peso) from jugador j inner join equipo e on j.nombre_equipo=e.nombre where j.posicion="c" and e.conferencia="east";
select count(*) from partido where temporada in ("98/99","99/00");
/*La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.*/
select count(codigo) from jugador j inner join equipo e on j.nombre_equipo=e.nombre where procedencia="michigan" and conferencia="west";
select count(codigo) from jugador where peso>195;
/*Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.*/
select avg(puntos_por_partido)+count(Asistencias_por_partido)+sum(Tapones_por_partido)
from estadistica e
inner join jugador j on e.jugador=j.codigo inner join equipo eq on j.nombre_equipo=eq.nombre
where eq.division="central";   
/*Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado.*/
select tapones_por_partido from estadistica e inner join jugador j on e.jugador=j.codigo 
where j.nombre="Corey Maggette" and e.temporada="00/01";
/*Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina.*/
select round(sum(puntos_por_partido)) from estadistica e 
inner join jugador j on e.jugador=j.codigo where j.procedencia="argentina";
/*Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.*/
select sum(j.peso)  from jugador j inner join equipo e on j.nombre_equipo=e.nombre where j.posicion like "%c%"

and e.conferencia="east";