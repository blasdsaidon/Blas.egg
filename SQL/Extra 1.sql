#1
select nombre "Nombre Jugador" from jugador order by nombre;

#2
select nombre  "Nombre Pivot", posicion, peso from jugador where posicion = "C" and peso > 200 order by nombre;

#3
select nombre "Nombre Equipo" from equipo order by nombre;

#4
select nombre "Nombre Equipo", conferencia from equipo where conferencia = "East";

#5
select nombre "Nombre Equipo", ciudad from equipo where ciudad like "C%" order by nombre;

#6
select nombre_equipo "Nombre Equipo",  nombre "Nombre Jugador" from jugador order by nombre_equipo desc, nombre;

#7
select nombre_equipo "Nombre Equipo",  nombre "Nombre Jugador" from jugador where nombre_equipo = "Raptors" order by nombre_equipo, nombre;

#8
select j.nombre "Nombre Jugador", Puntos_por_partido, temporada from estadistica e left join jugador j on e.jugador = j.codigo where j.nombre = "Pau Gasol" order by temporada;

#9
select j.nombre "Nombre Jugador", Puntos_por_partido, temporada from estadistica e left join jugador j on e.jugador = j.codigo where j.nombre = "Pau Gasol" and e.temporada = "04/05";

#10
select j.nombre "Nombre Jugador", round(sum(Puntos_por_partido)) "Puntos Totales" from estadistica e left join jugador j on e.jugador = j.codigo group by j.nombre order by j.nombre desc;

#11
select nombre_equipo "Nombre Equipo", count(codigo) "Cantidad De Jugadores" from jugador group by nombre_equipo order by nombre_equipo desc;

#12
select j.nombre "Nombre Jugador", round(sum(Puntos_por_partido)) "Puntos Totales" from estadistica e left join jugador j on e.jugador = j.codigo group by j.nombre order by 2 desc limit 1;

#13
select e.nombre, e.conferencia, e.division, j.nombre from  equipo e, jugador j where e.nombre = (select nombre_equipo from jugador order by altura desc limit 1) and j.nombre = (select nombre from jugador order by altura desc limit 1);

#14
select round(avg((puntos_local + puntos_visitante)))"Promedio De Puntos" from partido where equipo_local in (select nombre from equipo where division = "Pacific") or equipo_visitante in (select nombre from equipo where division = "Pacific");

#15
select codigo "Partido Numero", equipo_local, equipo_visitante, puntos_local, puntos_visitante, abs(puntos_local - puntos_visitante) "Diferencia De Puntos" from partido where abs(puntos_local - puntos_visitante) = (select max(abs(puntos_local - puntos_visitante)) from partido);

#16
select * from partido order by equipo_local, equipo_visitante, temporada;

#17
select * , case when puntos_local > puntos_visitante then equipo_local when puntos_local < puntos_visitante then equipo_visitante else null end "Ganador" from partido;
select *, puntos_local < puntos_visitante "Ganador: Visitante 1 / Local 0" from partido;
select *, if (puntos_local = puntos_visitante, null, if (puntos_local < puntos_visitante, equipo_visitante, equipo_local)) "Ganador" from partido;