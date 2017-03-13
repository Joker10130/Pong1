import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Medium here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Medium extends Actor
{
    /**
     * Act - do whatever the Medium wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            MyWorld world = new MyWorld();
             world.easy = false;
             world.medium = true;
             world.hard = true;
            Greenfoot.setWorld(world);
            world.addObject(new Ball(10,10),world.getWidth()/2,world.getHeight()-45);
             world.addObject(new Pong(7),world.getWidth()/2,world.getHeight()-15);
        }
    }    
}
