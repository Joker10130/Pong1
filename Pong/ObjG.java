import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjG here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjG extends Actor
{
    /**
     * Act - do whatever the ObjG wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld world = (MyWorld)getWorld();
       if(isTouching(Ball.class)){
           world.removeObject(this);
           world.addScore(20);
           world.counter(-1);
       }
    }    
}
