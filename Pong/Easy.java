import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Actor
{
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this)){
             MyWorld world = new MyWorld();
             world.easy = true;
             world.medium = false;
             world.hard = false;
            Greenfoot.setWorld(world);
            world.addObject(new Ball(5,5),world.getWidth()/2,world.getHeight()-45);
             world.addObject(new Pong(5),world.getWidth()/2,world.getHeight()-15);
        }
    }    
}
