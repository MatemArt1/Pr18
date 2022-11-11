public class Like18 {
    public class SquareDigit {

        public int squareDigits(int n) {
            if (n < 10) return n * n;
            else {
                int h = squareDigits(n / 10);
                int l = n % 10;
                return Integer.parseInt(h + "" + l * l);
            }
        }

    }
}
