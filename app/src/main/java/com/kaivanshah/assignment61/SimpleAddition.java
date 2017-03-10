package com.kaivanshah.assignment61;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class SimpleAddition extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

    Button btn_Submit;
    EditText Edit_Input;
    TextView tv_Output;

    public SimpleAddition() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View oView = inflater.inflate(R.layout.fragment_simple_addition, container, false);
        btn_Submit = (Button)(oView.findViewById(R.id.btn_Submit));
        Edit_Input = (EditText) (oView.findViewById(R.id.Edit_Input));
        tv_Output = (TextView) (oView.findViewById(R.id.tv_Output));
        btn_Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_Output.setText(Edit_Input.getText());
            }
        });
        return oView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

}
