/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemabancario;
 
import java.util.Objects;

public class ContaBase {

  
    private String numC;
    private String titu;
    private double sald;

    public ContaBase(String numPesq) {
        String numcr = numC;
        String titur = titu;
        double saldr = sald;             
    }

 

    public void setNumC(String numC) {
        this.numC = numC;
    }
    
   public ContaBase(String numC, String titu)
   {
       this.numC = numC;
       this.titu= titu;
       sald = 0;
   }
   
   public String trazerNumC()
   {
       return numC;
   }
   
   public String trazerTitu()
   {
       return titu;
   }
   public double trazerSald()
   {
       return sald;
   }
   
   public void depositarValor(double valorEnt)
   {
      if(valorEnt < 0.0)
      {
          System.out.println("É impossivel depositar valores negativos");
      }
      else
      {
          sald = sald + valorEnt;
      }
       
   }
   
   public void sacar(double valorSac)
   {
    if(valorSac > sald)
    {
        System.out.println("impossivel sacar este Valor");
    }
    else
    {
       sald = sald - valorSac; 
    }
   }
   @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContaBase other = (ContaBase) obj;
        if (!Objects.equals(this.numC, other.numC)) {
            return false;
        }
        return true;
    }
           
   
   
}
