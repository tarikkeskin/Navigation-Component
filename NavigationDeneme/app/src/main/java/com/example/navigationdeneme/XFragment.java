package com.example.navigationdeneme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdeneme.databinding.FragmentXBinding;


public class XFragment extends Fragment {


    private FragmentXBinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        tasarim = FragmentXBinding.inflate(inflater, container, false);

        tasarim.buttonXY.setOnClickListener(view -> {
            Navigation.findNavController(view).navigate(R.id.X_to_Y);
        });

        return tasarim.getRoot();
    }
}