# Práctica Programación Orientada a Objetos

Práctica con interfaces y polimorfismo

## Supermercado

El objetivo de la práctica es crear distintas clases Java para describir los productos que vende un supermercado.

Para unificar el código de los distintos programadores, el equipo debe crear las siguientes interfaces 
Java para describir algunas características de los productos.

## Creación de interfaces

### Interfaz EsLiquido

Esta interfaz indica que los objetos creados a partir de la clase serán líquidos, y tendrá los siguientes métodos:

```java
public void setVolumen(double v);
public double getVolumen();
public void setTipoEnvase(String env);
public String getTipoEnvase();
```

### Interfaz EsAlimento
Esta interfaz indica que los objetos creados a partir de la clase serán alimentos, y tendrá los siguientes métodos:

```java
public void setCaducidad(LocalDate fc);
public LocalDate getCaducidad();
public int getCalorias();
```

### Interfaz ConDescuento

Esta interfaz indicará que el producto tiene descuento e incluirá los siguientes métodos:

```java 
public void setDescuento(double des);
public double getDescuento();
public double getPrecioDescuento();
```

## Creación de clases

Se pide que programe las siguientes clases de productos, implementando las interfaces que sean necesarias.

### Clase Detergente

Define una botella de detergente (debe tener en cuenta que este producto
puede tener descuento). Sus propiedades principales serán:

* Marca (String)
* Precio (double)

> Incluya otras propiedades según sea necesario a la hora de implementar las interfaces.

**Requerimientos** 

* Programe un constructor que reciba como parámetros una marca y un
precio. 
* Programe métodos set y get para la marca y el precio. 
* Programe los métodos de las interfaces. 
* Programe el método toString con todas las características del producto.

### Clase Cereal

Define el producto caja de cereales. (Este producto no tiene descuentos)

Las propiedades del producto serán:

* Marca
* Precio
* Tipo de cereal (String)

> Incluya otras propiedades según sea necesario a la hora de implementar las interfaces.

**Requerimientos**

* Programe un constructor que reciba como parámetros las tres propiedades
anteriores. 
* Programe los métodos set y get para dichas propiedades. 
* Programe los métodos de las interfaces implementadas. (Si es necesario añada más propiedades a la clase)
* Las calorías serán las siguientes:
  * 5 si el cereal es espelta, 
  * 8 si es maíz
  * 12 si es trigo
  * 15 en los demás casos. 
* Programe el método toString para devolver una cadena con todas las
características del producto.

### Clase Vino

Esta clase describirá el producto botella de vino. (Este producto es susceptible de tener descuento)

El producto tendrá como propiedades:
* La marca
* El tipo de vino
* Los grados de alcohol y el precio.

> Incluya otras propiedades según sea necesario a la hora de implementar las interfaces.

**Requerimientos**

* Programe al igual que los productos anteriores un constructor con estas cuatro propiedades como parámetros.
* Programe también los métodos set, get, toString y los métodos de las interfaces. Añada nuevas propiedades si es necesario. 
* Las calorías se calcularán multiplicando por 10 la graduación alcohólica.

## Programa de prueba

Realice un programa de prueba dónde cree varios productos de cada clase. Haga un ejemplo de polimorfismo creando un ArrayList de productos alimenticios y calculando la suma de sus calorías.