<h1 align="center">CONVERSOR DE MONEDAS</h1>
<p align="center">
  <img src="https://github.com/user-attachments/assets/3729e009-69be-4715-889a-f8866f13cf2d" alt="Image" width="400"/>
</p>
<hr/>
<p>
Este emocionante desafio del equipo ONE consistió en realizar un conversor de monedas ,realizando solicitudes HTTP ala API  ExchangeRate,la cual permite consultar variedad de monedas  del mundo y en el desarrollo de la aplicación se toma como base la moneda estadounidense (USD) y por medio del uso de la librería de Gson ,se  convierte el json de respuesta de la solicitud HTTP (GET) a un objeto de java, con el cual se puede filtrar por medio de un Map todas las conversiones de moneda, y asi aplicarlos a las opciones del menú que ofrece la aplicación. </p>
<br/>
<p>
Para resolver el desafío, se realizaron consultas a la API de Exchangerate, y el proyecto se abordó de dos maneras: una opción utiliza directamente la API para hacer la conversión de monedas en tiempo real (se ejecuta con el archivo <i>Main.java</i>), y la otra hace una sola consulta tomando como referencia el USD, y a partir de ahí se realizan las conversiones manualmente. Esta segunda opción ayuda a ahorrar recursos, ya que evita hacer múltiples solicitudes HTTP, lo cual puede generar costos adicionales (se ejecuta con el archivo <i>Main2.java</i>).
  
</p>
