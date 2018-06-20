Los activity son actividades de la aplicacion, osea las diferentes pantallas de esta.

Cada controlador es un activity y se manjan a traves del androidmanifest.xml
Aca veremos a parte de todas las opciones de la aplicacion, veremos todas las actividades.

Intent-filder: Este parametro dentro del manifest es quien se encarga de definir la pantalla principal de la
aplicacion.


***Parentecis***

New > Package crea una nueva carpeta en el proyecto


*** Como crearla ****

New > Activity > Despliegue de todas las activity


*** Como importar una clase de una istancia que el IDE te esta diciendo que falta ***

 - Nos posicionamos encima de dicha clase y precionamos alt + Enter



******* CoordinatorLayout ********

Para esto en este caso se crea un basic activity solo de referencia y de este copia el codigo de coordinator layout, una 
vez hecho esto lo copias en el xml de tu actividad principal para que el navigation bar comienze en este



--------> ¿Como definir Alturas Proporcionales de elementos? <--------

Al elemento padre le asigno la propiedad [weightSum="1"] 

Y a sus elementos hijos le asigno layout_weight = 0.6 

Por ejemplo: Este valor lo que dice es que este elemento ocupara el 0.4 y se quedara libre el 0.6

Ejemplo de uso

LinearLayout
	orientation => vertical
	layout_width => match_parent (Ancho total)
	layout_height => match_parent (altura total)
	layout_weight => 0.3 (Significa que deja libre un 70%)


ImageView:

	- CenterInParent(Boolean) Esta propiedad lo que hace es centrar la imagen o el elemto en el centro
	de su elemento padre

	- background = @drawable/nombreDeLaImagen 
	Este parametro me permite colocar una imagen de fondo, en este caso a un imageVIew


¿Como instalar un plugins?

Para instalar un plugins se debe ir a Preferencias > Plugins

Instalar: Android Drwable Importer 

Este plugins es muy importante ya que  me permite importar una imagen con las diferentes
dencidades de pizeles que existen


¿Como centrar una imagen dentro de un LinearLayout?

<LinearLayout
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:layout_weight="0.7"

    android:gravity="center_vertical|center_horizontal">  <---------------- ********

    Nota: Tambien si se le pone solamente center; se centra completamente tanto vertical como horizontal


    <ImageView
        android:id="@+id/imageView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginBottom="16dp"
        android:layout_marginTop="16dp"
        android:contentDescription="@string/logo"
        app:srcCompat="@drawable/logo" />

</LinearLayout>

