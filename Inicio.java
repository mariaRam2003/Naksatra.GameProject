import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Propiedade de la clase TheSpace
 * 
 * @author: Maria Marta Ramirez Gil
 * Carne 21342 Universidad del Valle de Guatemala
 * Proyecto 1 Naksatra Game
 * @version:  0.1.2 - 26 de Julio 2021 
 */
public class Inicio extends World
{
    Flecha flecha = new Flecha();
    private int opcion=0; //0 = jugar & 1 = salir

    public Inicio()
    {    
        super(600, 400, 1);
        prepararInicio();

    }

    private void prepararInicio()
    {
        GreenfootSound sonido = new GreenfootSound("Espacio.wav");
        sonido.play();
        addObject(new jugar(),299,130);
        addObject(new salir(),320,282);
        addObject(flecha,182,172);
    }

    public void act(){
        if (Greenfoot.isKeyDown("UP") && opcion !=0) {opcion++;}
        if (Greenfoot.isKeyDown("DOWN") && opcion !=1) {opcion--;}

        if (opcion>=2) opcion=0;
        if (opcion<0) opcion=1;

        flecha.setLocation(182,172 +(opcion*100));

        if (Greenfoot.isKeyDown("SPACE") || Greenfoot.isKeyDown("ENTER")){
            switch(opcion){
                case 0: //opcion jugar
                Greenfoot.setWorld(new TheSpace());
                break;
                case 2: //opcion salir
                Greenfoot.stop();
                break;
            }
        }
    }

}