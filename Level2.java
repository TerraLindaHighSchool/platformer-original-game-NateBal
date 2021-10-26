import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0667f;
    private final GreenfootSound MUSIC = new GreenfootSound("kv-ocean.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 5;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
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
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(new Trapdoor(GRAVITY), 524,545);
        addObject(new Trapdoor(GRAVITY), 728,439);
        addObject(new Trapdoor(GRAVITY), 840,212);
        addObject(new Trapdoor(GRAVITY), 537,354);
        addObject(new BrickWall(),278,453);
        addObject(new BrickWall(),137,207);
        addObject(new BrickWall(),408,72);
        addObject(new BrickWall(),456,545);
        addObject(new BrickWall(),621,130);
        addObject(new BrickWall(),916,125);
        addObject(new BrickWall(),1096,103);
        addObject(new BrickWall(),1149,101);
        addObject(new BrickWall(),75,367);
        addObject(new BrickWall(),338,159);
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
