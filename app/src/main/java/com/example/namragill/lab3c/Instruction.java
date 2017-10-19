package com.example.namragill.lab3c;

/**
 * Created by namragill on 2017-09-11.
 */

class Instruction {
    String whatToDO;
    String content;
    public Instruction(String whatToDo, String content) {
        this.whatToDO = whatToDo;

        this.content = content;
    }
    public Instruction(String whatToDo) {
        this.whatToDO = whatToDo;
    }


    public String getContent(){

        return content;
    }


    public String getWhatToDo(String string) {
        return whatToDO;
    }
}
