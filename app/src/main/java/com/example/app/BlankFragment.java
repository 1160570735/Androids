package com.example.app;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        Log.i(TAG, "onAttach: 已执行");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate: 已执行");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.i(TAG, "onCreateView:已执行 ");


        return inflater.inflate(R.layout.fragment_blank, container, false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.i(TAG, "onActivityCreated: 已执行");


    }

    @Override
    public void onStart() {
        super.onStart();

        Log.i(TAG, "onStart: 已执行");


    }

    @Override
    public void onResume() {
        super.onResume();

        Log.i(TAG, "onResume:已执行 ");


    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: 已执行");


    }

    @Override
    public void onStop() {
        super.onStop();

        Log.i(TAG, "onStop: 已执行");


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "onCreateView: 已执行");


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy:已执行 ");


    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "onDetach: 已执行");


    }
}