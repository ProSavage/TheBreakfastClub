import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameRules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameRules extends Actor
{
    /**
     * Act - do whatever the GameRules wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public GameRules(){
        setImage(new GreenfootImage("GameRules1.png"));
    }
    public void act() 
    {
        if (Greenfoot.mouseClicked(null)){
            getWorld().removeObject(this);
        }
        
    }    
}
