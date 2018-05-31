package gatodedany.example.omen.preferencias;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Button btn1 = (Button) findViewById(R.id.btn1_reg);
        Button btn2 = (Button) findViewById(R.id.btn2_ini);

        registroActivity registro = new registroActivity();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objeto = new Intent(PrincipalActivity.this,registroActivity.class);

                Preferencias x = new Preferencias();
                objeto.putExtra("Ingreso de Usuario", x.getNombre());
                objeto.putExtra("Ingreso de Contraseña", x.getPassword());
                startActivity(objeto);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objeto2 = new Intent(PrincipalActivity.this,logueadoActivity.class);

                startActivity(objeto2);
            }
        });
    }
}
