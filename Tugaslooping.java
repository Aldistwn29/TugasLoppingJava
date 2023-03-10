package com.TugasPerulangan;

public class Tugaslooping {
    public static void main(String[] args) {
        System.out.println("No.1");
        for(int a=1; a<=11; a+=2){
                System.out.print(a);
            }
            {
                System.out.println();
            }
            System.out.println("No.2 ");
            for(int a=20; a>=0; a-=5){
                System.out.print(a+" ");
            }{
                System.out.println();
            }
            System.out.println("No.3");
            int a=0;
            int b=1;
            int c=0;
            System.out.print(a+""+b);
            for(int i=2; i<8; i++){
                c=a+b;
                System.out.print(c+"");
                a=b;
                b=c;
                    }
                System.out.println();{
                    System.out.println("No.4");
                    int d=1 ,e=2 ,f=3, g;
                    System.out.print(d+ "" +e);
                    System.out.print(""+ f);{
                        for(int i=3; i<7; i++){
                            g=e+d+f;
                        System.out.print("" +g);
                        d=e;
                        e=f;
                        f=g;
                    }{
                        System.out.println();
                    }
                        System.out.println("No.5");
                        int i = 0;
                        while(i<=2){
                            i++;
                            int k = i; 
                            while  (k <= i + 3){
                                System.out.print(k + "");
                                k++;
                            }
                            System.out.println();
                        }
                        

                    }
                }
                
            }
        }
    

