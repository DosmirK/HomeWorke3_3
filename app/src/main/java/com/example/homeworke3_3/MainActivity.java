package com.example.homeworke3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvContact;
    private ArrayList<String> contactList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        loadData();
        ContactAdapter adapter = new ContactAdapter(contactList);
        rvContact.setAdapter(adapter);
    }

    private void loadData() {
        contactList.add("Dastan");
        contactList.add("Amir");
        contactList.add("Nurtilek");
        contactList.add("Kamila");
        contactList.add("Beka");
        contactList.add("Dilnaz");
        contactList.add("Ademi");
        contactList.add("Malika");
        contactList.add("Nurbek");
        contactList.add("Aigerim");
        contactList.add("Sanjar");
        contactList.add("Nurlan");
        contactList.add("Anara");
        contactList.add("Aibek");
        contactList.add("Ahmed");
        contactList.add("Madina");
        contactList.add("Ayana");
        contactList.add("Nadira");
        contactList.add("Sabina");
        contactList.add("Sezim");

    }

    private void initView() {
        rvContact = findViewById(R.id.rv_contact);
    }
}