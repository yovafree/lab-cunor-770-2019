Algoritmo sin_titulo
	Escribir 'Ingrese el número'
	Leer n
	
	n2=0
	
	Para n3<-1 Hasta n Con Paso 1 Hacer
		Si n mod n3 = 0 Entonces
			n2=n2+1
		FinSi
	Fin Para
	
	Si n2 = 2 Entonces
		Escribir 'El número es primo'
	Sino
		Escribir 'El número no es primo'
	FinSi
FinAlgoritmo