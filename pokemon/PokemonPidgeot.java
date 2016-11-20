package pokemon;

public class PokemonPidgeot extends Pokemon{

    public PokemonPidgeot(Player user){
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
        att = new String[]{"Air Slash", "Hurricane", "Brave Bird", "Steel Wing"};
        attPower = new int[]{75, 110, 120, 70};
        attType1 = new String[]{"Flying", "Flying", "Flying", "Steel"};
        attType2 = new String[]{"Special", "Special", "Physical", "Physical"};
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
    }

}