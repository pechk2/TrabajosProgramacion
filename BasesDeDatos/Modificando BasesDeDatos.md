# Insertar filas y columnas usando SQL:

**use** empresa;

### Insertando filas:

--Insert a new department into DEPT table--

**insert into** DEPT **values**(50, 'IT', 'Inca');

En el siguiente caso, puesto que se admite un valor nulo no es necesario introducir un valor para cada columna:

**insert into** DEPT  (DEPT_NO, DNOM)

​		   **values**(70, 'RRHH'); /*Como no queremos rellenar cada campo manualmente, basta con indicar dentro del primer paréntesis qué campos deseas rellenar y en el segudo con qué valores*./

**insert into** DEPT **values**(80, 'ADMINISTRACIO', null); /*En este caso sabemos que solamente hay un campo más a rellenar y lo hacemos con el valor null*. / 

### Creando tablas:

**create table** client_history **like** client*;* */Así creamos una tabla siguiendo el modelo de una ya creada pero sin dato alguno en su interior/*

**insert into** client_history

**select * from client**

**where** LIMIT_CREDIT > 100000; /*Ahora insertamos en la tabla creada anteriormente sin contenido alguno todos los clientes cuyo límite de crédito sea mayor a 100.000 Euros empleando , como puede observarse, los mismos comandos que se emplean para realizar una consulta (select).*/

### Actualizando filas:

**update** DEPT

​	    **set** LOC = 'Burguer'

​	    **where ** DEPT_NO = 50; */ Éste código cambia el valor de la columna LOC coincidente con la fila DEPT_NO 50 por la cadena 'Burguer'./*



**update** CLIENT

​	   **set **NOM = 'Alicia', ADRECA = 'Carrer Sol'

​	   **where** CLIENT_COD = 107; */Así es como se actualizan los campos de las columnas NOM y ADRECA en aquellas filas cuyo CLIENT_COD sea igual a 107/*

​	Hay que tener en cuenta que si el valor a insertar en una fila es del tipo *string* **únicamente** se admitirá que sea substituído por un valor del **mismo tipo**.



### Eliminando:



**delete from** CLIENT

**where** CLIENT_COD = 50; */Así se elimina toda la información referente a la fila cuyo  CLIENT_COD igual a 50. Si no se filtra la orden de borrado mediante el **where** o cualquier otro filtro, se borrarían todos los registros de la tabla, por lo que es recomendable realizar siempre una copia de seguridad antes de borrar nada./*

Así, la orden **delete** se encarga de borrar registros completos.

​	Si quisiéramos borrar un valor en concreto sin que ello afecte al resto de la fila lo haríamos como sigue:

**update** CLIENT

**set** ADRECA = (En blanco)

**where** CLIENT_COD = 105; 

