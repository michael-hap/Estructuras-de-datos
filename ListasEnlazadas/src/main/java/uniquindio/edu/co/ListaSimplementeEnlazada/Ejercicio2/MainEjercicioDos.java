package uniquindio.edu.co.ListaSimplementeEnlazada.Ejercicio2;


import javax.swing.*;

public class MainEjercicioDos {
    public static void main(String[] args) {
        ListaSimple listita = new ListaSimple();
        int opcion = 0, elem;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un elemento al inicio de la lista\n" +
                                "2. Agregar al final de la lista\n" +
                                "3. Invertir la lista\n" +
                                "4. Mostrar elementos de la lista\n" +
                                "5. Salir\n",
                        "Menu de opciones"));
                switch(opcion){
                    case 1:
                        try{
                            elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento: "
                                    ," Insertando al inicio", JOptionPane.QUESTION_MESSAGE ));
                            //Agregando al Nodo
                            listita.agregarInicio(elem);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,  "Error" + n.getMessage());
                        }
                        break;

                    case 2:
                        try{
                            elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento: "
                                    ," Insertando al final", JOptionPane.QUESTION_MESSAGE ));
                            //Agregando al Nodo
                            listita.agregarFin(elem);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,  "Error" + n.getMessage());
                        }
                        break;

                    case 3:
                        listita.invertirLista();
                        break;

                    case 4:
                        listita.mostrarLista();
                        break;

                    case 5:
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }

        }while(opcion!=5);
    }
}



