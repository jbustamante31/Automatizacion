#language: es

Característica: Prueba técnica – Automatización

  Esquema del escenario: Manejo de selenium
    Dado la siguiente url "https://somosmakers.co/"
    Cuando hacemos clic en el enlace de CONTACTO
    Entonces capturar el numero de celular de servicio al cliente

    Y llenar el formulario "dejanos un mensaje" y en el campo mensaje adjuntar el numero de celular capturado

      | nombre   | apellido   | correo   | captura   | mensaje   |
      | <nombre> | <apellido> | <correo> | <captura> | <mensaje> |

    Y antes de hacer clic en el boton "enviar mensaje" tomar un pantallazo con la informacion diligenciada

    | valorEsperado |
    | <valorEsperado> |

    Ejemplos:
      | nombre | apellido         | correo                  | captura | mensaje |
      | Junior  | Bustamante De la Ossa | correo@gmail.com |        | Estoy interesad0           |





