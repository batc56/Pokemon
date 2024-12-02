public class PokemonEau extends Pokemon{

    public PokemonEau(String nom, int hp, int atk) {
        super(nom, hp, atk);
    }
    public void attaquer(Pokemon p){
        if(p instanceof PokemonFeu){
            // TODO
            p.setHp(p.getHp()-this.0.5*atk);

        }
        else if (p instanceof PokemonEau){



        } else if (p instanceof PokemonPlante){


        }
    }

}
