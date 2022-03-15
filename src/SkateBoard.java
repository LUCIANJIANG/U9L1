public class SkateBoard extends Vehicle
{
    private String boardMaterial;

    public SkateBoard(String name, int wheels, String boardMaterial)
    {
        super(name, wheels);
        this.boardMaterial = boardMaterial;
    }

    public String getBoardMaterial()
    {
        return boardMaterial;
    }

    public void kickFlip()
    {
        System.out.println("You did a kickflip!");
    }
}
