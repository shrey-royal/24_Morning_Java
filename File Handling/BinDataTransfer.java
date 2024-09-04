import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BinDataTransfer {
    public static void main(String[] args) {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int ctr = 0;

        try {
            fin = new FileInputStream("input.png");
            fout = new FileOutputStream("output.png");
            int c;

            while ( (c = fin.read()) != -1) {
                fout.write(c);
                ctr++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fin != null) fin.close();
                if (fout != null) fout.close();
            } catch (Exception e) {
                System.out.println("Error closing file");
            }

            System.out.println("Done");
            System.out.println("Copied " + ctr + " bytes.");
        }
    }
}
