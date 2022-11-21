package com.android1.hwmonth34;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Objects;


public class Eurasia extends Fragment {

    public RecyclerView rv_contacts;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        {
//
//            rv_contacts = rv_contacts.findViewById(R.id.recycler_view);
//            ArrayList<Contact> contactsList = new ArrayList<>();
//            contactsList.add(new Contact("Тима", "0777889909", R.drawable.china));
//
//            contactsAdapter adapter = new contactsAdapter(contactsList);
//
//            rv_contacts.setAdapter(adapter);
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_eurasia, container, false);
    }
}