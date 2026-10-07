
/**
 * Escreva uma descrição da classe Teste_Autocarro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Teste_Autocarro
{
    public static void main(String[] args)
    {
        System.out.println("A classe teste autocarro está a funcionar!");
        /**
         * Funcionalidade para testar o construtor da classe Autocarro 
         */
        // criar um objeto do tipo Autocarro
        // Instanciar
        Autocarro a1 = new Autocarro("xx-xx-xx", "#xxxxxx", 101, true, 1001.00);
        
        String propsDoObjeto = a1.toString();
        
        System.out.println(propsDoObjeto);
        
        //testar o get matricula
        String matric1 = a1.getMatricula();
        if(matric1 == "xx-xx-xx"){
            System.out.println("O teste ao get matrícula esta certo!");
        } else{
            System.out.println("O teste ao getMatricula nao passou...");
        }
        
        if(matric1 != "xx-xx-yx"){
            System.out.println("O teste ao get matrícula passou!");
        }else{
            System.out.println("O teste ao getMatricula não passou...");
        }
        
        a1.setMatricula("yy-yy-yy");
        
        String matric2 = a1.getMatricula();
        System.out.println(matric2);
        
         if(matric2 == "xx-xx-xx"){
            System.out.println("O teste ao get matrícula esta certo!");
        }else{
            System.out.println("O teste ao getMatricula nao passou...");
        }
        
        if(matric2 != "xx-xx-yx"){
            System.out.println("O teste ao get matrícula passou!");
        }else{
            System.out.println("O teste ao getMatricula não passou...");
        }
        
        //testar o get cor
        String cor = a1.getCor();
        System.out.println(cor);
        
        if(cor == "#xxxxxx"){
            System.out.println("O teste ao getCor esta certo!");
        }else{
            System.out.println("O teste ao getCor nao passou...");
        }
        
        if(cor != "#zzz"){
            System.out.println("O teste ao get cor passou!");
        }else {
            System.out.println("O teste ao getCor não passou...");
        }
        
        //testar o set cor
        a1.setCor("#xxxxxx");
        
        String cor2 = a1.getCor();
        System.out.println(cor2);
        
         if(cor2 == "#pppp"){
            System.out.println("O teste ao get cor esta certo!");
        }else{
            System.out.println("O teste ao getCor nao passou...");
        }
        
        if(cor2 != "#plplplplp"){
            System.out.println("O teste ao get cor passou!");
        }else{
            System.out.println("O teste ao getcor não passou...");
        }
        
        //validar numLugares e numKms
        String matricula = "uu-uu-uu";
        String corA10 = "Azul a Puorto";
        
        boolean acA10 = true;
        
        double kmsAValidar = -2.5;
        int numLugaresAValidar = 100;
        
        boolean kmsValidados = Autocarro.validarKms(kmsAValidar);
        boolean numLugaresValidados = Autocarro.validarNumLugares(numLugaresAValidar);
        if(kmsValidados && numLugaresValidados){
            Autocarro a10 = new Autocarro (matricula, corA10, numLugaresAValidar, acA10, kmsAValidar); 
        }
        
        
        
              
        // testar o get numLugares
        int lugares1 = a1.getnumLugares();
        if(lugares1 == 101){
            System.out.println("O teste ao get numLugares está certo!");
        }else{
            System.out.println("O teste ao getNumLugares não passou...");
        }

        if(lugares1 != 111){
            System.out.println("O teste ao get numLugares passou!");
        }else{
            System.out.println("O teste ao get numLugares não passou...");
        }
        
        
        // Set numLugares
        a1.setNumlugares(9);

        int lugares2 = a1.getnumLugares();
        System.out.println(lugares2);

        if(lugares2 == 8){
            System.out.println("O teste ao setNumLugares está certo!");
        }else{
            System.out.println("O teste ao setNumLugares não passou...");
        }

        if(lugares2 != 101){
            System.out.println("O teste ao set NumLugares passou!");
        }else{
            System.out.println("O teste ao set NumLugares não passou...");
        }
        // testar o get arCondicionado
        boolean ar1 = a1.getarCondicionado();
            
        if(ar1 == true){
            System.out.println("O teste ao get arCondicionado está certo!");
        }else{
            System.out.println("O teste ao get ArCondicionado não passou...");
        }
            
        if(ar1 != false){
            System.out.println("O teste ao get arCondicionado passou!");
        }else{
            System.out.println("O teste ao get ArCondicionado não passou...");
        }
        
        
        
        // Set arCondicionado
        a1.setarCondicionado(false);
        
        boolean ar2 = a1.getarCondicionado();
        System.out.println(ar2);
        
        if(ar2 == false){
            System.out.println("O teste ao set ArCondicionado está certo!");
        }else{
            System.out.println("O teste ao set ArCondicionado não passou...");
        }
        
        if(ar2 != true){
            System.out.println("O teste ao set ArCondicionado passou!");
        }else{
            System.out.println("O teste ao set ArCondicionado não passou...");
        }
        
        //testar o get kms
        double Kms1 = a1.getKms();
        
        if (Kms1 == 1001.000){
            System.out.println("O teste ao get kms passou!");
        }else{
             System.out.println("O teste ao get kms não passou!");
        }
        
        if(Kms1 != 3003.000){
            System.out.println("O teste ao get kms passou!");
        }else {
            System.out.println("O teste ao getkms não passou...");
        }

        a1.setKms(2000.00);
        
        double Kms2 = a1.getKms();
        System.out.println(Kms2);
        
         if(Kms2 == 2002.000){
            System.out.println("O teste ao getKms esta certo!");
        }else{
            System.out.println("O teste ao getKms nao passou...");
        }
        
        if(Kms2 != 2100.000){
            System.out.println("O teste ao getKms passou!");
        }else{
            System.out.println("O teste ao getKms não passou...");
        }
     
    
        
}
}