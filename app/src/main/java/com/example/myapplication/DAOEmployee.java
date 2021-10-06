package com.example.myapplication;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DAOEmployee {
    private DatabaseReference databaseReference;
    public DAOEmployee(){
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        databaseReference = db.getReference(PersonalInfo.class.getSimpleName());
    }
    public Task<Void> add(PersonalInfo emp){

       return databaseReference.push().setValue(emp);
    }
}
