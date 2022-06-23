Feature: PRODUCT STORE - Realiza Orden de compra

	Scenario Outline: Realiza Orden de compra
		Given Se carga el sistema PRODUCT STORE
			And Se ingresa con el usuario ya registrado <usuario> y contraseña <clave>
			And Se ingresa al carrito para ver el listado de productos a comprar
			And Se realiza el pedido dandole al botón Place Order
			And Se ingresa el nombre <name>, país <country>, ciudad <city>, tarjeta de crédito <creditCard>, mes <month>, y año <year>
			And Se confirma la compra
			Then El usuario cierra sesión
			
	
	Examples:
		| usuario 					 | clave    | name 			   | country | city 	| creditCard            | month | year   | 
		| "automatizacion60" | "prueba" | "Juan Perez" | "Perú"  | "Lima" | "0084 5874 5874 9841" | "12"  | "2026" | 
		