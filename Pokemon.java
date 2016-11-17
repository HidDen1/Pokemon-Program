//Pokemon should be an object with those 25 attributes.  You should have an arraylist full of them.
public abstract class Pokemon extends Stats {
    public void wildPokemon(Player user){
        int id, pokeNum;

        if (chance <= 70){

        } else if (chance <= 90 && chance > 70){
            id = idGenerator();
            switch (id){
               /* case 1:
                    name = "Ivysaur";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 1;
                    //pokeNum = 2;
                    exp = Math.pow(lev * 10 , 2);
                    type = "Grass / Posion";
                    atk = (62 * 2 + iv) * lev / 100 + 5;
                    def = (63 * 2 + iv) * lev / 100 + 5;
                    spAtk = (80 * 2 + iv) * lev / 100 + 5;
                    spDef = (80 * 2 + iv) * lev / 100 + 5;
                    spd = (60 * 2 + iv) * lev / 100 + 5;
                    hp = (60 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Vine Whip";
                    attPower[0] = 45;
                    attType1 [0] = "Grass";
                    attType2 [0] = "Physical";
                    att[1] = "Razorleaf";
                    attPower[1] = 55;
                    attType1 [1] = "Grass";
                    attType2 [1] = "Physical";
                    att[2] = "Double Edge";
                    attPower[2] = 120;
                    attType1 [2] = "Normal";
                    attType2 [2] = "Physical";
                    att[3] = "Solarbeam";
                    attPower[3] = 120;
                    attType1 [3] = "Grass";
                    attType2 [3] = "Special";
                    break;
                case 2:
                    name = "Charmeleon";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 2;
                    //pokeNum = 5;
                    exp = Math.pow(lev * 10 , 2);
                    type = "Fire";
                    atk = (64 * 2 + iv) * lev / 100 + 5;
                    def = (58 * 2 + iv) * lev / 100 + 5;
                    spAtk = (80 * 2 + iv) * lev / 100 + 5;
                    spDef = (65 * 2 + iv) * lev / 100 + 5;
                    spd = (80 * 2 + iv) * lev / 100 + 5;
                    hp = (58 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Slash";
                    attPower[0] = 70;
                    attType1 [0] = "Normal";
                    attType2 [0] = "Physical";
                    att[1] = "Dragon Rage";
                    attPower[1] = 40;
                    attType1 [2] = "Dragon";
                    attType2 [1] = "Special";
                    att[2] = "Flame Burst";
                    attPower[2] = 70;
                    attType1 [2] = "Fire";
                    attType2 [2] = "Special";
                    att[3] = "Flamethrower";
                    attPower[3] = 90;
                    attType1 [3] = "Fire";
                    attType2 [3] = "Special";
                    break;
                case 3:
                    name = "Wartortle";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 3;
                    //pokeNum = 8;
                    exp = Math.pow(lev * 10 , 2);
                    type = "Water";
                    atk = (63 * 2 + iv) * lev / 100 + 5;
                    def = (80 * 2 + iv) * lev / 100 + 5;
                    spAtk = (65 * 2 + iv) * lev / 100 + 5;
                    spDef = (80 * 2 + iv) * lev / 100 + 5;
                    spd = (58 * 2 + iv) * lev / 100 + 5;
                    hp = (59 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Aqua Tail";
                    attPower[0] = 90;
                    attType1 [0] = "Water";
                    attType2 [0] = "Physical";
                    att[1] = "Ice Beam";
                    attPower[1] = 90;
                    attType1 [1] = "Ice";
                    attType2 [1] = "Special";
                    att[2] = "Bite";
                    attPower[2] = 60;
                    attType1 [2] = "Dark";
                    attType2 [2] = "Physical";
                    att[3] = "Brine";
                    attPower[3] = 65;
                    attType1 [3] = "Water";
                    attType2 [3] = "Special";
                    break;
                case 4:
                    name = "Metapod";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 11;
                    //pokeNum = 10; //for the pokedex
                    exp = Math.pow(lev * 10 , 2);
                    type = "Bug";
                    atk = (20 * 2 + iv) * lev / 100 + 5;
                    def = (55 * 2 + iv) * lev / 100 + 5;
                    spAtk = (25 * 2 + iv) * lev / 100 + 5;
                    spDef = (25 * 2 + iv) * lev / 100 + 5;
                    spd = (30 * 2 + iv) * lev / 100 + 5;
                    hp = (50 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Tackle";
                    attPower[0] = 50;
                    attType1 [0] = "Normal";
                    attType2 [0] = "Physical";
                    att[1] = "Bug Bite";
                    attPower[1] = 60;
                    attType1 [1] = "Bug";
                    attType2 [1] = "Physical";
                    att[2] = "-----";
                    attPower[2] = 0;
                    attType1 [2] = "";
                    attType2 [2] = "";
                    att[3] = "-----";
                    attPower[3] = 0;
                    attType1 [3] = "";
                    attType2 [3] = "";
                    break;
                case 5:
                    name = "Kakuna";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 4;
                    //pokeNum = 15; //for the pokedex
                    exp = Math.pow(lev * 10 , 2);
                    type = "Bug/Poison";
                    atk = (25 * 2 + iv) * lev / 100 + 5;
                    def = (50 * 2 + iv) * lev / 100 + 5;
                    spAtk = (25 * 2 + iv) * lev / 100 + 5;
                    spDef = (25 * 2 + iv) * lev / 100 + 5;
                    spd = (35 * 2 + iv) * lev / 100 + 5;
                    hp = (45 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Poison String";
                    attPower[0] = 15;
                    attType1 [0] = "Poison";
                    attType2 [0] = "Physical";
                    att[1] = "Bug Bite";
                    attPower[1] = 60;
                    attType1 [1] = "Bug";
                    attType2 [1] = "Physical";
                    att[2] = "-----";
                    attPower[2] = 0;
                    attType1 [2] = "";
                    attType2 [2] = "";
                    att[3] = "-----";
                    attPower[3] = 0;
                    attType1 [3] = "";
                    attType2 [3] = "";
                    break; */
                case 6:
                    name = "Pidgeotto";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 1;
                    //pokeNum = 17; //for the pokedex
                    exp = Math.pow(lev * 10 , 2);
                    type = "Normal/Flying";
                    atk = (60 * 2 + iv) * lev / 100 + 5;
                    def = (55 * 2 + iv) * lev / 100 + 5;
                    spAtk = (50 * 2 + iv) * lev / 100 + 5;
                    spDef = (50 * 2 + iv) * lev / 100 + 5;
                    spd = (71 * 2 + iv) * lev / 100 + 5;
                    hp = (63 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Air Slash";
                    attPower[0] = 75;
                    attType1 [0] = "Flying";
                    attType2 [0] = "Special";
                    att[1] = "Quick Attack";
                    attPower[1] = 40;
                    attType1 [1] = "Normal";
                    attType2 [1] = "Physical";
                    att[2] = "Twister";
                    attPower[2] = 40;
                    attType1 [2] = "Dragon";
                    attType2 [2] = "Special";
                    att[3] = "Wing Attack";
                    attPower[3] = 60;
                    attType1 [3] = "Flying";
                    attType2 [3] = "Physical";
                    break;
            }

        } else if (chance <= 100 && chance > 90){
            id = idGenerator();
            switch (id){
                case 1:
                    name = "Venusaur";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 1;
                    //pokeNum = 2;
                    exp = Math.pow(lev * 10 , 2);
                    type = "Grass / Posion";
                    atk = (82 * 2 + iv) * lev / 100 + 5;
                    def = (83 * 2 + iv) * lev / 100 + 5;
                    spAtk = (100 * 2 + iv) * lev / 100 + 5;
                    spDef = (100 * 2 + iv) * lev / 100 + 5;
                    spd = (80 * 2 + iv) * lev / 100 + 5;
                    hp = (80 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Petal Dance";
                    attPower[0] = 120;
                    attType1 [0] = "Grass";
                    attType2 [0] = "Special";
                    att[1] = "Petal Blizzard";
                    attPower[1] = 90;
                    attType1 [1] = "Grass";
                    attType2 [1] = "Physical";
                    att[2] = "Double Edge";
                    attPower[2] = 120;
                    attType1 [2] = "Normal";
                    attType2 [2] = "Physical";
                    att[3] = "Solarbeam";
                    attPower[3] = 120;
                    attType1 [3] = "Grass";
                    attType2 [3] = "Special";
                    break;
                case 2:
                    name = "Charizard";
                    lev = levelGenerator(user);
                    iv = 31;
                    //id = 2;
                    //pokeNum = 6;
                    exp = Math.pow(lev * 10 , 2);
                    type = "Fire / Flying";
                    atk = (84 * 2 + iv) * lev / 100 + 5;
                    def = (78 * 2 + iv) * lev / 100 + 5;
                    spAtk = (109 * 2 + iv) * lev / 100 + 5;
                    spDef = (85 * 2 + iv) * lev / 100 + 5;
                    spd = (100 * 2 + iv) * lev / 100 + 5;
                    hp = (78 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Flare Blitz";
                    attPower[0] = 120;
                    attType1 [0] = "Fire";
                    attType2[0] = "Physical";
                    att[1] = "Fire Blast";
                    attPower[1] = 120;
                    attType1 [1] = "Fire";
                    attType2[1] = "Special";
                    att[2] = "Heat Wave";
                    attPower[2] = 90;
                    attType1 [2] = "Fire";
                    attType2[2] = "Special";
                    att[3] = "Flamethrower";
                    attPower[3] = 90;
                    attType1 [3] = "Grass";
                    attType2[3] = "Special";
                    break;

                case 3:
                    name = "Blastoise";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 3;
                    //pokeNum = 9;
                    exp = Math.pow(lev * 10 , 2);
                    type = "Water";
                    atk = (83 * 2 + iv) * lev / 100 + 5;
                    def = (100 * 2 + iv) * lev / 100 + 5;
                    spAtk = (85 * 2 + iv) * lev / 100 + 5;
                    spDef = (105 * 2 + iv) * lev / 100 + 5;
                    spd = (78 * 2 + iv) * lev / 100 + 5;
                    hp = (79 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Aqua Tail";
                    attPower[0] = 90;
                    attType1 [0] = "Water";
                    attType2 [0] = "Physical";
                    att[1] = "Ice Beam";
                    attPower[1] = 90;
                    attType1 [1] = "Ice";
                    attType2 [1] = "Special";
                    att[2] = "Skull Bash";
                    attPower[2] = 130;
                    attType1 [2] = "Normal";
                    attType2 [2] = "Physical";
                    att[3] = "Hydro Pump";
                    attPower[3] = 110;
                    attType1 [3] = "Water";
                    attType2 [3] = "Special";
                    break;
                case 4:
                    name = "Butterfree";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 4;
                    //pokeNum = 12; //for the pokedex
                    exp = Math.pow(lev * 10 , 2);
                    type = "Bug/Flying";
                    atk = (45 * 2 + iv) * lev / 100 + 5;
                    def = (50 * 2 + iv) * lev / 100 + 5;
                    spAtk = (90 * 2 + iv) * lev / 100 + 5;
                    spDef = (80 * 2 + iv) * lev / 100 + 5;
                    spd = (70 * 2 + iv) * lev / 100 + 5;
                    hp = (60 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Psybeam";
                    attPower[0] = 65;
                    attType1 [0] = "Physcic";
                    attType2 [0] = "Special";
                    att[1] = "Bug Bite";
                    attPower[1] = 60;
                    attType1 [1] = "Bug";
                    attType2 [1] = "Physical";
                    att[2] = "Silver Wind";
                    attPower[2] = 60;
                    attType1 [2] = "Bug";
                    attType2 [2] = "60";
                    att[3] = "Bug Buzz";
                    attPower[3] = 90;
                    attType1 [3] = "Bug";
                    attType2 [3] = "Special";
                    break;
                case 5:
                    name = "Beedrill";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 4;
                    //pokeNum = 10; //for the pokedex
                    exp = Math.pow(lev * 10 , 2);
                    type = "Bug/Poison";
                    atk = (90 * 2 + iv) * lev / 100 + 5;
                    def = (40 * 2 + iv) * lev / 100 + 5;
                    spAtk = (45 * 2 + iv) * lev / 100 + 5;
                    spDef = (80 * 2 + iv) * lev / 100 + 5;
                    spd = (75 * 2 + iv) * lev / 100 + 5;
                    hp = (65 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Pursuit";
                    attPower[0] = 40;
                    attType1 [0] = "Dark";
                    attType2 [0] = "Physical";
                    att[1] = "Bug Bite";
                    attPower[1] = 60;
                    attType1 [1] = "Bug";
                    attType2 [1] = "Physical";
                    att[2] = "Poison Jab";
                    attPower[2] = 80;
                    attType1 [2] = "Poison";
                    attType2 [2] = "Physical";
                    att[3] = "Fell Stinger";
                    attPower[3] = 30;
                    attType1 [3] = "Bug";
                    attType2 [3] = "Physical";
                    break;
                case 6:
                    name = "Pidgeot";
                    lev = levelGenerator(user);
                    iv = ivGenerator();
                    //id = 1;
                    //pokeNum = 17; //for the pokedex
                    exp = Math.pow(lev * 10 , 2);
                    type = "Normal/Flying";
                    atk = (80 * 2 + iv) * lev / 100 + 5;
                    def = (75 * 2 + iv) * lev / 100 + 5;
                    spAtk = (70 * 2 + iv) * lev / 100 + 5;
                    spDef = (70 * 2 + iv) * lev / 100 + 5;
                    spd = (101 * 2 + iv) * lev / 100 + 5;
                    hp = (83 * 2 + iv) * lev / 100 + 10;
                    att[0] = "Air Slash";
                    attPower[0] = 75;
                    attType1 [0] = "Flying";
                    attType2 [0] = "Special";
                    att[1] = "Hurricane";
                    attPower[1] = 110;
                    attType1 [1] = "Flying";
                    attType2 [1] = "Special";
                    att[2] = "Brave Bird";
                    attPower[2] = 120;
                    attType1 [2] = "Flying";
                    attType2 [2] = "Physical";
                    att[3] = "Steel Wing";
                    attPower[3] = 70;
                    attType1 [3] = "Steel";
                    attType2 [3] = "Physical";
                    break;
            }
        }

    }

    public void beginnerPokemon(int typ){ //depends on the users choose
        int id;
        int pokeNum;
        id = typ;
        switch (id){
            case 1:
                name = "Bulbasaur";
                lev = 5;
                iv = ivGenerator();
                id = 0;
                pokeNum = 1; //for the pokedex
                exp = Math.pow(lev * 10 , 2);
                type = "Grass";
                atk = (49 * 2 + iv) * lev / 100 + 5;
                def = (49 * 2 + iv) * lev / 100 + 5;
                spAtk = (65 * 2 + iv) * lev / 100 + 5;
                spDef = (65 * 2 + iv) * lev / 100 + 5;
                spd = (45 * 2 + iv) * lev / 100 + 5;
                hp = (45 * 2 + iv) * lev / 100 + 10;
                att[0] = "Vine Whip";
                attPower[0] = 45;
                attType1 [0] = "Grass";
                attType2 [0] = "Physical";
                att[1] = "Razorleaf";
                attPower[1] = 55;
                attType1 [1] = "Grass";
                attType2 [1] = "Physical";
                att[2] = "Seed Bomb";
                attPower[2] = 80;
                attType1 [2] = "Grass";
                attType2 [2] = "Physical";
                att[3] = "Solarbeam";
                attPower[3] = 120;
                attType1 [3] = "Grass";
                attType2 [3] = "Special";
                break;
            case 2:
                name = "Charmander";
                lev = 5;
                iv = ivGenerator();
                id = 0;
                pokeNum = 4;
                exp = Math.pow(lev * 10 , 2);
                type = "Fire";
                atk = (52 * 2 + iv) * lev / 100 + 5;
                def = (43 * 2 + iv) * lev / 100 + 5;
                spAtk = (60 * 2 + iv) * lev / 100 + 5;
                spDef = (50 * 2 + iv) * lev / 100 + 5;
                spd = (65 * 2 + iv) * lev / 100 + 5;
                hp = (39 * 2 + iv) * lev / 100 + 10;
                att[0] = "Ember";
                attPower[0] = 40;
                attType1 [0] = "Fire";
                attType2 [0] = "Special";
                att[1] = "Dragon Rage";
                attPower[1] = 40;
                attType1 [1] = "Dragon";
                attType2 [1] = "Special";
                att[2] = "Fire Fang";
                attPower[2] = 65;
                attType1 [2] = "Fire";
                attType2 [2] = "Physical";
                att[3] = "Flamethrower";
                attPower[3] = 90;
                attType1 [3] = "Fire";
                attType2 [3] = "Special";
                break;
            case 3:
                name = "Squirtle";
                lev = 5;
                iv = ivGenerator();
                id = 0;
                pokeNum = 7;
                exp = Math.pow(lev * 10 , 2);
                type = "Water";
                atk = (48 * 2 + iv) * lev / 100 + 5;
                def = (65 * 2 + iv) * lev / 100 + 5;
                spAtk = (50 * 2 + iv) * lev / 100 + 5;
                spDef = (64 * 2 + iv) * lev / 100 + 5;
                spd = (43 * 2 + iv) * lev / 100 + 5;
                hp = (44 * 2 + iv) * lev / 100 + 10;
                att[0] = "Water Gun";
                attPower[0] = 40;
                attType1 [0] = "Water";
                attType2 [0] = "Special";
                att[1] = "Water Pulse";
                attPower[1] = 60;
                attType1 [1] = "Water";
                attType2 [1] = "Special";
                att[2] = "Bite";
                attPower[2] = 60;
                attType1 [2] = "Dark";
                attType2 [2] = "Physical";
                att[3] = "Brine";
                attPower[3] = 65;
                attType1 [3] = "Water";
                attType2 [3] = "Special";
                break;
        }
    }

    public void emptySlot(){
        name = "Empty";
        lev = 0;
        iv = 0;
        id = 1;
        exp = Math.pow(lev * 10 , 2);
        type = "null";
        atk = 0;
        def = 0;
        spAtk = 0;
        spDef = 0;
        spd = 0;
        hp = 0;
        att[0] = "";
        attPower[0] = 0;
        attType1 [0] = "";
        attType2 [0] = "";
        att[1] = "";
        attPower[1] = 0;
        attType1 [1] = "";
        attType2 [1] = "";
        att[2] = "";
        attPower[2] = 0;
        attType1 [2] = "";
        attType2 [2] = "";
        att[3] = "";
        attPower[3] = 0;
        attType1 [3] = "";
        attType2 [3] = "";
    }

    protected int levelGenerator(Player user){
        double l;
        int e;

        //l = (1 + Math.random() * (100 - 1));
        //while (l > user.pokemonLevel[0] + 5){
           //l = (1 + Math.random() * (100 - 1));
        //}

        //e = (int) Math.round(l);
        e = 1; //for testing

        return e;
    }

    protected int ivGenerator(){
        double i;
        int v;

        i = Math.random() * 31;
        v = (int) Math.round(i);

        return v;
    }

    private int idGenerator(){
        double a;
        int b;

        a = 1 + Math.random() * (6 - 1);
        b = (int) Math.round(a);

        return b;
    }
}

//similar to enemy class in the quest and indivs for stats