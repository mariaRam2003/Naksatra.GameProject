import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Propiedade de la clase TheSpace
 * 
 * @author: Maria Marta Ramirez Gil
 * Carne 21342 Universidad del Valle de Guatemala
 * Proyecto 1 Naksatra Game
 * @version:  0.1.2 - 26 de Julio 2021 
 */
public class Puntero extends Actor
{
    /**
     * Moverse con las flechas
     */
    public void act() 
    {
        movimientoFlechas();
        move(4);
        tocarEstrella();
    }    
    
    public void movimientoFlechas()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void tocarEstrella()
    {
        Actor estrella;
        estrella = getOneObjectAtOffset(0, 0, EstrellaSi.class);
        Actor Star;
        //Star = getOneObjectAtOffset(star.class, 0, 0);
        if (estrella != null)
        {
            World world;
            world = getWorld();
            world.removeObject(estrella);
            TheSpace mundo = (TheSpace)world;
            Counter cont = mundo.getCounter();
            cont.addcontar();
        }
    }
}
