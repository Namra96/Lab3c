package com.example.namragill.lab3c;



import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {


    ListView listView;
    Controller controller;
    ArrayAdapter arrayAdapter;

    public  Instruction [] instructions = new Instruction[3];

    public ListFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        controller = new Controller();
        ArrayList<String> theList = new ArrayList<>();
        controller.initialiseWhatToDo(instructions);
        listView = (ListView) view.findViewById(R.id.list);
        for (int i = 0; i < instructions.length;i ++ ){
           String instruction = String.valueOf(instructions[i]);
            Toast.makeText(getActivity(),setWhatToDo(instructions[i].getWhatToDo(instruction)),Toast.LENGTH_SHORT).show();
            theList.add(setWhatToDo(instructions[i].getWhatToDo(instruction)));
        }
        arrayAdapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, theList);
        listView.setAdapter(arrayAdapter);
       // InstructionsAdapter adapter = new InstructionsAdapter();
       // listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String listView = parent.getItemAtPosition(position).toString();
                Log.d("list clicked", listView);
                controller.setContent(listView);
            }
        });

        return view;
    }

    private String setWhatToDo(String whatToDo) {
        return whatToDo;
    }


  /*  public class InstructionsAdapter extends ArrayAdapter<Instruction> {
        public InstructionsAdapter() {
            super(ListFragment.this.getContext(), 0, instructions);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            Instruction instruction = getItem(position);

            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_list, parent, false);
            }
            return convertView;
        }
    }
*/


    }

