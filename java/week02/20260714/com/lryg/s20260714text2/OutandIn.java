package com.lryg.s20260714text2;

public class OutandIn {
    public void useIn(){
        In.in();
    }
    private static class In{
        public static void in(){
            System.out.println("In");
        }

        }
    }

