package com.aztlandev.abc.viewsFragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aztlandev.Bases.BaseFragment;
import com.aztlandev.abc.R;

public class Abc extends BaseFragment {

    public Abc() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_abc, container, false);
    }

    @Override
    public void setup(View rootView, Bundle savedInstanceState) {

    }
}
