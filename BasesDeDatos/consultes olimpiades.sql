/* 'Olimpíades de Cicles Formatius' és un esdeveniment cultural on participen diferents alumnes de diversos instituts de la província de Cadis en 
diversos Cicles Formatius (Administració, Electrònica i Informàtica). Cada institut participa amb un nombre màxim d'alumnes per a cadascun dels cicles. 
Per cada cicle se donen 3 premis (Or, Plata i Bronze). Els premis es concedeixen a l'institut, no als alumnes. Amb l'objectiu d'emmagatzemar aquesta informació, 
s'ha dissenyat la base de dades Olimpíades.
*/


-- 1) Llista d'instituts (nom) i localitat on se troben.
select nombre, ciudad
from institutos;

-- 2) Llista d'instituts (nom i entre parèntesi la localitat on se troba) amb els seus alumnes (nom i data de naixement).
select a.nombre, fecha_nacimiento, i.nombre as 'instituto', concat('(' , i.ciudad, ')') as 'ciudad'
from alumnos a left join institutos i on a.id_Instituto = i.id_Instituto
order by i.id_instituto asc;
-- 3) Llista alfabètica dels participants de les olimpíades indicant nom del participant, dorsal (compost per identificador de l'institut i identificador de l'alumne),
--  institut al que pertany i localitat d'aquest.
select a.nombre, concat(i.id_instituto, a.id) as 'dorsal', i.nombre as 'instituto', i.ciudad
from alumnos a join institutos i on a.id_Instituto = i.id_Instituto
where a.id in (select a.id from alumnos a join equipos e on a.id_Equipo = e.id)
order by a.nombre asc;

-- 4) Llista d'instituts participants indicant nom de l'institut, nombre d'Ors, nombre de Plates, nombre de Bronzes i total de medalles, en ordre descendent per aquest darrer valor.
select i.nombre as 'Instituto',  p.medalla ,count(p.id) as 'cantidad medallas'
from((equipos e join premios p on e.id_premio = p.id) join institutos i on e.id_Instituto = i.id_Instituto)
group by p.id; -- Se entiende que las medallas ya se encuentran introducidas en orden (desde el oro hasta el bronce).
-- 5) Llista alfabètica de localitats que NO han aconseguit cap medalla a les Olimpíades.
select ciudad
from institutos
where id_Instituto not in (select id_Instituto from equipos where id_premio in (select id from premios))
order by ciudad asc;
-- 6) Llista de participants d’una determinada modalitat. Mostrar dorsal i nom del participant. El llistat estarà ordenat per dorsal.
select a.nombre, a.apellidos, concat(e.id_instituto, a.id) as 'dorsal'
from((alumnos a join equipos e on a.id_Equipo = e.id) join estudios es on e.id_Estudios = es.id)
where es.nombre like 'null'
order by dorsal;
-- 7) Llista de medalles indicant modalitat (nom), institut (nom) i tipus de medalla (or, plata o bronze). Ordenar per modalitat i medalla.
select es.nombre as 'modalidad' , p.medalla, i.nombre as 'instituto'
from((equipos e join estudios es on e.id_Estudios = es.id) join institutos i on e.id_Instituto = i.id_Instituto) join premios p on e.id_premio = p.id
order by es.nombre and p.medalla;
-- 8) Nom de l'alumne de més edat, l'institut on va i l'edat que té.
select max(datediff(curdate(), Fecha_Nacimiento)) / 365 as 'edad mayor (en años)', a.Nombre, i.nombre
from alumnos a join institutos i on a.id_Instituto = i.id_Instituto
group by 'edad mayor (en años)';
-- 9) Estadística que mostra quants alumnes hi ha de cada sexe per cada any de naixement.
select count(sexo), fecha_nacimiento
from alumnos
group by Fecha_Nacimiento;
-- 10) Afegeix columna a instituts amb el nom de la localitat.
select concat(nombre, ' ', ciudad)
from institutos;


