import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lava here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lava extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    public Lava(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        
    }
    
    protected void fall(){} 
}
