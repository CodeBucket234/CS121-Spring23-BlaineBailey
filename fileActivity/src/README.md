Activity 10 has 3 classes for reading data from files, writing into files, and appending data to a file.

FileRead.java uses a Scanner object to read a file object. This class tries to read from a file and print out the contents of the file to the console. If the file is not found, then an error message is thrown saying the file is not found.

FileWrite.java uses a PrintWriter object to write data into a file, and a Scanner object for user input. The user enters in the number of headers of data they want, and input the title of the headers. The user then enters the amount of data per header, and the user inputs the data for the headers.

FileAppend.java uses a FileWriter object so that the PrintWriter object appends data rather than overrides it. The Scanner object is used for user input. The user inputs the number of headers, and then one line of data gets appended under the headers.

The hardest part of Activity 10 is remembering when to use FileWriter because I often mixed up PrintWriter and FileWriter. I forgot FileWriter is used when data should be appended.
