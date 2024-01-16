public class operator {
    public static void main(String[] args) {
        // logical operators : and or not
        // boolean : true false
        // arithmetic operator : +,-,*,/

        float perc = 75;
        // if else statement
        if (perc > 75 && perc <= 100) {
            System.out.println("First Division");
        } else if (perc >= 35 && perc <= 75) {
            System.out.println("Second Division");
        } else {
            System.out.println("Fail");
        }

        /*
         * //nested if else statement
         * if (perc >= 75) {
         * if (perc <= 100)
         * {
         * System.out.println("First Division");
         * }
         * }
         */

        /*
         * assignment : check the greatest number from five numbers using nested if and
         * if-else ladder
         * condition : check if all values are same
         **************************
         * assginment : if salaray >= 80000 and <=100000 -> bonus 10000
         * >=50000 -> bonus 50000
         * >=25000 -> bonus 2000
         * else better luck next time
         */
    }
}
