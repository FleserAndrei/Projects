public class Main {
    public static void main(String[] args) {

        System.out.println(convertToBinary(42));
        System.out.println(Converter(42));

    }

    public static String Converter(int nr) {
        if (nr <= 0) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        while (nr > 0){
            int remainder = nr % 2;
            result.append(remainder);
            nr /= 2;
        }
        return result.reverse().toString();

    }

    public static String convertToBinary(int number){
        return "" + Integer.toBinaryString(number);
    }
}
