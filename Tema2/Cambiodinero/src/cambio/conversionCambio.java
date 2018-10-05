/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio;
/**
 * 
 * Omar Alexis Chi Canche
 * Sistemas 3B 17070004
*/
public class conversionCambio {
    
    public static void calcular(int cambio){
        
        int a,b,c,d,e,f,g,h,i;          
            if(cambio >=500){
            a= cambio/500;
                System.out.println(a + " Billetes de $500");
                calcular(cambio%500);
            }
            else{
                if(cambio>=200 && cambio<500){
                    b= cambio/200;
                    System.out.println(b + " Billetes de $200");
                    calcular(cambio%200);
                }
                else{
                    
                    if(cambio>= 100 && cambio <200){
                      c= cambio/100;
                    System.out.println(c + " Billete(s) de $100");
                    calcular(cambio%100);  
                    
                    }
                    else{
                        
                        if (cambio >=50 && cambio <100){
                            d = cambio/50;
                            System.out.println(d +  " Billete(s) de $50");
                            calcular(cambio%50);
                        }
                        else{
                        
                        if(cambio>=20 && cambio<50){
                            e = cambio/20;
                            System.out.println(e + " Billete(s) de $20");
                            calcular(cambio%20); 
                            
                        }
                        else{
                            
                            if(cambio>=10 && cambio <20){
                                
                                f = cambio/10;
                                System.out.println(f + " Moneda(s) de $10");
                                calcular(cambio%10);
                                
                            }
                            else{
                                
                                if(cambio>=5 && cambio <10){
                                   g = cambio/5;
                                    System.out.println(g + " Moneda(s) de $5" );
                                    calcular(cambio%5);
                                }
                                else{
                                    
                                    if(cambio>=2 && cambio<5){
                                        
                                        h = cambio/2;
                                    System.out.println(h +  " Moneda(s) de $2");
                                    calcular(cambio%2);
                                    }
                                    else{
                                        
                                        if(cambio == 1){
                                            i = cambio/1;
                                            System.out.println(i + " monedas de $1");
                                        }
                                    }   
                                }               
                            }
                        }
                    }
                }     
            }
        }
   }
}