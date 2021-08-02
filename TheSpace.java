import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * Propiedade de la clase TheSpace
 * 
 * @author: Maria Marta Ramirez Gil
 * Carne 21342 Universidad del Valle de Guatemala
 * Proyecto 1 Naksatra Game
 * @version:  0.1.2 - 26 de Julio 2021 
 */
public class TheSpace extends World
{
    Counter cont = new Counter();
    /**
     * Color del fondo
     */

    public TheSpace()
    {
        super(600, 400, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        prepare();
    }

    public Counter getCounter(){
        return cont;
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Estrellano estrellano = new Estrellano();
        addObject(estrellano,75,51);
        Estrellano estrellano2 = new Estrellano();
        addObject(estrellano2,520,57);
        Estrellano estrellano3 = new Estrellano();
        addObject(estrellano3,526,163);
        Estrellano estrellano4 = new Estrellano();
        addObject(estrellano4,312,48);
        Estrellano estrellano5 = new Estrellano();
        addObject(estrellano5,394,134);
        Estrellano estrellano6 = new Estrellano();
        addObject(estrellano6,127,358);
        Estrellano estrellano7 = new Estrellano();
        addObject(estrellano7,409,224);
        Estrellano estrellano8 = new Estrellano();
        addObject(estrellano8,227,365);
        Estrellano estrellano9 = new Estrellano();
        addObject(estrellano9,296,306);
        Estrellano estrellano10 = new Estrellano();
        addObject(estrellano10,226,256);
        Estrellano estrellano11 = new Estrellano();
        addObject(estrellano11,127,208);
        Estrellano estrellano12 = new Estrellano();
        addObject(estrellano12,25,206);
        Estrellano estrellano13 = new Estrellano();
        addObject(estrellano13,32,274);
        Estrellano estrellano14 = new Estrellano();
        addObject(estrellano14,119,284);
        Estrellano estrellano15 = new Estrellano();
        addObject(estrellano15,65,350);
        Estrellano estrellano16 = new Estrellano();
        addObject(estrellano16,424,40);
        Estrellano estrellano17 = new Estrellano();
        addObject(estrellano17,191,45);
        Estrellano estrellano18 = new Estrellano();
        addObject(estrellano18,575,372);
        Estrellano estrellano19 = new Estrellano();
        addObject(estrellano19,476,365);
        Estrellano estrellano20 = new Estrellano();
        addObject(estrellano20,576,112);
        estrellano20.setLocation(576,112);
        Estrellano estrellano21 = new Estrellano();
        addObject(estrellano21,270,120);
        Estrellano estrellano22 = new Estrellano();
        addObject(estrellano22,54,100);
        Estrellano estrellano23 = new Estrellano();
        addObject(estrellano23,151,92);
        Puntero puntero = new Puntero();
        addObject(puntero,27,29);
        Meteorito meteorito = new Meteorito();
        addObject(meteorito,561,26);
        star star = new star();
        addObject(star,69,148);
        star star2 = new star();
        addObject(star2,176,148);
        star star3 = new star();
        addObject(star3,252,196);
        star star4 = new star();
        addObject(star4,352,256);
        star star5 = new star();
        addObject(star5,396,359);
        star star6 = new star();
        addObject(star6,558,257);
        star star7 = new star();
        addObject(star7,526,362);
        star.setLocation(68,148);
        EstrellaSi estrellaSi = new EstrellaSi();
        addObject(estrellaSi,68,148);
        star2.setLocation(176,149);
        EstrellaSi estrellaSi2 = new EstrellaSi();
        addObject(estrellaSi2,176,149);
        star3.setLocation(252,198);
        EstrellaSi estrellaSi3 = new EstrellaSi();
        addObject(estrellaSi3,252,198);
        star4.setLocation(352,257);
        EstrellaSi estrellaSi4 = new EstrellaSi();
        addObject(estrellaSi4,352,257);
        star5.setLocation(396,360);
        EstrellaSi estrellaSi5 = new EstrellaSi();
        addObject(estrellaSi5,396,360);
        star7.setLocation(526,362);
        EstrellaSi estrellaSi6 = new EstrellaSi();
        addObject(estrellaSi6,526,362);
        star6.setLocation(557,258);
        EstrellaSi estrellaSi7 = new EstrellaSi();
        addObject(estrellaSi7,557,258);
        addObject(cont, 300, 50);
    }
}