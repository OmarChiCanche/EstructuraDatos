                           /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cambio;

public class conversionCambio {
    
    public static void calcular(int cambio){
        
        int a,b,c,d,e,f,g,h,peso;
        
            
            if(cambio >=500){
            a= cambio/500;
                System.out.println(a + " billetes de $500\n");
                bille(cambio%500);
            }else{
                if(cambio>=200 && cambio<=499){
                    b= cambio/200;
                    System.out.println(b + " billetes de $200\n");
                    bille(cambio%200);
                }else{
                    
                    if(cambio>= 100 && cambio <= 199){
                      c= cambio/100;
                    System.out.println(c + " billetes de $100\n");
                    bille(cambio%100);  
                    
                    }else{
                        
                        if (cambio >=50 && cambio <=99){
                            d = cambio/50;
                            System.out.println(d +  " billetes de $50\n");
                            bille(cambio%50);
                        }else{
                        
                        if(cambio>=20 && cambio<=49){
                            e = cambio/20;
                    System.out.println(e + " billetes de $20\n");
                    bille(cambio%20); 
                            
                        }else{
                            
                            if(cambio>=10 && cambio <= 19){
                                
                                f = cambio/10;
                                System.out.println(f + " monedas de $10\n");
                                bille(cambio%10);
                                
                            }else{
                                
                                if(cambio>=5 && cambio <= 9){
                                   g = cambio/5;
                                    System.out.println(g + " monedas de $5\n" );
                                    bille(cambio%5);
                                }else{
                                    
                                    if(cambio>=2 && cambio<= 4){
                                        
                                        h = cambio/2;
                                    System.out.println(h +  " monedas de $2\n");
                                    bille(cambio%2);
                                    }else{
                                        
                                        if(cambio == 1){
                                            peso = cambio/1;
                                            System.out.println( peso + " monedas de $1\n");
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
    }
    
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          