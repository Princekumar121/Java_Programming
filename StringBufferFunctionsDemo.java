public class StringBufferFunctionsDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("HELLO");

        // Append "Java"
        stringBuffer.append("Java");
        System.out.println("Appended String: " + stringBuffer);

        // Insert "Java" at index 1
        stringBuffer.insert(1, "Java");
        System.out.println("Inserted String: " + stringBuffer);

        // Replace characters between index 1 and 2 with "Java"
        stringBuffer.replace(1, 3, "Java");
        System.out.println("Replaced String: " + stringBuffer);

        // Delete characters between index 1 and 2
        stringBuffer.delete(1, 3);
        System.out.println("Deleted String: " + stringBuffer);

        // Reverse the string
        stringBuffer.reverse();
        System.out.println("Reversed String: " + stringBuffer);
    }
}
