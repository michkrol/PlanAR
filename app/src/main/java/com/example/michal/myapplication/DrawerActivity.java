package com.example.michal.myapplication;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.example.michal.myapplication.NavigationDrawer.DrawerHandler;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.OptionsItem;

/**
 * Created by Mariusz on 2015-05-20.
 */
@EActivity(R.layout.activity_drawer)
public class DrawerActivity extends ActionBarActivity {

        public final String LOG_TAG = this.getClass().getSimpleName();

        @Bean
        DrawerHandler drawerHandler;

        @AfterViews
        void init() {
            drawerHandler.init();
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            return super.onCreateOptionsMenu(menu);
        }

        @Override
        protected void onPostCreate(Bundle savedInstanceState) {
            super.onPostCreate(savedInstanceState);
            // Sync the toggle state after onRestoreInstanceState has occurred.
            drawerHandler.getDrawerToggle().syncState();
        }

        @OptionsItem(android.R.id.home)
        public boolean drawerToggleSelected(MenuItem item) {
            return drawerHandler.drawerToggleSelected(item);
        }

        @Override
        public void setTitle(CharSequence title) {
            getSupportActionBar().setTitle(title);
        }

        @Override
        public void setTitle(int titleId) {
            getSupportActionBar().setTitle(titleId);
        }


    }
