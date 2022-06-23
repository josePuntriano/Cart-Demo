Feature: PRODUCT STORE - Registro de usuario

	Scenario Outline: Registro de usuario
		Given Se carga el sistema PRODUCT STORE
			Then Se registra con el usuario <usuarioRegistro> y la clave <claveRegistro>

	
	Examples:
		| usuarioRegistro		 | claveRegistro | 
		| "automatizacion60" | "prueba" 		 | 
		