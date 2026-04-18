// Name: Kutay Melikoglu
// SID: 1381527

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {

        //Create Scanner Object
        Scanner sc = new Scanner(System.in);

        //Menu print
        System.out.println("==============================================\n" +
                "       New York Institute of Technology\n" +
                "                 Login Portal\n" +
                "==============================================");

        //Loop login attempts until failure or success
        for (int attempt = 3; attempt >= 1; attempt--) {
            System.out.println("You have " + attempt + " attempts to login");
        }




        //Close scanner
        sc.close();
    }

    public static int status () {


        return 0;
    }
}

