public class Third {
    public static void main(String[] args) {
        if(args.length == 0){
            System.out.println("No values");
        }else{
            for(String a:args){
                System.out.println(a+",");
            }
        }
    }
}
