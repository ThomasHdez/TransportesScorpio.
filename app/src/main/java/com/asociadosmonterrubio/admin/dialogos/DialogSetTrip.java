package com.asociadosmonterrubio.admin.dialogos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.asociadosmonterrubio.admin.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DialogSetTrip extends Fragment {


    public DialogSetTrip() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialog_set_trip, container, false);
    }

}
