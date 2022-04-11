package com.example.navigationdeneme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdeneme.databinding.FragmentAnasayfaBinding;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false);

        tasarim.buttonA.setOnClickListener(view -> {

            Navigation.findNavController(view).navigate(R.id.anaSayfa_to_A);
        });

        tasarim.buttonX.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.anasayfa_to_X);
        });

        return tasarim.getRoot();
    }
}