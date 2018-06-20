
Los recyclerView son contenedores inteligentes de informacion y estan super optimizados.
Se les pasa la informacion mediante un adaptador.

********* Pasos para crear un RecyclerView **********

1 - Modelamos la estructura de nuestro contenido.

	Por ejemplo: Si tenemos un template de un CardView, con un titulo, imagen, y textos

	Cremos sus respectivas propiedades, un constructor para incializar los datos
	y sus respectivos get

2 - Creamos el adaptador que recibira la instancia de del RecyclerView de nuestra vista

# Explicacion de la clase del adaptador

1 - Creamos la clase del adaptador

2 - Creamos su Inner Class, que estara dentro de esta y heredara (extends) de (RecyclerView.ViewHolder)
	Este representara un objeto del modelo por lo que debe de tener iguales propiedades.

	a) Creamos su respectivo constructor, con un View como parametro que representa el CardView o lo que sea

	b) llamamos al constructor de la clase padre y le pasamos el view (super(paramView))

	c) le asignamos sus respectivos objetos a las propiedades buscandolos en la vista en cuestion.

3 - Creamos las propiedades del adaptador que representaran el listado del modelo, el recurso que representa el view (CardView)
y el Activity que representa el contenedor.

	a) Creamos el constructur del adaptador que recibira los 3 parametros para llenar estas propiedades.


4 - Hacemos que el adaptador herede de RecyclerView.Adapter<> que representa un listado de objetos, de la clase Inner (El holder)
	El IDE comenzara a gritar que para que esto sea posible se necesitan sobrescribir ciertos metodos de la clase que
	se esta heredando (RecyclerView.Adapter) 

	Dichos metodos son los siguentes:

	a) NombreDeLaCaseHolderOInner onCreateViewHolder(ViewGroup parent, int viewType) aca se infla el la representacion del card (el recurso)
	se asigna a un View y se retorna un objeto de la clase Holder con view como parametro del constructor.

	b) public void onBindViewHolder(ClaseInnerDelHolder holder, int position) este metodo se ejecuta las veces que diga el getItemCount
	osea la cantidad de posiciones que tenga mi ArrayList<> del modelo. mediante el parametro position se acsede a la posicion
	de la lista y se le asignan a las propiedades del Holder que es el primer parametro

	c) public int getItemCount() esta le indica al binder todas las veces que se tiene que ejecutar retona el size del listado de modelo



# Ejemplo de implementacion del Adaptador

	```
	public class PictureAdapterRecyclerView extends RecyclerView.Adapter<PictureAdapterRecyclerView.PictureViewHolder> {

	    private ArrayList<Picture> pictures;
	    private int resource;
	    private Activity activity;

	    public PictureAdapterRecyclerView(ArrayList<Picture> pictures, int resource, Activity activity) {
	        this.pictures = pictures;
	        this.resource = resource;
	        this.activity = activity;
	    }

	    @Override
	    public PictureViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
	        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
	        return new PictureViewHolder(view);
	    }

	    @Override
	    public void onBindViewHolder(PictureViewHolder holder, int position) {
	        Picture picture = pictures.get(position);
	        holder.usernameCard.setText(picture.getUserName());
	        holder.timeCard.setText(picture.getTime());
	        holder.likeNumberCard.setText(picture.getLike_number());
	        Picasso.with(activity).load(picture.getPicture()).into(holder.pictureCard);

	        holder.pictureCard.setOnClickListener(new View.OnClickListener() {
	            @Override
	            public void onClick(View view) {
	                Intent intent = new Intent(activity, PictureDetailActivity.class);

	                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
	                    Explode explode = new Explode();
	                    explode.setDuration(1000);
	                    activity.getWindow().setExitTransition(explode);
	                    activity.startActivity(intent,
	                            ActivityOptionsCompat.makeSceneTransitionAnimation(activity, view, activity.getString(R.string.transitionname_picture)).toBundle());

	                }else {
	                    activity.startActivity(intent);
	                }


	            }
	        });

	    }

	    @Override
	    public int getItemCount() {
	        return pictures.size();
	    }

	    public class PictureViewHolder extends RecyclerView.ViewHolder{

	        private ImageView pictureCard;
	        private TextView usernameCard;
	        private TextView timeCard;
	        private TextView likeNumberCard;


	        public PictureViewHolder(View itemView) {
	            super(itemView);

	            pictureCard     = (ImageView) itemView.findViewById(R.id.pictureCard);
	            usernameCard    = (TextView) itemView.findViewById(R.id.userNameCard);
	            timeCard        = (TextView) itemView.findViewById(R.id.timeCard);
	            likeNumberCard  = (TextView) itemView.findViewById(R.id.likeNumberCard);

	        }
	    }
	}
	```



# Que hacer en el fragment o en el activity para pasarle la informacion a nuestro RecyclerView

	// Tomamos como ejemplo un fragment
	
	1 - Lo que retorna el fragment en su metodo onCreate es un View, por ello lo asiganaremos a un objeto de de la clase View

	2 - Instaciamos la clase RecyclerView y buscamos el elemento en la vista y se lo asignamos (view.findViewById) con el objeto del View

	3 - Declaramos un LinearLayoutManager para setearselo al manejador del RecyclerView

	LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
    linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // Si lo definimos Horizontal hace un carrusel horizontal

    4 - Le asignamos el manejador a nuestro RecyclerView que en este caso es el LinearLayout

    OBJETO RECYCLER DE LA VISTA.setLayoutManager(linearLayoutManager);

    5 - Instanciamos nuestro adaptador y le pasamos los parametros requeridos al constructor de este

    6 - Al objeto del Recycler de la vista le setiamos el adaptador.

    OBJETO RECYCLER DE LA VISTA.setAdapter(pictureAdapterRecyclerView);

    7 - Retornamos la vista inflada !!!

    	return vista Objeto View



# Ejemplo del codigo en cuestion

```

public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        
        showToolbar(getResources().getString(R.string.tab_home), false, view);
        
        RecyclerView picturesRecycler = (RecyclerView) view.findViewById(R.id.pictureRecycler);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        picturesRecycler.setLayoutManager(linearLayoutManager);

        PictureAdapterRecyclerView pictureAdapterRecyclerView =
                new PictureAdapterRecyclerView(buidPictures(), R.layout.cardview_picture, getActivity()); 
                // Cabe destacar que el segundo parametro hace referencia al nombre del archivo del recurso no al id

        picturesRecycler.setAdapter(pictureAdapterRecyclerView);


        return view;
    }

    public ArrayList<Picture> buidPictures(){
        ArrayList<Picture> pictures = new ArrayList<>();
        pictures.add(new Picture("http://www.novalandtours.com/images/guide/guilin.jpg", "Uriel Ramírez", "4 días", "3 Me Gusta"));
        pictures.add(new Picture("http://www.enjoyart.com/library/landscapes/tuscanlandscapes/large/Tuscan-Bridge--by-Art-Fronckowiak-.jpg", "Juan Pablo", "3 días", "10 Me Gusta"));
        pictures.add(new Picture("http://www.educationquizzes.com/library/KS3-Geography/river-1-1.jpg", "Anahi Salgado", "2 días", "9 Me Gusta"));
        return pictures;
    }

    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}

```

