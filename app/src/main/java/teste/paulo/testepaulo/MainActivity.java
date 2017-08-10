package teste.paulo.testepaulo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public interface Teste {
        public abstract void seila();
        public void test();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Teste y = new Teste(){
            @Override
            public void seila() {

            }

            @Override
            public void test() {

            }
        };
        Teste z = new Teste(){
            @Override
            public void seila() {

            }

            @Override
            public void test() {

            }
        };
        Button x = (Button) findViewById(R.id.btnCadastrar);
        x.setOnClickListener(new View.OnClickListener(){
            public void onCLick (View view){
                Intent it = new Intent(MainActivity.this, TelaInicial.class);
                startActivity(it);
            }
        });
    }

    public void executaEntrar(View parametro){
        Toast.makeText(this, "Texto de teste", Toast.LENGTH_LONG).show();
    }
}
