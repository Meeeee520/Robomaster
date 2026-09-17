public class practice7{
public static void main(String[] args) {
    String s1=args[0];
    String s2=args[1];
    int n=0;
    if(s1.length()==s2.length()){
        for(int i=0;i<=s1.length()-1;i++)
    {
        if(s1.charAt(i)==s2.charAt(i)){
             n++;
        }
    }
        if(n==s1.length()){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
    else{
        System.out.println("Not equal");
    }
    
}
}