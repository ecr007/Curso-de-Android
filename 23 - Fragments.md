
Los fragments son agrupaciones de activity que se utilizan cuando trabajamos con 
menu tab bar en los cuales este siempre sera visible en la parte de abajo y lo
unico que cambiara son el cuerpo de cada activity.

Es la manera mas recomendable de hacer esto.

Consite en utilizar La clase FragmentManager

Transacciones: Son las cambios de pantalla entre activity

Commits: Son llamados para mostrar el activity.


-----------------------------------------------------------------------------------------------------------

Nota: Los fragments no son activity, para crear estos es bueno crear un nuevo package y desplegarlo ahi.

	java > new > fragment

Es importante crearlo en clanco.

Importante: Se debe crear un Activity que servira de contenedor para los fragments

Importante: A los fragments se les debe quitar las opciones:

	- include fragment factory methods?
	- include interface callbacks?



***** Nota Importante: Fijarse bien los fragments no comienzan con la etiqueta xml de comienzo
ya que siempre estaran dentro de un contenedor principal quien es que la tiene. a estos se les pone de una vez
el contenido



************** Como agregar los fragments al contenedor principal ???? *****************

Los fragments que se agregaran por codigo al contenedor prinsipal es bueno que esten dentro de <FrameLayout> que sera su contenedor,
por lo que es importante colocarle su id para inyectarle el contenido de cada fragments necesario.

Aca no es necesario entrar el <FrameLayout> dentro de Contraint, ya qu el tamaño del bottom bar es fijo.
	Que es 56, cualquier duda consultar la guia de material.


Nota: dentro de cada archivo fragment, es bueno si tiene toolbar que este todo dentro del
CoordinatorLayout y despues del include del toolbar, colocamos un LinearLayout, vertical
que incluya todo.

Despues de este linear colocamos el floating button si solo va aca, si se repite en todas las vistas
lo colocamos en el content.



************ Como llamar un fragments desde del activity del contenedor ????? *********

1 - Instaciamos el codigo java del fragments

	NombreDelFragmentsClass obj = new NombreDelFragmentsClass();

2 - Añadimos soporte al fragments que queremos mostras con los metodos siguientes

	getSuppotFragmentManager()
		.beginTransaction() // Comenzamos la transaccion
		.replace(R.id.IDdelContener,OBJETO DEL FRAGMENT) // Usamos replace para no agregar si no remplazar, el primer parametro es el id del contenedor donde se mostrara el fragments
		.setTrasition(FragmentTransaction.TRANSIT_FRAGMENT_FADE) // Le agregamos un efecto a dicha transicion
		.addToBackStack(null) // Evita sobrecarga de memoria si se le agrega en null. // Usar mejor disallowAddToBackStack()
		.commit(); // Se registra transaccion lista para ser usada

3 




