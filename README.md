# ScriptApiMeli
Script simple para el Test_gestion_Operativa de MercadoLibre.

# Introduccion
Descargar el repositorio y en la carpeta test se encuentra la clase ClienteHTTP. Dentro se encuentra un codigo simple que consta de las siguientes librerias

OkHttp
encargado de las llamadas HTTP hacia la API de MercadoLibre

Gson
encargado del manejo de la respuesta Json por parte de la API de MercadoLibre

lang
libreria requerida para poder usar los metodos ToStringBuilder

# Funcionamiento

Solo hace falta llamar al metodo "obtenerUsuariosPorId" que recibe 2 paramtros. El primero un string con el siteId, y el segundo es un List<String> osea
una lista de objetos de tipo String, que al final resulta ser la cantidad de userId que queremos recuperar sus items y datos para luego guardarlos en el archivo .txt
