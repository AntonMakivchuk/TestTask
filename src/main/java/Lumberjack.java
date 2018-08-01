import exception.CutTreeException;


public class Lumberjack {
    
    public int cut(int treeNumber, int leaveTrees) throws CutTreeException{
       
        if(treeNumber<leaveTrees){
            throw new CutTreeException("Cann't cut negative number of tree ");
        }
        if(treeNumber == 0 && leaveTrees == 0){
            return 0;
        }
        if(treeNumber == leaveTrees ){
            return 1;
        }
        if(leaveTrees == 0){
            return 1;
        }
        
        int cutTrees=treeNumber-leaveTrees;
        int countOfState=cutTrees+1;
        if(leaveTrees>1){

            for(int i = 1; (leaveTrees+(leaveTrees-1)*i)<=treeNumber;i++){
                countOfState=countOfState+(treeNumber-(leaveTrees+(leaveTrees-1)*i))+1;

            }
        }
        
        return countOfState;
    }
}
