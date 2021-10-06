package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name;
        final EditText city;
        final EditText birthday;
        final EditText age;
        final EditText gender;
        final EditText country;
        final EditText contact;
        final EditText email;
        final EditText ethnicity;
        final EditText course;

        Button submit;
        DAOEmployee dao = new DAOEmployee();

        name = findViewById(R.id.ptname);
        city = findViewById(R.id.ptcity);
        birthday = findViewById(R.id.ptBirthday);
        age = findViewById(R.id.ptAge);
        gender = findViewById(R.id.ptGender);
        country = findViewById(R.id.ptCountry);
        contact = findViewById(R.id.ptContact);
        email = findViewById(R.id.ptEmail);
        ethnicity = findViewById(R.id.ptEthnicity);
        course = findViewById(R.id.ptCourse);



        submit = findViewById(R.id.btnSubmit);

        submit.setOnClickListener(view -> {
               PersonalInfo emp = new PersonalInfo(name.getText().toString(), city.getText().toString(), birthday.getText().toString(),
                       age.getText().toString(), gender.getText().toString(), country.getText().toString(), contact.getText().toString(),
                       email.getText().toString(), ethnicity.getText().toString(), course.getText().toString());
               dao.add(emp).addOnSuccessListener(suc ->{
                   Toast.makeText(this, "Record is inserted", Toast.LENGTH_SHORT).show();
               }).addOnFailureListener(er ->{
                   Toast.makeText(this, ""+er.getMessage(), Toast.LENGTH_SHORT).show();
               });
        });
    }
}