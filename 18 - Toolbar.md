IMPORTANTE: SIEMPRE USAR LA REFERENCIA DE TOOLBAR QUE TRAE ANDROID OSEA LOS TEMPLATE


Importante: Despues que se coloca un toolbar, a los ScrollView o a cual quier elemento
que le siga a este se le debe especificar los layout_behavior; Y es como decirle que respete el alto del toolbar

	Etiqueta: app:layout_behavior="@string/appbar_scrolling_view_behavior"

Importante: Siempre es buena practica que los toolbar esten dentro de un CoordinatorLayout @Obligatorio!!!!


Importante: Es bueno crear por separado los elemento que siempre se va a repetir en todas las vistas,
En este caso siempre repetiremos el toolbar por lo que es buena practica crear solo su layout a parte
para hacer un include donde se necesite.

Cada elemento debe tener los espacios de nombre

xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"

¿Como hago un include?

 <include layout="@layout/SLUG DEL LAYOUT O NOMBRE" />


****** ¿Como interactuo con mi toolbar que acabo de insertar????

Una vez incluido ya podemos interactuar con dicho toolbar desde nuestro activity (Codigo java)

Ya que se debe habilitar la compatibilidad de titulo y demas y por si surgen mas cosas
en el futuro creamos un metodo que haga eso. Y lo llamamos desde el oncreate


Dicho metodo recibira como parametro el String del titulo del toolbar y un Booleano si va a mostrar o no el
boton de back

Creamos una variable tipo Toolbar y le asignamos el toolbar ya creado

	Ej: Toolbar obj = findViewById(R.id.toolbar)

	// Agregamos soporte al action bar
	setSupportActionBar(OBJETO TOOLBAR). // De segundo siempre o da error

	// Setiamos el titulo
	getSupportActionBar().setTitle(title)

	// Setiamos el boton de back
	getSupportActionBar().setDisplayHomeAsUpEnabled(BOLEANO PASADO A LA FUNCION)



********** ¿Como traer un texto de los string y plasmarlo en el codigo????? ********


	getResources().getString(R.string.LLAVE ASIGNADA AL STRING)


********** Prevenir la alerta de nul en setTitle

if(getSupportActionBar() != null)


#Como mostrar un toolbar en un fragment con compatibilidad

```
public void showToolbar(String tittle, boolean upButton, View view){
    Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
    ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
    ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
    ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
}
```