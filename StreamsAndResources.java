import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class StreamsAndResources {
    public static void main(String[] args) throws Exception {
        practice1();
        practice2();
        practice4();
    }

    // Практика #1: InputStream + read()
    private static void practice1() throws IOException {
        byte[] data = {65, 66, 67}; // 'A', 'B', 'C'
        ByteArrayInputStream in = new ByteArrayInputStream(data);

        int b;
        while ((b = in.read()) != -1) {
            System.out.println("read byte: " + b + " char: " + (char) b);
        }
        in.close();
    }

    // Практика #2: OutputStream + write(int)
    private static void practice2() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        out.write(65);
        out.write(66);
        out.write(67);

        byte[] result = out.toByteArray();
        System.out.println("written bytes as String: " + new String(result));
        out.close();
    }

    // Практика #4: AutoCloseable + try-with-resources
    private static void practice4() {
        try (MyResource res = new MyResource()) {
            System.out.println("inside try-with-resources");
        } // здесь res.close() будет вызван автоматически
    }

    static class MyResource implements AutoCloseable {
        public MyResource() {
            System.out.println("resource opened");
        }

        @Override
        public void close() {
            System.out.println("resource closed");
        }
    }
}
