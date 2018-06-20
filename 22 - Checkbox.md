
Los checkbox en android son como los conocemos pero se pueden personalizar como queramos;

Se personalizan creando estilos definidos por iconos y luego se le asignan al elemento dicho estilo.

<CheckBox>


¿Como creo dicho recurso?

Me voy a la cardpete DrawAble y creo un nuevo recurso en new

1 - Le asinamos un nombre y se creara un selector

2 - Le agregamos los siguientes <item> con los parametros siguientes

	// Cuando el estado del elemento este desmarcado //
	- drawable = ruta donde se encuentra la imagen
	- stated_checked = false // La imagen de arriba sera signada si el estado es false

	- drawable = Ruta de la imagen
	- stated_checked = true

	Y colocamos un <item> por defecto si no se ha marcado o desmarcado solo con el parametro drawable

Nota: Estos recursos se pueden crear para cualquier elemento


¿Como asignar el recurso?

Nos vamos a la etiqueta que queremos modificar en este caso <CheckBox>
Y le asignamos el siguiente parametro button con la ruta al recurso

	android:button="@drawable/NOMBRE DEL SELECTOR"

