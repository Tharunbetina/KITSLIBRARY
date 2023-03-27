package com.example.kitslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class LoginPage extends AppCompatActivity {

    TextInputLayout Usernameout, Passwordout;
    TextInputEditText Usernamein, Passwordin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login_page);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void tocredits (View view){
        Intent i = new Intent(LoginPage.this, CreditsPage.class);
        startActivity(i);
    }

    public void tocategories (View view){

        Usernameout = (TextInputLayout)findViewById(R.id.Usernameout);
        Passwordout = (TextInputLayout)findViewById(R.id.Passwordout);
        Usernamein = (TextInputEditText)findViewById(R.id.Usernamein);
        Passwordin = (TextInputEditText)findViewById(R.id.Passwordin);

        String username = Usernamein.getText().toString().trim();
        String password = Passwordin.getText().toString().trim();

        if (username.equals("KITS")&&password.equals("kits123")) {

            Intent i = new Intent(LoginPage.this, CategoriesPage.class);
            startActivity(i);
            finish();
        }
        else {
            Toast.makeText(this, "WRONG CREDENTIALS", Toast.LENGTH_SHORT).show();
        }
    }
}