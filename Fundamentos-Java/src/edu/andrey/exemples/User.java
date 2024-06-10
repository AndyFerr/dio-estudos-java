package edu.andrey.exemples;
public class User {
    public static void main(String[] args) {
        SmartTV  tv1 = new SmartTV();
        
        tv1.switchChannel(9);

        System.out.print(tv1.channel);
    }
}
