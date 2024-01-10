Q1) Write a program to get the third bit(from last) of the given Binary Number?

import java.util.*;
import java.io.*;

class Solution {
    
    public static void sol(int n) {
        int bitmask = 1<<2;
        int val = n & bitmask;
        if(val==0) {
            System.out.println("Bit is 0:");
        }
        else {
            System.out.println("Bit is 1:"); 
        }
    }
    
    public static void main(String[] args) {
       int n = 5; //Get 3 bit - 0 (1) 01
       sol(5);
    }
}


Q2) Write a program to set the second bit(from last) of the given Binary Number?

import java.util.*;
import java.io.*;

class Solution {
    
    public static void sol(int n) {
        int bitmask = 1<<1;
        int val = n | bitmask;
        System.out.println(val);
    }
    
    public static void main(String[] args) {
       int n = 5; //Set 2 bit - 01(0)1 - 0111(7)
       sol(5);
    }
}

// O/P
// 7


Q3) Write a program to clear the third bit(from last) of the given Binary Number?

import java.util.*;
import java.io.*;

class Solution {
    
    public static void sol(int n) {
        int bitmask = 1<<2;
        int val = ~bitmask;
        System.out.println(n&val);
    }
    
    public static void main(String[] args) {
       int n = 5; //Clear 3 bit - 0 (1) 01 - 0111(7)
       sol(5);
    }
}

// O/P
// 1


Q4) Write a program to update the given bit(from last) of the given Binary Number?

import java.util.*;
import java.io.*;

class Solution {
    
    public static void sol(int n, int pos, int operation) {
        int bitmask = 1<<(pos-1);
        if(operation == 0)
        {
            int val = ~bitmask;
            System.out.println(n&val);
        }
        else{
            int val = n|bitmask;
            System.out.println(val);
        }
    }
    
    public static void main(String[] args) {
       int n = 5; //Clear 3 bit - 0 (1) 01 , Set 2 bit - 01 (0) 1 
       System.out.println("Update - Enter the operation :");
       System.out.println("Enter : 0 clear or Enter : 1 Set");
       Scanner sc = new Scanner(System.in);
       int operation = sc.nextInt();
       System.out.println("Enter the digit from last to update :");
       int pos = sc.nextInt();
       sol(5,pos,operation);
    }
}

// O/P
// Update - Enter the operation :
// Enter : 0 clear or Enter : 1 Set
// 0
// Enter the digit from last to update :
// 3
// 1

//O/P
// Update - Enter the operation :
// Enter : 0 clear or Enter : 1 Set
// 1
// Enter the digit from last to update :
// 2
// 7
