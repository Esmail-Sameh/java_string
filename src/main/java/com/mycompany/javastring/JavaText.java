package com.mycompany.javastring;

public class JavaText{
    
    String text;
    public JavaText(String text){
        this.text = text;
    }
    
    public void printCharByChar(){
        for(char c : text.toCharArray()){
            System.out.println(c);
        }
    }
    
}
