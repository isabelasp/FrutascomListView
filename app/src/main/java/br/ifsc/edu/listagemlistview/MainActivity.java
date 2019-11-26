package br.ifsc.edu.listagemlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        Frutas frutas = new Frutas();

        FrutaAdapter adapter = new FrutaAdapter(getApplicationContext(),
                                   R.layout.templatelistagemfruta,
                                   frutas.FRUTAS);


        /*String[] arrayCidades = {"Gaspar","Blumenau", "Indaial",
                                 "Florianopolis", "Timbo", "Jaragua do Sul", "Penha"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                                                                android.R.layout.simple_list_item_1,
                                                                android.R.id.text1,
                                                                arrayCidades);*/

        listView.setAdapter(adapter);
    }
}
