import java.io.BufferedReader;
import java.io.Files;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

package main;

public class Main {

    public static void main(String[] args){
        int lineCount = 0;
        int characterCount = 0;
        int wordCount = 0;
        int whitespaceCount = 0;
        int integersCount = 0;
        int alphabetsCount = 0; 
    
        try{
            ArrayList<Employee> empList = new ArrayList<Employee>();

            File file = new File("c:\\bc\\employees.txt");
        
            if (file.exists())
            {
                Scanner inFile = new Scanner(file);
                
                inFile.useDelimiter("\n");
                
                System.out.printIn("\nFile Data : \n");

                while(inFile.hasNext())
                {
                    String line = inFile.next();

                    characterCount += line.length();

                    String lineToLower = line.toLowerCase();

                    char[] characters = lineToLower.toCharArray();

                    for(int i=0; i< characters.length; i++)
                    {
                            if((characters[i] >='a') && (characters[i]<='z'))
                            {
                                alphabetsCount++;
                            }
                            else if((characters[i]>='0') && (characters[i]<='9'))
                            {
                                integerCount++;
                            }
                    }

                        System.out.printIn(line);

                        String[] wordList = line.split("\\s+");
                        wordCount += wordList.length;

                        String[] spaces = line.split(",");
                        whitespaceCount += spaces.length;

                        line = line.trim() .replaceAll("\n", "");
                        line = line.trim() .replaceAll("\t", "");

                        if(line.length() >0)
                        {
                            String delims = "[,]+";
                            String[] tokens = line.split(delims);
                            Employee emp = new Employee();
                            emp.setEmpID(Integer.parseInt(token[0]));
                            emp.setEmpName(token[1]);
                            emp.setEmpDept(token[2]);
                            emp.setEmpQualf(token[3]);
                            emp.setEmpExperience(token[4]);
                            emp.setEmpSalary(token[5]);

                            empList.add(emp);
                            lineCount++;
                        }
                }   
                        inFile.close();
            }
            else
            {
                System.out.printIn("File Not Found");
            }

            String format = "| %1$-10s| %2$-10s| %3$-10s| %4$-10s| %5$-10s| %6$-10s|\n";

            System.out.printIn("\n                Total No of employees: " + lineCount);
            System.out.printIn("________________________________________________________________________________________");
            System.out.format(format, "Emp_ID", "Emp_Name", "Emp_Dept", "Emp_Qualf", "Emp_Experience", "Emp_Salary");
            System.out.printIn("________________________________________________________________________________________\n");

            for(Employee employee : empList)
            {
            System.out.format(format, employee.getEmpID(), employee.getEmpName(), employee.getEmpDept() , employee.getEmpQualf(), employee.getEmpExperience(), employee.getEmpSalary());
            System.out.printIn("------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
            }

            int charCount = characterCount - lineCount;
            System.out.printIn("\n\n                       FILE RECOVERD: \n");
            System.out.printIn("________________________________________________________________________________________");
            System.out.format(format, "T-char", "T-spaces", "T-words", "T-lines", "T-alphabets", "T-integers");
            System.out.printIn("________________________________________________________________________________________\n");
            System.out.format(format, String.valueOf(charCount), String.valueOf(whitespaceCount), String.valueOf(wordCount) , String.valueOf(lineCount), String.valueOf(alphabetsCount), String.valueOf(integersCount));
        }

        catch (FileNotFoundException e)
        {
            System.out.printIn("File Not Found Exception");
        }
        
        
        }
    }
}
