package com.aztlandev.Bases;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ViewAnimator;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import com.aztlandev.abc.viewsFragments.Home;
import com.aztlandev.abc.viewsFragments.HomeDirections;

public abstract class BaseFragment extends Fragment {
boolean hasAdView = false;
/** Para evitar multiples clicks */
protected long mLastClickTime = 0;
public static NavController navController;

protected ViewAnimator animator;
protected View emptyContainer;


/**
 * Obtiene la barra de acciones principal
 * @return
 */




/*public void initViews(View rootView)
{
    emptyContainer = rootView.findViewById(R.id.emptyContainer);
    animator = (ViewAnimator)rootView.findViewById(R.id.animator);

}*/




public void showProgress() {
    if(animator != null) {
        getActivity().runOnUiThread(new Runnable() {

            @Override
            public void run() {
                animator.setDisplayedChild(2);
            }
        });
    }
}

protected boolean first = true;

public void setFirst() {
    if(first) {
        first = false;
    }
}
public void Navigate(View v, String title, String key) {
    NavDirections action = HomeDirections.actionHome2ToAbc().setValue("hola");
    Navigation.findNavController(v).navigate(action);
}
public void showMainContainer() {
    if(animator != null) {
        getActivity().runOnUiThread(new Runnable() {

            @Override
            public void run() {
                animator.setDisplayedChild(0);
            }
        });
    }
}
public abstract void setup(View rootView, Bundle savedInstanceState);

}
