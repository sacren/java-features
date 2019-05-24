/**
 * PrimType class for primitive type values.
 *
 * <p>Constructor:
 * +PrimType()
 *
 * <p>Public method:
 * +toString():String
 */
public class PrimType {
    /** PrimType string method. */
    public String toString() {
        return String.format(
                /* int (32-bit signed integer) */
                "int(min) = %d%n"
                        + "int(max) = %d%n"
                        + "int(bit-length) = %d%n%n"
                        /* byte (8-bit signed integer) */
                        + "byte(min) = %d%n"
                        + "byte(max) = %d%n"
                        + "byte(bit-length) = %d%n%n"
                        /* short (16-bit signed integer) */
                        + "short(min) = %d%n"
                        + "short(max) = %d%n"
                        + "short(bit-length) = %d%n%n"
                        /* long (64-bit signed integer) */
                        + "long(min) = %d%n"
                        + "long(max) = %d%n"
                        + "long(bit-length) = %d%n%n"
                        /* char (16-bit character or 16-bit unsigned integer) */
                        + "char(min) = %d%n"
                        + "char(max) = %d%n"
                        + "char(bit-length) = %d%n%n"
                        /* float (32-bit floating point) */
                        + "float(min) = %f%n"
                        + "float(max) = %f%n"
                        + "float(bit-length) = %d%n%n"
                        /* double (64-bit floating point) */
                        + "double(min) = %f%n"
                        + "double(max) = %f%n"
                        + "double(bit-length) = %d",
                Integer.MIN_VALUE,
                Integer.MAX_VALUE,
                Integer.SIZE,
                Byte.MIN_VALUE,
                Byte.MAX_VALUE,
                Byte.SIZE,
                Short.MIN_VALUE,
                Short.MAX_VALUE,
                Short.SIZE,
                Long.MIN_VALUE,
                Long.MAX_VALUE,
                Long.SIZE,
                (int) Character.MIN_VALUE,
                (int) Character.MAX_VALUE,
                Character.SIZE,
                Float.MIN_VALUE,
                Float.MAX_VALUE,
                Float.SIZE,
                Double.MIN_VALUE,
                Double.MAX_VALUE,
                Double.SIZE);
    }
}
