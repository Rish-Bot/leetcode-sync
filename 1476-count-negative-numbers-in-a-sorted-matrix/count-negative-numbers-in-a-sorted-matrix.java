class Solution {
    public int countNegatives(int[][] grid) {

        int o=0; //mxn in matrix n is uniform through out the column

        for(int[]i:grid){

            int n = i.length;
           for(int l =0; l<n;l++){

            if(i[l]<0){
                int v = i.length-l;
                o+=v;
                break;
            } 

           }
          
        }
           return o;
     }
      
}