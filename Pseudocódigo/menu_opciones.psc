Algoritmo ciclo
	n=1
	Repetir
		Escribir '------ MEN� ------'
		Escribir '1) Suma de 2 n�meros'
		Escribir '2) Mayor y menor de 2 n�meros'
		Escribir '5) Salir'
		Escribir 'Ingrese la opci�n que desea hacer: '
		Leer n
		
		Segun n Hacer
			1:
				Escribir 'Ingrese el primer n�mero'
				Leer num1
				Escribir 'Ingrese el segundo n�mero'
				Leer num2
				Escribir 'El resultado es: ',(num1+num2);
				Esperar Tecla
			2:
				Escribir 'Ingrese el primer n�mero'
				Leer num1
				Escribir 'Ingrese el segundo n�mero'
				Leer num2
				
				Si num1>num2 Entonces
					Escribir 'El mayor es ', num1
				Sino
					Escribir 'El mayor es ', num2
				FinSi
				
				Si num1<num2 Entonces
					Escribir 'El menor es ', num1
				Sino
					Escribir 'El menor es ', num2
				FinSi
				Esperar Tecla
		Fin Segun
		
		Limpiar Pantalla
	Hasta Que n=5
FinAlgoritmo