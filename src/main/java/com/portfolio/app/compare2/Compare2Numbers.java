package com.portfolio.app.compare2;

public class Compare2Numbers {
    /// This is the class that you can use to compare two numbers and find out two
    /// numbers match or not . ///


    public int getHigherOne(int a, int b){
        /// this method returns higher one if both same returns one of them

        if (a != b){
            if (a > b){
                return a;
            }else {
                return b;
            }
        }else {
            return b;
        }
    }

    public int getLowerOne(int a, int b){
        /// this method returns lower one if both same returns one of them


        if (a != b){
            if (a < b){
                return a;
            }else {
                return b;
            }
        }else {
            return b;
        }
    }

    public boolean areBothSame(int a, int b){
        if (a == b){
            return true;
        }else {
            return false;
        }
    }

}
