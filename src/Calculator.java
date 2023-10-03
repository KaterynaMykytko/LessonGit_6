public class Calculator {
        public static void main(String[] args) {

            System.out.println(calculate(4,5,7));
        }
        static double calculate(int a, int b, int c){

            double avg = (a + b + c) / 3.0;
            return avg;
        }
}

