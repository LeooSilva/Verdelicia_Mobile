package com.example.startup_verdelicia;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity { // Corrigido o nome da classe

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Certifique-se de que 'activity_login' é o nome correto do layout
    }
}
