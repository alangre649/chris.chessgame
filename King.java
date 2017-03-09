
/**
 * Write a description of class King here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class King extends Chess
{
    Side side;
    King(Side side){
        this.side = side;
    }
    public String toString()
    {
        if(side==null){
        }else{
            if(side.getSide().equals("Black")||side.getSide().equals("black"))
            {
                return "[BKg]";
            }else if(side.getSide().equals("White")||side.getSide().equals("white")){
                return "[WKg]";
            }
        }
        return null;
    }
    public boolean behavior(int origin, int destination){
        int x1=origin%8;
        int x2=destination%8;
        int y1=origin/8;
        int y2=destination/8;
        if(Math.abs(x1-x2)==1&&y1==y2||Math.abs(y1-y2)==1&&x1==x2){
            return true;
        }else if(Math.abs(x1-x2)==Math.abs(y1-y2)&&Math.abs(x1-x2)==1){
            return true;
        }
        return false;
    }
     public String getSide()
    {
        return side.getSide();
    }
    
}
