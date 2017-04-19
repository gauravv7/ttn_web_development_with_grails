package q8

/**
 * Created by gaurav on 18/4/17.
 */
class Q8 {

    public static void main(String[] args) {
        def fout = new File('q8-write.txt')
        def line = "";
        int i = 1
        StringBuilder sb = new StringBuilder();
        new File("q8-1.txt").withReader { reader ->
            while (line = reader.readLine()) {
                sb.append(line+'\n')
            }
        }
        new File("q8-2.txt").withReader { reader ->
            while (line = reader.readLine()) {
                sb.append(line+'\n')
            }
        }
        fout.write(sb.toString())
    }
}
