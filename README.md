# Proyecto_Cuenta_Banco

Un banco de renombre nos ha solicitado la creación de un sistema de gestión de cuentas, específicamente para las cuentas Ahorro, Corriente y de Estudiantes. 
Cada tipo de cuenta tiene sus propias características distintivas, pero también tienen características en común. 

 Características comunes: 
- Todas las cuentas mostrarán su estado actual. 
- Permitirán realizar retiros e ingresos de dinero. 

Cuenta de Ahorro: 
- Esta cuenta genera rendimientos, ya que el dinero depositado genera intereses automáticamente. Sería útil incluir una función de simulación de rendimientos, que permita al usuario calcular cuánto ganaría de intereses al ingresas una determinada cantidad de dinero. 

Cuenta Corriente: 
- Esta cuenta está sujeta al pago de una comisión anual, además de permitir el pago de facturas. 

Cuenta de Estudiante: 
- Esta cuenta no tiene comisiones, pero tiene ciertas condiciones especiales: 
  - El estudiante debe actualizar sus datos periódicamente para verificar que sigue estudiando.
  - Si el estudiante ha excedido el décimo período, lo que indica múltiples reprobaciones, se cerrará su cuenta de estudiante y se desactivarán sus beneficios. En esta caso se dispara una alarma dónde le avisa que su tiempo se ha excedido con esta cuenta.
  - Solo se pueden realizar retiros de un máximo de 15€ al día. Si acaso intenta sacar más que este valor, se dispara una alarma dónde le avisa que ha excedido el valor máximo de retirada diária.
  - Al finalizar los estudios, la cuenta se cierra, pero en este caso se permite retirar todo el saldo, incluso si supiera los 15€.


Atención al cliente:
- El cliente será atendido por un bot que tendrá opciones para elegir de preguntas. Este bot será capaz de responder a las consultas de los clientes, proporcionando informaciones sobre las diferentes cuentas, las vantajas de ellas, informaciones de tasas y etc. El objetivo es proporcionar un servicio al cliente eficiente y efectivo, mejorando así la experiencia del cliente con el banco.

Transferencias:
- Los clientes deben poder hacer transferencias entre cuentas. Pero sólo se podrá entre Cuentas Corrientes.

Histórico Santander:
- Esta será el histórico de transferencias que los clientes hicieron, pero del propio banco, o sea, la visualización no es a nivel de clientes pero a control del banco.


