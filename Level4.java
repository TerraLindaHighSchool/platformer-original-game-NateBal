import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4 extends World
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
    public Level4()
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

        addObject(new Floor(), 600, 700);
        addObject(new BrickWall(),1168,100);
        addObject(new BrickWall(),1116,100);
        addObject(new SmBrickWall(),188,508);
        addObject(new SmBrickWall(),278,353);
        addObject(new SmBrickWall(),371,204);
        addObject(new SmBrickWall(),468,73);
        addObject(new SmBrickWall(),654,150);
        addObject(new SmBrickWall(),796,311);
        addObject(new SmBrickWall(),942,455);
        addObject(new SmBrickWall(),1096,343);
        addObject(new SmBrickWall(),1021,218);
        addObject(new Alien(GRAVITY), 1000, 200);
        addObject(new Alien(GRAVITY), 1000, 450);
        addObject(new Alien(GRAVITY), 1000, 150);
        addObject(new Alien(GRAVITY), 1000, 100);
        addObject(new Alien(GRAVITY), 1000, 350);
        addObject(new Alien(GRAVITY), 1000, 550);
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
