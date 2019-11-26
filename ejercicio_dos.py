#FUNCIONA
"""
Este programa mete notas por teclado hasta que pulsemos 0
Si la nota es menor-igual que 0 o mayor que 10 es erronea.
Cuando pulsamos el 0 para terminar el programa este nos dirá si hay suspensos o han aprobado todos los alumnos
"""
nota = 1
suspenso = False
while nota != 0:
    nota = int(input("Introduzca una nota:\n"))
    if nota > 0 and nota < 5:
        suspenso = True
    elif nota < 0 or nota > 10:
        print("ERROR, la nota introducida debe ser entre 1 y 10")
if suspenso == True:
    print("Hay suspensos.")
else:
    print("Todos aprobados.")