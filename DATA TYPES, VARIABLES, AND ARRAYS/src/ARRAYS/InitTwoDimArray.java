
package ARRAYS;



public class InitTwoDimArray {
    
    public static void main(String[] args) {
        
        double TwoDim[][]={
            
            {0*0,1*0,2*0,3*0,4*0},
            {0*1,1*1,2*1,3*1,4*1},
            {0*2,1*2,2*2,3*2,4*2},
            {0*3,1*3,2*3,3*3,4*3},
            {0*4,1*4,2*4,3*4,4*4}
        };
        
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(TwoDim[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
