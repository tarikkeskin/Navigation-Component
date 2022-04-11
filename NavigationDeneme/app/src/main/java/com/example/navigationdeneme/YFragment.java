package com.example.navigationdeneme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdeneme.databinding.FragmentYBinding;


public class YFragment extends Fragment {

    private FragmentYBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        tasarim = FragmentYBinding.inflate(inflater, container, false);

        tasarim.buttonGeri.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.Y_to_Anasayfa);
        });
        return tasarim.getRoot();
    }
}