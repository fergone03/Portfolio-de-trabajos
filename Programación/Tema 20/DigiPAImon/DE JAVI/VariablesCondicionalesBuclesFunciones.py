def suma_valores(valor1, valor2):
    return valor1+valor2


print("hola mundo")
valor = 5
print("Introduce un numero")
numero = int(input())

valor += numero

print(str(valor))

#sentencia condicional
if valor == 5:
    print("hola mundo")
    print("que tal")
elif valor >=5:
    print("hola mundo2")
    print("que tal2")
else:
    print("hola mundo3")
    print("que tal3")

#bucle while
valorBucle = 0
valorBooleano = False
while (valorBucle < 10 and valor >= 6) and (not valorBooleano) :
    print(str(valor))
    valorBucle+=1


#bucle for
for contador in range(1, 3):
    print("Iteración: ", contador)

# Bucle for con una lista de elementos
# Declarar una lista con elementos de diferentes tipos de datos
mi_lista = [1, "Hola", True, 3.14]

print(mi_lista[2])
mi_lista.append("que tal")
mi_lista.remove(3.14)

for nombre in mi_lista:
    print("Hola,", nombre)

for i in range(3):
    print("Iteración", i)

valor1 = 4
valor2 = 5
resultado = suma_valores("Hola","Mundo")
print(resultado)

def main():

    #Lógica ejecutable
    print("Función main")

main()