-- Insert 10 Questions for Java Category
INSERT INTO question (id, category, difficulty_level, option1, option2, option3, option4, question_title, right_answer) VALUES
(1, 'Java', 'Easy', 'C++', 'Java', 'Python', 'Ruby', 'What programming language is primarily used for Android development?', 'Java'),
(2, 'Java', 'Easy', 'JVM', 'JRE', 'JDK', 'JAVAC', 'Which one is the Java Virtual Machine?', 'JVM'),
(3, 'Java', 'Medium', 'Static', 'Dynamic', 'Both', 'None', 'In Java, method overloading is an example of __________ polymorphism.', 'Static'),
(4, 'Java', 'Medium', 'Encapsulation', 'Inheritance', 'Polymorphism', 'Abstraction', 'What is the main feature of Object-Oriented Programming?', 'Encapsulation'),
(5, 'Java', 'Easy', 'new', 'this', 'super', 'self', 'Which keyword is used to create an object in Java?', 'new'),
(6, 'Java', 'Easy', 'A', 'B', 'C', 'D', 'What will be the output of "System.out.println(10 + 20 + \"30\");"?', '1030'),
(7, 'Java', 'Hard', 'try', 'catch', 'throw', 'all of the above', 'Which keywords are used for exception handling in Java?', 'all of the above'),
(8, 'Java', 'Medium', 'Arrays', 'Collections', 'Lists', 'All of the above', 'What does ArrayList in Java use for storing elements?', 'Collections'),
(9, 'Java', 'Hard', 'static', 'void', 'main', 'all of the above', 'Which keyword is used to define a main method in Java?', 'all of the above'),
(10, 'Java', 'Easy', '4', '5', '6', '7', 'How many bytes does an int take in Java?', '4');

-- Insert 10 Questions for Python Category
INSERT INTO question (id, category, difficulty_level, option1, option2, option3, option4, question_title, right_answer) VALUES
(11, 'Python', 'Easy', 'Python', 'Java', 'C++', 'C#', 'Which language is known as the "batteries included" language?', 'Python'),
(12, 'Python', 'Medium', 'List', 'Tuple', 'Set', 'Dictionary', 'Which of the following is an immutable data type in Python?', 'Tuple'),
(13, 'Python', 'Easy', '2', '3', '4', '5', 'How many built-in data types does Python have?', '9'),
(14, 'Python', 'Medium', 'def', 'func', 'function', 'method', 'What keyword is used to define a function in Python?', 'def'),
(15, 'Python', 'Easy', 'YES', 'NO', 'MAYBE', 'SURE', 'Does Python support multiple inheritance?', 'YES'),
(16, 'Python', 'Medium', 'while', 'for', 'do', 'all of the above', 'Which loop is not supported by Python?', 'do'),
(17, 'Python', 'Hard', 'map()', 'filter()', 'reduce()', 'All of the above', 'Which function is used for functional programming in Python?', 'All of the above'),
(18, 'Python', 'Easy', '1', '0', '-1', 'error', 'What will be the output of "print(bool(0))"?', 'False'),
(19, 'Python', 'Medium', 'list', 'set', 'dict', 'tuple', 'Which of the following is not a collection type in Python?', 'set'),
(20, 'Python', 'Hard', 'append()', 'insert()', 'add()', 'both a and b', 'Which method is used to add an element at the end of a list in Python?', 'append()');

-- Insert 10 Questions for C++ Category
INSERT INTO question (id, category, difficulty_level, option1, option2, option3, option4, question_title, right_answer) VALUES
(21, 'C++', 'Easy', 'No', 'Yes', 'Maybe', 'Depends', 'Does C++ support multiple inheritance?', 'Yes'),
(22, 'C++', 'Medium', 'A', 'B', 'C', 'D', 'What is the default access modifier for class members in C++?', 'Private'),
(23, 'C++', 'Easy', '2', '4', '8', '16', 'How many bytes is a pointer in C++ on a 32-bit system?', '4'),
(24, 'C++', 'Medium', 'new', 'malloc', 'calloc', 'All of the above', 'Which operator is used to allocate memory in C++?', 'new'),
(25, 'C++', 'Easy', 'void', 'int', 'char', 'float', 'What is the return type of main function in C++?', 'int'),
(26, 'C++', 'Medium', 'inline', 'virtual', 'friend', 'static', 'Which keyword is used to declare a function that can be overridden in C++?', 'virtual'),
(27, 'C++', 'Hard', 'object', 'class', 'method', 'function', 'In C++, a user-defined type is called a __________.', 'class'),
(28, 'C++', 'Easy', '2', '4', '8', '16', 'What is the size of int in C++?', '4'),
(29, 'C++', 'Medium', 'Yes', 'No', 'Depends', 'Not sure', 'Does C++ support function overloading?', 'Yes'),
(30, 'C++', 'Hard', 'int', 'float', 'char', 'double', 'Which of the following is not a user-defined data type in C++?', 'char');

-- Insert 10 Questions for JavaScript Category
INSERT INTO question (id, category, difficulty_level, option1, option2, option3, option4, question_title, right_answer) VALUES
(31, 'JavaScript', 'Easy', 'Java', 'JavaScript', 'C++', 'C#', 'Which language is primarily used for web development?', 'JavaScript'),
(32, 'JavaScript', 'Medium', 'var', 'let', 'const', 'All of the above', 'Which of the following is not a keyword in JavaScript?', 'None'),
(33, 'JavaScript', 'Easy', 'True', 'False', 'Null', 'Undefined', 'Which value is considered as falsy in JavaScript?', 'False'),
(34, 'JavaScript', 'Medium', '8', '9', '10', '11', 'What is the output of "console.log(2 + 2 * 2)"?', '6'),
(35, 'JavaScript', 'Easy', 'window', 'document', 'console', 'alert', 'Which object is the global object in JavaScript?', 'window'),
(36, 'JavaScript', 'Medium', 'function', 'method', 'procedure', 'routine', 'Which keyword is used to define a function in JavaScript?', 'function'),
(37, 'JavaScript', 'Hard', 'Promise', 'Callback', 'Async', 'All of the above', 'Which is used for asynchronous programming in JavaScript?', 'All of the above'),
(38, 'JavaScript', 'Easy', '===', '==', '!=', '!==', 'Which operator checks both value and type in JavaScript?', '==='),
(39, 'JavaScript', 'Medium', 'for', 'foreach', 'do', 'while', 'Which loop is used to iterate over arrays in JavaScript?', 'for'),
(40, 'JavaScript', 'Hard', 'Null', 'Undefined', 'Both', 'None', 'Which is a falsy value in JavaScript?', 'Both');

-- Insert 6 Questions for PHP Category
INSERT INTO question (id, category, difficulty_level, option1, option2, option3, option4, question_title, right_answer) VALUES
(41, 'PHP', 'Easy', 'True', 'False', 'Null', 'Undefined', 'Does PHP support object-oriented programming?', 'True'),
(42, 'PHP', 'Medium', 'PHP', 'HTML', 'CSS', 'JavaScript', 'Which language is used for server-side scripting in web development?', 'PHP'),
(43, 'PHP', 'Easy', 'array()', 'list()', 'set()', 'map()', 'Which function is used to create an array in PHP?', 'array()'),
(44, 'PHP', 'Medium', 'GET', 'POST', 'PUT', 'DELETE', 'Which method is not a valid HTTP method in PHP?', 'DELETE'),
(45, 'PHP', 'Easy', 'string', 'int', 'float', 'all of the above', 'What type of data does PHP support?', 'all of the above'),
(46, 'PHP', 'Medium', 'TRUE', 'FALSE', 'NULL', 'None', 'Which keyword is used for boolean true in PHP?', 'TRUE');