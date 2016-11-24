import game.Player;
import pokemon.*;


//Pokemon should be an object with those 25 attributes.  You should have an arraylist full of them.
public abstract class Pokemon extends Stats {
    public Pokemon wildPokemon(Player user){
        int id, pokeNum;
        double chance;
        chance = getChance();
        id = idGenerator();
        Pokemon x = new PokemonEmpty();

        if (chance <= 70){ //put into an array by rarity later
            switch(id){
                case 1:
                    x = new PokemonBulbasaur(user);
                    break;
                case 2:
                    x = new PokemonSquirtle(user);
                    break;
                case 3:
                    x = new PokemonCharmander(user);
                    break;
                case 4:
                    x = new PokemonCaterpie(user);
                    break;
                case 5:
                    x = new PokemonWeedle(user);
                    break;
                case 6:
                    x = new PokemonPidgey(user);
                    break;
            }
        } else if (chance <= 90 && chance > 70){
            switch(id){
                case 1:
                    x = new PokemonIvysaur(user);
                    break;
                case 2:
                    x = new PokemonWartortle(user);
                    break;
                case 3:
                    x = new PokemonCharmeleon(user);
                    break;
                case 4:
                    x = new PokemonMetapod(user);
                    break;
                case 5:
                    x = new PokemonKakuna(user);
                    break;
                case 6:
                    x = new PokemonPidgeotto(user);
                    break;
            }
        } else if (chance <= 100 && chance > 90) {
            switch(id){
                case 1:
                    x = new PokemonVenusaur(user);
                    break;
                case 2:
                    x = new PokemonBlastoise(user);
                    break;
                case 3:
                    x = new PokemonCharizard(user);
                    break;
                case 4:
                    x = new PokemonButterfree(user);
                    break;
                case 5:
                    x = new PokemonBeedrill(user);
                    break;
                case 6:
                    x = new PokemonPidgeot(user);
                    break;
            }
        }
        return x;
    }

    public Pokemon beginnerPokemon(int typ){
        int id;
        int pokeNum;
        id = typ;
        Pokemon x = new PokemonEmpty();
        switch(id){
            case 1:
                x = new PokemonBulbasaur();
                break;
            case 2:
                x = new PokemonCharmander();
                break;
            case 3:
                x = new PokemonSquirtle();
                break;
        }
        return x;
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

    private double getChance(){
        double chance;
        chance = Math.random() * 100;
        chance = Math.round(chance);

        return chance;
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