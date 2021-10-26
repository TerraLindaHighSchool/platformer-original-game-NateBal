import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.11f;
    private final GreenfootSound MUSIC = new GreenfootSound("battle-of-the-dragons-8037.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 5;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level4.class;
    
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 700, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
        MUSIC.play();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);
        Door door = new Door();
        addObject(new Door(), 1137, 50);
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, 
                MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC), 96, 650);
        addObject(new BrickWall(), 1125, 100);
        addObject(new BrickWall(), 255,440);
        addObject(new BrickWall(), 302,594);
        addObject(new Trapdoor(GRAVITY), 838,380);
        addObject(new BrickWall(), 664,317);
        addObject(new BrickWall(), 404,189);
        addObject(new BrickWall(), 334,107);
        addObject(new BrickWall(), 84,266);
        addObject(new BrickWall(), 169,352);
        addObject(new BrickWall(), 441,403);
        addObject(new BrickWall(),536,475);
        addObject(new BrickWall(),424,529);
        addObject(new Floor(), 600, 700);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(new Trapdoor(GRAVITY), 575, 600);
        addObject(new Trapdoor(GRAVITY), 221,204);
        addObject(new Lava(GRAVITY),1028,688);
        addObject(new Lava(GRAVITY),341,688);
        addObject(new Lava(GRAVITY),683,688);
        addObject(new BrickWall(),518,308);
        addObject(new BrickWall(),584,91);
        addObject(new BrickWall(),992,267);
        addObject(new BrickWall(),766,128);
        addObject(new BrickWall(),876,180);
        addObject(new BrickWall(),1099,184);
        addObject(new BrickWall(),1178,100);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.01)
        {
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
