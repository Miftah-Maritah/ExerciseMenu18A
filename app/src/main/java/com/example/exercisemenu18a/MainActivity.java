package com.example.exercisemenu18a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edName,edPassword;
    Button btnSignIn;
    String username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edName = findViewById(R.id.usernamne);
        edPassword = findViewById(R.id.password);
        btnSignIn = findViewById(R.id.btn);

        btnSignIn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                username = edName.getText().toString();
                password = edPassword.getText().toString();

                if( username.equals("miftah") && password.equals("miftah99")){
                    Toast.makeText(getApplicationContext(), "Login Berhasil", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getApplicationContext(),"Password Salah", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
