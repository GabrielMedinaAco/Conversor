/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gabrielmedina.conversor;

/**
 *
 * @author Gabriel
 */

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Conversor {

    //creación de una función para validar solo números
    public static boolean validacion(String cadena){
            try{
                Double.parseDouble(cadena);
                return true;
            }

            catch(Exception e){
                 return false;
            }
    }

    public static void main(String[] args) {
        
        //Menu Principal, muestra 2 opciones "Conversor de monedas" y "Conversor de temperatura"
        Object menu;
        int input = 0;
        
        while(input == 0){
            ImageIcon icono = new ImageIcon("src/img/menu.png");
            menu = JOptionPane.showInputDialog(null, "Elija el conversor a usar:","Menú Principal", JOptionPane.INFORMATION_MESSAGE, icono, new Object[]{"Conversor de monedas","Conversor de temperatura"},"Conversor de monedas");

            if (menu == "Conversor de monedas"){
                String cantidad;   
                double resultado;

                cantidad=JOptionPane.showInputDialog("Ingrese el monto a convertir:");
                //Validando la "cantidad" ingresada
               if (cantidad !=" " && validacion(cantidad)== true && Double.parseDouble(cantidad)>0){
                   //declarando e inicializando "monto" haciendo uso del método Double.parseDouble() para convertir de String a Double
                    double monto = Double.parseDouble(cantidad);
                    ImageIcon iconoconversor = new ImageIcon("src/img/conversor.png");//implementa un icono en la interface del menu
                    Object menu2;//Menú que muestra las conversiones de monedas disponibles
                    menu2 = JOptionPane.showInputDialog(null, "Elija el tipo de moneda:","Conversor de monedas", JOptionPane.INFORMATION_MESSAGE, iconoconversor, new Object[]{"De Sol a Dólar","De Sol a Euros","De Sol a Libras Esterlinas","De Sol a Yen Japonés","De Sol a Won Sur-Coreano","De Dólar a Sol","De Euros a Sol","De Libras Esterlinas a Sol","De Yen Japonés a Sol","De Won Sur-Coreano a Sol"},"De Sol a Dólar");

                    if (menu2=="De Sol a Dólar"){
                        resultado=monto*0.2652;
                        JOptionPane.showMessageDialog(null,"La conversión a dolares es: US$ "+ resultado);
                    }else if(menu2=="De Sol a Euros"){
                        resultado=monto*0.2506;
                        JOptionPane.showMessageDialog(null,"La conversión a Euros es: € "+ resultado);
                    }else if(menu2=="De Sol a Libras Esterlinas"){
                        resultado=monto*0.2232;
                        JOptionPane.showMessageDialog(null,"La conversión a Libras Esterlinas es: £ "+ resultado);
                    }else if(menu2=="De Sol a Yen Japonés"){
                         resultado=monto*36.25;
                        JOptionPane.showMessageDialog(null,"La conversión a Yen Japonés es: ¥ "+ resultado);
                    }else if(menu2=="De Sol a Won Sur-Coreano"){
                         resultado=monto*348.51;
                        JOptionPane.showMessageDialog(null,"La conversión a Won Sur-Coreano es: ₩ "+ resultado);

                    }else if(menu2=="De Dólar a Sol"){
                        resultado=monto*3.7707;
                        JOptionPane.showMessageDialog(null,"La conversión a sol es: S/."+ resultado);
                    }else if(menu2=="De Euros a Sol"){
                        resultado=monto*3.9904;
                        JOptionPane.showMessageDialog(null,"La conversión a sol es: S/."+ resultado);
                    }else if(menu2=="De Libras Esterlinas a Sol"){
                        resultado=monto*4.4803;
                        JOptionPane.showMessageDialog(null,"La conversión a sol es: S/. "+ resultado);
                    }else if(menu2=="De Yen Japonés a Sol"){
                         resultado=monto*0.028;
                        JOptionPane.showMessageDialog(null,"La conversión a sol es: S/."+ resultado);
                    }
                     else if  (menu2=="De Won Sur-Coreano a Sol") {
                        resultado=monto*0.002869;
                        JOptionPane.showMessageDialog(null,"La conversión a sol es: "+ resultado);
                    }
                    
                    else{}
                }
               
               else if(cantidad == null){}
               
               else{
                   JOptionPane.showMessageDialog(null, "El valor no es válido, ingrese una cantidad positiva", "Error de validación",JOptionPane.ERROR_MESSAGE);
                }

            }
            //
            else if (menu == "Conversor de temperatura" ){
            
                String grados;
                double conversion;
                ImageIcon iconotemp = new ImageIcon("src/img/temperatura.png");
                Object menu3;

                grados=JOptionPane.showInputDialog(null,"Ingrese la temperatura en Celsius:","Conversor de temperatura",JOptionPane.INFORMATION_MESSAGE);
               //Validación de la temperatura ingresada en grados celsius
                if (grados !=" " && validacion(grados)== true && Double.parseDouble(grados)> -273){
                    
                    
                    double celsius = Double.parseDouble(grados);////declarando e inicializando "celsius" haciendo uso del método Double.parseDouble() para convertir de String a Double
                    menu3 = JOptionPane.showInputDialog(null, "Elija la unidad de temperatura:","Conversor de Temperatura", JOptionPane.INFORMATION_MESSAGE, iconotemp, new Object[]{"De Celsius a Fahrenheit","De Celsius a Kelvin","De Celsius a Rankine"},"De Celsius a Fahrenheit");

                    if (menu3=="De Celsius a Fahrenheit"){

                        conversion = 9*celsius/5 + 32;
                        JOptionPane.showMessageDialog(null, celsius + "°C " + " equivale a : "+ conversion + "°F ");
                    } 
                    else if (menu3=="De Celsius a Kelvin"){

                        conversion = celsius + 273.15;
                        JOptionPane.showMessageDialog(null, celsius + "°C " + " equivale a : "+ conversion + "K ");
                    }
                    else if (menu3=="De Celsius a Rankine") {
                        conversion = (1.8*celsius) + 491.67;
                        JOptionPane.showMessageDialog(null,     celsius + "°C " + " equivale a : "+ conversion + "R ");
                    }
                    
                    else{}
                }
                
                else if(grados == null){} 
                
                else{
                   JOptionPane.showMessageDialog(null, "La temperatura no es válida, ingrese una cantidad mayor a -273 °C", "Error de validación",JOptionPane.ERROR_MESSAGE);
                } 
            }
            
            else{}
    
           // 0=yes, 1=no, 2=cancel
           input = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?","Seleccione una opción" ,JOptionPane.YES_NO_CANCEL_OPTION);
        }
        
        JOptionPane.showMessageDialog(null,"Programa Finalizado");

    }
}
