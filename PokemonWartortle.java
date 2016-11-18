public class PokemonWartortle extends Pokemon{

    public PokemonWartortle(Player user){
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
        att = new String[]{"Aqua Tail", "Ice Beam", "Bite", "Brine"};
        attPower = new int[]{90, 90, 60, 65};
        attType1 = new String[]{"Water", "Ice", "Dark", "Water"};
        attType2 = new String[]{"Physical", "Special", "Physical", "Special"};
    }

}