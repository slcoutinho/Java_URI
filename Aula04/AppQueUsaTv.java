import java.util.Scanner;
public class AppQueUsaTv{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Televisao t;          // declaro a TV
        t = new Televisao("Samsung", 42);  
                              // solicito memória para armazenar a estrutura
                              // Televisao t = new Televisao();

        int opcao;
        //t.setMarca("Samsung");
        //t.setTamanhoTela(42);
        


        do{
            System.out.println("0:POWER/ 1:Canal+ / 2:Canal- / 3:Vol+ / 4:Vol- / 5:Mute / -1:Exit" );
            opcao = teclado.nextInt();
            switch(opcao){
                case 0:
                    t.power();
                    break;
                case 1:
                    boolean resultado = t.avancarCanal();
                    if (resultado == true){
                        System.out.println("Avançou canal para "+t.getCanal());
                    }
                    else{
                        System.out.println("A TV precisa ser ligada");
                    }
                    break;
                case 2:
                    t.voltarCanal();
                    break;
                case 3:
                    t.aumentarVolume();
                    break;
                case 4:
                    t.diminuirVolume();
                    break;
                case 5:
                    t.mutar();
                    break;
                case -1:
                    System.out.println("END.");
                    break;
                default:
                    System.out.println("ERROR");
                    break;

            }


        } while (opcao != -1);

        
    }
}