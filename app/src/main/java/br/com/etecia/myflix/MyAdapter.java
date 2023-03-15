package br.com.etecia.myflix;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context mContexto;
    private List<Filmes> listaFilmes;

    public MyAdapter(Context mContexto, List<Filmes> listFilmes) {
        this.mContexto = mContexto;
        this.listaFilmes = listaFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    TextView idTituloFilmes;
    ImageView idImagemFilmes;
    CardView idCardFilmes;


    //criando a classe ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            idTituloFilmes = itemView.findViewById(R.id.idTituloFilmes);
            idImagemFilmes = itemView.findViewById(R.id.idImagemFilmes);
            idCardFilmes = itemView.findViewById(R.id.idCardFilmes);
        }
    }
}
