Se deben crear los estilos definidos para cada elemento en el archivo 
	values > styles.xml

Como definir el estilo de un RaisedButton

 1 - Se declara una nueva estiqueta style y se le asigna el nombre [name] y el diseño del cual hereda [parent="Theme.AppCompat.Light"]
 	----> En este caso hereda del material desing claro. <----

 2 - El boton cuenta con 3 valores <item></item>

 	name = "colorButtonNormal" >@color/NombreDelColor<  // Es el color del boton
 	name = "colorControlHeighLight" >@color/NombreColor<  // Es cuando el boton es precionado
 	name = "android:textColor"  >@android:color/white< // El color del texto; En este caso se le coloca el blanco que viene con el SDK por default


 ¿Como usar este estilo????

 Nos vamos al elemtento en el xml y le colocamos la propiedad theme y como valor
 le colocamos la ruta al estilo que en este caso es:

 	@style/Nombre que le asignamos al estilo



***** Como agregar un text hint a los input??? *****  (floating hint text)

Solo hay que colocar el edit text dendro de un "textInputLayout"


# Floating Action button

Al gloating action button se le puede poner 
	
	gravity = bottom | end
	margin = 16 en todos las esquinas

	android:layout_gravity="bottom|end"
    android:layout_margin="@dimen/fab_margin"

# Como poner el floating action button debajo de un contenedor X

Para esto se utiliza la propiedad "layout_anchor" y se le pasa como ID de donde queremos que cuelgue dicho
contenido.

Ej:

app:layout_anchor = @+id/ID DE DONDE CORGARA EL ELEMENTO
app:layout_anchorGravity = bottom|end // La posicion de donde corgara el elmento

Recordad que este tipo de boton va de ultimo solo contenido por el coordinator layout o cualquier otro parecido.

Nota: Nunca del nestedScrollView

