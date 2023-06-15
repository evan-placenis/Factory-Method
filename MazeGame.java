import java.util.ArrayList;

abstract class MazeGame{
    public Maze MakeMaze(){
        return new Maze();
    }

    public Room MakeRoom(int n){
        return new Room(n);
    }

    public Wall MakeWall(){
        return new Wall();
    }

    public Door MakeDoor(Room r1, Room r2){
        return new Door(r1, r2);
    }

    public Maze CreateMaze(){
        Maze aMaze = MakeMaze();

        Room r1 = MakeRoom(1);
        Room r2 = MakeRoom(2);
        Door theDoor = MakeDoor(r1, r2);
        aMaze.AddRoom(r1);
        aMaze.AddRoom(r2);

        r1.setSide("North", MakeWall());
        r1.setSide("East", theDoor);
        r1.setSide("South", MakeWall());
        r1.setSide("West", MakeWall());

        r2.setSide("North", MakeWall());
        r2.setSide("East", MakeWall());
        r2.setSide("South", MakeWall());
        r2.setSide("West", theDoor);

        return aMaze;
    }
}

class BombedMazeGame extends MazeGame{
    BombedMazeGame(){

    }

    @Override
    public Wall MakeWall(){
        return new BombedWall();
    }

    @Override
    public Room MakeRoom(int n){
        return new RoomWithABomb(n);
    }
}

class EnchantedMazeGame extends MazeGame {
    @Override
    public Wall MakeWall(){
        return new EnchantedWall();
    }

    @Override
    public Room MakeRoom(int n){
        return new EnchantedRoom(n);
    }

}

class NormalMazeGame extends MazeGame {

}




class Maze{
    ArrayList<Room> rooms;
    Maze(){
        rooms = new ArrayList<Room>();
    }

    public void AddRoom(Room room){
        System.out.println("Room "+ Integer.toString(room.roomNo) + " constructing");
        rooms.add(room);
    }

    public Room RoomNo(int r){
        for(Room currentRoom : rooms){
            if (currentRoom.roomNo == r){
                return currentRoom;
            }
        }
        return null;

    }
}

 


