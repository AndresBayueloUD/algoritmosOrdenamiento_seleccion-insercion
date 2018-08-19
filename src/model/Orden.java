package model;

public class Orden {

    public int[] seleccion(int[] vector){
        int temp;
        for(int i=0; i<vector.length; i++){
            for(int j=0; j<vector.length; j++){
                if(vector[j]<vector[i]){
                    temp=vector[i];
                    vector[i]=vector[j];
                    vector[j]=temp;
                }
            }
        }
        return vector;
    }

    public int[] insercion(int[] vector) {
        int i,j;
        int actual;
        for(i=0; i<vector.length; i++){
            actual = vector[i];
            for(j=i; j>0 && vector[j-1] > actual; j--)
                vector[j]=vector[j-1];
            vector[j]=actual;
        }
        return vector;
    }

}
