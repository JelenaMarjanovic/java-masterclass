public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value: " + myMinIntValue);
        System.out.println("Integer maximum value: " + myMaxIntValue);

        System.out.println("Busted MIN value: " + (myMinIntValue - 1));   // Underflow
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));   // Overflow

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte minimum value: " + myMinByteValue);
        System.out.println("Byte maximum value: " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short minimum value: " + myMinShortValue);
        System.out.println("Short maximum value: " + myMaxShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long minimum value: " + myMinLongValue);
        System.out.println("Long maximum value: " + myMaxLongValue);

        int myNewIntValue = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        System.out.println("New int value: " + myNewIntValue);
        System.out.println("New byte value: " + myNewByteValue);
        System.out.println("New short value: " + myNewShortValue);

        // Primitive Types Challenge
        System.out.println("Primitive Types Challenge");

        byte byteValue = 77;
        short shortValue = 13468;
        int intValue = 1356842785;
        long longValue = 50000L + 10L * (byteValue + shortValue + intValue);

        System.out.println("Total long value: " + longValue);
    }
}
