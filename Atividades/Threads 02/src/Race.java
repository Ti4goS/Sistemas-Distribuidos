import java.util.ArrayList;

public class Race {

    private final static ArrayList<Integer> frogs = new ArrayList<>();
    private final static int MAX_JUMP = 10;
    private final static int MAX_DISTANCE = 50;


    public static void main(String[] args) {


        Frog[] frogs = new Frog[5];

        for (int i = 0; i < frogs.length; i++) {
            frogs[i] = new Frog(MAX_DISTANCE,MAX_JUMP,i);
        }

        for (Frog frog : frogs) {
            frog.start();
        }
    }


    public static void finishLine(int frogId){
        frogs.add(frogId);
    }


    public static ArrayList<Integer> getFrogs(){
        return frogs;
    }


    public static int indexOfFrog(int frogId){
        return frogs.indexOf(frogId);
    }
}