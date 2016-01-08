package AddKey;

import Bitsgetter.bytegetter;

public class AddKey {
    public AddKey() {
    }
    public String[][] AddRoundKey(String[][] state,String[][] key) {
        
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
           state[i][j]=byteget.xor2hex(state[i][j],key[i][j]);
        return state;
    }
    private final bytegetter byteget=new bytegetter((byte)27);
}
