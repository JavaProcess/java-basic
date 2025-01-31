package abc;


import java.util.Scanner;

public class Txx {
    Scanner scanner = new Scanner(System.in);
    public String input(){
        System.out.println("덧셈할 숫자를 입력해주세요 :");
        String a = scanner.nextLine();
        if(!(a instanceof String)) {
            System.out.println("IllegalArgumentException");
            System.exit(0);
        }
        return a;
        }
    }

