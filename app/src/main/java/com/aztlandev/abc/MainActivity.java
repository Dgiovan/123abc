package com.aztlandev.abc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;

import com.aztlandev.Utils.Constants;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

DrawerLayout drawerLayout;
private boolean mAdIsShowed = false;
private boolean mAdIsLoading = false;

NavController navController;
View searchable;
public Toolbar toolbar;
LinearLayout Splash;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Splash = findViewById(R.id.splash);
    drawerLayout = findViewById(R.id.drawerLayout);
    toolbar = findViewById(R.id.layoutToolBar);
    setSupportActionBar(toolbar);
    initview();
}

private void initview() {
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            Splash.setVisibility(View.GONE);
            drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED);
        }
    }, Constants.SPLASH_TIME);

    findViewById(R.id.imagemenu).setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    });
    NavigationView navigationView = findViewById(R.id.navigationView);
    navController = Navigation.findNavController(this,R.id.navHostFragment);
    NavigationUI.setupWithNavController(navigationView,navController);
}


public Toolbar getToolbar() {
    return toolbar;
}
public View getMView(){
    return searchable;
}

@Override
public void onBackPressed() {

    DrawerLayout mdrawe = findViewById(R.id.drawerLayout);
    if (mdrawe.isDrawerOpen(GravityCompat.START)){
        mdrawe.close();
    }else {
        super.onBackPressed();
    }
}

}
