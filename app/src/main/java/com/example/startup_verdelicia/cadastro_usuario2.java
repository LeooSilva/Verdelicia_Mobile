package com.example.startup_verdelicia;
import android.content.Intent; // Importa a classe Intent
import android.os.Bundle; // Importa a classe Bundle
import android.view.View; // Importa a classe View
import android.widget.Button; // Importa a classe Button
import androidx.appcompat.app.AppCompatActivity; // Importa AppCompatActivity

public class cadastro_usuario2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario2); // Define o layout da atividade

        Button buttonNovoNome = findViewById(R.id.btn_proximo); // Altere para o ID do seu botão
        buttonNovoNome.setOnClickListener(new View.OnClickListener() { // Define o ouvinte de clique
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cadastro_usuario2.this, termos_autorizacao_usuario.class); // Altere para o nome da sua nova atividade
                startActivity(intent); // Inicia a nova atividade
            }
        });
    }
}
