Algoritmo sin_titulo
	Escribir 'Ingrese el n�mero'
	Leer n
	
	n2=0
	
	Para n3<-1 Hasta n Con Paso 1 Hacer
		Si n mod n3 = 0 Entonces
			n2=n2+1
		FinSi
	Fin Para
	
	Si n2 = 2 Entonces
		Escribir 'El n�mero es primo'
	Sino
		Escribir 'El n�mero no es primo'
	FinSi
FinAlgoritmo