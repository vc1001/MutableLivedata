package com.example.mutablelivedata;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class ViewModel extends androidx.lifecycle.ViewModel {

    private MutableLiveData<Integer> counter = new MutableLiveData<>();

    public void increasecounter(View view){

        //Retrieve current value from live data
        int currentvalue = counter.getValue() != null ? counter.getValue() : 0 ;

        //Increase value by 1
        counter.setValue(currentvalue+1);
    }

    public LiveData<Integer> getCounter(){ return counter;
    }

}
