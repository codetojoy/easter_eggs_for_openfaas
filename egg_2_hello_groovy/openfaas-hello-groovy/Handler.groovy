
class Handler {
    def VERSION = "v 0.1"
    def PREFIX = "TRACER GROOVY " + VERSION + " " + new Date() + "\n" 

    def process() throws IOException {
        def result = new StringBuilder(PREFIX)
        def br = new BufferedReader(new InputStreamReader(System.in))
        def isDone = false

        while (! isDone) {
            String line = br.readLine()
            isDone = (line == null)
            if (! isDone) { result.append(line + "\n") }
        }

        return result
    }

    def handleRequest() {
        def buffer = new StringBuilder(PREFIX + "INTERNAL ERROR")

        try {
            buffer = process()
        } catch(IOException e) {
            e.printStackTrace()
        }

        return buffer.toString()
    }

    static void main(String[] args) {
        def handler = new Handler()
        System.out.print(handler.handleRequest())
    }
}
