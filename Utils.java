public class Utils {
    public static void reticencias(int qntPontinhos){

        try {
            for(int i = 0; i< qntPontinhos;i++){
                Thread.sleep(700); 
                System.out.print(".");
                Thread.sleep(700); 
            } 
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
