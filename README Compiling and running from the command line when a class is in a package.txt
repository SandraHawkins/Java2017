To comile a java class that exists in a package:

Open the command window where you can see the package/ folder containing the Java file. 

e.g. The file Ex9IfElseStatements.java is in a package/ folder called sheet3ControlFlow.  
sheet3ControlFlow is in a folder called src.  The command window is open in the 
ExerciseSolutions folder where I can see sheet3ControlFlow.  Here is the result of running 
the 'dir' command:


****************************************************************

02/05/2017  13:28    <DIR>          .
02/05/2017  13:28    <DIR>          ..
02/05/2017  11:51    <DIR>          sheet1VariablesAndOperators
02/05/2017  11:55    <DIR>          sheet2Methods
02/05/2017  11:58    <DIR>          sheet3ControlFlow
02/05/2017  13:28    <DIR>          sheet4Arrays
               0 File(s)              0 bytes
               6 Dir(s)  860,781,146,112 bytes free

****************************************************************


To compile Ex9IfElseStatements (that exists inside the sheet3ControlFlow package)
I must run the following command:

C:\**shortened**\Java\Code\ExerciseSolutions\src>javac sheet3ControlFlow\Ex9IfElseStatements.java


And to execute, I must run the following command:

C:\**shortened**\Java\Code\ExerciseSolutions\src>java sheet3ControlFlow.Ex9IfElseStatements




*** Because this class is physically in a package / folder, its full name is the package 
*** name dot class name. I.e.    sheet3ControlFlow.Ex9IfElseStatements
***
*** Note: It cannot be executed without its package name. ***