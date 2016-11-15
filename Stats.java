
public class Stats {
    public String name, itemName;
    public double atk, def, spAtk, spDef, spd, hp, lev, exp, ballBonus;
    public int iv, level = 1, id, healthRestore, itemID;
    public String att [] = new String[4];
    public String attType1 [] = new String [4];
    public String attType2 [] = new String [4];
    public String type;
    public int attPower [] = new int[4];
    public Pokemon party [] = new Pokemon [6];
    public Pokemon storage [] = new Pokemon[1000];

    public String getName(){
        return(name);
    }

    public double getAttack(){
        return(atk);
    }

    public double getDeffense(){
        return(def);
    }

    public double getSpecialAttack(){
        return(spAtk);
    }

    public double getSpecialDeffense(){
        return(spDef);
    }

    public double getSpeed(){
        return(spd);
    }

    public double getHealthPoints(){
        return(hp);
    }

    public double getLevel(){
        return(lev);
    }

    public int getIV(){
        return(iv);
    }

    public int getTrainerLevel(){
        return(level);
    }

    public String getElementType(){
        return(type);
    }

    public int getID(){
        return (id);
    }

    public Pokemon getPokemon(){
        return(party[0]);
    }

    public int getItemID(){
        return(itemID);
    }

}

