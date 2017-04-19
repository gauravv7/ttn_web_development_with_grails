package q11

/**
 * Created by gaurav on 18/4/17.
 */
class Q11 {

    public static void main(String[] args) {
        def fout = new FileOutputStream("Q11-write.jpg")
        def fin = new FileInputStream("Q11.jpg")
        fin.eachByte { fout.write(it)}
    }
}
