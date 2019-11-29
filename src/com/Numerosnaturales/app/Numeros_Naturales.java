/**
 * 
 * @author Iván Gamaliel Sánchez Zepeda
 */

package com.Numerosnaturales.app;
import java.util.Scanner;
public class Numeros_Naturales {
		public static void main(String args[])
		{
			//Declaración de Variables
			int [] numeros= new int[2];
			int aux =0;
			int pares=0;
			int impares=0;
			
			//Declaración de Objetos
			Scanner input=new Scanner(System.in);
			
			System.out.println("Introduce 2 numeros");
			
			//se obtienen los datos del usuario
			for(int i=1;i<=numeros.length;i++)
			{
				System.out.println("Dame el numero:"+i);
				numeros[i-1]=input.nextInt();
			}
			
			System.out.println("Numeros naturales entre ambos numeros:");
			//se avalua cual es mayor y se muestran los numeros naturales entre estos numeros introcucidos
			if(numeros[0]>numeros[1])
			{
				for(int i=numeros[1]+1;i<numeros[0];i++)
				{
					System.out.println(i);
					aux++;
					if(i%2==0)
					{
						pares++;
					}
					else {
						impares+=i;
					}
					
				}
			}
			
			else
			{
				for(int i=numeros[0]+1;i<numeros[1];i++)
				{
					System.out.println(i);
					aux++;
					
					if(i%2==0)
					{
						pares++;
					}
					
					else {
						impares+=i;
					}
				}
			}
			
			System.out.println("Numero de numeros naturales es:"+aux);
			System.out.println("Numero de Pares es:"+pares);
			System.out.println("La suma de los impares es:"+impares);		
			
		}
}
