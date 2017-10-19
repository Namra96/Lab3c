package com.example.namragill.lab3c;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TextFragment extends Fragment {

    TextView tvContent;
    Controller controller;
    TextView tvWhatToDo;
    static View view;

    public  Instruction [] instructions = new Instruction[3];
    public TextFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_blank, container, false);
        controller = new Controller();
        controller.initialiseContent(instructions);
        tvContent = (TextView) view.findViewById(R.id.content);
        tvWhatToDo = (TextView) view.findViewById(R.id.title);
        return view;
    }

    public void setContent(String content) {
        tvContent = (TextView) view.findViewById(R.id.content);
        tvContent.setText(content);
        Log.d("set-Content",content);
    }

    public void setWhatToDO(String listView) {
        tvWhatToDo = (TextView) view.findViewById(R.id.title);
        tvWhatToDo.setText(listView);
    }
}
