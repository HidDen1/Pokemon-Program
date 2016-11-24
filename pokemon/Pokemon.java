package pokemon;

import game.Player;

public abstract class Pokemon extends Stats {

    static Pokemon[] getRarityLev1(){
        return new Pokemon[]{new PokemonBulbasaur(), new PokemonSquirtle(), new PokemonCharmander(), new PokemonCaterpie(), new PokemonWeedle(), new PokemonPidgey()};
    }

    static Pokemon[] getRarityLev2(){
        return new Pokemon[]{new PokemonIvysaur(), new PokemonWartortle(), new PokemonCharmeleon(), new PokemonMetapod(), new PokemonKakuna(), new PokemonPidgeotto()};
    }

    static Pokemon[] getRarityLev3(){
        return new Pokemon[]{new PokemonVenusaur(), new PokemonBlastoise(), new PokemonCharizard(), new PokemonButterfree(), new PokemonBeedrill(), new PokemonPidgeot()};
    }

    static Pokemon[] getStarters(){
        return new Pokemon[]{new PokemonBulbasaur(), new PokemonSquirtle(), new PokemonCharmander()};
    }


    static public Pokemon wildPokemon(Player user){
        int id = idGenerator();
        double chance;
        chance = getChance();
        Pokemon p = null;

        if (chance <= 60){
            p = getRarityLev1()[id];
        } else if (chance >= 61 && chance <= 89){
            p = getRarityLev2()[id];
        } else if (chance < 101 && chance >= 90) {
            p = getRarityLev3()[id];
        }
        assert p != null;
            p.changeLevel(levelGenerator(user));
        return p;
    }

    static public Pokemon beginnerPokemon(int typ){
        Pokemon p = getStarters()[typ];
        p.changeLevel(5);
        return p;
    }

    protected static int levelGenerator(Player user){
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

    private static double getChance(){
        double chance;
        chance = Math.random() * 100;
        chance = Math.round(chance);

        return chance;
    }

    private static int idGenerator(){
        double a;
        int b;

        a = 1 + Math.random() * (6 - 1);
        b = (int) Math.round(a);

        return b;
    }

    void changeLevel(int l){
        lev = l;
    }
}

//similar to enemy class in the quest and indivs for stats