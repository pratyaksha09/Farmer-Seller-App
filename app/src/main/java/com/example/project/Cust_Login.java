package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cust_Login extends AppCompatActivity implements View.OnClickListener {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView Info;
    private int counter=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cust__login);
        Name = (EditText) findViewById(R.id.usr);
        Password = (EditText) findViewById(R.id.pwd);
        Login = (Button) findViewById(R.id.login);
        Info = (TextView) findViewById(R.id.info);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });
    }

    private void validate(String username, String password)
    {
        if( (username.equals("a") && password.equals("z")) || (username.equals("b") && password.equals("y")))
        {
            Intent intent= new Intent(Cust_Login.this,UsrInterface.class );
            startActivity(intent);
        }
        else
        {
            counter--;

            if (counter==0)
            {
                Login.setEnabled(false);
            }
        }
    }
}
