
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class Handler {
    private final String VERSION = "v 0.1";
    private final String PREFIX = "TRACER JAVA " + VERSION + " " + new Date() + "\n"; 

    private StringBuilder process() throws IOException {
        StringBuilder result = new StringBuilder(PREFIX);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean isDone = false;

        while (! isDone) {
            String line = br.readLine();
            isDone = (line == null);
            if (! isDone) { result.append(line + "\n"); }
        }

        return result;
    }

    public String handleRequest() {
        StringBuilder buffer = new StringBuilder(PREFIX + "INTERNAL ERROR");

        try {
            buffer = process();
        } catch(IOException e) {
            e.printStackTrace();
        }

        return buffer.toString();
    }

    public static void main(String[] args) {
        Handler handler = new Handler();
        System.out.print(handler.handleRequest());
    }
}
