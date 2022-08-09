
public class Parcial_No1 {

 /**
  * @param args
  */
 public static void main(String[] args) {
  
 System.out.println("*********************************************************************");
 System.out.println("*                                                                   *");
 System.out.println("*                                                                   *");
 System.out.println("*********************************************************************");
 System.out.println();
 System.out.println("-------------------<< Clase Padre Vehiculo >>-----------------------");
 Vehiculo miVehiculo = new Vehiculo();
 miVehiculo.nombreVehiculo="El Gran Transportador";
 System.out.println("usando miVehiculo, nombreVehiculo : "+miVehiculo.nombreVehiculo);
 System.out.println("usando miVehiculo llama a: "+miVehiculo.transportar());
 System.out.println("--------------------------------------------------------------------");
 System.out.println();
 
 System.out.println("----------<< SubClase hija Acuatico Extiende de Vehiculo >>---------");
 vehiculo_terrestre miterrestre= new vehiculo_terrestre();
 miterrestre.nombreVehiculo="El Terrestre";
 System.out.println("usando miterrestre, nombreVehiculo : "+miterrestre.nombreVehiculo);
 System.out.println("usando miterrestre llama a : "+miterrestre.transportar());
 System.out.println("usando miterrestre llama a : "+miterrestre.terrestre());
 System.out.println("---------------------------------------------------------------------");
 System.out.println();
 
 System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Acuatico>-----");
 automovil miautomovil=new automovil();
 miautomovil.nombreVehiculo="Mitsubishi";
 System.out.println("usando miautomovil, nombreVehiculo : "+miautomovil.nombreVehiculo);
 System.out.println("usando miautomovil llama a : "+miautomovil.transportar());
 System.out.println("usando miautomovil llama a : "+miautomovil.navegar());
 System.out.println("usando miautomovil llama a : "+miautomovil.prenderautomovil());
 System.out.println();
 
 moto mimoto=new moto();
 mimoto.nombreVehiculo="Tormenta";
 System.out.println("usando mimoto, nombreVehiculo : "+mimoto.nombreVehiculo);
 System.out.println("usando mimoto llama a : "+mimoto.transportar());
 System.out.println("usando mimoto llama a : "+mimoto.navegar());
 System.out.println("usando mimoto llama a : "+mimoto.atodavelocidad());
 System.out.println("---------------------------------------------------------------------");
 
 System.out.println("----------<< SubClase hija Aereo Extiende de Vehiculo >>---------");
 vehiculo_aereo miAereo= new vehiculo_aereo();
 miAereo.nombreVehiculo="El Volador";
 System.out.println("usando miAereo, nombreVehiculo : "+miAereo.nombreVehiculo);
 System.out.println("usando miAereo llama a : "+miAereo.transportar());
 System.out.println("usando miAereo llama a : "+miAereo.volar());
 System.out.println("---------------------------------------------------------------------");
 System.out.println();
 
 System.out.println("-----<< SubClases hijas extienden de la Subclase Padre Aereo >-----");
 avion miAvion=new avion();
 miAvion.nombreVehiculo="El Condor";
 System.out.println("usando miAvion, nombreVehiculo : "+miAvion.nombreVehiculo);
 System.out.println("usando miAvion llama a : "+miAvion.transportar());
 System.out.println("usando miAvion llama a : "+miAvion.volar());
 System.out.println("usando miAvion llama a : "+miAvion.bajarTrenDeAterrizaje());
 System.out.println();
 
 Helicoptero miHelicoptero=new Helicoptero();
 miHelicoptero.nombreVehiculo="El lobo del Aire";
 System.out.println("usando miHelicoptero, nombreVehiculo : "+miHelicoptero.nombreVehiculo);
 System.out.println("usando miHelicoptero llama a : "+miHelicoptero.transportar());
 System.out.println("usando miHelicoptero llama a : "+miHelicoptero.encenderHelices());
 System.out.println("usando miHelicoptero llama a : "+miHelicoptero.encenderHelices());
 System.out.println("---------------------------------------------------------------------");
 System.out.println();
 
 System.out.println("--<< Propiedad de la clase Vehiculo usada por todas las clases Hijas >--");
 System.out.println("nombre Vehiculo :"+miVehiculo.nombreVehiculo);
 System.out.println("nombre Acuatico :"+miterrestre.nombreVehiculo);
 System.out.println("nombre Aereo :"+miAereo.nombreVehiculo);
 System.out.println("nombre Barco :"+miautomovil.nombreVehiculo);
 System.out.println("nombre Velero :"+mimoto.nombreVehiculo);
 System.out.println("nombre Avion :"+miAvion.nombreVehiculo);
 System.out.println("nombre Helicoptero :"+miHelicoptero.nombreVehiculo);
 System.out.println("---------------------------------------------------------------------");
 
 }
}


//disculpe ing pero no se encontre el error :,( 