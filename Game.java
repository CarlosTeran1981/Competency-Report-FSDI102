public class Game{

    public static void main(String args[])
    {
        Character mario= new Character("(M)", 100, 20, 30);
        Character toad= new Character("=D", 200, 30, 50);
        
        mario.printing();
        toad.printing();

        toad.attack (mario);
    }
      

}