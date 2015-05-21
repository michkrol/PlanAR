package com.example.michal.myapplication.fragment;

import android.support.v4.app.Fragment;

import com.example.michal.myapplication.R;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;

/**
 * Created by Mariusz on 2015-05-21.
 */

    @EFragment(R.layout.fragment_home)
    public class HomeFragment extends Fragment {

        @AfterViews

        void init() {

            getActivity().setTitle(R.string.title_home);

        }

    }

