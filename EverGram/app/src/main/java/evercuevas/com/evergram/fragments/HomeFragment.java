package evercuevas.com.evergram.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import evercuevas.com.evergram.R;
import evercuevas.com.evergram.adapters.EcrCardViewAdapter;
import evercuevas.com.evergram.model.EcrCardView;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View ecrVista = inflater.inflate(R.layout.fragment_home, container, false);

        showToolbar(getResources().getString(R.string.tab_home), false, ecrVista);

        RecyclerView obj = ecrVista.findViewById(R.id.ecrRecyclerView);

        LinearLayoutManager objLinear = new LinearLayoutManager(getContext());
        objLinear.setOrientation(LinearLayoutManager.VERTICAL);

        obj.setLayoutManager(objLinear);

        EcrCardViewAdapter objAdapter = new EcrCardViewAdapter(defineCard(),R.layout.cardview,getActivity());

        // Setiamos el adaptador
        obj.setAdapter(objAdapter);

        return ecrVista;
    }

    private ArrayList<EcrCardView> defineCard(){
        ArrayList<EcrCardView> obj = new ArrayList<>();

        obj.add(new EcrCardView("http://www.novalandtours.com/images/guide/guilin.jpg", "Ever Cuevas", "Hace 2 dias", "80 Me gustas"));
        obj.add(new EcrCardView("http://www.enjoyart.com/library/landscapes/tuscanlandscapes/large/Tuscan-Bridge--by-Art-Fronckowiak-.jpg", "Juan Cuevas", "Hace 2 dias", "80 Me gustas"));
        obj.add(new EcrCardView("http://www.novalandtours.com/images/guide/guilin.jpg", "Bolivar Cuevas", "Hace 2 dias", "80 Me gustas"));
        obj.add(new EcrCardView("http://www.enjoyart.com/library/landscapes/tuscanlandscapes/large/Tuscan-Bridge--by-Art-Fronckowiak-.jpg", "Rodrigo Cuevas", "Hace 2 dias", "80 Me gustas"));

        return obj;
    }

    public void showToolbar(String tittle, boolean upButton, View view){
        Toolbar toolbar = view.findViewById(R.id.ecrToolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);
        if( ((AppCompatActivity) getActivity()).getSupportActionBar() != null) ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle(tittle);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
    }

}
