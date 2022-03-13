/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author dania
 */
public class JavaApplication1 {
    public boolean succeeded;
    public String expected_output;
    public String actual_output;
    static int square(int n){
        return n*n;
    }
    static JavaApplication1[] correctness(){
        int[] inputs = {0, 1, 2, 5};
        int[] expected_outputs = {0, 1, 4, 25};
        float accuracy ;
        int count = 0;
        JavaApplication1[] test_results = new JavaApplication1[4];
        for(int i = 0; i < inputs.length; i++) {
          test_results[i] = new JavaApplication1();
          test_results[i].expected_output = String.valueOf(expected_outputs[i]);
          int actual_output = square(inputs[i]);
          test_results[i].actual_output = String.valueOf(actual_output);
          if (actual_output == expected_outputs[i]) {
            test_results[i].succeeded = true;
            count = count + 1;
          } else {
            test_results[i].succeeded = false;
          }
        }
        accuracy = count/inputs.length *100;
        System.out.println("Accuracy: "+accuracy+"% ");
        return test_results;
    }
    
    static void cyclomaticComplexity(int [][]mat){
        int row=0, col=0, edges, nodes;
        //mat is the adjacency matrix of a code
        //can be of less size, just an upper bound is defined
        for(int r=0; r < mat.length; r++){
            for(int c=0; c < mat[r].length; c++){
                col++;
            }
            row++;
            col = 0;
        }
        
        nodes = row +1;
        System.out.println("Total nodes = "+nodes);
        edges = 0;
        for (int i = 0; i<= row; i++){
            for(int j=0; j<= col; j++){
                if(mat[i][j] == 1){
                    edges= edges+1;
                }     
            }
        }
        System.out.println("Total edges = "+edges);
        int complexity = edges-nodes+2;
        System.out.println("Cyclomatic complexity= "+ complexity);
        
    }
    public static void main(String[] args) {
        JavaApplication1 a[] = correctness();
        for(int i=0;i<a.length;i++){
            System.out.print(a[i].actual_output+" ");
            System.out.print(a[i].expected_output+" ");
            System.out.println(a[i].succeeded);
        }
    }
}
