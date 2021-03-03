import java.util.ArrayList;
import javax.swing.JOptionPane;


public class main {
    public static void main (String [] args) {


        //Configuración de Juego
        /*
        crear juego con jugadores, el juego debe tener los limites de kilómetros por cada pista (un jugador puede ser un conductor y un conductor debe tener un carro asociado y un carro debe estar asociado a un carril que a su vez debe estar en una pista)
        */

        int numberPlayers = Integer.parseInt(JOptionPane.showInputDialog("Type the players number, please"));
        JOptionPane.showMessageDialog(null, numberPlayers);

        ArrayList x = myMethod(numberPlayers);
        JOptionPane.showMessageDialog(null, x);

    }

    static ArrayList myMethod(int NumberPlayers) {
        ArrayList<piloto> players = new ArrayList<piloto>();

        for(int i=0; i<NumberPlayers ; i++){
            JOptionPane.showMessageDialog(null, "Iteracion numero: " + i);

            int Choosed = Integer.parseInt(JOptionPane.showInputDialog("#1 Predeterminado \n#2 Simple Perfil"));

            if(Choosed == 1){
                players.add(new piloto(i));
                JOptionPane.showMessageDialog(null, "Ok, :v");
            }
            else if (Choosed == 2){
                players.add(new piloto(JOptionPane.showInputDialog("Please, Your Name"),
                        i, Integer.parseInt(JOptionPane.showInputDialog("How old Are You?"))));
                JOptionPane.showMessageDialog(null, "Ok, :v");
            }
            else{
                JOptionPane.showMessageDialog(null, "No Valid, Try Again");
                i--;
            }
        }
        return players;
    }

}