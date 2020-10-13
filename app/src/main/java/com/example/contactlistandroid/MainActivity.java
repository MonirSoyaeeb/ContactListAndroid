package com.example.contactlistandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.os.Bundle;
import android.util.Log;

import com.example.contactlistandroid.data.DatabaseController;
import com.example.contactlistandroid.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseController db = new DatabaseController(MainActivity.this);

       // Log.d("Counter", "onCreate: "+db.getCount());

//        Contact jack = new Contact();
//
//        jack.setName("Jack");
//        jack.setPhoneNumber("123456");
//
//        db.addContact(jack);

//        Contact c = db.getContact(1);
//
//        c.setName("New Jerrymy");
//        c.setPhoneNumber("789456");
//
//        int updatedConcat = db.updateContact(c);
//
//        Log.d("UpdateC", "onCreate: "+updatedConcat);

//        db.deleteContact(c);


        List<Contact> contactList = db.getAllContact();

        for(Contact contact: contactList)
        {
            Log.d("Main", "onCreate: "+contact.getName());
            //Log.d("Main", "onCreate: "+contact.getPhoneNumber());
        }




    }
}