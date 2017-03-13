import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public boolean easy;
    public boolean medium;
    public boolean hard;
    public int count = 40;
    public int score;
    private int time;
    public MyWorld()
    {    
        
        super(800, 600, 1); 
        prepare();
        score=0;
        
        time=3000;
        showScore();
        showTime();
        
    }
    public void counter(int points){
        
        count = count-points;
        if(count==1){
            prepare();
        }
    }
    
    public void act(){
        countTime();
       
    }
    
    public void addScore(int points){
        score = score+points;
        showScore();
        
    }
     private void showScore(){
        showText("Score: "+score,60,25);
    }
    private void countTime(){
        time--;
        showTime();
        if (time == 0)
        {
            Greenfoot.playSound("win.wav");
            showEndMessage();
            addObject(new Restart(),200,500);
            addObject(new MenuButt(),600,500);
            
        }
        
    }
    private void showTime(){
        showText("Time: " + time, 740, 25);
    }
    public void showEndMessage(){
        showText("Time is up - you win!", getWidth()/2, 290);
        showText("Your final score: " + score + " points", getWidth()/2, 310);
    }
    public void showLose(){
        showText("You lose!!!", getWidth()/2, 290);
        //showText("Your final score: " + score + " points", getWidth()/2, 310);
    }
    private void prepare(){
        for(int i=0;i<10;i++){
            Obj obj = new Obj();
            addObject(obj,i*60+140,40);
        }
        for(int i=0;i<10;i++){
            ObjG objg = new ObjG();
            addObject(objg,i*60+140,60);
        }
        for(int i=0;i<10;i++){
            ObjY objy = new ObjY();
            addObject(objy,i*60+140,80);
        }
        for(int i=0;i<10;i++){
            ObjO objo = new ObjO();
            addObject(objo,i*60+140,100);
        }
    }
}
