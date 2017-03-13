import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int hSpeed;
    private int vSpeed;
    private boolean easy = false;
    private boolean medium = false;
    private boolean hard = false;
    public Ball(int hSpeed,int vSpeed){
        this.hSpeed = hSpeed;
        this.vSpeed = vSpeed;
    }
    public void act() 
    {
       
        movement();
        Actor Pong = getOneIntersectingObject(Pong.class);
        Actor Obj = getOneIntersectingObject(Obj.class);
        Actor ObjG = getOneIntersectingObject(ObjG.class);
        Actor ObjY = getOneIntersectingObject(ObjY.class);
        Actor ObjO = getOneIntersectingObject(ObjO.class);
        if(Pong!=null){
            vSpeed = -vSpeed;
            Greenfoot.playSound("boom.wav");
        }
        if(Obj!=null){
            vSpeed = -vSpeed;
            Greenfoot.playSound("fireball.wav");
            
        }
        if(ObjG!=null){
            vSpeed = -vSpeed;
            Greenfoot.playSound("fireball.wav");
            
        }
        if(ObjY!=null){
            vSpeed = -vSpeed;
            Greenfoot.playSound("fireball.wav");
            
        }
        if(ObjO!=null){
            vSpeed = -vSpeed;
            Greenfoot.playSound("fireball.wav");
            
        }
        
    }    
   
    private void movement(){
    setLocation(getX()+hSpeed,getY()+vSpeed);
        if(getX()<3){
            hSpeed = -hSpeed;
            Greenfoot.playSound("boom.wav");
        } 
        if(getY()<3){
            vSpeed = -vSpeed;
            Greenfoot.playSound("boom.wav");
        }
        if(getX()>getWorld().getWidth()-3){
            hSpeed = -hSpeed;
            Greenfoot.playSound("boom.wav");
        }
        if(getY()>getWorld().getHeight()-10){
            
            MyWorld world = (MyWorld)getWorld();
            
            Greenfoot.playSound("die.wav");
            Greenfoot.setWorld(new Result());
            /*world.showLose();
            world.addObject(new Restart(),200,500);
            world.addObject(new MenuButt(),600,500);
            world.removeObject(this);*/
           
             
           
        }
    }
}
