Feature: 2. Login del usuario

	Scenario Outline: Login del usuario
		Given Se carga el sistema PRODUCT STORE
			Then Se ingresa con el usuario ya registrado <usuario> y clave <clave>
			
	
	Examples:
		| usuario 		| clave    	|
		| "qa-auto444"	| "pruebas"	|
		