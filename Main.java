import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Q1
int max=0;

      String[]name={"cat","dog","red","is","am"};
      for(int i=0;i<name.length;i++){
               if(max< name[i].length()){
                   max=name[i].length();

               }



          }
        for(int j=0;j< name.length;j++){
          if(name[j].length()>=max){
              System.out.println(name[j]);
          }
        }




        //Q2
        int[]num={1,1,1,3,3,5};

        for (int i =0 ; i< num.length ;i++ ){
           int  f=0;
            boolean found=true;

        for(int j=0;j< num.length;j++){
            if(num[j]==num[i])
            {

                f++;

            }


        }
for(int b=0;b<i;b++){
    if(num[b]==num[i]){
        found=false;


    }



}
            if(found==true){
                System.out.println(num[i] + " occurs " + f + " times");
            }



        }






    //Q3

        int[]arr={1,4,17,7,25,3,100};
        int first=0,second=0,third=0;
        for(int i=0;i<arr.length;i++){
            if(first<arr[i]){
                third=second;
                second=first;
                first=arr[i];

            }else if(arr[i]>second){
                third=second;
                second=arr[i];


            }else if(arr[i]>third){
                third=arr[i];
            }

        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

////Q4
int[]rever={5,4,3,2,1};
rev(rever);

//Q5

int ele,stop;

        System.out.println();
System.out.println("Enetr the number of elements:");
        ele=sc.nextInt();
        int [] arr1=new int[ele];
        System.out.println("1-Accepts element of an array:");
        System.out.println("2-dispaly elements of the array:");
        System.out.println("3-search the element within array:");
        System.out.println("4-sort the array:");
        System.out.println("5-stop type false");

 boolean stopp=true;
        while(stopp){

            int op;
            op=sc.nextInt();
            switch (op){
                case 1:
                {
                    for(int i=0;i<ele;i++){
                        arr1[i]=sc.nextInt();

                    }
                    break;
                } case 2:
                {
                    for(int i=0;i<ele;i++){
                        System.out.println(arr1[i]);
                    }
                    break;

                }
                case 3:
                {
                    int index;
                    System.out.println("Enter the index of the element to search");
                    index= sc.nextInt();
                    for(int i=0;i<ele;i++){
                       if(arr1[i]==index){
                           System.out.println("the number you asked for is found");
                       }else{
                           System.out.println("not found");
                       }
                    }
                }
                case 4:
                {
                    for(int i=0;i< arr1.length-1;i++){
                        for(int j=0;j< arr1.length-1;j++){
                            if(arr1[j]>arr1[j+1]){
                                int temp=arr1[j];
                                arr1[j]=arr1[j+1];
                                arr1[j+1]=temp;
                            }
                        }
                    }
                    for(int i=0;i< arr1.length;i++){
                        System.out.print(arr1[i]+" ");

                    }
                 break;
                }
                case 5:
                    stopp=false;

            }





        }












//Q6

        int maxi,min,gene;
        System.out.println();
        System.out.println("Enter the minimum value of the range :");
        min=sc.nextInt();
        System.out.println("Enter the Maximum value of the range :");
        maxi=sc.nextInt();
        System.out.println("Enter how many number you want to generate :");
        gene=sc.nextInt();
        sc.nextLine();
        ran(maxi,min,gene);


String pass;
        System.out.println("Enter a password: ");
        pass=sc.nextLine();
        System.out.println("your score is: "+length(pass));
        System.out.println("your score is: "+speci(pass));
        System.out.println("your score is: "+upper(pass));
        int sum=length(pass)+speci(pass)+upper(pass);
        System.out.println("the total score is: "+ sum);











        //Q8
        int number;
        System.out.println("Enter a number of fibo:");
        number=sc.nextInt();
        fibon(number);










      }












      public static void rev(int[]rev){

for (int i= rev.length-1 ; i>-1;i--){
    System.out.print(" "+rev[i]);

}

      }

public static void ran(int max,int min,int gen){
        Random ran=new Random();
        int random;
        for(int i=0;i<gen;i++){
            System.out.println(random= ran.nextInt(max-min+1)+min);


    }

}

public static void fibon(int number){

    int sum,first=0,second=1;
        for(int i=0;i<number;i++){
            System.out.print(first + " ");
            sum=first+second;
       first=second;
            second=sum;


       }
}

public static int length(String pass){
        int score=0;
        if(pass.length()>=8){
            score=3;
        }else if (pass.length()<=7&&pass.length()>=6)
        {
            score=2;
        }else{
            score=0;
        }

        return score;
}
public static int speci(String pass){
        int score=0;
        for(int i=0;i<pass.length();i++){
            char ch=pass.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                score=2;
                break;

            }

        }
        return score;
}

public static int upper(String pass){
        int score=0;
        boolean upper=false,lower=false;
        for(int i=0 ; i<pass.length();i++){
            char ch=pass.charAt(i);
            if(Character.isUpperCase(ch)){
                upper=true;
            }
            if(Character.isLowerCase(ch)){
                lower=true;
            }
            if(lower==true&&upper==true){
                score=3;
            }
        }
        return score;
}


    }
