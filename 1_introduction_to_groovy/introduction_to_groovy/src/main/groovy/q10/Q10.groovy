package q10

/**
 * Created by gaurav on 18/4/17.
 */
class Q10 {
    public static void main(String[] args) {
        def fout = new File('q10-write.txt')
        def line = "";
        StringBuilder sb = new StringBuilder();
        new File("q10.txt").withReader { reader ->
            while (line = reader.readLine()) {
                sb.append(line.replaceAll("\\s", ""))
            }
        }
        fout.write(sb.toString())
    }
}
