import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Difficulty here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Difficulty extends World
{

    /**
     * Constructor for objects of class Difficulty.
     * 
     */
     
    public Difficulty()
    {    
        
        super(800, 600, 1); 
        addObject(new Easy(),400,100);
         addObject(new Medium(),400,300);
          addObject(new Hard(),400,500);
    }
}
