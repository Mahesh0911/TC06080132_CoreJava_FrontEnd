
public class varArgs {
    public int add(String name, int... args) {
        // to represent variable args use operator called as ellipses (...) dots after
        // data type.
        int len = args.length;
        System.out.println("First argument is : " + name);
        System.out.println("Length of arguments passed : " + len);
        // for (int i : args) {
        // System.out.println(i);
        // }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += args[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        varArgs obj = new varArgs();
        int sum = obj.add("mahesh", 1, 3, 5, 7, 9); // varargs must be defined at last.
        System.out.println("The sum is : " + sum);
    }
}