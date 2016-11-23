public class PokemonKakuna extends Pokemon{

    public PokemonKakuna(Player user){
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
        att = new String[]{"Poison Sting", "Bug Bite", "---", "---"};
        attPower = new int[]{15, 60, 0, 0};
        attType1 = new String[]{"Poison", "Bug", "", ""};
        attType2 = new String[]{"Physical", "Physical", "", ""};
    }

}