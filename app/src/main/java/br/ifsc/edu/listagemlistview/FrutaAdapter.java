package br.ifsc.edu.listagemlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.text.DecimalFormat;
import java.text.NumberFormat;

class FrutaAdapter  extends ArrayAdapter {
    Context mContext;
    int mResource;

    public FrutaAdapter(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent, false);

        TextView tvCodigo = convertView.findViewById(R.id.text1);
        TextView tvNome = convertView.findViewById(R.id.text2);
        TextView tvPreco = convertView.findViewById(R.id.preco);
        TextView tvPrecoVenda = convertView.findViewById(R.id.preco_venda);
        ImageView imageView = convertView.findViewById(R.id.imageView);



        Fruta fruta = (Fruta) getItem(position);

        NumberFormat numberFormat = new DecimalFormat("#,###.00");
        tvCodigo.setText(Integer.toString(fruta.getCodigo()));
        tvNome.setText(fruta.getNome());
        tvPreco.setText(numberFormat.format(fruta.getPreco()));
        tvPrecoVenda.setText(numberFormat.format(fruta.getPreco_venda()));
        imageView.setImageResource(fruta.getImagem());

        return convertView;
    }
}
