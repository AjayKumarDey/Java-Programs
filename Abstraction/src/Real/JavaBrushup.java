package Real;

import java.io.IOException;

public class JavaBrushup{
public static void main(String[] args) {
try {
throw new Exception("Hello ");
} catch (Exception e) {
System.out.print(e.getMessage());
} finally {
System.out.println("World");
}
}
}