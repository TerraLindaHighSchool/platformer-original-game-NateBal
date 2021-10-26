import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.1f;
    private final GreenfootSound MUSIC = new GreenfootSound("Jazz.wav");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 5;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level2.class;
    
    
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
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
        addObject(new Bomb(GRAVITY), 225, 675);
        addObject(new Bomb(GRAVITY), 725, 675);
        addObject(new Bomb(GRAVITY), 1075, 375);
        addObject(new BrickWall(), 1125, 100);
        addObject(new BrickWall(), 1175, 100);
        addObject(new BrickWall(), 302,594);
        addObject(new BrickWall(), 425, 650);
        addObject(new BrickWall(), 475, 650);
        addObject(new BrickWall(), 255,455);
        addObject(new BrickWall(), 425, 500);
        addObject(new BrickWall(), 358,347);
        addObject(new BrickWall(), 775, 450);
        addObject(new BrickWall(), 725, 400);
        addObject(new BrickWall(), 775, 250);
        addObject(new BrickWall(), 1075, 200);
        addObject(new BrickWall(), 875, 400);
        addObject(new BrickWall(), 925, 250);
        addObject(new BrickWall(),1075,423);
        addObject(new BrickWall(),989,343);
        addObject(new Floor(), 600, 700);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(new Trapdoor(GRAVITY), 575, 600);
        addObject(new Trapdoor(GRAVITY), 577, 428);
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
