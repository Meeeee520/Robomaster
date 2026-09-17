public class practice9{
    public static void main(String[] args) {
        String a=args[0];
        String b=args[1];
        String c=args[2];
        int n=0;
        n=Integer.parseInt(a);
        if(n<=Integer.parseInt(b)){
            n=Integer.parseInt(b);
            if(n<=Integer.parseInt(c)){
                n=Integer.parseInt(c);
            }
    
            
        }
        else{
            if(n<=Integer.parseInt(c)){
                n=Integer.parseInt(c);
            }
        }
        System.out.print(n);
    }
}