Feature: 2. Login del usuario

	Scenario Outline: Login del usuario
		Given Se carga el sistema PRODUCT STORE
			Then Se ingresa con el usuario ya registrado <usuario> y contraseña <clave>
			
	
	Examples:
		| usuario 					 | clave    | 
		| "automatizacion" | "prueba" | 
		