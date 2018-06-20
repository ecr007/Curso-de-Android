Este es en sentido general un Linear Layout en modo vertical

Nos permite manejar caracteristicas de material design en app bar 


Alto del App Bar Layout: Este siempre viene con 256dp osea se lo colocamos ever ever

Tema: ThemeOverlay.AppCompat.Dark.ActionBar Este es le tema que le colocamos


# <CollapsingToolbarLayout> 

	Es un wrapper para toolbar el cual implementa un efecto colapsable en toolbar y elementos hijos

	Es hijo directo del appBarLayout

# Estructura de un AppBarLayout

1 - Primero se coloca el AppBarLayout
	-tema
	- alto 256
	- ancho padre

2 - Despues va el collapsing
	- ancho padres
	- alto padre
	- layout_scrollFlags = scroll|exitUntilCollapsed|snap <-- Este ultimo es opcional
	- contentScrim = Color de fondo 

3 - Despues va cualquier contenido, en este caso una imagen
	ancho padre
	alto padre
	scaleType = centerCrop
	layout_collapsedMode = parallax   < -- Es el efecto que ara la imagen cuando colapse

4 - En ultimo lugar va el toolbar

	Sus valores que trae de ancho y alto se quedan igual
	theme = ThemeOverlay.AppCompat.Light
	layout_collapsedMode = pin

	Nota importante: Debemos quitarle el background ya que necesitamos que sea trasparente.

5 - Despues del AppBarLayout el contenido por recomendacion lo colocamos en un NestedScrollView !!!!!!