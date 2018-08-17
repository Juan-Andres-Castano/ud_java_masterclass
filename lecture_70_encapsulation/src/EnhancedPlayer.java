public class EnhancedPlayer {


    private String name;
    private int myHealth = 100;
    private String weapon;



    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health >0 && health <= 200)
            this.myHealth = health;
        this.weapon = weapon;
    }


    public void loseHealth(int damage)
    {
        this.myHealth -= damage;

        if(this.myHealth <= 0 ){
            System.out.println("Player knocked out ...");
        }
    }

    public int getMyHealth() {
        return myHealth;
    }
}
