Proceso SistemaRepositorio
	
    Definir opcion, tipo Como Entero
    Definir dato, id Como Caracter
	
    Escribir "Seleccione el tipo de repositorio"
    Escribir "1. SQL"
    Escribir "2. Memoria"
    Leer tipo
	
    Si tipo = 1 Entonces
        Escribir "Repositorio SQL seleccionado"
    SiNo
        Escribir "Repositorio en memoria seleccionado"
    FinSi
	
    Repetir
        Escribir ""
        Escribir "MENU"
        Escribir "1. Guardar dato"
        Escribir "2. Leer dato"
        Escribir "3. Eliminar dato"
        Escribir "4. Salir"
        Leer opcion
		
        Segun opcion Hacer
            1:
                Escribir "Ingrese el dato"
                Leer dato
                Escribir "Dato guardado con id"
            2:
                Escribir "Ingrese el id"
                Leer id
                Escribir "Dato obtenido"
            3:
                Escribir "Ingrese el id"
                Leer id
                Escribir "Dato eliminado"
        FinSegun
		
    Hasta Que opcion = 4
	
    Escribir "Programa finalizado"
	
FinProceso
