import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("10.5.151.134",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            Scanner in=new Scanner(System.in);
            String str=in.nextLine();
            dout.writeUTF(str);
            dout.flush();
            dout.close();
            s.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
