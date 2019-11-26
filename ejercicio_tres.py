#FUNCIONA
"""
Este programa pide un número entre 1 y 10 y nos muestra su tabla de multiplicar por pantalla
"""
num = int(input("Introduzca un número del 1 al 10:\n"))
while num < 0 or num > 10:
    num = int(input("ERROR, introduzca un número del 1 al 10:\n"))
print("Tabla del", num,)
for i in range(0, 11, 1):
    print(num, "*", i, "=", num*i, end="\t")
