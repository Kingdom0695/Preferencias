package gatodedany.example.omen.preferencias;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class registroActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Button btn = (Button) findViewById(R.id.btn_reg);

        EditText usuario = (EditText) findViewById(R.id.usuario_reg);
        EditText contrasena = (EditText) findViewById(R.id.contrasena_reg);

        PrincipalActivity registro_com = new PrincipalActivity();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent objeto2 = new Intent(registroActivity.this,PrincipalActivity.class);
                startActivity(objeto2);

                guardarPreferencias();
            }
        });
        cargarPreferencias();
    }

    private void guardarPreferencias() {
        SharedPreferences preferences = getSharedPreferences("usuarios", Context.MODE_PRIVATE);
        String user = usuario.getText().toString();
        String contra = contrasena.getText().toString();
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("Usuario: ", user);
        editor.putString("Contrasena: ", contra);
        editor.commit();
    }

    private void cargarPreferencias() {
        SharedPreferences preferences = getSharedPreferences("usuarios", Context.MODE_PRIVATE);
        String user = preferences.getString("Usuario", "No existe la informacion");
        String contra = preferences.getString("Contrasena", "No existe la informacion");
    }

}
