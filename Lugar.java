public class Lugar
{
    private int numLugar; // "A01"
    private Autocarro autocarroEstacionado; 
    private boolean isOcupado; 
    
    public Lugar(){
        
    }
    
    public Lugar(int numLugar)
    {
        this.numLugar = numLugar;
        this.isOcupado = false;
        this.autocarroEstacionado = null;
    }
    
    public int getnumLugar(){
        return this.numLugar;
    }
    
    public void setNumLugar(int NumLugar){
        this.numLugar = NumLugar;
    }
    
     public boolean getOcupado(){
        return this.isOcupado;
    }
    
     public void setOcupado(boolean isOcupado){
        this.isOcupado = isOcupado;
    }
    
    public Autocarro getautocarro(){
        return autocarroEstacionado;
    }
    
     public boolean EstacionarAutocarro(Autocarro a){
         //Conseguir estacionar autocarro 
         // se lugar estiver disponivel
         //quando this.isocupado == false 
      if(this.isOcupado){
          this.isOcupado = true;
          this.autocarroEstacionado = a;
          
          return true;
      }
      return false;
    }
    public boolean desocuparLugar(){
        if(this.isOcupado == true){
            this.isOcupado = false;
            this.autocarroEstacionado = null;
            
            return true;
        }
        return false;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        String resultado = "";
        sb.append("\n-----------------------------------------------------------------\n");
        sb.append("N.Lugar: " + this.numLugar);
        sb.append("\nOcupado: " + this.isOcupado);
        sb.append("\nAutocarro Estacionado: " + this.autocarroEstacionado);
        sb.append("\n-----------------------------------------------------------------\n");
        
        resultado = sb.toString();
        
        return resultado;
    }
}