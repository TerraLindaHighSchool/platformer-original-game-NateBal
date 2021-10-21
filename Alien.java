import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    public Alien(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        move(8);
        turnAtEdge();
    }
    
    public void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(180);
        }
    }
    
    protected void fall(){} 
}
