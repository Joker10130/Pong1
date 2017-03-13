import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Actor
{
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Difficulty dif = new Difficulty();
            Greenfoot.setWorld(dif);
            /*MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
            if(world.easy==true){
                world.addObject(new Ball(5,5),world.getWidth()/2,world.getHeight()-45);
                world.addObject(new Pong(5),world.getWidth()/2,world.getHeight()-15);
            }
            if(world.medium==true){
                 world.addObject(new Ball(10,10),world.getWidth()/2,world.getHeight()-45);
                 world.addObject(new Pong(7),world.getWidth()/2,world.getHeight()-15);
            }
            if(world.hard==true){
                world.addObject(new Ball(15,15),world.getWidth()/2,world.getHeight()-45);
                world.addObject(new Pong(12),world.getWidth()/2,world.getHeight()-15);
            }*/
        }
    }    
}
