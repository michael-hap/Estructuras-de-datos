package uniquindio.edu.co.ListaSimplementeEnlazada.Practica;

import javax.swing.*;

public class MainPractica {
    public static void main(String[] args) {
        Lista listita = new Lista();
        int opcion = 0, elem;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"1. Agregar un elemento al inicio de la lista\n2. " +
                        "Mostrar los datos de la lista\n3. Salir\n4. " +
                        "Agregar un elemento al final de la lista\n" +
                        "5.Eliminar del inicio de la lista\n" +
                        "6. Eliminar del final de la lista\n" +
                        "7. Eliminar un elemento específico",
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
                        listita.mostrarLista();
                        break;
                    case 3:
                        break;

                    case 4:
                        try{
                            elem = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento: "
                                    ," Insertando al final", JOptionPane.QUESTION_MESSAGE ));
                            //Agregando al Nodo
                            listita.agregarFin(elem);
                        }catch(NumberFormatException n){
                            JOptionPane.showMessageDialog(null,  "Error" + n.getMessage());
                        }
                        break;

                    case 5:
                        elem= listita.eliminarInicio();

                        JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elem, "Eliminando nodo del inicio", JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case 6:
                        elem= listita.eliminarFin();

                        JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elem, "Eliminando nodo del final", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case 7:
                        elem= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el " +
                                "elemento a eliminar: ", "Eliminando nodos en especifico", JOptionPane.INFORMATION_MESSAGE));

                        if(listita.eliminarNodo(elem)== true){
                            JOptionPane.showMessageDialog(null, "El elemento eliminado es: " + elem, "Eliminando nodo en específico", JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "No se encontró el elemento " + elem);
                        }


                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error" + e.getMessage());
            }

        }while(opcion!=3);
    }
}
