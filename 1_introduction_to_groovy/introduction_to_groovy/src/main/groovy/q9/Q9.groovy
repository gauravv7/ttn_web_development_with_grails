package q9

/**
 * Created by gaurav on 18/4/17.
 */
class Q9 {
    public static void main(String[] args) {
        def fout = new File('q9-write.txt')
        def line = "";
        int i = 1
        StringBuilder sb = new StringBuilder();
        new File("q9.txt").withReader { reader ->
            while (line = reader.readLine()) {
                if(i%2!=0)
                    sb.append(line+'\n')
                i++
            }
        }
        fout.write(sb.toString())
    }
}
