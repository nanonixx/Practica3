package com.company.practica3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.company.practica3.databinding.ActivityMainBinding;

public class MainActivity<ActivityDrawerBinding> extends AppCompatActivity {

        ActivityMainBinding binding;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView((binding = ActivityMainBinding.inflate(getLayoutInflater())).getRoot());

            setSupportActionBar(binding.toolbar);

            AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                    // Top-level destinations:
                    R.id.drawer1Fragment, R.id.drawer2Fragment
            )
                    .setOpenableLayout(binding.drawerLayout)
                    .build();

            NavController navController = ((NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).getNavController();
            NavigationUI.setupWithNavController(binding.navView, navController);
            NavigationUI.setupWithNavController(binding.toolbar, navController, appBarConfiguration);

        }
    }
