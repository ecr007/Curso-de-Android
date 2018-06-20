*** LinearLayout: Es para definir un diseño agrupado por bloques ya sean de manera horizontal o vertical
	
	Para definir la manera en como se muestran los elementos se cambia el parametro orientation


- TextView : Se encarga de colocar un texto

	text: esta propiedad define el texto que tendra el textview
	layout-gravity: se usa para centrar elementos [horizontal o vertical]

	A los widgets es obligatorio definirles su ancho y alto; asi como un id para
	identificarlos en el codigo

- EditText : Es una etiqueta que me permite colocar inputs [Password, email, username, etc]

	hint: es el placeholder de android 

- Button: Este me permite colocar un boton de texto, si quiero agregarlo un icono al lado del texto
le coloco la propiedad drawableleft o drawableright con el path del icono @drawable/iconimage

	Acciones:

		- onClick: Este es un parametro de los botones y se usa para ejecutar un metodo definido en su controlador

			Dicho metodo se le debe parar como parametros una variable tipo View 

			eje: public void enviar(View vista)

			Ya que el onclic lo que hace es pasar el boton como parametro

			Importante: Se le pueden colocar a cualquier widgets no solo a botones

		- setOnClickListener :   


- Toast : es una clase de notificacion tipo alerta que se usa para mostrar pequeños textos

	Se instancia la clase con su metodo estatico: makeText
		Este recibe 3 parametros 

			- El contento de como y donde se mostrata el Toast, con la funcion getBaseContext().
			- El texto que mostrara la alerta

			- La duracion, se le puede pasar segundo o el estandar de la clase Toast 
				Toast.LENGTH_LONG
				Toast.LENGTH_SHORT

			- Al final se le coloca el metodo show() para mostrar la alerta.

			Uso: Toast.makeText(getBaseContext(),"Felicitaciones Sr."+name,Toast.LENGTH_SHORT).show();


**** Propiedades de height y width

	- wrap_content: es el tamaño que trae por defecto el widget
	- match_parent: ocupa todo el espacio que le resta de pantalla


**** Interactuar con la interfaz desde el controlador

Si queremos interactual con elemento de la interfaz se le debe colocar su ID, al trabajar
con constraint layout los ID se colocan automaticamente.

Cada elemento de la interfaz tiene una clase que lo representa, se debe crear una variable de ese tipo
para asignarle el elemento de la interfaz:

ej: EditText obj = findViewById(R.id.nombre);

String name = obj.getText().toString(); // Al elemento se le debe estraer el contenido y para ser usado se convierte a String

- findViewById: esta funcion busca en la carpeta Res, por el ID del elemento

