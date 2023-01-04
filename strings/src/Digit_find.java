public class Digit_find {
    public static void main(String[] args) {
        String str="22abxy779";
        int c=0;
        char[] ch=str.toCharArray();
        for (int i=0;i<ch.length;i++) {
            if (Character.isDigit(ch[i])) {
                c++;
            }
        }
        if(c>0){
            System.out.println(true);
        }
        else
            System.out.println(false);

    }
}
