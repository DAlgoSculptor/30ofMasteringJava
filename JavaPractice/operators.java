package JavaPractice;
public class operators {
    

    public static void main(String[] args){

        // operators

        int a = 22;
        int b = 200 ;
        int sum = a + b;
        System.out.println(sum); 

        double  c = 1;
        double d = 2;
        double div = c/d;
        double mod = c%d;
        System.out.println(mod);
        System.out.println(div);

        // unary operator 
        int num = 2;
        // num += 2;
        System.out.println(num++); // 2
        System.out.println(++num); // 4
        System.out.println(num);  // 4

        System.out.println(num--);
        System.out.println(--num);
        System.out.println(num);


        // Maths 
        // 5 , 6 

        System.out.println(Math.max(5, 6));

        System.out.println(Math.min(5, 6));

        System.out.println((int)Math.random());

    }
}
