Feature: 4. Realiza Orden de compra

	Scenario Outline: Realiza Orden de compra
		Given Se carga el sistema PRODUCT STORE
			And Se ingresa con el usuario ya registrado <usuario> y clave <clave>
			And Se ingresa al carrito para ver el listado de productos a comprar
			And Se realiza el pedido dandole al boton Place Order
			And Se ingresa el nombre <name>, pais <country>, ciudad <city>, tarjeta de credito <creditCard>, mes <month>, y periodo <year>
			And Se confirma la compra
			Then El usuario cierra sesion
			
	
	Examples:
		| usuario 		| clave    	| name 			| country	| city 		| creditCard            | month | year   |
		| "qa-auto444"	| "pruebas"	| "Juan Perez"	| "Perú"  	| "Lima"	| "0084 5874 5874 9841" | "12"  | "2026" |
