package edu.andrey.exemples;

public class SmartTV {

    String state = "Tv off";
    int volume = 0;
    int channel = 0;


    public void turnOn(){
        state = "Tv on";
        System.out.println(state);
    }

    public void turnOff(){
        state = "Tv off";
        System.out.println(state);
    }

    public void turnUpVolume(){
        volume++;
        System.out.println("volume: "+volume);
    }

    public void turnUpVolume(int x){
        volume += x;
        System.out.println("volume: "+volume);
    }
    
    public void switchChannel(){
        if (channel < 10){
            channel++;
        }else{
            channel = 0;    
        }
        
        System.out.println("Channel: "+channel);
    }
    
    public void switchChannel(int x){
        if ((x <= 10) && (x >= 0)){
            channel = x;
            System.out.println("Channel: "+channel);
        }
        
    }
}