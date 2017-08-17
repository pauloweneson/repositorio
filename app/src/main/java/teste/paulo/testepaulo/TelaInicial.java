package teste.paulo.testepaulo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
        Button x = (Button) findViewById(R.id.btnCadastrar1);
        x.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent it = new Intent(TelaInicial.this, MainActivity.class);
                startActivity(it);
            }
        });

    }
    public void voltar (View v){
        finish();
    }
}
