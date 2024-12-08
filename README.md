# HamburguesasLowCost
Trabajo práctico de gestión de una hamburguesería donde el cliente se prepara su hamburguesa. 

Una hamburguesería que está por abrir a la vuelta de la UADE, está pensando en las diferentes opciones para ofrecer a sus clientes. Desea cubrir un gran segmento del mercado, para todos los gustos. El asesor de marketing que está trabajando con el dueño le propuso un modelo de negocio basado en el de las aerolíneas low cost, en el que: “solamente pagás lo que comés”
. La consigna es: el cliente prepara su hamburguesa y luego un sistema modelado en objetos deberá calcular el precio basado en las siguientes reglas:
● Una hamburguesa está compuesta por medallones, todos los que el cliente desea. Los medallones pueden ser de carne, pollo o vegetarianos. Todos tienen un precio y sabor distinto. Es probable que en un futuro se agreguen otras opciones.
● Es posible agregarle ingredientes extra a una hamburguesa, como huevo frito, lechuga, tomate, cheddar, y otros que se agreguen en un futuro. Siguiendo la política low cost, todos los ingredientes tienen todos un precio diferente, y solamente se paga lo que se abona.
● Cada hamburguesa debe poder calcular su precio sumando el precio de todos sus ingredientes, más el precio base. El precio base depende del tipo de pan utilizado, por el momento existe pan de papa, y pan de campo pero en un futuro se podrían agregar otros.
● Para poder facturar una hamburguesa, la misma tiene que tener como mínimo 1 medallón, y no puede tener más ingredientes que medallones.
● Todos los precios deben poder ser actualizados sin grandes dificultades.

Ejemplos para crear hamburguesas y calcular su precio:
● Hamburguesa con pan de papa (precio base $4500), 1 medallón de pollo ($1500) y 1 de carne ($2900), ingredientes extra: cheddar ($600 ) y berenjena ($350). Puede ser facturada ok y tendrá un precio total de $9850.
● Hamburguesa con pan de campo (precio base $5500). 1 medallón vegetariano ($1890), ingrediente extra berenjena ($350), cheddar ($600). No puede ser facturada porque tiene más ingredientes extras que medallones. Se debería sacar un ingrediente extra o agregar un medallón.
Consigna: Creá la clase hamburguesa y todas las clases, atributos y métodos que consideres necesarios para poder calcular el precio de una hamburguesa basados en las reglas de negocios. Se necesita poder agregar y sacar ingredientes de cada hamburguesa, saber si una hamburguesa puede ser facturada, y por otro lado obtener su precio total a pagar. Asegurate de preguntarle primero a la hamburguesa si puede ser facturada antes de pedirle el precio total.
