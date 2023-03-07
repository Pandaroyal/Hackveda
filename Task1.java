import java.util.Scanner;
class Task1{
    public static String encrypt(String s,int key){
        String done = "";
        for(int i=0;i<s.length();i++){
            int c =(s.charAt(i)+key%26);
            if(c>122){
                    done += (char)(c%122+96);
            }else if(c<97&&c>90){
                done += (char)(c%90+64);
            }else{
                done+=(char)(c);
            }
        }
        return done;
    }
    public static String decrypt(String s,int key){
        String done = "";
        for(int i=0;i<s.length();i++){
            int c =(s.charAt(i)-key%26);
            if(c<65||(c>90&&c<97)){
                    done += (char)(c+26);
            }else{
                done+=(char)(c);
            }
        }
        return done;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Message: ");
        String s = sc.nextLine();
        System.out.print("Enter Key: ");
        int key = sc.nextInt();
        sc.close();
        String encrypt = encrypt(s,key);
        System.out.println("Encrypted Message = "+encrypt);
        String decrypt = decrypt(encrypt,key);
        System.out.println("Decrypted Message = "+decrypt);
    }
}