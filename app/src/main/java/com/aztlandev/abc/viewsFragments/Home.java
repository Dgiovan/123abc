package com.aztlandev.abc.viewsFragments;

import android.os.Bundle;

import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.aztlandev.Bases.BaseFragment;
import com.aztlandev.Utils.Constants;
import com.aztlandev.abc.R;
import com.aztlandev.frameworks.Datacharacters;


public class Home extends BaseFragment {

public Home() {
    // Required empty public constructor
}
View rootView;
Button asdak;
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    rootView = inflater.inflate(R.layout.fragment_home, container, false);
    asdak = rootView.findViewById(R.id.examplebuton);
    Log.e("haberpares", Datacharacters.getPairs(Constants.Abecedario,7).toString());
    asdak.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Navigate(rootView,"dcknsldk","nckls");
        }
    });
    return rootView;
}


@Override
public void setup(View rootView, Bundle savedInstanceState) {

}
}
