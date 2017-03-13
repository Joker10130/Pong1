import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hard extends Actor
{
    /**
     * Act - do whatever the Hard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
             MyWorld world = new MyWorld();
             world.easy = false;
             world.medium = false;
             world.hard = true;
            Greenfoot.setWorld(world);
            world.addObject(new Ball(15,15),world.getWidth()/2,world.getHeight()-45);
             world.addObject(new Pong(12),world.getWidth()/2,world.getHeight()-15);
        }
    }
}
