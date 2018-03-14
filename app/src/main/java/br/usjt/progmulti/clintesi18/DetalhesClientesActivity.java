package br.usjt.progmulti.clintesi18;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/*
 author 816114287 Ana Paula Silva de Macedo SIN3AN MCA1
*/

public class DetalhesClientesActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_clientes);
        TextView nomeSelecionado=(TextView)findViewById(R.id.nome_selecionado);
        Intent intent = getIntent();
        nomeSelecionado.setText(intent.getStringExtra(ListaClientesActivity.NOME));
    }
}
