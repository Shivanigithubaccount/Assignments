package AssignmentOne;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int stud1[]= {45,55,65};
		int stud2[]= {43,70,80};
		int stud3[]= {65,77,85};
		
		int eachStudentTotal[]=new int[3];
		int subStudentAverage[]=new int[3];
		int eachSubjectAverage[]=new int[3];
		
		eachStudentTotal[0] =stud1[0]+stud1[1]+stud1[2];
		eachStudentTotal[1] =stud2[0]+stud2[1]+stud2[2];
		eachStudentTotal[2] =stud3[0]+stud3[1]+stud3[2];
		
	    subStudentAverage[0] = eachStudentTotal[0]/3;
		subStudentAverage[1] = eachStudentTotal[1]/3;
		subStudentAverage[2] = eachStudentTotal[2]/3;
		
		eachSubjectAverage[0] =(stud1[0]+stud2[0]+stud3[0])/3;
		eachSubjectAverage[1] =(stud1[1]+stud2[1]+stud3[1])/3;
		eachSubjectAverage[2] =(stud1[2]+stud2[2]+stud3[2])/3;
		
		for(int i =0; i<3; i++) {
			System.out.println();
			System.out.println("Student "+(i+1)+" : ");
			System.out.println("Total: "+eachStudentTotal[i]);
			System.out.println("Student "+ subStudentAverage[i]);
			
			for(int j=0; j<3; j++) {
				System.out.println("Subject " +(j+1) +" mark : " +stud1[j] + "Subject "+ (i+1) + "Avg :" +eachSubjectAverage[i]);
			}
		}
		
		

	}

}
