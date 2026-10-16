/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rahmani;

/**
 *
 * @author Mohamadreza
 */
public class Rahmani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //--------------------HomeWork1---------------------------------
        /*int number = 141;
        
        
        int count= 0;
        int sum = 0;
        int zarb = 1;
        int Max = 0;
        int min = 9;
        int zoj = 0;
        int fard = 0;
        int reverse = 0;
        int digit = 0;
        
        if (number == 0) {
            count = 1;
            sum = 0;
            zarb = 0;
            Max = 0;
            min = 0;
            zoj = 1;
            fard = 0;
            reverse = 0;
            
        }
        
            while(number != 0)
            {
                digit = number % 10;
                number = number / 10;
                
                count++;
                sum += digit;
                
                if (digit != 0) {
                    zarb *= digit;
                }
                if (digit > Max) {
                    
                    Max = digit;
                    
                }
                if (digit < min) {
                    min = digit;
                }
                if (digit % 2 == 0) {
                    zoj++;
                }
                else
                {
                    fard++;
                }
                reverse = reverse * 10 + digit;
            }
        System.out.println("Ragham:" + count);
        System.out.println("sum :" + sum);
        System.out.println("zarb :" + zarb);
        System.out.println("Max :" + Max);
        System.out.println("Min :" + min);
        System.out.println("zoj :" + zoj);
        System.out.println("fard :" + fard);
        System.out.println("reverse :" + reverse);*/
        
        //------------------Homework2--------------------------
       /* int number = 15;
        int count = 0;
        int sum = 0;
        int LessMaghsomalay = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;

                sum += i;

                
                if (i < number) {
                    LessMaghsomalay += i;
                }
            }
        }

        boolean Aval = false;
        if (count == 2) {
            Aval = true;
        }

        boolean Kamel = false;
        if (LessMaghsomalay == number) {
            Kamel = true;
        }

        System.out.println("number :" + number);
        System.out.println("tedad maghsoomalay :" + count);
        System.out.println("majmoo maghsoomalay :" + sum);

        
        if (Aval == true) {
            System.out.println("aval : yes");
        } else {
            System.out.println("aval : no");
        }

        if (Aval == false) {
            System.out.print("maghsoomalay ha : ");
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        
        if (Kamel == true) {
            System.out.println("kamel : yes");
        } else {
            System.out.println("kamel : no");

        }*/
       
       //------------------HomeWork3:----------------------------------
       /*int adad = 6;

        
        int marahel = 0;
        int bozorgtarin = adad;
        int tedadZoj = 0;
        int tedadFard = 0;

        
        while (adad != 1) {

            
            System.out.print(adad);

            
            if (adad > bozorgtarin) {
                bozorgtarin = adad;
            }

            
            if (adad % 2 == 0) {
                tedadZoj++;
                adad = adad / 2;
            } else {
                tedadFard++;
                adad = adad * 3 + 1;
            }

            marahel++;
        }

        
        System.out.print(adad);
        if (adad % 2 == 0) {
            tedadZoj++;
        } else {
            tedadFard++;
        }
        System.out.println();

        
        System.out.println("tedad marahel : " + marahel);
        System.out.println("bozorgtarin adad : " + bozorgtarin);
        System.out.println("tedad zoj : " + tedadZoj);
        System.out.println("tedad fard : " + tedadFard);
       */
       
       
       //------------------HomeWork4:----------------------------------
       /*double Variz = 0;
       double Bardasht = 0;
       double mojoodi = 10000000;
       double Mazrab = 50000;
       
        if (Variz <0 || Bardasht < 0 || Bardasht > mojoodi || Bardasht % Mazrab != 0){
            System.out.println("Emkan Pazir Nist");
            
        }
        else{
            mojoodi -= Bardasht;
            mojoodi += Variz;
            System.out.println("Mojoodi :");
            System.out.println(mojoodi);
        }*/
       
       
       
       /*int Target = 100;
       int guss = 3;
       int priviousGuss = 0;
       int Try = 0;
       int MaxTry = 7;
       
       while(Try < MaxTry)
       {
           if (guss <1 || guss > 100) {
               System.out.println("Kharej Az Baze");
               priviousGuss = guss;
               Try++;
           }
           if (priviousGuss == guss) {
               System.out.println("Hadse Tekrari");
               Try++;  
           }
           if (guss > Target) {
               System.out.println("bozorg tar az hadaf");
               priviousGuss = guss;
               Try++;
           }
           if (guss < Target) {
               System.out.println("koochek tar az hadaf");
               priviousGuss = guss;
               Try++;
           }
           if (guss == Target) {
               System.out.println("dorost hads zadi");
               priviousGuss = guss;
               Try++;
           }
           if (Try == MaxTry) {
               System.out.println("az maxtry gozashti");
               
           }
           
       }*/ 
       
       
       
       //-----------------HomeWork5:----------------------------------------
       /*double Daneshjoo = 5;

       double sum = 0;
       int maxGrade = -1;
       int minGrade = 2;
       int passCount = 0;
       int excellentCount = 0;
       int belowAverage = 0;

       int[] Nomre = {10, 12, 8, 20, 15};

       int i = 0;
       while (i < Daneshjoo) {

       int grade = Nomre[i];

       if (grade < 0 || grade > 20) {
       System.out.println("Nomre Namotabar");
       }

       sum = sum + grade;

       if (grade > maxGrade) {
       maxGrade = grade;
       }
       if (grade < minGrade) {
       minGrade = grade;
       }
       if (grade >= 10) {
       passCount++;
       }
       if (grade >= 18) {
       excellentCount++;
       }

       i++;
}

       double average = sum / Daneshjoo;

       i = 0;
       while (i < Daneshjoo) {
       if (Nomre[i] < average) {
       belowAverage++;
       }
       i++;
}

       double passpercent = (passCount * 100) / Daneshjoo;

       System.out.println("Miangin: " + average);
       System.out.println("Bishtarin: " + maxGrade);
       System.out.println("Kamtarin: " + minGrade);
       System.out.println("Ghabol Shode: " + passCount);
       System.out.println("Momtaz: " + excellentCount);
       System.out.println("Kamtar Az Miangin: " + belowAverage);
       System.out.println("Darsad Ghaboli: " + passpercent);*/
            
    }
    
}

         
    
        
    
    

