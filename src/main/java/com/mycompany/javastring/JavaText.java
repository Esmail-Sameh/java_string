package com.mycompany.javastring;

public class JavaText{
    
    public String text;
    private String inverse;
    public JavaText(String text){
        this.text = text;
    }
    
    public void printCharByChar(){
        for(char c : text.toCharArray()){
            System.out.println(c);
        }
    }
    
    public void printCharByCharInvers(){
        inverse = new StringBuilder(text).reverse().toString();
        for(char c : inverse.toCharArray() ){
            System.out.println(c);
        }
       // System.out.println(inverse);
    }
    
}
