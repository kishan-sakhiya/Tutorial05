package com.example.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
    TextView txtFname,txtLname,txtEmail,txtPassword,txtspinner,txtrdo,txtCheck,txtSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().setTitle("Welcome");

        txtFname = findViewById(R.id.txtFname);
        txtLname = findViewById(R.id.txtLname);
        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        txtspinner = findViewById(R.id.txtspinner);
        txtrdo = findViewById(R.id.txtrdo);
        txtCheck = findViewById(R.id.txtCheck);
        txtSwitch = findViewById(R.id.txtSwitch);

        Bundle bundle = getIntent().getExtras();
        String fname = bundle.getString("firstname");
        String lname = bundle.getString("lastname");
        String email = bundle.getString("email");
        String password = bundle.getString("password");
        String spinner = bundle.getString("spinner");
        String rd = bundle.getString("rdogender");
        String ck = bundle.getString("check");
        String swich = bundle.getString("switch");

        txtFname.setText("First Name : "+fname);
        txtLname.setText("Last Name : "+lname);
        txtEmail.setText("Username : "+email);
        txtPassword.setText("Password : "+password);
        txtspinner.setText("Select is "+ spinner);
        txtrdo.setText("Gender is "+rd);
        txtCheck.setText("Gender is "+ck);
        txtSwitch.setText("Branch is "+swich);


    }
}