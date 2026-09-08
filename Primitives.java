public class PrimitiveTypesExample {
    public static void main(String[] args) {

        // 1. byte - 8-bit integer (-128 to 127)
        byte age = 25;
        byte temperature = -10;
        System.out.println("Byte: " + age);

        // 2. short - 16-bit integer (-32,768 to 32,767)
        short year = 2024;
        System.out.println("Short: " + year);

        // 3. int - 32-bit integer (-2^31 to 2^31-1)
        int Mariana_Trench = -10935;
        System.out.println("Int: " + Mariana_Trench);

        // 4. long - 64-bit integer (needs 'L' suffix)
        long worldPopulation = 8000000000L;
        long largeNumber = 9223372036854775807L;
        System.out.println("Long: " + worldPopulation);

        // 5. float - 32-bit floating point (needs 'f' suffix)
        float gravity = 9.80665f;
        System.out.println("Float: " + gravity);

        // 6. double - 64-bit floating point (default for decimals)
        double pi = 3.141592653589793;
        System.out.println("Double: " + pi);

        // 7. char - 16-bit Unicode character (single quotes)
        char grade = 'A';
        char unicodeChar = '\u0041'; // 'A' in Unicode
        System.out.println("Char: " + grade + unicodeChar );

        // 8. boolean - true or false
        boolean isJavaFun = true;
        boolean isRaining = false;
        System.out.println("Boolean: " + isJavaFun);
    }
}
