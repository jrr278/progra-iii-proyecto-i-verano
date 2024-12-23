# PROYECTO #1: Sistema de gestión de inventario para ferretería

Un pequeño emprendimiento requiere implementar un sistema de escritorio con interfaz gráfica para llevar registro de los artículos de ferretería que tienen a la venta. Inicialmente, el catálogo de artículos se compone de categorías, subcategorías, artículos y su presentación (un artículo puede existir en más de una presentación, por ejemplo, pintura en presentaciones de ¼ y 1 galón).
El sistema deberá tener interfaz gráfica (tipo Swing) y deberá usar como almacenamiento para los datos archivo(s) XML (se les proveerá de un archivo de ejemplo, el mismo puede ser modificado). Deberá usarse una arquitectura de una sola capa y esta deberá ajustarse al patrón Modelo-VistaControlador (MVC).

La interfaz debe estar compuesta de una única ventana, que contiene un tabbed pane, donde la funcionalidad de cada tab, se detallará en las siguientes secciones. No requiere autenticación de usuario ni generación de reportes. La lista de tab’s es la siguiente:

1. Categorías
2. Subcategorías
3. Artículos
4. Acerca de

# Categorías

Mantenimiento (búsqueda y listado, inclusión, modificación y borrado) de las distintas categorías que los artículos tienen asignada. Cada categoría tiene asignada un ID único, descripción y contiene al menos una subcategoría. Un artículo solo puede pertenecer a una única categoría.
La ventana de categorías es de diseño libre, por lo tanto, el estudiante debe utilizar su creatividad y aplicar los conocimientos adquiridos para presentar una GUI que cumpla con los principios de UX.

Debe implementarse la funcionalidad de creación, edición, eliminación y visualización de categorías, considerando las siguientes reglas:

• Las categorías son únicas, por lo tanto, el código no puede repetirse.
• El nombre y la descripción son requeridos y editables.
• Una categoría no puede eliminarse si tiene asociada una subcategoría.
• Debe desplegarse un listado de las categorías existentes.
• Para editar una categoría, se debe realizar una búsqueda y seleccionarla de la lista.
• Al seleccionar una categoría, se activa en tab con las subcategorías que este tenga asociadas.
• Si no hay una categoría seleccionada, los tab de subcategoría y artículo deben estar desactivados.

# Subcategoría

Debe implementarse en el segundo tab de la ventana, implementando el mantenimiento (búsqueda y listado, inclusión, modificación y borrado) de subcategorías. Cada subcategoría tiene un ID único, Nombre, Descripción y, además, tiene asociada la lista de artículos.

Las reglas para esta sección son las siguientes:

• La lista de subcategorías se carga automáticamente al seleccionar una categoría.
• El nombre y la descripción son requeridos y editables.
• El ID es único
• Una subcategoría no puede eliminarse si tiene asociada un artículo.
• Debe desplegarse un listado de las subcategorías existentes.
• Para editar una subcategoría, se debe realizar una búsqueda y seleccionarla de la lista.
• Al seleccionar una subcategoría, se activa el tab con los artículos que este tenga asociados.
• Si no hay una subcategoría seleccionada, el tab de artículo debe estar desactivado.

# Artículos

Despliega la lista de artículos asociados a una subcategoría. Las reglas para esta sección son las siguientes:

• La lista de artículos se carga automáticamente al seleccionar una subcategoría.
• La marca, el nombre y la descripción son requeridos y editables.
• El ID es único
• Un artículo no puede eliminarse si tiene asociado una presentación.
• Debe desplegarse un listado de los artículos existentes.
• Para editar un artículo, se debe realizar una búsqueda y seleccionarlo de la lista.
• Al seleccionar una subcategoría, se activa el tab con los artículos que este tenga asociados.
• Al seleccionar un artículo, se cargan automáticamente las presentaciones que este tenga registrado.
• Si no hay una subcategoría seleccionada, el tab de artículo debe estar desactivado.

# Presentación de artículos

Esta sección es un submódulo del módulo de artículos. Despliega la lista de presentaciones en las cuales viene un artículo. Por ejemplo, pintura color blanco, es el artículo, y cuenta las presentaciones de ¼ de galón y 1 galón.

Las reglas para esta sección son las siguientes:

• Las presentaciones cuentas con los campos de unidad de medida, capacidad/cantidad
• La lista de presentaciones se carga automáticamente al seleccionar un artículo.
• Todos los campos son requeridos y editables
• Las presentaciones deben ser únicas.

# Acerca de

Despliega la información de la aplicación, letra asignada al equipo de trabajo, así como los integrantes.
