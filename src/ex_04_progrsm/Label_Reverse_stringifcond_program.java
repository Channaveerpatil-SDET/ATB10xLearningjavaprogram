package ex_04_progrsm;

public class Label_Reverse_stringifcond_program {

    public static void main(String[] args) {

        String str = "Automation";

      for (int i = str.length()-1; i >=0; i--) {
          System.out.print(str.charAt(i));
      }
        System.out.println();
        String str2 = "CHannaveer";

        for (int i = str2.length()-1; i >=0; i--) {
            System.out.print(str2.charAt(i));
        }
    }
}
