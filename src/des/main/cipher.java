package des.main;


import java.util.Scanner;
import static des.main.sha256.toHexString;

public class cipher {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("1: Encrypt" + '\n' + "2: Decrypt");
        int choice = sc.nextInt();
        switch(choice){
            case 1: System.out.println("Enter word to encrypt");
                String text = sc.next();
                System.out.println("Which type you want to use to encrypt?");
                System.out.println("1: SHA-256"
                        + '\n' + "2: MD5"
                        + '\n' + "3: DES"
                        + '\n' + "4: SHA-1"
                        + '\n' + "5: 3DES");
                int type = sc.nextInt();
                switch (type){
                    case 1: System.out.println("Your HashCode Generated by SHA-256 is: " + toHexString(sha256.getSHA(text)));
                        break;
                    case 2: System.out.println("Your HashCode Generated by MD5 is: " + MD5.getMd5(text));
                        break;
                    case 3: System.out.println("Your HashCode Generated by DES is: " + des.getDes(text));
                        break;
                    case 4: System.out.println("Your HashCode Generated by SHA-1 is: " + sha1.getSha1(text));
                        break;
                    case 5: System.out.println("Your HashCode Generated by 3DES is: " + new TripleDES().encrypt(text));
                        break;
                    default: System.out.println("Error type!!!!");
                }

                break;
            case 2: System.out.println("Enter word to decrypt");
                System.out.println("decrypt not work)))");
                break;
            default: System.out.println("Error choice!!!!");
        }


    }
}