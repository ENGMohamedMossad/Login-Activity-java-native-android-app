package com.example.loginwithgallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button login;
    private EditText user;
    private EditText password;

    String userr = "admin";
    String id = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.pass);
        login = (Button) findViewById(R.id.button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(user.getText().toString()) || TextUtils.isEmpty(password.getText().toString())) {
                    Toast.makeText(MainActivity.this, "Empty bars are found!!", Toast.LENGTH_SHORT).show();
                } else if ((user.getText().toString().equals(userr)) && (password.getText().toString().equals(id))) {
                    Intent intent = new Intent(MainActivity.this, Gallery.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Wrong password or Username, Try Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
    /*private void validate (String userr , String id){
        if ((userr == "admin") && (id == "1234")){
            Intent intent = new Intent(MainActivity.this,Gallery.class);
            startActivity(intent);
        }else if ((userr != "admin") && (id != "1234")){
            Toast.makeText(MainActivity.this,"Wrong Password, Try Again",Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this,"Username And Password Is Empty",Toast.LENGTH_SHORT).show();
        }
    }*/
}