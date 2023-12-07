import java.util.Random;

public class Frog extends Thread{

    private final int frogId;
    private final int maxJump;
    private final int maxDistance;


    public Frog(int maxDistance, int maxJump, int frogId){
        this.maxDistance = maxDistance;
        this.maxJump = maxJump;
        this.frogId = frogId;
    }


    public void run() {
        Random random = new Random();
        int jumpedDistance = 0;

        while (jumpedDistance < this.maxDistance) {
            int jump = random.nextInt(this.maxJump);
            jumpedDistance += jump;
        }

        synchronized (Race.getFrogs()){
            Race.finishLine(this.frogId);
            int position = Race.indexOfFrog(this.frogId) + 1;
            System.out.println("O sapo " + this.frogId + " chegou na posição: " + position + "º");
        }
    }

}
