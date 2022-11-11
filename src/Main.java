public class Main {
    /*

Square Every Digit
    Welcome. In this kata, you are asked to square every digit of a number and concatenate them.

For example, if we run 9119 through the function, 811181 will come out, because 92 is 81 and 12 is 1.
     */
    public class SquareDigit {

        public int squareDigits(int n) {
            // TODO Implement me
            String s = "" + n;
            char [] dig = s.toCharArray();
            int l = s.length();
            int[] M = new int[l];
            for (int i = 0; i < l; i++)
            {
                M[i] = Integer.parseInt(String.valueOf(dig[i]));
                M[i] *= M[i];
            }
            String s1 = "";
            for (int i = 0; i < l; i++)
            {
                s1 += M[i];
            }
            int n1 = Integer.parseInt(s1);
            return n1;
        }

    }
    public static void main(String[] args) {

    }
}