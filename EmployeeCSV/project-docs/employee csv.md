#Employee CSV Data Migration Project

##Overall Goals
- To read data from a CSV file (provided), parse it, populate objects and add to a collection.
- To efficiently write the data from the objects to a relational database using JDBC.
- To demonstrate good programming practices in OOP, SOLID, design patterns, testing, logging, etc.

##Phase 1 – Initial Reading and Cleaning
- Create a new project and write code to read data from an Employee CSV file.
- As it is read in, add each record read to a new object of a suitable class and then add those objects to a collection.
- Any corrupt or duplicated data should be added to a separate collection for further analysis.
- Write tests to ensure data is being managed correctly.
- Consider which date class would be best to use for the date fields – there is one in java.util and another in java.sql.
- Provide a simple user interface to display the results of reading the file – how many unique, clean records there are, how many duplicates, how many records with missing fields, possibly display the questionable records.
- User the provided EmployeeRecords.csv for your testing and optionally create your own test files to help with your JUnit tests.
###Notes:
- Consider preparing your tests beforehand, in line with a TDD approach.
- Since the overall purpose of the project is data migration, we want to make sure that only clean data is transferred.
- Consider your code structure, since later in the project we will be increasing the size of the data and looking at the efficiency of the code.
- The choice of collection will be important as there is some duplication of the employee records.

##Phase 2 – Persist to Database
- Write the SQL statements to create a table and to persist data to that table. If the table exists, it will need to be dropped first.
- Install the drivers for the database to be used (MySQL) and create a connection.
- Create a data access object (DAO pattern) to persist the data to the database.
- Persist employee records and write code to retrieve individual records from the database.
###Notes:
- Remember to use try-with-resources to ensure connections are closed as soon as they have been used, if appropriate.
- Care needs to be taken with transferring dates from Java to SQL; make sure strings are not used for dates.
- It is easy to make this process very slow by creating a new connection for each record – consider how to ensure that you reuse connections.

##Phase 3 – Add Multithreading
- Use the second file, EmployeeRecordsLarge.csv, which can be assumed to have already been cleaned.
- Record time taken to persist before implementing multiple threads.
- Add multithreading to your application to write the data to the database, comparing the execution time with the single-threaded version.
- Try different numbers of threads and compare the results – what is the optimum number of threads? Record this information in your readme.md
###Notes:
- Run tests to ensure the integrity of the data - make sure data has not been corrupted by adding multithreading to the application (check whether race conditions, for example, have changed the operation of the program).

##Phase 4 - Add Streams and Lambdas
- Modify code to make use of functional programming concepts – lambdas and streams.
- Keep the original code and then run tests to see if efficiency has improved by adding functional code.
###Notes:
- Functional programming is not all about speed, but also thread safety, ease of reading etc.
- Consider whether your code has been improved as a result of the changes.