Feature: 3. Seleccionar Productos

	Scenario Outline: Seleccionar Productos
		Given Se carga el sistema PRODUCT STORE
			And Se ingresa con el usuario ya registrado <usuario> y clave <clave>
			And Selecciona la categoria
			And Elige una laptop a comprar y la carga al carrito
			And Elige un celular a comprar y la carga al carrito
			Then Visualiza lo cargado en el carrito
			
	
	Examples:
		| usuario 		| clave    	|
		| "qa-auto444"	| "pruebas"	|
		