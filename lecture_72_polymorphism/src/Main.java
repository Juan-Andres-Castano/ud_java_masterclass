

    class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }


        public String getName() {
            return name;
        }

        public String plot(){
        return "no plot here";
    }
    }
/**********************************************/
    class Jaws extends Movie{
        public Jaws(){
            super("jaws");
        }

     public String plot()  {
            return "A shark eats lots of peaople";
        }
    }

/**********************************************/
    class IndependencyDay extends  Movie{

        @Override
        public String plot() {
            return "alies attemp to take over the planet" ;
        }

        public IndependencyDay(){
            super("independecy day");

        }
    }
        /**********************************************/
    class MazeRunner extends Movie{

        public MazeRunner() {
            super("maza runner");
        }

        @Override
        public String plot() {
            return "kids try to scape from a maze";
        }
    }

        /**********************************************/
    class Starwars extends Movie{
        public Starwars() {
            super("star wars");
        }

        @Override
        public String plot() {
            return "imperial forces working";
        }

    }
        /**********************************************/
    class forgetablleMovie extends Movie{

        public forgetablleMovie() {
            super("forgetable");
        }

        //no plot
    }



    /**********************************************/


    public class Main {

    public static void main(String[] args)
    {
        for(int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie numero "  + i + ":" + movie.getName() + "\n" +
                                            "plot : " + movie.plot() + "\n");//sout tab tab
        }

    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5 ) + 1;
        System.out.println("Random number : " + randomNumber);


        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependencyDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new forgetablleMovie();

            default:
                return null;
        }
        //return null;

    }


}
