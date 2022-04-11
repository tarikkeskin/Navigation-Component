package com.example.navigationdeneme;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationdeneme.databinding.FragmentABinding;

public class AFragment extends Fragment {

    private FragmentABinding tasarim;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        tasarim =  FragmentABinding.inflate(inflater, container, false);

        tasarim.buttonB.setOnClickListener(view -> {

            Navigation.findNavController(view).navigate(R.id.A_to_B);
        });
        return tasarim.getRoot();
    }
}