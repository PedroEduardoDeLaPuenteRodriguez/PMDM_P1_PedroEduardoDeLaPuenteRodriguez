package es.medac.pedroeduardodelapuenterodriguez.aguadiaria;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvSaludo = findViewById(R.id.tv_saludo);
        TextView tvProgreso = findViewById(R.id.tv_progreso);

        tvSaludo.setText(getString(R.string.saludo, getString(R.string.nombre_ejemplo)));
        tvProgreso.setText(getString(R.string.progreso, 3, 8));
    }
}