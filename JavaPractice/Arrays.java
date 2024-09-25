package JavaPractice;
public class Arrays {
    public static void main(String[] args){
        int age = 20;
        int physics = 90;
        int Chem = 80;
        int  Math = 90 ;
        int Eng = 100;

        int [] marks = new int [4];
        
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 90;
        marks[3] = 100;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);


        // Arrays length

        System.out.println(marks.length);





        String  Java;
        String  Python;
        String  Cpp ;
        String  C ;
        String  Kotlin;
        String Dart;


        String [] EngineeringBook = new String[6];

        EngineeringBook[0]= "Java";
        EngineeringBook[1]= "Python";
        EngineeringBook[2]= "Cpp";
        EngineeringBook[3]= "C";
        EngineeringBook[4]= "Kotlin";
        EngineeringBook[5]= "Dart";
        
        // Displays the output

        System.out.println(EngineeringBook[0]);
        System.out.println(EngineeringBook[1]);
        System.out.println(EngineeringBook[2]);
        System.out.println(EngineeringBook[3]);
        System.out.println(EngineeringBook[4]);
        System.out.println(EngineeringBook[5]);

        // Two D Arrays
        
        int [][] finalMarks ={{90, 89 , 100},{100 , 100 ,80}};
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[0][2]);
        System.out.println(finalMarks[1][0]);


        


    }
    
}
