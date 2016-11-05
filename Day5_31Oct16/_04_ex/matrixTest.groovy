//groovy program to text Matrix class

Matrix matTest = new Matrix(3,4);

println("A 3 x 4 matrix intialised with 1's: ")
matTest.prettyPrint();

println("Test setElement method");
matTest.setElement(1,1,5)
println("Set 1,1 to 5: ")
matTest.prettyPrint();

println("Test setElement method when index is out of bounds");
matTest.setElement(3,4,10)
println("Set 3,4 to 10: ")
matTest.prettyPrint();

//
println("Test setRow method");
str = "9,8,7,2"
matTest.setRow(1,str);
println("Single digit numbers - Row two populated with " + str)
matTest.prettyPrint();

str = "98,81,70,27"
matTest.setRow(1,str);
println("Double digit numbers - Row two populated with " + str)
matTest.prettyPrint();

str = "9,8,7,2,8"
matTest.setRow(1,str);
println("More numbers than cols - Row two populated with " + str)
println("No change")
matTest.prettyPrint();

str = "9,8,7"
matTest.setRow(1,str);
println("Less numbers than cols - Row two populated with " + str)
println("No change")
matTest.prettyPrint();


//
println("Test setCol method");
str = "1,2,3"
matTest.setColumn(1,str);
println("Single digit number - Col two populated with " + str)
matTest.prettyPrint();

str = "10,21,37"
matTest.setColumn(1,str);
println("Double digit number - Col two populated with " + str)
matTest.prettyPrint();

str = "1,2,37,8"
matTest.setColumn(1,str);
println("More numbers than rows - Col two populated with " + str)
println("No change")
matTest.prettyPrint();

str = "1,2"
matTest.setColumn(1,str);
println("Less numbers than rows - Col two populated with " + str)
println("No change")
matTest.prettyPrint();


println("Test method toString")
println(matTest.toString())