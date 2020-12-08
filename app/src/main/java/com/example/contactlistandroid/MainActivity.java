package com.example.contactlistandroid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.example.contactlistandroid.adapter.RecyclerViewAdapter;
import com.example.contactlistandroid.data.DatabaseController;
import com.example.contactlistandroid.model.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recylerViewAdapter;
    private ArrayList<Contact> contactArrayList;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        Contact c = new Contact();
        c.setName("Babul");
        c.setPhoneNumber("668547");



        contactArrayList = new ArrayList<>();
        DatabaseController db = new DatabaseController(MainActivity.this);

       // db.addContact(c);


        List<Contact> contactList = db.getAllContact();

        for(Contact contact: contactList)
        {
            contactArrayList.add(contact);
        }



        // set Adapter

         recylerViewAdapter  = new RecyclerViewAdapter(MainActivity.this,contactArrayList);

         recyclerView.setAdapter(recylerViewAdapter);




    }
}