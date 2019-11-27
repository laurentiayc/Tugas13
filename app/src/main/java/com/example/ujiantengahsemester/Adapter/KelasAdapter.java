package com.example.ujiantengahsemester.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ujiantengahsemester.MainActivity;
import com.example.ujiantengahsemester.Model.Kelas;
import com.example.ujiantengahsemester.R;

import java.util.ArrayList;

public class KelasAdapter extends RecyclerView.Adapter<KelasAdapter.ViewHolder> {
    private ArrayList<Kelas> dataList;
    private Context context;
    public KelasAdapter (ArrayList<Kelas> dataList){
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view_kelas,parent,false); //
        context = parent.getContext();
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.txtKodeMk.setText(dataList.get(position).getKodeKelas());
        holder.txtNamaMk.setText(dataList.get(position).getNamaKelas());
        holder.txtHari.setText(dataList.get(position).getHariKelas());
        holder.txtSesi.setText(dataList.get(position).getSksKelas());
        holder.txtJmlMhs.setText(dataList.get(position).getJumlahMhsKelas());
        holder.txtNamaDosen.setText(dataList.get(position).getDosenKelas());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(context != null){
                    Intent intent = new Intent(context, MainActivity.class);
                    context.startActivity(intent);}
            }
        });
    }

    @Override
    public int getItemCount() { //berguna untuk menghitung jumlah data yang ada
        return (dataList != null)? dataList.size() : 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtKodeMk, txtNamaMk, txtHari, txtSesi, txtNamaDosen, txtJmlMhs;
        private CardView cv;

        public ViewHolder(View view){
            super(view);
            txtKodeMk = view.findViewById(R.id.txtKodeKelas);
            txtNamaMk = view.findViewById(R.id.txtNamaKelas);
            txtHari = view.findViewById(R.id.txtHariKelas);
            txtSesi = view.findViewById(R.id.txtSesiKelas);
            txtNamaDosen = view.findViewById(R.id.txtDosenKelas);
            txtJmlMhs = view.findViewById(R.id.txtJumlahMhsKrs);
            cv = view.findViewById(R.id.cvKelas);
        }
    }
}
