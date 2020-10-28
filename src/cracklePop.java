public class cracklePop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i%3==0 && i%5==0){
                System.out.println("CracklePop");
                i++;
            } else if (i%3==0 ) {
                System.out.println("Crackle");
                i++;
            } else if (i%5==0) {
                System.out.println("Pop");
                i++;
            } else {
                System.out.println(i);
                i++;
            }
        }
    }
}
