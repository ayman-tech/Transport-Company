package my_package;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayman Sayed
 */
public class Truck {
    	public String truckId,src,dest,status,leaveTime,reachTime;
        
        public Truck(String truckId,String src,String dest,String status,String leaveTime,String reachTime){
           this.truckId = truckId;
           this.src = src;
           this.dest = dest;
           this.status = status;
           this.leaveTime = leaveTime;
           this.reachTime = reachTime;
       }

    Truck() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}