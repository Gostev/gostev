DB Checker (Java)

Hello!

The purpose of this little program is to fetch data from SQL table to .csv file after regular time intervals. I had this task from my friend who is QC Engineer. He was in need of programm that will check DB state from time to time and save results to log file. So, he is happy right now when using this one.

Structure:
Database.java - Getting connection executing statement.
DBcontent.java - File you need to rewrite to reflect your DB contents. Fields is columns in your database.
Output.java - Manages output to file.
RunMe.java - Executable class. You can declare delay time between connections here as well.

Would be happy if this can be usefull for you.
All questions or propositions please send me to alex.gostev@yahoo.com

Sincerely, Alex Gostev.