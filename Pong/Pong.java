import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pong extends Actor
{
    /**
     * Act - do whatever the Pong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    public Pong(int speed){
        this.speed = speed;
    }
    public void act() 
    {
        checkKeys();
    }    
    private void checkKeys(){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed,getY());
        }
    }
}
