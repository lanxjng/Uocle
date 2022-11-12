/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uocle;

/**
 *
 * @author admin
 */
public class Tim_uoc {
    private int n;

    public Tim_uoc(int n) {
        this.n = n;
    }
    
    public String Tinh(){
        String kq = "";
        for(int i=1;i<=n;i++){
            if(n%i==0 && i%2!=0) 
                kq+=String.valueOf(i)+" ";
        }
        return kq;
    }
    
}
