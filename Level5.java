import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level5 extends World
{
    private final float GRAVITY = 0.06f;
    private final GreenfootSound MUSIC = new GreenfootSound("triumphant-long-6673.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 5;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
    
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level5()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 633, 1, false); 
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
        addObject(new Player(SPEED, JUMP_FORCE, GRAVITY, MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC), 96, 600);

        addObject(new Floor(), 600, 633);
        addObject(new BigPlatform(),191,615);
        addObject(new BigPlatform(),358,536);
        addObject(new BigPlatform(),524,459);
        addObject(new BigPlatform(),683,372);
        addObject(new BigPlatform(),451,596);
        addObject(new BigPlatform(),614,523);
        addObject(new BigPlatform(),779,430);
        addObject(new BigPlatform(),969,428);
        addObject(new BigPlatform(),1099,336);
        addObject(new BigTrap(GRAVITY), 817, 292);
        addObject(new BigPlatform(),968,207);
        addObject(new BigPlatform(),1150,103);
        BigPlatformV bigPlatformV = new BigPlatformV();
        addObject(bigPlatformV,276,390);
        BigPlatformV bigPlatformV2 = new BigPlatformV();
        addObject(bigPlatformV2,450,329);
        BigPlatformV bigPlatformV3 = new BigPlatformV();
        addObject(bigPlatformV3,608,268);
        BigPlatformV bigPlatformV4 = new BigPlatformV();
        addObject(bigPlatformV4,741,171);
        bigPlatformV3.setLocation(601,256);
        BigPlatformV bigPlatformV5 = new BigPlatformV();
        addObject(bigPlatformV5,896,70);
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
