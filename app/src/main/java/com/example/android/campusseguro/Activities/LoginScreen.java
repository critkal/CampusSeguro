package com.example.android.campusseguro.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.campusseguro.R;

import org.w3c.dom.Text;

public class LoginScreen extends AppCompatActivity {

    private EditText user;
    private EditText password;
    private Button login;
    private TextView message;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        user = (EditText)findViewById(R.id.etUser);
        password = (EditText)findViewById(R.id.etPassword);
        login =(Button)findViewById(R.id.btLogin);
        message = (TextView)findViewById(R.id.tvMessage);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(user.getText().toString(), password.getText().toString());
            }
        });

    }

    protected void validate(String username, String pass)
    {
        if (username.equals(pass)&&username.length()>0)
        {
            Intent intent = new Intent(LoginScreen.this, MenuActivity.class);
            startActivity(intent);
        }
        else
            message.setText("Usuario e senha incorretos");
    }
}
