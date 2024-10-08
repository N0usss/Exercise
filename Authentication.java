public class Authentication {

    public static void main(String[] args) {
        
    
    
    boolean isLoggedin = true;
    boolean hasPermission = false;
    

    if(!isLoggedin && hasPermission){

        System.out.println("Please login first");
    }
    if(isLoggedin && !hasPermission){

        System.out.println("Welcome to admin site");
    }
    if(isLoggedin || hasPermission){

        System.out.println("Welcome to customer site");
    }


}

}
