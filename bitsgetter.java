package Bitsgetter;
  
public class bitsgetter {
     
    public bitsgetter() {
    }
    
      public byte[] getBinaryBits(int ch) { 
         
         // method for returning array of byte 
        //
        byte[] bin=new byte[8];
        int tag=1;
        for(int i=0;i<=7;i++) {
         bin[7-i]=(byte)((ch&((tag<<i)))>>i);
        }
          
        return bin;
    }
         public byte[] getBinaryBitsHex(int ch) {
           
             if(ch>=48&ch<=57)
                 ch-=48;
             else ch-=55;
             //BINARY FORM FROM THE HEX ONE 
          
        byte[] bin=new byte[8];
        int tag=1;
        for(int i=0;i<8;i++) {
            bin[i]=(byte)((ch&((tag<<i)))>>i);
             
        }
          
        return bin;
    }
}
