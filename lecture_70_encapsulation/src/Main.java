public class Main {


    public static void main(String[] args)
    {

        Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("reamining helath " + player.healtRemain());

        damage =11 ;
        player.loseHealth(damage);
        player.health = 100;

        System.out.println("reamining helath " + player.healtRemain());

        /*****/
        EnhancedPlayer player2 = new EnhancedPlayer("Tim2",250, "Sword");
        System.out.println("reamining helath " + player2.getMyHealth());

 /****/
 Printer printer = new Printer(50, true);
 System.out.println(" ******************* " );

        System.out.println("initial page count  " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("pages printed was  " + pagesPrinted + "new total count for printer : " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was  " + pagesPrinted + "new total count for printer : " + printer.getPagesPrinted());


    }
}
