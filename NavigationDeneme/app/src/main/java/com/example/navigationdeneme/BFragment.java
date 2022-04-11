package com.example.navigationdeneme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdeneme.databinding.FragmentBBinding;


public class BFragment extends Fragment {

    private FragmentBBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tasarim = FragmentBBinding.inflate(inflater, container, false);

        tasarim.buttonY.setOnClickListener(view -> {

            Navigation.findNavController(view).navigate(R.id.B_to_Y);
        });
        return tasarim.getRoot();
    }
}