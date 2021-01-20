package com.example.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {
    Button btnRegister;
    EditText edtFname,edtLname,edtEmail,edtPassword;
    Spinner spinner;
    RadioGroup radioGroup;
    RadioButton rdobtn;
    CheckBox checkBox;
    Switch aSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Register here");

        btnRegister = findViewById(R.id.btnRegister);
        edtFname = findViewById(R.id.edtFname);
        edtLname = findViewById(R.id.edtLname);
        edtEmail = findViewById(R.id.edtEmail);
        edtPassword = findViewById(R.id.edtPassword);
        spinner = findViewById(R.id.spinner);
        radioGroup = findViewById(R.id.rdoGroup);
        checkBox = findViewById(R.id.checkBox);
        aSwitch = findViewById(R.id.switchOn);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = edtFname.getText().toString();
                String lname = edtLname.getText().toString();
                String email = edtEmail.getText().toString();
                String password = edtPassword.getText().toString();
                String spi = spinner.getSelectedItem().toString();

                int id = radioGroup.getCheckedRadioButtonId();
                rdobtn = findViewById(id);
                String tdo = rdobtn.getText().toString();

                String chk = "";

                if (checkBox.isChecked())
                {
                    chk = "Active";
                }
                else
                {
                    chk="Inactive";
                }

                String sw = "";

                if(aSwitch.isChecked())
                {
                    sw = aSwitch.getText().toString();
                }
                else
                {
                    sw = aSwitch.getText().toString();
                }

                Intent intent = new Intent(MainActivity.this, Welcome.class);
                intent.putExtra("firstname",fname);
                intent.putExtra("lastname",lname);
                intent.putExtra("email",email);
                intent.putExtra("password",password);
                intent.putExtra("spinner",spi);
                intent.putExtra("rdogender",tdo);
                intent.putExtra("check",chk);
                intent.putExtra("switch",sw);
                 startActivity(intent);

            }
        });

    }
}