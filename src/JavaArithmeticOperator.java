public class JavaArithmeticOperator {
    static int ans; //static global variable
    static int a = 24; //static global variable
    static int b = 18; //static global variable

    static void calc() {//static method with return type and without parameter
        ans = a + b; // 42
        // printing out the answer value for calc() method
        System.out.println(" The Addition of " + a + " + " + b + " = " + ans); // string concatenation
        ans = a - b;  // 6
        //printing out the answer value for calc() method
        System.out.println(" The Subtraction of " + a + " - " + b + " = " + ans); // string concatenation
        ans = a * b; // 432
        //printing out the answer value for calc() method
        System.out.println("The Multiplication of " + a + " * " + b + " = " + ans); // string concatenation
        ans = a / b; // 1
        //printing out the answer value for calc() method
        System.out.println(" The Division of " + a + "  / " + b + " = " + ans); // string concatenation
        ans = a % b; // 6
        //printing out the answer value for calc() method
        System.out.println(" The Modulus of " + a + " % " + b + " = " + ans); } // string concatenation

    public static void main(String[] args) {
        calc(); }
}
