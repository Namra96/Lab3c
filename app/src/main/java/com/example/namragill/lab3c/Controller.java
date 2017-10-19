package com.example.namragill.lab3c;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;

/**
 * Created by namragill on 2017-09-11.
 */

public class Controller {
    public  Instruction [] instructions = new Instruction[3];
    private TextFragment textFragment;


    public String content ;
    public String content2;
    public String content3;

    public Controller(){
        initialiseWhatToDo(instructions);
        initialiseContent(instructions);
        textFragment = new TextFragment();
    }

    public void initialiseWhatToDo(Instruction instructions[]){
        instructions[0] = new Instruction("Att starta en Activity");
        instructions[1] = new Instruction("Att lägga till data i en Intent");
        instructions[2] = new Instruction("Avläsa data i en ny Activity");
    }
    public void initialiseContent(Instruction instructions[]){
        content = "Skapa en Intent:\\n\n" +
                "\" +\n" +
                "                \"        Intent i = new Intent(this,ActivityToStart.class);\\\\n\\\\n\\n\" +\n" +
                "                \"    Starta Activity:\\\\n\\n\" +\n" +
                "                \"    startActivity(i);";
        content2 = "Skapa en Intent:\\n\n" +
                "\" +\n" +
                "                \"    Intent i = new Intent(this,ActivityToStart.class);\\\\n\\\\n\\n\" +\n" +
                "                \"    Infoga data:\\\\<n></n>\\n\" +\n" +
                "                \"    i.putExtra(\\\"Age\\\", 23);\\\\n\\n\" +\n" +
                "                \"    i.putExtra(\"Name\", \"Eva\");";
        content3 = "Avläsa data i en ny Activity\", \" Hämta referens till Intent:\\\\n\\n\" +\n" +
                "                \"    Intent i = getIntent();\\\\n\\\\n\\n\" +\n" +
                "                \"    Avläsa data:\\\\n\\n\" +\n" +
                "                \"    int age = i.getIntExtra(\\\"Age\\\");\\\\n\\n\" +\n" +
                "                \"    String name = i.getStringExtra(\"Name\");";

        instructions[0] = new Instruction("Att starta en Activity",content);
        instructions[1] = new Instruction("Att lägga till data i en Intent",content2);
        instructions[2] = new Instruction("Avläsa data i en ny Activity",content3);
    }




    public void setContent(String listView){
        Log.d("controller-content",listView);
        Log.d("controller-content", instructions[0].getContent());
        Log.d("controller-content", String.valueOf(textFragment));

        if (listView.contains("Att starta en Activity")){
            textFragment.setWhatToDO(listView);
            textFragment.setContent(instructions[0].getContent());
        }
        else if (listView.contains("Att lägga till data i en Intent")){
            textFragment.setWhatToDO(listView);
          textFragment.setContent(instructions[1].getContent());
        }
        else if (listView.contains("Avläsa data i en ny Activity")){
            textFragment.setWhatToDO(listView);
           textFragment.setContent(instructions[2].getContent());
        }

    }

}
