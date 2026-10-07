public class Autocarro
    {
    //variaveis de classe 
    static final int MIN_LUGARES = 10;
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String matricula; // "xx-xx-xx ou xxxxx"
    private String cor; //"#xxxxxx"
    private int numLugares; // 1
    private boolean arCondicionado;
    private double Kms;  // 123.00
        
        public Autocarro(){}
        
    public Autocarro(String matricula, String cor, int numLugares, boolean arCondicionado, double kms)
    {
        this.matricula = matricula;
        this.cor = cor;
        // Não seja possivel inserir num lugares 0 ou negativos
        if(numLugares >= 1 ){
            this.numLugares = numLugares;
        }
        this.arCondicionado = arCondicionado ;
        
        if(Kms >= 1 ){
            this.Kms = Kms;
        }
        this.Kms = Kms;
    }
    
    public String getMatricula()
    {
        return this.matricula;
    }
    
    public String getCor()
    {
        return this.cor;
    }
    
    public int getnumLugares()
    {
        return this.numLugares;
    }
    
    public boolean getarCondicionado()
    {
        return this.arCondicionado;
    }
    
    public double getKms()
    {
        return this.Kms;
    }
    
    public void setMatricula(String m)
    {
        this.matricula = m;
    }
    
    public void setCor(String c)
    {
        this.cor = c;
    }
    
        public void setNumlugares(int numLugares)
    {
        this.numLugares = numLugares;
    }
    
    public void setarCondicionado(boolean ac)
    {
        this.arCondicionado = ac;
    }
    
    public void setKms(double kms)
    {
        this.Kms = kms;
    }
    public String toString()
        {
            String resultado = "Testar o toString";
            
            StringBuilder sb = new StringBuilder();
            
            sb.append("-----------------------------------------------------\n");
            sb.append("\nMatric: " + this.matricula);
            sb.append("\nCor: " + this.cor);
            sb.append("\nlugares: " + this.numLugares);
            sb.append("\narCondicionado: " + this.arCondicionado);
            sb.append("\nKms: " + this.Kms);
            sb.append("\n-----------------------------------------------------\n");
    
            resultado = sb.toString();
            return resultado;
        }
        
        
    static boolean validarKms(double kmsAValidar){
           if(kmsAValidar >=1){
                return true;
            }
            
            return false;
            
        }
    static boolean validarNumLugares(double lugaresAValidar){
        if(lugaresAValidar >= MIN_LUGARES){
                return true;
            }
            return false;
    }
    }