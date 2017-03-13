import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ObjY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ObjY extends Actor
{
    /**
     * Act - do whatever the ObjY wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        MyWorld world = (MyWorld)getWorld();
       if(isTouching(Ball.class)){
           world.removeObject(this);
           world.addScore(15);
           world.counter(-1);
       }
    }    
}
