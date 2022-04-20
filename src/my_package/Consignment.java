package my_package;

import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ayman Sayed
 */
public class Consignment {
    	public String cId, vol, wt, src, dest, sName, sAddr, sPin, timeRec, status, timeDel, rName, rAddr, rPin, truckId;
        
        public Consignment(String cId, String vol, String wt, String src, String dest, String sName, String sAddr, String sPin, String timeRec, String status, String timeDel, String rName, String rAddr, String rPin, String truckId){
           this.cId= cId;
           this.vol = vol;
           this.wt = wt;
           this.src = src;
           this.dest = dest;
           this.sName = sName;
           this.sAddr = sAddr;
           this.sPin = sPin;
           this.timeRec = timeRec;
           this.status = status;
           this.timeDel = timeDel;
           this.rName = rName;
           this.rAddr = rAddr;
           this.rPin = rPin;
           this.truckId = truckId;
       }
}