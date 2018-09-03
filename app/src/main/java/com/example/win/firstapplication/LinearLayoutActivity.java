package com.example.win.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LinearLayoutActivity extends AppCompatActivity {
    EditText edtUserName,edtPassword;
    Button btnLogin,btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_linear_layout);

        edtUserName=(EditText)findViewById(R.id.edit_text_user_name);
        edtPassword=(EditText)findViewById(R.id.edit_text_password);
        btnLogin=(Button)findViewById(R.id.button_login);
        btnCancel=(Button)findViewById(R.id.button_cancel);

     btnLogin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String userName,password;
             userName=edtUserName.getText().toString();
             password =edtPassword.getText().toString();

             Toast.makeText(LinearLayoutActivity.this,userName+" "+ password,Toast.LENGTH_SHORT).show();

             Log.i("Result",userName+" "+ password);
         }
     });





    }
}
