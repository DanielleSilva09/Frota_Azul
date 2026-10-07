import java.util.ArrayList;

public class Parque 
{
    private String nome;
    private String morada;
    private ArrayList<Lugar> lugares;

    public Parque(String nome, String morada , int numLugares)
    {
        this.nome = nome;
        this.morada = morada;
        this.lugares = new ArrayList();
        
        for(int i = 0; i < numLugares; i++){
            String numLugar = "L-" + i;
        
            Lugar lTemp = new Lugar(numLugares);
            
            this.lugares.add(lTemp); 
        }
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getMorada()
    {
        return morada;
    }

    public void setMorada(String morada)
    {
        this.morada = morada;
    }

    public ArrayList<Lugar> getLugares()
    {
        return lugares;
    }

    public void setLugares(ArrayList<Lugar> lugares)
    {
        this.lugares = lugares;
    }

    public void adicionarLugar(Lugar lugar)
    {
        lugares.add(lugar);
    }

    public void removerLugar(Lugar lugar)
    {
        lugares.remove(lugar);
    }
    
    public boolean estacionar(Autocarro a){
        for(int i = 0; i <this.lugares.size(); i++){
            if(this.lugares.get(i).getOcupado()){
                this.lugares.get(i).EstacionarAutocarro(a);
                
                
                return true;
            }
        }
        return false;
    }
}