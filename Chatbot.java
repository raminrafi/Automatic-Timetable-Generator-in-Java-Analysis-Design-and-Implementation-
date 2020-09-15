/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaframes;
import java.util.LinkedList;
import java.util.Scanner;

public class Chatbot {
   private boolean Status;
   private LinkedList<String> messages;

    public Chatbot() {
        Status = false;
        messages = new LinkedList<String>();
    }
    public Chatbot(boolean Status, LinkedList<String> messages) {
        this.Status = Status;
        this.messages = messages;
    }
    
    public boolean notifyUser(){
        
       if(!Status){
           return !Status;
       }
       else
           return Status;
    }
    public void printMesasge(){
        System.out.println(messages);
    }
    public String typeMessage(){
        String Str;
        Scanner sc =new Scanner(System.in);
        Str = sc.nextLine();
        if( Str.contains(" ") || Str == null)
            return null;
        else
            return Str; 
    }
     public void AppendMessage(String Str){
        if(messages == null)
            messages = new LinkedList<String>();
         messages.add(Str);
     }
    public boolean DeleteMessage(int index){
        
        if(messages.isEmpty()){
            return false;
        }
        else if(messages.size() < index){
            return false;
        }
        else{
            System.out.println(messages.remove(index));
        }
        return false;
    }
    public void Runnable(){
        
        int opt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("New Thread Has Been created\n");
        while(opt!=-1){
            System.out.println("Enter Your Turn No.\n");
             opt = Integer.parseInt(sc.nextLine());
            String str;
            System.out.println("Enter Message here.. \n");
            if(opt == 1){
                str = sc.nextLine();
                messages.add(str);
                System.out.println(str + " (By Person#1)"+"\n" );
            }
            else if(opt == 2){
                str = sc.nextLine();
                messages.add(str);
                System.out.println(str + " (By Person#2)"+"\n" );
            }
            
        }
        
    }
    public boolean getStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

    public LinkedList<String> getMessages() {
        return messages;
    }

    public void setMessages(LinkedList<String> messages) {
        this.messages = messages;
    }
    
}
