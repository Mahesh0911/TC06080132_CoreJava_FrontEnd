public class do_while {
    public static void main(String args[]) {
        int i = 1;
        do {
            System.out.print("Number :" + i + "  ");
            i++;
            System.out.print("Condition :" + (i < 10) + "  ");
            System.out.println("Number :" + i);
        } while (i < 10);
    }
}

/*
 * Number :1 | Condition :true | Number :2
 * Number :2 | Condition :true | Number :3
 * Number :3 | Condition :true | Number :4
 * Number :4 | Condition :true | Number :5
 * Number :5 | Condition :true | Number :6
 * Number :6 | Condition :true | Number :7
 * Number :7 | Condition :true | Number :8
 * Number :8 | Condition :true | Number :9
 * Number :9 | Condition :false | Number :10
 */