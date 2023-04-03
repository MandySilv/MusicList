

import java.util.ArrayList;

public class MusicList{
    public static void main (String[] args){
       ArrayList <String> ListaParaIlhaDeserta = new ArrayList <String>();
        ListaParaIlhaDeserta.add("Até Que Durou");
        ListaParaIlhaDeserta.add("Fim De Semana No rio");
        ListaParaIlhaDeserta.add("Minha Cura");
        ListaParaIlhaDeserta.add("Me faça Forte");
        ListaParaIlhaDeserta.add("Set Tatuapé");
        ListaParaIlhaDeserta.add("Tem Café");
        ListaParaIlhaDeserta.add("Voz&Violao");
        System.out.println(ListaParaIlhaDeserta.size());
        ListaParaIlhaDeserta.remove( "Fim De Semana No rio");
        ListaParaIlhaDeserta.remove("Voz&Violao");
        int indiceA = 1;
        int indiceB = 3;
        String Temp = (ListaParaIlhaDeserta.get(indiceA));
        ListaParaIlhaDeserta.set(indiceA, ListaParaIlhaDeserta.get(indiceB));
        ListaParaIlhaDeserta.set(indiceB, Temp);
        System.out.println(ListaParaIlhaDeserta);



        
  


















    }
}