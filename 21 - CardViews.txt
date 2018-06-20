
CardView: Es simplemente un contenedor de widgets, se le pueden agregar sombas y bordes redondeados, etc.

RecyclerView: Viene como sustituto de las listas de contenidos y se usan mucho con los CardView

FloatingActionButton: Es el boton flotante que tenemos en la parte inferior derecha (Es un estandard)

-------------------------------------------------------------------------------------------------------

Para poder utilizar los CardView o cualquier otra libreria parecida se debe incluir este
paquete en el gradle. Ver URL de paquetes en los marcadores.

1 - Se crea un layout solamente para el cardView, tal como haciamos con las celdas en IOS

2 - Se le coloca sus nombres de espacio al cardView y un identificador ya que sera reutilizable

3 - Se le debe asigar su ancho y alto fijo en DP y un cardCornerRadios si se desea

Ver todas las opciones aqui: https://developer.android.com/reference/android/support/v7/widget/CardView.html


-----------------------------------------------------------------------------------------------------------


*** FrameLayout

	Coloca todos sus hijos uno arriba de otro; Por ejemplo si el CardView tiene una imagen
	La imagen sera la primera seguida de los otros elementos.

	

Nota Importante : A la imgen se le debe colocar el alto del cardView y cropCental
y el acho del padre.

Ej:

```
<ImageView
            android:id="@+id/ecrImageCard"
            android:layout_width="match_parent"
            android:layout_height="200dp"
            android:contentDescription="@string/testcardview"
            app:srcCompat="@drawable/banner_img1"
            android:scaleType="centerCrop" />

```