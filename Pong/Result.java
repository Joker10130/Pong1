import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Result here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Result extends World
{

    /**
     * Constructor for objects of class Result.
     * 
     */
    public Result()
    {    
        super(800, 600, 1); 
        showText("You lose!!!", getWidth()/2, 290);
        addObject(new Restart(),200,500);
        addObject(new MenuButt(),600,500);
        
    }
    
    
}
