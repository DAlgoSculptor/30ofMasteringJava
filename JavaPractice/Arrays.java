package JavaPractice;

public class Arrays {
    public static void main(String[] args) {
        int[] marks = new int[4];

        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 90;
        marks[3] = 100;

        // Print the marks
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);

        // Print the length of the array
        System.out.println(marks.length);

        // Array of engineering books
        String[] EngineeringBook = new String[6];

        EngineeringBook[0] = "Java";
        EngineeringBook[1] = "Python";
        EngineeringBook[2] = "Cpp";
        EngineeringBook[3] = "C";
        EngineeringBook[4] = "Kotlin";
        EngineeringBook[5] = "Dart";

        // Print engineering books
        System.out.println(EngineeringBook[0]);
        System.out.println(EngineeringBook[1]);
        System.out.println(EngineeringBook[2]);
        System.out.println(EngineeringBook[3]);
        System.out.println(EngineeringBook[4]);
        System.out.println(EngineeringBook[5]);

        // Two-dimensional array
        int[][] finalMarks = { { 90, 89, 100 }, { 100, 100, 80 } };
        System.out.println(finalMarks[0][0]);
        System.out.println(finalMarks[0][2]);
        System.out.println(finalMarks[1][0]);
    }
}
