package com.qnszt.tpcqnszt;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.navigation.fragment.NavHostFragment;

import com.qnszt.tpcqnszt.models.Measurement;

public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.btn_startMeasurement).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Measurement measurement = new Measurement();
               // measurement.setName(((TextView)view.findViewById(R.id.txt_measurementName)).getText().toString());
/*                measurement.setDuration(((TextView)view.findViewById(R.id.txt_measurementDuration)).getText().toString());
                RadioButton selected = view.findViewById(((RadioGroup) view.findViewById(R.id.rdg_frequency)).getCheckedRadioButtonId());
                measurement.setDelay(selected.getText() == "50hz" ? 20 : 10); //TODO: Add more freq options
                MainActivity.measurement = measurement;
  */              //TODO: TCP.send(measurement.name);TCP.send(measurement.duration);TCP.send(measurement.delay);TCP.send(sys.time);
            }
        });

        view.findViewById(R.id.chk_testerLed).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: TCP.send("<LED1>");


            }
        });
    }



    
}