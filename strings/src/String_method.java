import  java.lang.String;
public class String_method {
    public static void main(String[] args) {
        /*
        String name="Hello World!!";
        int a=name.length();
        int c=0;
        System.out.println(a);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(1));
        System.out.println(name);
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
                c++;
            }
            System.out.println(name.charAt(i));

        }
        System.out.println("The even elemets are ="+c);

         */
        String st="Hello World ";

        System.out.println(st.substring(5+1));
        System.out.println(st.substring(0,5));
        System.out.println(st.replace("H","Y"));
        System.out.println(st.startsWith("Hel"));
        System.out.println(st.endsWith(" "));




    }


}
