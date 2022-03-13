import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
//import org.eclipse.jdt.core.compiler.IProblem;
//import org.eclipse.jdt.core.dom.AST;
//import org.eclipse.jdt.core.dom.ASTParser;
//import org.eclipse.jdt.core.dom.CompilationUnit;

public class halsteadComplexity {
	
		public double ProgramLength;
		public double halsteadVocab;
		public double ProgramVolume;
		public double PotentialMinimumVolume;
		public double ProgramLevel;
		public double ProgramDifficulty;
		public double ProgrammingEffort;
		public double LanguageLevel;
		public double IntelligenceContent;
		public double ProgrammingTime;
		
		
	
	
    public static void main(String[] args) throws Exception {

        double [] params = new double[4];
        double n1 = 10.0,n2 = 13.0,N1 = 15.0,N2 = 18.0;
        // initialize params obj after parsing;
        params[0] = n1;
        params[1] = n2;
        params[2] = N1;
        params[3] = N2;
        
    	halsteadComplexity hcomplexity = calculateHalsteadMetrics(params);
    	
    	System.out.println("Program Length: "+hcomplexity.ProgramLength);
    	System.out.println("halsteadVocab: "+hcomplexity.halsteadVocab);
    	System.out.println("ProgramVolume: "+hcomplexity.ProgramVolume);
    	System.out.println("PotentialMinimumVolume: "+hcomplexity.PotentialMinimumVolume);
    	System.out.println("ProgramLevel: "+hcomplexity.ProgramLevel);
    	System.out.println("ProgramDifficulty: "+hcomplexity.ProgramDifficulty);
    	System.out.println("ProgrammingEffort: "+hcomplexity.ProgrammingEffort);
    	System.out.println("LanguageLevel: "+hcomplexity.LanguageLevel);
    	System.out.println("IntelligenceContent: "+hcomplexity.IntelligenceContent);
    	System.out.println("ProgrammingTime: "+hcomplexity.ProgrammingTime);
    }

    static halsteadComplexity calculateHalsteadMetrics(double [] params) {
    	
    	halsteadComplexity metrics = new halsteadComplexity();
    	
    	metrics.ProgramLength =calculateProgramLength(params);
    	metrics.halsteadVocab =calculateVocab(params);
    	metrics.ProgramVolume =calculateProgramVolume(params);
    	metrics.PotentialMinimumVolume =calculatePotentialMinimumVolume(params);
    	
    	metrics.ProgramLevel =calculateProgramLevel(params);
    	metrics.ProgramDifficulty =calculateProgramDifficulty(params);
    	metrics.ProgrammingEffort =calculateProgrammingEffort(params);
    	metrics.LanguageLevel =calculateLanguageLevel(params);
    	metrics.IntelligenceContent =calculateIntelligenceContent(params);
    	metrics.ProgrammingTime =calculateProgrammingTime(params);
    	
    	
    	return metrics;
    }
    
    static double calculateProgramLength(double [] params) {
    	
    	return params[2] + params[3];  //N1+N2
    			
    }
    
    static double calculateVocab(double [] params) {
    	
    	return params[0] + params[1];  // n1+n2
    			
    }
    static double calculateProgramVolume(double [] params) {
    	
    	double N = params[2] + params[3];
    	double n = params[0] + params[1];
    	return N * Math.log(n); 
    			
    }
    static double calculatePotentialMinimumVolume(double [] params) {
	
//    	return params[0] + params[1];
    	return 0.0;
			
    }
    
    static double calculateProgramLevel(double [] params) {
    	
    	double D = (params[0] / 2) * (params[3] / params[1]); // L = 1 / D
    	return 1/D;
			
    }
    static double calculateProgramDifficulty(double [] params) {
    	
    	return (params[0] / 2) * (params[3] / params[1]) ;  //(n1 / 2) * (N2 / n2) 
			
    }
    static double calculateProgrammingEffort(double [] params) {
    	
    	double difficulty = (params[0] / 2) * (params[3] / params[1]);
    	double volume = params[2] + params[3] * Math.log(params[0] + params[1]);
    	return difficulty *volume;
			
    }
    static double calculateLanguageLevel(double [] params) {
    	
//    	return params[0] + params[1];
    	return 0.0;
			
    }
    static double calculateIntelligenceContent(double [] params) {
    	
    	double difficulty = (params[0] / 2) * (params[3] / params[1]);
    	double volume = params[2] + params[3] * Math.log(params[0] + params[1]);
    	
    	return volume / difficulty;
			
    }
    static double calculateProgrammingTime(double [] params) {
	
    	
    	double difficulty = (params[0] / 2) * (params[3] / params[1]);
    	double volume = params[2] + params[3] * Math.log(params[0] + params[1]);
    	double E = difficulty *volume;
    	return E / 18.0;
		
    }


}
