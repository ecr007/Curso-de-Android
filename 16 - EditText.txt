

PAra crear un nuevo tema para ser aplicado en todos los EditText, nos vamos a style como siempre

Nota: El theme debe ser aplicado a Al EditTextLayout que cubre el editText


1 - Cremos una etiqueta <style> con parent = "TextApparence.AppCompat"

*** Opciones para aplicar colores y tamaño de fuente

	- name="android:textColorHint"  // Es el color del hint
	- android:textSize   // La medicion es sp || Puede ser en dp pero es recomendable la primera para texto
	- android:textColorPrimary  // Color primario antes de hacer clic
	- colorAccent   // Mas color del input
	- colorControlNormal  // Mas color del input
	- colorControlActivated // Mas color para el input cuando se esta escribiendo