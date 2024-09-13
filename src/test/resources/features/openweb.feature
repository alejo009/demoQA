# author : Alejandro Jimenez
#language: es

Característica: Abrir una página

  yo como alejandro
  Quiero realizar una prueba de abrir una pagina
  Para comprobar la robustes y control de errores de la aplicacion o pagina web

  @successful
  Escenario: abrir con el navegador chrome la pagina web x
    Dado "alejandro" abre el sitio web de pruebas
    Cuando ingresa al navegador chrome
    Entonces visualizara el titulo de la pagina "cucumber"