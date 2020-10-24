package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText edt_email,edt_password;
    String email = "admin@mail.com",password = "admin123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar() != null){
            getSupportActionBar().hide();
        }

        edt_email = findViewById(R.id.edt_loginMail);
        edt_password = findViewById(R.id.edt_loginPassword);
    }
    public void goHome(View view){
        String getEmail = edt_email.getText().toString();
        String getPassword = edt_password.getText().toString();

        if (email.equals(getEmail) && password.equals(getPassword)){
            Intent intent = new Intent(this,home.class);
            startActivity(intent);
        }else {
            Toast.makeText(this,"Crendenciales Erroneas",Toast.LENGTH_LONG).show();
        }
    }
    public void mainRegistro(View view){
        Intent intn = new Intent(this,registro.class);
        startActivity(intn);
    }
}