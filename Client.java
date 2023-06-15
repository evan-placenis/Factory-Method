public class Client {
    public static void main(String[] args){
        
        //MazeFactory factory = new EnchantedMazeFactory();
        //MazeFactory factory = new BombedMazeFactory();
        BombedMazeGame game = new BombedMazeGame();
        game.CreateMaze();
        System.out.println("-----------------------");
        EnchantedMazeGame game2 = new EnchantedMazeGame();
        game2.CreateMaze();
        System.out.println("-----------------------");
        NormalMazeGame game3 = new NormalMazeGame();
        game3.CreateMaze();
        System.out.println("-----------------------");


    }
}
