package com.example.prueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registro extends AppCompatActivity {
    EditText edtNombre_registro,edtEmail_registro,edtContraseña_registro,
                edtContraseña2_registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        if (getSupportActionBar() != null){
            getSupportActionBar().hide();
        }
        edtNombre_registro = findViewById(R.id.edtNombre_registro);
        edtEmail_registro = findViewById(R.id.edtEmail_registro);
        edtContraseña_registro = findViewById(R.id.edtContraseña_registro);
        edtContraseña2_registro = findViewById(R.id.edtContraseña2_registro);
    }
    public void registroToHome(View view){
        String getNombre = edtNombre_registro.getText().toString();
        String getEmail = edtEmail_registro.getText().toString();
        String getContraseña = edtContraseña_registro.getText().toString();
        String getContraseña2 = edtContraseña2_registro.getText().toString();

        if(getNombre.equals("") && getEmail.equals("") && getContraseña.equals("") && getContraseña2.equals("")){
            Toast.makeText(this,"Formulario vacio",Toast.LENGTH_LONG).show();
            getCurrentFocus();
        }else if(getNombre.equals("")){
            Toast.makeText(this,"ingrese nombre",Toast.LENGTH_LONG).show();
        }else if(getEmail.equals("")){
            Toast.makeText(this,"Ingrese Email",Toast.LENGTH_LONG).show();
        }else if(getContraseña.equals("")){
            Toast.makeText(this,"Ingrese Contraseña",Toast.LENGTH_LONG).show();
        }else if(!getContraseña2.equals(getContraseña) || getContraseña2.equals("")){
            Toast.makeText(this,"Contraseña no son iguales",Toast.LENGTH_LONG).show();
        } else{
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
        }
    }
    public void goLogin(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}