#FUNCIONA
"""
Este programa introduce 5 notas entre 1 y 10 por teclado y dice cuantos aprobados hay y cuantos suspensos
"""
aprobado = 0
suspenso = 0
for i in range(0, 5, 1):
    nota = int(input("Introduzca una nota del 1 al 10:\n"))
    while nota < 0 or nota > 10:
        nota = int(input("ERROR, Introduzca una nota del 1 al 10:\n"))
    if nota > 0 and nota < 5:
        suspenso = suspenso +1
    elif nota >= 5 and nota <= 10:
        aprobado = aprobado + 1
print("Hay", aprobado, "aprobados.")
print("Hay", suspenso, "suspensos.")