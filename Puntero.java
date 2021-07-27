import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Propiedade de la clase TheSpace
 * 
 * @author: Maria Marta Ramirez Gil
 * Carne 21342 Universidad del Valle de Guatemala
 * Proyecto 1 Naksatra Game
 * @version:  0.1.1 - 26 de Julio 2021 
 */
public class Puntero extends Actor
{
    /*Realizar instancias movimientoFlechas(), move(), tocarEstrella()*/
    public void act() 
    {
        movimientoFlechas();
        move(4);
        tocarEstrella();
    }    
    
	/*Definir instancia movimientoFlechas() que se encargara del giro de Puntero con las flechas derecha y izquierda*/
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
    
	/*Definir instancia tocarEstrella() para cuando Puntero toque a EstrellaSi elimine a EstrellaSi*/
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
        }
    }
}
