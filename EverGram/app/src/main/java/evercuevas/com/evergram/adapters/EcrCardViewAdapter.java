package evercuevas.com.evergram.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import evercuevas.com.evergram.DetalleActivity;
import evercuevas.com.evergram.R;
import evercuevas.com.evergram.model.EcrCardView;

/**
 * Created by evercuevas on 12/8/17.
 */

public class EcrCardViewAdapter extends RecyclerView.Adapter<EcrCardViewAdapter.EcrCardViewHolder>{

    private ArrayList<EcrCardView> objCard = new ArrayList<>();
    private int recurso;
    private Activity actvidad;

    public EcrCardViewAdapter(ArrayList<EcrCardView> objCard, int recurso, Activity actvidad) {
        this.objCard = objCard;
        this.recurso = recurso;
        this.actvidad = actvidad;
    }

    @Override
    public EcrCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View objVista = LayoutInflater.from(parent.getContext())
                .inflate(this.recurso,parent,false);

        return new EcrCardViewHolder(objVista);
    }

    @Override
    public void onBindViewHolder(EcrCardViewHolder holder, int position) {
        EcrCardView objModel = this.objCard.get(position);

        holder.holderTitle.setText(objModel.getTitle());
        holder.holderFecha.setText(objModel.getFecha());
        holder.holderLikes.setText(objModel.getLikes());

        // Este es un servicio de descargar imagenes Online
        Picasso.with(this.actvidad).load(objModel.getImg()).into(holder.holderImg);

        holder.holderImg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View vista){
                Intent objIntent = new Intent(actvidad, DetalleActivity.class);
                actvidad.startActivity(objIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.objCard.size();
    }

    public class EcrCardViewHolder extends RecyclerView.ViewHolder {
        private ImageView holderImg;
        private TextView holderTitle;
        private TextView holderFecha;
        private TextView holderLikes;

        public EcrCardViewHolder(View vista) {
            super(vista);

            this.holderImg = vista.findViewById(R.id.ecrImageCard);
            this.holderTitle = vista.findViewById(R.id.ecrTitleCard);
            this.holderFecha = vista.findViewById(R.id.ecrCardFecha);
            this.holderLikes = vista.findViewById(R.id.ecrCardLike);
        }
    }
}
