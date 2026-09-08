public class AlgoritmoDois {
    void main(){
        //Entrada De Dados

        IO.println("Sejam Bem Vindo Ao Portal Java360!");
        String usuario = IO.readln("Qual o seu nome?");
        IO.println("Olá," + usuario + "! Bem Vindo ao Portal!");

        // mais rápido sem métodos

        // int estrelas = 0; 

        //mais lento com métodos (classes wrappers)

        //Integer.parseInt(Valor para converção)


        int estrelas = 0;
        IO.println("Quem criou o Java?");
        IO.println("1 - James Gosling. ");
        IO.println("2 - Bill Gates.");
        IO.println("3 - Steve Jobs.");
        IO.println("4 - Mark Zuckerberg.");
        int resp = Integer.parseInt(IO.readln("Digite o número:"));
        
        if (resp == 1){
            IO.println("Parabéns, Você Acertou!:)");
            estrelas = estrelas + 1; 
            //variável de incremento
            //Estrelas ++;
        }
        else{
            IO.println("Você Errou :( ");
        }
        IO.println("Você obteve " + estrelas + " Estrelas.");
        
    }
    
}
