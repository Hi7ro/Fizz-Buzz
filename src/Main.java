public class Main {
    public static void main(String[] args) {
        String[] kaChing = {"Ka", "Ching", "Ka-Ching"};
        

        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(kaChing[2]);
            }
            else if (i % 5 == 0) {
                System.out.println(kaChing[1]);
            }
            else if (i % 3 == 0) {
                System.out.println(kaChing[0]);
            } else System.out.println(i);
        }

    }

}