# prueba-tecnica-java-avanzado
Lista de vuelos
Se requiere desarrollar una programa en Java que permita filtrar una lista de vuelos según distintos criterios de búsqueda basados en fechas y que se puedan ver en la terminal.

Requisitos:

Definir constantes de fecha en Main:
Se deben definir dos constantes de fecha en la Clase Main. Te serviran para declarar la fecha de inicio y la fecha fin, ten en cuenta que podrian ser nulas tambien.
Se crearon estas constantes como FECHA_DESDE y FECHA_HASTA

Estructura del objeto Vuelo:
id (int) - No importa el orden de la secuencia
nombreVuelo (String) - Nombres que tu quieras. Ej. (H001-V)
empresa (String) - Aerolineas Reales que tu quieras. Ej. (Iberia, Turkish)
lugarSalida (String) - Ciudades más importantes Ej. (Madrid, Barcelona)
lugarLlegada (String) - Ciudades más importantes Ej. (Buenos Aires, New York)
fechaInicio (LocalDate) - Año-Mes-Día. : 2025-05-20 Ej. LocalDate.of(2025, 5, 20)
fechaFinal (LocalDate) - Año-Mes-Día. : 2025-05-20 Ej. LocalDate.of(2025, 5, 20)

Se creó esta estructura, pero en id, no me di cuenta y lo puse en mayúscula, cuando quise cambiarlo me daba un error y no encontraba cuál era así que por si acaso lo dejé como Id.

Función de filtrado ( trabaja solo sobre la fechaInicio ):
Si no se envía la fechaDesde, el filtro debe devolver todos los vuelos hasta la fecha fechaHasta.
Si no se envía la fechaHasta, el filtro debe devolver todos los vuelos desde la fecha fechaDesde en adelante.
Si se envían ambas fechas, debe devolver los vuelos que se encuentren dentro de ese rango de fechas.
Si no se envía ninguna fecha, debe devolver todos los vuelos.
Los vuelos se impriman en la terminal ordenados por fecha de inicio.
Se utiliza esta función sólo con la fechaInicio, aunque también cree el getter de la fechaFinal

Crear en Main una lista de 10 vuelos de prueba.
Creada en Main

Recomendaciones:
Crear un package llamado entities para que crees tu entidad Vuelo.
Crear un package llamado utils para que crees tu clase utilitaria para la función de filtro.
Ambos packages fueron creados
