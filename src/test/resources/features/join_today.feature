#language: es

Característica: Registro Utest

  Esquema del escenario: Registro Exitoso Utest
    Dado que actor quiere registrarse en uTest
    Cuando Ingreso los datos en el formulario de registro
     | nombre   | apellido   | correo   | fechaNaciMes   | fechaNaciDia   | fechaNaciAnio   | idioma   | ciudad   | codigoPostal   | pais   | movil   | modelo   | sOMovil   | contrasena   |
      | <nombre> | <apellido> | <correo> | <fechaNaciMes> | <fechaNaciDia> | <fechaNaciAnio> | <idioma> | <ciudad> | <codigoPostal> | <pais> | <movil> | <modelo> | <sOMovil> | <contrasena> |
    Entonces valido el registro exitoso
    | valorEsperado |
    | <valorEsperado> |

    Ejemplos:
      | nombre | apellido         | correo                  | fechaNaciMes | fechaNaciDia | fechaNaciAnio | idioma  | ciudad   | codigoPostal | pais     |  movil | modelo | sOMovil | contrasena | valorEsperado |
      | Junior  | Bustamante De la Ossa | email@gmail.com | January       | 14           | 1988          | Spanish | MEDELLIN | 054448       | Colombia | Huawei          | Y9 | Android 10         | Junior_1234 | We are excited that you have found your way to uTest |






