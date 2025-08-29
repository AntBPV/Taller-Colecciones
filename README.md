# Integrantes:

Antonio Benjamin Parra Velasquez \
Sebastian Camilo Ramos toro \
Cristhian David Orbes Lasso

# Instrucciones:

Ejectuar Main.java

# Explicacion:

## Parte A:

El script en el archivo ListExercises con dos métodos estáticos que muestran el uso de listas dinámicas (ArrayList y LinkedList) para gestionar objetos de tipo Pedido: en exercise_ArrayList() se crean cinco pedidos en un ArrayList, se imprimen en orden de llegada y luego se insertan dos pedidos urgentes al inicio de la lista; mientras que en excersise_LinkedList() se repite la misma lógica pero usando un LinkedList. De esta forma se ilustran las diferencias en la manipulación de colecciones en Java según la implementación de lista utilizada.

## Parte B:

Este script ParteB_HashSet, donde en el método ejecutar() se crea un HashSet de objetos Pedido para almacenar pedidos sin un orden específico y sin permitir duplicados; se agregan cinco pedidos distintos y luego se intentan insertar dos repetidos ("Cafe", 14 y "Tampico", 10). Al usar un HashSet, los duplicados solo se eliminan si la clase Pedido redefine correctamente los métodos equals() y hashCode() (comparando por nombre y precio); de lo contrario, cada instancia se considera diferente en memoria y los supuestos duplicados aparecerán en el conjunto como si fueran elementos distintos.

## Parte C:

MapsExcersise, ejemplifica el uso de un HashMap en Java para indexar clientes por su identificador único (Integer). En el método indexClients() se crean tres clientes (Juan, Maria y Pedro), a cada uno se le agregan varios pedidos y luego se insertan en el mapa usando su id como clave; printClientsOrder() permite consultar e imprimir todos los pedidos de un cliente específico a partir de su id, validando si existe o no en el mapa; printTotalClient() recorre todos los clientes en el HashMap y calcula el total gastado sumando los precios de cada pedido directamente en la función; finalmente, excersise_HashMap() ejecuta el flujo completo: crea el mapa de clientes, imprime los pedidos de un cliente concreto (id = 2, que corresponde a María) y luego muestra el gasto total de cada cliente.

## Parte D:

La clase ParteD, cuyo objetivo es mostrar el uso de genéricos en Java para trabajar con colecciones de distintos tipos. En el método ejecutar() se crea una lista de objetos Pedido, se imprimen todos los pedidos originales y luego se usa el método genérico filtrar() para obtener únicamente aquellos con precio mayor a $50. El método filtrar() está definido con un parámetro genérico <T> y recibe una lista de cualquier tipo junto con un criterio; en este caso, si el criterio es numérico (Double o Integer) y los elementos de la lista son instancias de Pedido, se filtran y retornan solo los que cumplen la condición de precio. En la ejecución, se imprimen primero todos los pedidos y después los pedidos filtrados cuyo valor supera el umbral establecido, mostrando cómo los genéricos permiten crear funciones más reutilizables.

# Evidencia:\

[Link Al Texto Con Evidencia](Docs/evidencia_consola.txt)
