/**
 * The minimum, maximum and bit-length of primitive types.
 */
public class PrimitiveTypesMinMax {
  public static void main(String[] args) {
    printPrimitiveTypes();
  }

  private static void printPrimitiveTypes() {
    System.out.println(/* int (32-bit signed integer) */
                       "int(min) = " + Integer.MIN_VALUE + "\n"
                       + "int(max) = " + Integer.MAX_VALUE + "\n"
                       + "int(bit-length) = " + Integer.SIZE + "\n\n"
                       /* byte (8-bit signed integer) */
                       + "byte(min) = " + Byte.MIN_VALUE + "\n"
                       + "byte(max) = " + Byte.MAX_VALUE + "\n"
                       + "byte(bit-length) = " + Byte.SIZE + "\n\n"
                       /* short (16-bit signed integer) */
                       + "short(min) = " + Short.MIN_VALUE + "\n"
                       + "short(max) = " + Short.MAX_VALUE + "\n"
                       + "short(bit-length) = " + Short.SIZE + "\n\n"
                       /* long (64-bit signed integer) */
                       + "long(min) = " + Long.MIN_VALUE + "\n"
                       + "long(max) = " + Long.MAX_VALUE + "\n"
                       + "long(bit-length) = " + Long.SIZE + "\n\n"
                       /* char (16-bit character or 16-bit unsigned integer) */
                       + "char(min) = " + (int)Character.MIN_VALUE + "\n"
                       + "char(max) = " + (int)Character.MAX_VALUE + "\n"
                       + "char(bit-length) = " + Character.SIZE + "\n\n"
                       /* float (32-bit floating point) */
                       + "float(min) = " + Float.MIN_VALUE + "\n"
                       + "float(max) = " + Float.MAX_VALUE + "\n"
                       + "float(bit-length) = " + Float.SIZE + "\n\n"
                       /* double (64-bit floating point) */
                       + "double(min) = " + Double.MIN_VALUE + "\n"
                       + "double(max) = " + Double.MAX_VALUE + "\n"
                       + "double(bit-length) = " + Double.SIZE);
  }
}
