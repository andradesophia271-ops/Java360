public class AlgoritmosTres {
    void main(){

        // Números inteiros de 0 a 100

        int Nota1,Nota2,Nota3;

        // Média é real (double)

        double media;

        // Operadores: +,-,*,/,%
        //Entrada das Notas dos Alunos

        Nota1 = Integer.parseInt(IO.readln("Qual a primeira nota?"));
        Nota2 = Integer.parseInt(IO.readln("Qual a segunda nota?"));
        Nota3 = Integer.parseInt(IO.readln("Qual a terceira nota?"));

        //Soma das Notas

        int soma = Nota1 + Nota2 + Nota3;
         
        // Medias das Notas

        media = soma / 3.0;

        //Saída das Notas,Soma e Media

        IO.println("Notas: "  +  Nota1 + ";"  +  Nota2 + ";"  +  Nota3 + ";");
        IO.println("Soma:"  +  soma );
        IO.println("Média: "  +  media );
    }

    
    
}
