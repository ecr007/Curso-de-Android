
Los intents me permiten moverme de una pantalla a otra. Y pasar informacion.

Eje:

	Intent obj = new Intent(this,ActivitiDondeQuieroIr.class)
	startActivity(obj)

	Ya con esto se ejecuta el pase a la siguiente actividad.

	REAL
	```
	Intent obj = new Intent(this,RegistroActivity.class);
    startActivity(obj);
	```

ADVERTENCIA: Recuerda que la clase es Intent !!!!