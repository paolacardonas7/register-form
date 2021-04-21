package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRegisterBtnClick(View view){
        EditText edtTxtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtName = findViewById(R.id.txtName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        txtFirstName.setText(edtTxtFirstName.getText());
        txtName.setText(edtTxtName.getText());
        txtEmail.setText(edtTxtEmail.getText());
    }

}